/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

import ito.clases.Figura;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Cuadrado.
 * 
 * @author rherrera
 */
public class Cuadrado extends Figura {
	// Start of user code (user defined attributes for Cuadrado)

	// End of user code

	public Cuadrado(float medidaLado) {
		super("Cuadrado", 4, medidaLado);
		// TODO Auto-generated constructor stub
	}

	/**
	 * The constructor.
	 */
	public Cuadrado() {
		// Start of user code constructor for Cuadrado)
		super();
		// End of user code
	}

	/**
	 * Description of the method calculaArea.
	 * @return 
	 */
	public float calculaArea() {
		// Start of user code for method calculaArea
		float calculaArea = this.getMedidaLado()*this.getMedidaLado();
		
		return calculaArea;
		// End of user code
	}

	/**
	 * Description of the method calculaPerimetro.
	 * @return 
	 */
	public float calculaPerimetro() {
		// Start of user code for method calculaPerimetro
		float calculaPerimetro =  this.getMedidaLado()*this.getCantidaLados();
		return calculaPerimetro;
		// End of user code
	}

	@Override
	public String toString() {
		return "Cuadrado [Titulo="+getTitulo()+", Cantida de Lados=" + getCantidaLados() + ", Medida de cada Lado=" + getMedidaLado() 
				+ ", Area=" +calculaArea()  + ", Perimetro="+calculaPerimetro()
				+ "]";
	}

	// Start of user code (user defined methods for Cuadrado)

	// End of user code

}
