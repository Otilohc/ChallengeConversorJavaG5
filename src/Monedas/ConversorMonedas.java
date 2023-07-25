package Monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public void ConvertirColonesDolares() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaDolar = moneda * 0.0019;
		// monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " colones son  " + monedaDolar + " Dolares");
	}

	public void ConvertirColonesEuros() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaEuro = moneda * 0.0017;
		// monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " colones son  " + monedaEuro + " Euros");
	}

	public void ConvertirColonesLibra() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaLibra = moneda * 0.0014;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, +moneda + " colones son  " + monedaLibra + " Libras Esterlinas");
	}

	public void ConvertirColonesYen() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaYen = moneda * 0.26;
		// monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " colones son  " + monedaYen + " Yenes");
	}

	public void ConvertirColonesWon() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaWon = moneda * 2.38;
		// monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " colones son  " + monedaWon + " Won");
	}

	public void ConvertirDolaresColones() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaDolar = moneda * 541.86;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, +moneda + " Dolares son " + monedaDolar + " Colones");
	}

	public void ConvertirEurosColones() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaEuro = moneda * 597.67;
		// monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " Euros son " + monedaEuro + " Colones");
	}

	public void ConvertirLibraColones() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaLibra = moneda * 691.06;
		// monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " Libras esterlinas son " + monedaLibra + " Colones");
	}

	public void ConvertirYenColones() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaYen = moneda * 3.84;
		// monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " Yen son " + monedaYen + " Colones");
	}

	public void ConvertirWonColones() {
		String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double moneda = Double.parseDouble(input);
		double monedaWon = moneda * 0.42;
		// monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, +moneda + " Won coreanos son " + monedaWon + " Colones");
	}

}
