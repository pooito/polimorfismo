package ito.app;

import ito.clases.Figura;
import ito.clases.Triangulo;

public class MyApp {

	static void run() {
		Figura x;
		x= new Triangulo(43,55);
		System.out.println(x);
		System.out.println(x.calculaArea());
		System.out.println(x.calculaPerimetro());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

}
