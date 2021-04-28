package ito.app;

import ito.clases.Triangulo;
import ito.clases.Cuadrado;

public class MyApp {
	
	static int getMenor(int [] a) {
		int menor=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]<menor)
				menor=a[i];
		return menor;
	}
	
	static String getMenor(String [] a) {
		String menor=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i].compareTo(menor)<0)
				menor=a[i];
		return menor;
		
	}
	
	static Triangulo getMenor(Triangulo[]a) {
		Triangulo menor=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i].compareTo(menor)<0)
				menor=a[i];
		return menor;
	}
	
	static Cuadrado getMenor(Cuadrado[]a) {
		Cuadrado menor=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i].compareTo(menor)<0)
				menor=a[i];
		return menor;
	}

	static void run() {
		int arreglo[]= {46,62,42,87,72,42,63,27,81,19,22,65,32,12,43,54};
		String arreglo2[]= {"Maria","Luisa","ANA","Felipe","Hugo","Alan","Alma"};
	    Triangulo arreglo3[]= {new Triangulo(35,45),new Triangulo(60,30),new Triangulo(70,20)};
	    Cuadrado arreglo4[]= {new Cuadrado(40),new Cuadrado(60), new Cuadrado(8)};
		System.out.println(getMenor(arreglo));
	    System.out.println(getMenor(arreglo2));
	    System.out.println(getMenor(arreglo3));
	    System.out.println(getMenor(arreglo4));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         run();
	}

}
