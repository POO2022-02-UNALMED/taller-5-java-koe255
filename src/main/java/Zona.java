package gestion;

import zooAnimales.Animal;
import java.util.*;

public class Zona {
	private String nombre;
	private static ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();

	public Zona() {

	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		Zona.zoo.add(zoo);
	}

	public void agregarAnimales(Animal animales) {
		this.animales.add(animales);

	}

	public int cantidadAnimales() {
		return getAnimales().size();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public static Zoologico getZoo() {
		return Zona.zoo.get(0);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void setZoo(Zoologico zoo) {
		Zona.zoo.add(zoo);
	}

	public void setAnimales(Animal animales) {
		this.animales.add(animales);
	}

}
