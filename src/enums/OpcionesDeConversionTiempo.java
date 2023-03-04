package enums;

/*Este enum contendra las conversiones entre unidades de tiempo, el factor de conversión 
y la constante aditiva que será difinida como 0 por su fórnula de conversión*/

public enum OpcionesDeConversionTiempo {
	SEGUNDOMINUTO("De Segundo a Minuto", 0.0166667, 0), SEGUNDOHORA("De Segundo a Hora", 0.00027777833333, 0),
	SEGUNDODIA("De Segundo a Dia", 1.1574E-5, 0), SEGUNDOSEMANA("De Segundo a Semana", 1.6534E-6, 0),
	SEGUNDOMES("De Segundo a Mes", 3.8052E-7, 0), SEGUNDOAÑO("De Segundo a Año", 3.171E-8, 0),
	MINUTOHORA("De Minuto a Hora", 0.0166667, 0), MINUTODIA("De Minuto a Dia", 0.000694444, 0),
	MINUTOSEMANA("De Minuto a Semana", 9.9206E-5, 0), MINUTOMES("De Minuto a Mes", 2.2831E-5, 0),
	MINUTOAÑO("De Minuto a Año", 1.9026E-6, 0), HORADIA("De Hora a Dia", 0.04166694, 0),
	HORASEMANA("De Hora a Semana", 0.00595238, 0), HORAMES("De Hora a Mes", 0.00136986, 0),
	DIASEMANA("De Dia a Semana", 0.142857, 0), DIAMES("De Dia a Mes", 0.0328767, 0),
	DIAAÑO("De Dia a Año", 0.00273973, 0), HORAAÑO("De Hora a Año", 0.000114155, 0),
	SEMANAMES("De Semana a Mes", 0.230137, 0), SEMANAAÑO("De Semana a Año", 0.0191781, 0),
	MESAÑO("De Mes a Año", 0.0833334, 0), AÑOMES("De Año a Mes", 12, 0), AÑOSEMANA("De Año a Semana", 52.1429, 0),
	AÑODIA("De Año a Dia", 365, 0), AÑOHORA("De Año a Hora", 8760, 0), AÑOMINUTO("De Año a Minuto", 525600, 0),
	AÑOSEGUNDO("De Año a Segundo", 3.154E+7, 0), MESSEMANA("De Mes a Semana", 4.34524, 0),
	MESDIA("De Mes a Dia", 30.4167, 0), MESHORA("De Mes a Hora", 730.001, 0), MESMINUTO("De Mes a Minuto", 43800, 0),
	MESSEGUNDO("De Mes a Segundo", 2.628E+6, 0), SEMANADIA("De Semana a Dia", 7, 0),
	SEMANAHORA("De Semana a Hora", 168, 0), SEMANAMINUTO("De Semana a Minuto", 10080, 0),
	SEMANASEGUNDO("De Semana a Segundo", 604800, 0), DIAHORA("De Dia a Hora", 24, 0),
	DIAMINUTO("De Dia a Minuto", 1440, 0), DIASEGUNDO("De Dia a Segundo", 86400, 0),
	HORAMINUTO("De Hora a Minuto", 60, 0), HORASEGUNDO("De Hora a Segundo", 3600, 0),
	MINUTOSEGUNDO("De Minuto a Segundo", 60, 0);

	//Atributos necesarios para definir el enum
	
	private final String opcionesDeConversion;
	private final double factorDeConversionNum;
	private final double constanteASumar;

	//Constructor del enum
	
	private OpcionesDeConversionTiempo(String opcionesDeConversion, double factorDeConversionNum,
			double constanteASumar) {
		this.opcionesDeConversion = opcionesDeConversion;
		this.factorDeConversionNum = factorDeConversionNum;
		this.constanteASumar = constanteASumar;
	}
	
	//Getters de cada atributo

	public String getSize() {
		return opcionesDeConversion;
	}

	public double getFactor() {
		return factorDeConversionNum;
	}

	public double getConstanteASumar() {
		return constanteASumar;
	}

}


//