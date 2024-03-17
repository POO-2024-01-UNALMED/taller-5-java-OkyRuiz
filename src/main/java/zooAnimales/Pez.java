package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad, habitat,genero);
		this.colorEscamas= colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public Pez() {
		listado.add(this);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
	Pez salmon= new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao= new Pez(nombre,edad,"oceano", genero ,"gris",6 );
		bacalaos++;
	}
	
	//METODOS SETTER Y GETTER
	public void setListado(ArrayList<Pez> listado) {
		this.listado= listado;	
	}

	public ArrayList<Pez> getListado(){
		return listado;
	}
	
	public void setColorEscamas(String i) {
		this.colorEscamas= i;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int i) {
		this.cantidadAletas= i;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}

}
