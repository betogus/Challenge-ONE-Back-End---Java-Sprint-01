# Challenge-ONE-Back-End---Java-Sprint-01

##  Conversores de Moneda y Temperatura
Este programa en Java permite convertir entre diferentes unidades de moneda y temperatura. Proporciona una interfaz gráfica utilizando la clase JOptionPane de Java Swing para solicitar valores de entrada al usuario y mostrar los resultados de las conversiones.

## Uso del programa
Al ejecutar el programa, se presenta al usuario un cuadro de diálogo con dos opciones de conversión: "Conversor de Moneda" y "Conversor de Temperatura". El usuario puede seleccionar una de las opciones haciendo clic en ella.

## Conversor de Moneda
Si el usuario elige la opción "Conversor de Moneda", se abrirá un cuadro de diálogo adicional solicitando al usuario que ingrese un valor numérico. Se valida que el valor ingresado sea numérico y, una vez validado, se presenta otro cuadro de diálogo con las opciones de conversión disponibles: "De Pesos a Dólar", "De Pesos a Euro", "De Euro a Pesos" y "De Dólar a Pesos".

Al seleccionar una de las opciones de conversión, se utiliza la clase ConversorMoneda para realizar la conversión correspondiente y se muestra el resultado en un cuadro de diálogo.

## Conversor de Temperatura
Si el usuario elige la opción "Conversor de Temperatura", se sigue un proceso similar al del conversor de moneda. Se solicita al usuario que ingrese un valor numérico, se valida y luego se presentan las opciones de conversión de temperatura: "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius" y "De Kelvin a Celsius".

Al seleccionar una opción de conversión, se utiliza la clase ConversorTemperatura para realizar la conversión correspondiente y se muestra el resultado en un cuadro de diálogo.

## Repetición y finalización
Después de realizar una conversión, se muestra un cuadro de diálogo de confirmación para preguntar al usuario si desea realizar otra conversión. Si el usuario selecciona "Aceptar", el programa vuelve al inicio y permite realizar otra conversión. Si el usuario selecciona "Cancelar" o cierra el cuadro de diálogo, el programa muestra un cuadro de diálogo de despedida y finaliza.
