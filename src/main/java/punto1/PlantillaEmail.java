package punto1;

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

    @Override
    public String toString() {
        return "PlantillaEmail{" +
                "asunto='" + asunto + '\'' +
                ", cuerpoHtml='" + cuerpoHtml + '\'' +
                ", destinatarios=" + destinatarios +
                ", etiquetas=" + etiquetas +
                '}';
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpoHtml() {
        return cuerpoHtml;
    }

    public void setCuerpoHtml(String cuerpoHtml) {
        this.cuerpoHtml = cuerpoHtml;
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }
}
