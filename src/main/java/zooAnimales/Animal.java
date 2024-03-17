package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales=0;
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre= nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	public Animal() {
		totalAnimales++;
	}
	
	@Override
	public String toString(){
		if (zona!=null) {
		return "Mi nombre es " + nombre + ", tengo una edad de "+ edad +", habito en "
				+ habitat +" y mi genero es " + genero + ", la zona en la que me ubico es "
				+ zona + "en el " + zona.getZoo ; }
		else {
			return "Mi nombre es " + nombre + ", tengo la edad de "+ edad + ", habito en "
					+ habitat + " y mi genero es " + genero;	
		}
   }
	
   public String movimiento() {
	   return "desplazarse";
	   }
   
   //METODOS SETTER Y GETTER PARA ATRIBUTOS
   public void setNombre(String nombre) {
	   this.nombre= nombre;   
   }
   
   public String getNombre() {
	   return nombre;
   }
   
   public void setEdad(int edad) {
	   this.edad= edad;
   }
   public int getEdad() {
	   return edad;
   }
   
   public void setHabitat(String habitat) {
	   this.habitat= habitat;
   }
   public String getHabitat() {
	   return habitat;
   }
   
   public void setGenero(String genero) {
	   this.genero= genero;
   }
   public String getGenero() {
	   return genero;
   }
   
   public int getTotalAnimales() {
	   return totalAnimales;
   }
   public void setAnimales(int totalAnimales) {
	   this.totalAnimales= totalAnimales;
   }
   public Zona getZona() {
       return zona;
   }
   public void setZona(Zona zona) {
       this.zona = zona;
   }
}