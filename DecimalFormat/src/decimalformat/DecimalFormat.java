package decimalformat;
import javax.swing.JOptionPane;
public class DecimalFormat {
	public static void main(String[] args) {
		String raio = JOptionPane.showInputDialog("Informe o raio da circunferência: ");
		double raioCircunferencia = Double.parseDouble(raio);
		double diametroCircunferencia = 2 * raioCircunferencia;
		double pi = Math.PI;
		double comprimentoCircunferencia = 2 * pi * raioCircunferencia;
		double areaCircunferencia = pi * raioCircunferencia * raioCircunferencia;
	
		String msg1 = "O diâmetro de uma circunferência de raio " + raioCircunferencia + " vale " + diametroCircunferencia;
		String msg2 = "O comprimento de uma circunferência de raio " + raioCircunferencia + " vale " + Math.floor(comprimentoCircunferencia * 100) / 100;
		String msg3 = "A área de uma circunferência de raio " + raioCircunferencia + " vale " + Math.floor(areaCircunferencia * 100) / 100;
	
		JOptionPane.showMessageDialog(null, msg1);
		JOptionPane.showMessageDialog(null, msg2);
		JOptionPane.showMessageDialog(null, msg3);
	}
}
