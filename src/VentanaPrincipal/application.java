package VentanaPrincipal;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import ClasesMetodosYDefiniciones.InstanciasYDefiniciones;
import enums.OpcionesDeConversionMonedas;
import enums.OpcionesDeConversionPresiones;
import enums.OpcionesDeConversionTemperaturas;
import enums.OpcionesDeConversionTiempo;

public class application extends InstanciasYDefiniciones {
	Object opcionSeleccionada;

	//Método que abre la ventana para abrir los conversores
	
	public void abrirVentanaPrincipal() {
		String lblSubTitulo = "Seleccione una opción de conversión";
		String lblTitulo = "Conversor";
		opcionSeleccionada = JOptionPane.showInputDialog(null, lblSubTitulo, lblTitulo, JOptionPane.INFORMATION_MESSAGE,
				null, ListaDeOpcionesDeConversion, lblTitulo);
		elegirConversor(opcionSeleccionada);

	}
	
	//Método para elegir el conversor y asignarle su correspondiente lista de conversiones

	public void elegirConversor(Object opcionSeleccionada) {
		try {

			if (opcionSeleccionada.toString().contains("Monedas")) {

				for (OpcionesDeConversionMonedas var : OpcionesDeConversionMonedas.values()) {

					JF.opcionesJComboBox(var.getSize());
				}
				JF.CambiarTituloDeJLabel("Conversor De Monedas");
				meterFactoresEnUnVectorMonedas();
				accionConvertir();

			} else if (opcionSeleccionada.toString().contains("Temperatura")) {
				
				for (OpcionesDeConversionTemperaturas var : OpcionesDeConversionTemperaturas.values()) {

					JF.opcionesJComboBox(var.getSize());
				}
				JF.CambiarTituloDeJLabel("Conversor de Temperaturas");
				meterFactoresEnUnVectorTemperaturas();
				accionConvertir();

			} else if (opcionSeleccionada.toString().contains("Presiones")) {
				for (OpcionesDeConversionPresiones var : OpcionesDeConversionPresiones.values()) {
					JF.opcionesJComboBox(var.getSize());
				}
				JF.CambiarTituloDeJLabel("Conversor de Presiones");
				meterFactoresEnUnVectorPresiones();
				accionConvertir();

			} else if (opcionSeleccionada.toString().contains("Tiempo")) {
				for (OpcionesDeConversionTiempo var : OpcionesDeConversionTiempo.values()) {
					JF.opcionesJComboBox(var.getSize());
				}
				JF.CambiarTituloDeJLabel("Conversor de Tiempo");
				meterFactoresEnUnVectorTiempo();
				accionConvertir();
			}

		} catch (NullPointerException Null) {
			System.exit(0);

		}

	}
	
	
	//Acción del botón Convertir
	
	public void accionConvertir() {
		JF.setVisible(true);
		JF.BotonConvertir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					conv.setCantidadDeEntrada(JF.convertirEntradaADouble());
					for (int i = 0; i <= listaDeFactores.size(); i++) {
						if ((String) JF.tipoDeConversion.getSelectedItem() == listaDeOpcionesAConvertir.get(i)) {
							convertirCantidad(i);
							break;
						}

					}

				} catch (NumberFormatException caracter) {
					JOptionPane.showMessageDialog(null, "No se pueden ingresar letras " + "o caracteres especiales");
				}

			}
		});
	}
	
	//Método para convertir la cantidad de entrada y mostrar resultado
	
		public void convertirCantidad(int indiceDelVectorDeFactores) {

			resultado = conv.funcionConversion(listaDeFactores.get(indiceDelVectorDeFactores), conv.getCantidadDeEntrada(),
					listaDeConstantesASumar.get(indiceDelVectorDeFactores));
			JF.resultadoDeSalida.setText(String.valueOf(resultado));

		}


	//Constructor
	
	public application() {
		abrirVentanaPrincipal();
	}

	//
	
	//
	

}
