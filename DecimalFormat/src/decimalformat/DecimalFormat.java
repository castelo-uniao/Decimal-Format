package decimalformat;
import javax.swing.JOptionPane;
public class DecimalFormat {
	public static void main(String[] args) {
		String raio = JOptionPane.showInputDialog("Informe o raio da circunfer�ncia: ");
		double raioCircunferencia = Double.parseDouble(raio);
		double diametroCircunferencia = 2 * raioCircunferencia;
		double pi = Math.PI;
		double comprimentoCircunferencia = 2 * pi * raioCircunferencia;
		double areaCircunferencia = pi * raioCircunferencia * raioCircunferencia;
	
		String msg1 = "O di�metro de uma circunfer�ncia de raio " + raioCircunferencia + " vale " + diametroCircunferencia;
		String msg2 = "O comprimento de uma circunfer�ncia de raio " + raioCircunferencia + " vale " + Math.floor(comprimentoCircunferencia * 100) / 100;
		String msg3 = "A �rea de uma circunfer�ncia de raio " + raioCircunferencia + " vale " + Math.floor(areaCircunferencia * 100) / 100;
	
		JOptionPane.showMessageDialog(null, msg1);
		JOptionPane.showMessageDialog(null, msg2);
		JOptionPane.showMessageDialog(null, msg3);
	}
}
