package Monedas;

import javax.swing.JOptionPane;

public class OpMonedas {

	ConversorMonedas monedas = new ConversorMonedas();

	public void ConvertirMonedas() {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Colones a Dólar", "De Colones a Euro", "De Colones a Libras Esterlinas",
						"De Colones a Yen Japonés", "De Colones a Won sub-coreano", "De Dólar a Colones",
						"De Euro a Colones", "De Libras Esterlinas a Colones", "De Yen Japonés a Colones",
						"De Won sub-coreano a Pesos" },
				"Seleccion")).toString();

		switch (opcion) {
		case "De Colones a Dólar":
			monedas.ConvertirColonesDolares();
			break;

		case "De Colones a Euro":
			monedas.ConvertirColonesEuros();
			break;

		case "De Colones a Libras Esterlinas":
			monedas.ConvertirColonesLibra();
			break;

		case "De Colones a Yen Japonés":
			monedas.ConvertirColonesYen();
			break;

		case "De Colones a Won sub-coreano":
			monedas.ConvertirColonesWon();
			break;

		case "De Dólar a Colones":
			monedas.ConvertirDolaresColones();
			break;

		case "De Euro a Colones":
			monedas.ConvertirEurosColones();
			break;

		case "De Libras Esterlinas a Colones":
			monedas.ConvertirLibraColones();
			break;

		case "De Yen Japonés a Colones":
			monedas.ConvertirYenColones();
			break;

		case "De Won sub-coreano a Colones":
			monedas.ConvertirWonColones();
			break;
		}
	}

}
