import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	 public void CelsiusAFahrenheit(double valor) {
	        double CFahrenheit = (valor * 1.8) + 32;
	        CFahrenheit = (double) Math.round(CFahrenheit * 100d) / 100;
	        JOptionPane.showMessageDialog(null, "Son " + CFahrenheit + " grados Fahrenheit");
	    }

	    public void CelisusAKelvin(double valor) {
	        double CKelvin = valor + 273.15;
	        CKelvin = (double) Math.round(CKelvin * 100d) / 100;
	        JOptionPane.showMessageDialog(null, "Son " + CKelvin + " grados Kelvin");
	    }


	    public void FahrenheitACelsius(double valor) {
	        double FCelsius = (valor - 32) * (0.556);
	        FCelsius = (double) Math.round(FCelsius * 100d) / 100;
	        JOptionPane.showMessageDialog(null, "Son " + FCelsius + " grados Celsius");
	    }

	   

	    public void KelvinACelsius(double valor) {
	        double KCelsius = valor - 273.15;
	        KCelsius = (double) Math.round(KCelsius * 100d) / 100;
	        JOptionPane.showMessageDialog(null, "Son " + KCelsius + " grados Celsius");
	    }

	 

	   
}
