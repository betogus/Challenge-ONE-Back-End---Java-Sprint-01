import javax.swing.JOptionPane;

public class ConversorMoneda {
	public void dePesosADolar(double value) {
		double result = value * 0.0038;
		result = (double) Math.round(result * 100d) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + result + " Dolares");
	}
	
	public void dePesosAEuro (double value) {
		double result = value * 0.0034;
		result = (double) Math.round(result * 100d) / 100;

		 JOptionPane.showMessageDialog(null, "Tienes € " + result + " Euros");
	}
	
	public void deEuroAPesos (double value) {
		double result = value / 0.0034;
		result = (double) Math.round(result * 100d) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + result + " Pesos");
	}
	
	public void deDolarAPesos (double value) {
		double result = value / 0.0038;
		result = (double) Math.round(result * 100d) / 100;
		 JOptionPane.showMessageDialog(null, "Tienes $ " + result + " Pesos");
	}
}
