package gestion;

import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico() {
        this(null, null);
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Zona> getZona() {
        return zonas;
    }

    public void setZona(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (int i = 0; i < this.zonas.size(); i++) {
            total += this.zonas.get(i).cantidadAnimales();
        }
        return total;
    }
}
