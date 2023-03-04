package ClasesMetodosYDefiniciones;

import java.util.ArrayList;
import java.util.List;

import EstructuraDelFRame.JFrameEstructura;
import enums.OpcionesDeConversionMonedas;
import enums.OpcionesDeConversionPresiones;
import enums.OpcionesDeConversionTemperaturas;
import enums.OpcionesDeConversionTiempo;


public class InstanciasYDefiniciones extends JFrameEstructura {
	
	//Se definen objetos que necesitaremos
	
	public JFrameEstructura JF = new JFrameEstructura();
	public double resultado = 0;
	public conversorLinealConConstante conv = new conversorLinealConConstante();
	public Object[] ListaDeOpcionesDeConversion = { "Conversor de Monedas", "Conversor de Temperaturas",
			"Conversor de Presiones", "Conversor de Tiempo" };
	public List<String> listaDeOpcionesAConvertir = new ArrayList<String>();
	public List<Double> listaDeFactores = new ArrayList<Double>();
	public List<Double> listaDeConstantesASumar = new ArrayList<Double>();
	
	
//Métodos para guardar los valores de su enum correspondiente en un vector
	
	public void meterFactoresEnUnVectorMonedas() {
		for (OpcionesDeConversionMonedas valor : OpcionesDeConversionMonedas.values()) {
			listaDeOpcionesAConvertir.add(valor.getSize());
			listaDeFactores.add(valor.getFactor());
			listaDeConstantesASumar.add(valor.getConstanteASumar());
		}
	}

	public void meterFactoresEnUnVectorTemperaturas() {
		for (OpcionesDeConversionTemperaturas valor : OpcionesDeConversionTemperaturas.values()) {
			listaDeOpcionesAConvertir.add(valor.getSize());
			listaDeFactores.add(valor.getFactor());
			listaDeConstantesASumar.add(valor.getConstanteASumar());
		}
	}

	public void meterFactoresEnUnVectorPresiones() {
		for (OpcionesDeConversionPresiones valor : OpcionesDeConversionPresiones.values()) {
			listaDeOpcionesAConvertir.add(valor.getSize());
			listaDeFactores.add(valor.getFactor());
			listaDeConstantesASumar.add(valor.getConstanteASumar());
		}
	}
	
	public void meterFactoresEnUnVectorTiempo() {
		for (OpcionesDeConversionTiempo valor : OpcionesDeConversionTiempo.values()) {
			listaDeOpcionesAConvertir.add(valor.getSize());
			listaDeFactores.add(valor.getFactor());
			listaDeConstantesASumar.add(valor.getConstanteASumar());
		}
	}
	

	//
}
