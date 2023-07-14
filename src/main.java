import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		boolean continuar = true;
		while (continuar) {
			Object[] optionValues = { "Conversor de Moneda", "Conversor de Temperatura"};
			Object selectedOption = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Input", JOptionPane.INFORMATION_MESSAGE, null, optionValues, optionValues[0]);
			if (selectedOption == "Conversor de Moneda") {
				boolean validarInput = false;
				double inputDouble = 0.0;
				while (!validarInput) {
					String inputValue = JOptionPane.showInputDialog("Ingrese un valor");
					try {
						inputDouble = Double.parseDouble(inputValue);				
						validarInput = true;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no válido");
					}	
				}
				Object[] optionsMoneyConvert = {"De Pesos a Dólar", "De Pesos a Euro", "De Euro a Pesos", "De Dólar a Pesos"};
				Object selectedMoneyConvert = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Input", JOptionPane.INFORMATION_MESSAGE, null, optionsMoneyConvert, optionsMoneyConvert[0]);
				ConversorMoneda conversor = new ConversorMoneda();
				if (selectedMoneyConvert == "De Pesos a Dólar") {
					conversor.dePesosADolar(inputDouble);
				}
				else if (selectedMoneyConvert == "De Pesos a Euro") {
					conversor.dePesosAEuro(inputDouble);
				}
				else if (selectedMoneyConvert == "De Euro a Pesos") {
					conversor.deEuroAPesos(inputDouble);
				} else if (selectedMoneyConvert == "De Dólar a Pesos") {
					conversor.deDolarAPesos(inputDouble);
				}
				
			} else if (selectedOption == "Conversor de Temperatura") {
				boolean validarInput = false;
				double inputDouble = 0.0;
				while (!validarInput) {
					String inputValue = JOptionPane.showInputDialog("Ingrese un valor");
					try {
						inputDouble = Double.parseDouble(inputValue);				
						validarInput = true;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no válido");
					}	
				}
				Object[] optionsTempConvert = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Kelvin a Celsius" };
				Object selectedTempConvert = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Input", JOptionPane.INFORMATION_MESSAGE, null, optionsTempConvert, optionsTempConvert[0]);
				ConversorTemperatura conversor = new ConversorTemperatura();
				if (selectedTempConvert == "De Celsius a Fahrenheit") {
					conversor.CelsiusAFahrenheit(inputDouble);
				}
				else if (selectedTempConvert == "De Celsius a Kelvin") {
					conversor.CelisusAKelvin(inputDouble);
				}
				else if (selectedTempConvert == "De Fahrenheit a Celsius") {
					conversor.FahrenheitACelsius(inputDouble);
				} else if (selectedTempConvert == "De Kelvin a Celsius") {
					conversor.KelvinACelsius(inputDouble);
				}
			}
			
			int response = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
			if (JOptionPane.OK_OPTION != response) {
				JOptionPane.showMessageDialog(null, "Finalizando programa");
				continuar = false;
			}
		}
	}
}