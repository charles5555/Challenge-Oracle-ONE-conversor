package ClasesMetodosYDefiniciones;

//Clase que contendrá la fórmula de conversión
public class conversorLinealConConstante {
	
	//Atributo que contendrá la cantidad a convertir de JFrameEstructura

	protected double cantidadDeEntrada;

	//Getter y Setter del atributo
	
	public double getCantidadDeEntrada() {
		return cantidadDeEntrada;
	}

	public void setCantidadDeEntrada(double cantidadDeEntrada) {
		this.cantidadDeEntrada = cantidadDeEntrada;
	}
	
	//Método para la función de conversión

	public double funcionConversion(double factorDeConversion, double cantidadDeEntrada, double constanteAsumar) {
		// TODO Auto-generated method stub
		double resultadoPreliminar = factorDeConversion * cantidadDeEntrada + constanteAsumar;
		return (double) Math.round(resultadoPreliminar * 10000d) / 10000d;
	}

}

//
