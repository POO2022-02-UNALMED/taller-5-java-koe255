package gestion;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private Animal[] animales;

    public Zona() {
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public void agregarAnimales(Animal animal) {
        Animal[] animales = new Animal[this.animales.length + 1];
        for (int i = 0; i < this.animales.length; i++) {
            animales[i] = this.animales[i];
        }
        animales[animales.length - 1] = animal;
        this.animales = animales;
    }

    public int cantidadAnimales() {
        return this.animales.length;
    }
}
