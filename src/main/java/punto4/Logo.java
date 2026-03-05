package punto4;

import punto1.Prototipo;

import java.util.ArrayList;
import java.util.List;

public class Logo implements Prototipo1{
    private String nombre;
    private List<String> colores;
    private int ancho;
    private int alto;
    private String formato;
    private String eslogan;

    public Logo(String nombre, List<String> colores, int ancho, int alto, String formato, String eslogan) {
        this.nombre = nombre;
        this.colores = colores;
        this.ancho = ancho;
        this.alto = alto;
        this.formato = formato;
        this.eslogan = eslogan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getColores() {
        return colores;
    }

    public void setColores(List<String> colores) {
        this.colores = colores;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    @Override
    public String toString() {
        return "Logo{" +
                "nombre='" + nombre + '\'' +
                ", colores=" + colores +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", formato='" + formato + '\'' +
                ", eslogan='" + eslogan + '\'' +
                '}';
    }

    @Override
    public Prototipo1 clonar() {
        return new Logo(this.nombre,new ArrayList<>(this.colores), this.ancho, this.alto, this.formato, this.eslogan);
    }
}
