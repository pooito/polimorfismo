/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

import ito.clases.Figura;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Triangulo.
 * 
 * @author rherrera
 */
public class Triangulo extends Figura {
	

	/**
	 * Description of the property altura.
	 */
	private float altura = 0F;

	// Start of user code (user defined attributes for Triangulo)

	// End of user code

	public Triangulo(float medidaLado, float altura) {
		super("Triangulo",3, medidaLado);
		this.altura = altura;
	}
	/**
	 * The constructor.
	 */
	public Triangulo() {
		// Start of user code constructor for Triangulo)
		super();
		// End of user code
	}

	/**
	 * Description of the method calculaArea.
	 * @return 
	 */
	public float calculaArea() {
		// Start of user code for method calculaArea
		float calculaArea = this.getMedidaLado()*this.altura/2;
		return calculaArea;
		// End of user code
	}

	/**
	 * Description of the method calculaPerimetro.
	 * @return 
	 */
	public float calculaPerimetro() {
		// Start of user code for method calculaPerimetro
		float calculaPerimetro = this.getMedidaLado()*this.getCantidaLados();
		return calculaPerimetro;
		// End of user code
	}

	// Start of user code (user defined methods for Triangulo)

	// End of user code
	/**
	 * Returns altura.
	 * @return altura 
	 */
	public float getAltura() {
		return this.altura;
	}

	/**
	 * Sets a value to attribute altura. 
	 * @param newAltura 
	 */
	public void setAltura(float newAltura) {
		this.altura = newAltura;
	}
	@Override
	public String toString() {
		return "Triangulo [Titulo=" + getTitulo() + ", altura=" + altura + ", Cantidad de Lados="
				+ getCantidaLados() + ",Base=" + getMedidaLado() + "]";
	}
	@Override
	public int compareTo(Figura o) {
		// TODO Auto-generated method stub
		float a1=this.calculaArea();
		float a2=((Triangulo)o).calculaArea();
		int compare=0;
		if(a1<a2)
			compare=-1;
		else if(a1>a2)
			compare=1;
		return compare;
	}

}
