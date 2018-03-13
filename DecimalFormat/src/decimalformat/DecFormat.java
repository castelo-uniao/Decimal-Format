import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class DecFormat {
	public static void main(String[] args) {
		String raio = JOptionPane.showInputDialog("Informe o raio da circunferência: ");
		double raioCircunferencia = Double.parseDouble(raio);
		double diametroCircunferencia = 2 * raioCircunferencia;
		double pi = Math.PI;
		double comprimentoCircunferencia = 2 * pi * raioCircunferencia;
		double areaCircunferencia = pi * raioCircunferencia * raioCircunferencia;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		String msg1 = "O diâmetro de uma circunferência de raio " + raioCircunferencia + " vale " + diametroCircunferencia;
		String msg2 = "O comprimento de uma circunferência de raio " + raioCircunferencia + " vale " + df.format(comprimentoCircunferencia);
		String msg3 = "A área de uma circunferência de raio " + raioCircunferencia + " vale " + df.format(areaCircunferencia);
	
		JOptionPane.showMessageDialog(null, msg1);
		JOptionPane.showMessageDialog(null, msg2);
		JOptionPane.showMessageDialog(null, msg3);
	}
}
