/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_polimorfismo;

/**
 *
 * @author Admin
 */

  public class Polimorfismo {
 
	public static void main(String[] args) {
 
		// Creamos una variable del tipo MiClaseA, que sera un array de 3 elementos
		MiClaseA [] misClases=new MiClaseA[3];
 
		misClases[0]=new MiClaseA("Esther");
 
		// Asignamos a la variable misClases que son del tipo MiClaseA un objeto del
		// tipo MiClaseB, ya que hereda de MiClaseA
		misClases[1]=new MiClaseB("Juan", "Azul");
 
		misClases[2]=new MiClaseA("Rosa");
 
		for(MiClaseA e:misClases) {
 
			// ejecutara la función info() de la clase que haya sido instanciada.
			// Esto se llama polimorfismo
			System.out.println(e.info());
		}
	}
}
 
class MiClaseA {
 
	private String name;
 
	// constructor
	public MiClaseA(String name) {
		this.name=name;
	}
 
	public String info() {
		// Devolvemos el nombre
		return this.name;
	}
}
 
class MiClaseB extends MiClaseA {
 
	private String color;
 
	// constructor
	public MiClaseB(String name, String color) {
 
		// ejecutamos el constructor de la superclase (MiClaseA) enviandole el nombre
		super(name);
 
		// guardamos el nombre del color en la variable color de MiClaseB
		this.color=color;
	}
 
	public String info() {
 
		// devolvemos el contenido de MiClaseA.info() mas la variable color
		// de la clase MiClaseB
		return super.info() + " (" + this.color + ")";
	}
}  

