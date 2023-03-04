package enums;

/*Este enum contendra las conversiones entre unidades de Temperatura, el factor de conversión 
y la constante aditiva que su valor dependerá de los sistemas involucrados*/

public enum OpcionesDeConversionTemperaturas {
	DECELCIUSAKELVIN("De Celcius a Kelvin",1,273.15), DEKELVINACELCIUS("De Kelvin a Celcius",1,-273.15),
	DECELCIUSAFARENHEIT("De Celcius a Farenheit",1.8,32), DEFARENHEITACELCIUS("De Farenheit a Celcius",0.556,-17.778),
	DEKELVINAFARENHEIT("De Kelvin a Farenheit",1.8,-459.67), DEFARENHEITAKELVIN("De Farenheit a Kelvin",0.556,255.37);
	
	// Atributos necesarios para definir el enum
	
	private final String opcionesDeConversion;
	private final double factorDeConversionNum;
	private final double constanteASumar;

	// Constructor del enum
	
	private OpcionesDeConversionTemperaturas(String opcionesDeConversion, double factorDeConversionNum, double constanteASumar) {
		this.opcionesDeConversion = opcionesDeConversion;
		this.factorDeConversionNum = factorDeConversionNum;
		this.constanteASumar = constanteASumar;
	}
	
	// Getters de cada atributo

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