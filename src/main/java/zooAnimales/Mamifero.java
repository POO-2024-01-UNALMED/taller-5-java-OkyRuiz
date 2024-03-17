package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat,genero);
		this.pelaje= pelaje;
		this.patas= patas;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	public void crearCaballos(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;	
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		Mamifero Leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	//METODOS GETTER Y SETTER
	public void setPelaje(boolean pelaje) {
		this.pelaje= pelaje;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas= patas;	
	}
	public int getPatas() {
		return patas;
	}
	
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado= listado;	
	}
	
	public ArrayList<Mamifero> getListado(){
		return listado;
	}
	

}
