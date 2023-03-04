package enums;

/*Este enum contendra las conversiones entre monedas, el factor de conversión 
y la constante aditiva que será difinida como 0 por su fórnula de conversión*/

public enum OpcionesDeConversionMonedas {
	DEPESOADOLAR("De Peso Mexicano a Dolar Americano", 0.054, 0),
	DEDOLARAPESO("De Dolar Americano a Peso Mexicano", 18.3, 0), DEPESOAEURO("De Peso Mexicano a Euro", 0.051, 0),
	DEEUROAPESO("De Euro a Peso Mexicano", 19.48, 0), DEPESOALIBRA("De Peso Mexicano a Libra Esterlina", 0.045, 0),
	DELIBRAAPESO("De Libra Esterlina a Peso Mexicano", 22.15, 0), DEPESOAYEN("De Peso Mexicano a Yen Japones", 7.42, 0),
	DEYENAPESO("De Yen Japones a Peso Mexicano", 0.13, 0), DEPESOAWON("De Peso Mexicano a Won Sur-Coreano", 71.77, 0),
	DEWONAPESO("De Won Sur-Coreano a Peso Mexicano", 0.014, 0);

	// Atributos necesarios para definir el enum

	private final String opcionesDeConversion;
	private final double factorDeConversionNum;
	private final double constanteASumarNum;

	// Constructor del enum

	private OpcionesDeConversionMonedas(String opcionesDeConversion, double factorDeConversionNum,
			double constanteASumarNum) {
		this.opcionesDeConversion = opcionesDeConversion;
		this.factorDeConversionNum = factorDeConversionNum;
		this.constanteASumarNum = constanteASumarNum;
	}

	// Getters de cada atributo

	public String getSize() {
		return opcionesDeConversion;
	}

	public double getFactor() {
		return factorDeConversionNum;
	}

	public double getConstanteASumar() {
		return constanteASumarNum;
	}

}
//