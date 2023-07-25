package Master;

import javax.swing.*;

import Monedas.OpMonedas;
import Temperaturas.OpTemperatura;

public class Master {

	public static void main(String[] args) {

		OpMonedas conversion = new OpMonedas();
		OpTemperatura conversionT = new OpTemperatura();
		boolean continua = true;

		while (continua) {

			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione la acción que desea realizar", "Menú", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Convertir monedas", "Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Convertir monedas":

				conversion.ConvertirMonedas();

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {

					continua = true;
				} else {
					continua = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;

			case "Conversor de Temperatura":
				//String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				//double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas();

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
					continua = true;
				} else {
					continua = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}

			}

		}
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
	}

}
