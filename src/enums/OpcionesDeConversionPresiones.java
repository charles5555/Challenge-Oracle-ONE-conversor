package enums;

/*Este enum contendra las conversiones entre unidades de Presión, el factor de conversión 
y la constante aditiva que será difinida como 0 por su fórnula de conversión*/

public enum OpcionesDeConversionPresiones {
	PASCALATMOSFERA("De Pascales a Atmosferas",9.8692E-6,0), ATMOSFERAPASCAL("De Atmosferas a Pascales",101300,0),
	PASCALMERCURIO("De Pascales a Milimetros de Mercurio",1/(133.3),0), MERCURIOPASCAL("De Milimetros de Mercurio a Pascales",133.3,0),
	ATMOSFERAMERCURIO("De Atmosferas a Milimetros de Mercurio",760,0),
	MERCURIOATMOSFERA("De Milimetros de Mercurio a Atmosferas",1.3157E-3,0), ATMOSFERASBAR("De Atmosferas a Bares",1.01325,0),
	BARESATMOSFERAS("De Bares a Atmosferas",1/(1.01325),0), PASCALBAR("De Pascales a Bares",1E-5,0), BARPASCAL("De Bares a Pascales",100000,0), 
	MERCURIOBAR("De Milimetros de Mercurio a Bares",1/(750.062),0),BARMERCURIO("De Bares a Milimetros de Mercurio",750.062,0);

	// Atributos necesarios para definir el enum
	
	private final String opcionesDeConversion;
	private final double factorDeConversionNum;
	private final double constanteASumar;

	// Constructor del enum
	
	private OpcionesDeConversionPresiones(String opcionesDeConversion, double factorDeConversionNum, double constanteASumar) {
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