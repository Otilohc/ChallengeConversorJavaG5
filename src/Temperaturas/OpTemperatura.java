package Temperaturas;

import javax.swing.JOptionPane;



public class OpTemperatura {
	
	ConversorTemp temperatura = new ConversorTemp();
	
	
	public void ConvertirTemperaturas() {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije Conversión que desea realizar ",  "Temperaturas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
							"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Celsius a Fahrenheit":
		temperatura.ConvertirCelsiusFahrenheit();
		break;
	
	case "De Celsius a Kelvin": 
		temperatura.ConvertirCelisusKelvin();
		break;
		
	case "De Celsius a Rankine":
		temperatura.ConvertirCelsiusRankine();
		break;
		
	case "De Fahrenheit a Celsius":
		temperatura.ConvertirFahrenheitCelsius();
		break;
		
	case "De Fahrenheit a Kelvin":
		temperatura.ConvertirFahrenheitKelvin();
		break;
	
	case "De Fahrenheit a Rankine":
		temperatura.ConvertirFahrenheitRankine();
		break;
		
	case "De Kelvin a Celsius":
		temperatura.ConvertirKelvinCelsius();
		break;
		
	case "De Kelvin a Fahrenheit":
		temperatura.ConvertirKelvinFahrenheit();
		break;
	 
	case "De Kelvin a Rankine":
		temperatura.ConvertirKelvinRankine();
		break;
		
	case "De Rankine a Celsius":
		temperatura.ConvertirRankineCelsius();
		break;
		
	case "De Rankine a Fahrenheit":
		temperatura.ConvertirRankineFahrenheit();
		break;
		
	case "De Rankine a Kelvin":
		temperatura.ConvertirRankineKelvin();
		break;
	}
	}
	}
