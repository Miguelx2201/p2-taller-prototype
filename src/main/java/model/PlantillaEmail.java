package model;

import java.util.ArrayList;
import java.util.List;

public class PlantillaEmail implements Prototipo{
    private String asunto;
    private String cuerpoHtml;
    private List<String> destinatarios;
    private List<String> etiquetas;

    public PlantillaEmail(String asunto, String cuerpoHtml, List<String> destinatarios, List<String> etiquetas) {
        this.asunto = asunto;
        this.cuerpoHtml = cuerpoHtml;
        this.destinatarios = destinatarios;
        this.etiquetas = etiquetas;
    }
    @Override
    public Prototipo clonar() {
        return new PlantillaEmail(this.asunto, this.cuerpoHtml, new ArrayList <>(this.destinatarios), new ArrayList<>(this.etiquetas));
    }
}
