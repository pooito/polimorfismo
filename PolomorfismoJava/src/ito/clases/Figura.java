/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.clases;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Figura.
 * 
 * @author rherrera
 */
public abstract class Figura {
	
	/**
	 * Description of the property titulo.
	 */
	private String titulo = "";

	/**
	 * Description of the property cantidaLados.
	 */
	private int cantidaLados = 0;

	/**
	 * Description of the property medidaLado.
	 */
	private float medidaLado = 0F;

	// Start of user code (user defined attributes for Figura)

	// End of user code

	public Figura(String titulo, int cantidaLados, float medidaLado) {
		super();
		this.titulo = titulo;
		this.cantidaLados = cantidaLados;
		this.medidaLado = medidaLado;
	}

	/**
	 * The constructor.
	 */
	public Figura() {
		// Start of user code constructor for Figura)
		super();
		// End of user code
	}

	/**
	 * Description of the method calculaArea.
	 * @return 
	 */
	public abstract float calculaArea();

	/**
	 * Description of the method calculaPerimetro.
	 * @return 
	 */
	public abstract float calculaPerimetro();

	/**
	 * Description of the method dsd.
	 */
	public void dsd() {
		// Start of user code for method dsd
		// End of user code
	}

	// Start of user code (user defined methods for Figura)

	// End of user code
	/**
	 * Returns titulo.
	 * @return titulo 
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * Sets a value to attribute titulo. 
	 * @param newTitulo 
	 */
	public void setTitulo(String newTitulo) {
		this.titulo = newTitulo;
	}

	/**
	 * Returns cantidaLados.
	 * @return cantidaLados 
	 */
	public int getCantidaLados() {
		return this.cantidaLados;
	}

	/**
	 * Sets a value to attribute cantidaLados. 
	 * @param newCantidaLados 
	 */
	public void setCantidaLados(int newCantidaLados) {
		this.cantidaLados = newCantidaLados;
	}

	/**
	 * Returns medidaLado.
	 * @return medidaLado 
	 */
	public float getMedidaLado() {
		return this.medidaLado;
	}

	/**
	 * Sets a value to attribute medidaLado. 
	 * @param newMedidaLado 
	 */
	public void setMedidaLado(float newMedidaLado) {
		this.medidaLado = newMedidaLado;
	}

}
