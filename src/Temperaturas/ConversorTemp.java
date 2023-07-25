package Temperaturas;

import javax.swing.JOptionPane;

public class ConversorTemp {
	
	public void ConvertirCelsiusFahrenheit() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Celsius");
		double valorRecibidoT = Double.parseDouble(input);
		double CFahrenheit = (valorRecibidoT * 1.8) + 32;
		CFahrenheit = (double)Math.round(CFahrenheit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT + " Celsius, son " + CFahrenheit + " Fahrenheit");
	}
	public void ConvertirCelisusKelvin() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Celsius");
		double valorRecibidoT = Double.parseDouble(input);
		double CKelvin = valorRecibidoT + 273.15;
		CKelvin = (double)Math.round(CKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Celsius son " + CKelvin + " Kelvin");
	}
	public void ConvertirCelsiusRankine() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Celsius");
		double valorRecibidoT = Double.parseDouble(input);
		double CRankine = (valorRecibidoT * 1.8) + 491.67;
		CRankine = (double)Math.round(CRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Celsius son " + CRankine + " Rankine");
	}
	
	
	
	public void ConvertirFahrenheitCelsius() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Farenheit");
		double valorRecibidoT = Double.parseDouble(input);
		double FCelsius = (valorRecibidoT - 32) * ( 0.556 );
		FCelsius = (double)Math.round(FCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Farenheit son " + FCelsius + " Celsius");
	}
	public void ConvertirFahrenheitKelvin() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Farenheit");
		double valorRecibidoT = Double.parseDouble(input);
		double FKelvin = (valorRecibidoT + 459.67)*(0.556);
		FKelvin = (double)Math.round(FKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Farenheit son " + FKelvin + " Kelvin");
	}
	public void ConvertirFahrenheitRankine() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Farenheit");
		double valorRecibidoT = Double.parseDouble(input);
		double FRankine = valorRecibidoT + 459.67;
		FRankine = (double)Math.round(FRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Farenheit son " + FRankine + " Rankine");
	}
	
	
	public void ConvertirKelvinCelsius() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Kelvin");
		double valorRecibidoT = Double.parseDouble(input);
		double KCelsius = valorRecibidoT - 273.15;
		KCelsius = (double)Math.round(KCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Kelvin son " + KCelsius + " Celsius");
	}
	public void ConvertirKelvinFahrenheit() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Kelvin");
		double valorRecibidoT = Double.parseDouble(input);
		double KFahrenhit = ((valorRecibidoT - 273.15) * (1.8)) + 32;
		KFahrenhit = (double)Math.round(KFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Kelvin son " + KFahrenhit + " Farenheit");
	}
	public void ConvertirKelvinRankine() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Kelvin");
		double valorRecibidoT = Double.parseDouble(input);
		double KRankine = valorRecibidoT * 1.8 ;
		KRankine = (double)Math.round(KRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Kelvin son " + KRankine + " Rankine");
	}
	
	
	public void ConvertirRankineCelsius() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Rankine");
		double valorRecibidoT = Double.parseDouble(input);
		double RCelsius = (valorRecibidoT - 491.67) * (0.556);
		RCelsius = (double)Math.round(RCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Rankine son " + RCelsius + " Celsius");
	}
	public void ConvertirRankineFahrenheit() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Rankine");
		double valorRecibidoT = Double.parseDouble(input);
		double RFahrenhit = valorRecibidoT - 459.67;
		RFahrenhit = (double)Math.round(RFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Rankine son " + RFahrenhit + " Farenheit");
	}
	public void ConvertirRankineKelvin() {
		String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Rankine");
		double valorRecibidoT = Double.parseDouble(input);
		double RKelvin = valorRecibidoT * (0.556);
		RKelvin = (double)Math.round(RKelvin* 100d) /100 ;
		JOptionPane.showMessageDialog(null, valorRecibidoT +  " Rankine son " + RKelvin + " Kelvin");
	}

}


