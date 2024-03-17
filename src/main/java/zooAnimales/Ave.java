package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal {
	private static ArrayList<Ave>listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad, habitat,genero);
		this.colorPlumas= colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		listado.add(this);
	}
	public int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		Ave halcon= new Ave(nombre,edad,"montañas", genero, "cafe glorioso" );
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		Ave halcon= new Ave(nombre,edad,"montañas", genero, "blanco y amarillo" );
		aguilas++;
	}
	//METODOS GETTER Y SETTER
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado= listado;	
	}
	
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setColorPlumas(String i) {
		this.colorPlumas= i;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	
}
