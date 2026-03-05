package punto1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> destinatarios = new ArrayList<>();
        destinatarios.add("Profesor");

        List<String> etiquetas = new ArrayList<>();
        etiquetas.add("URGENTE");

        PlantillaEmail plantilla1 = new PlantillaEmail("EXCUSA MEDICA", "Falte a clase porque quise",destinatarios, etiquetas);
        PlantillaEmail plantilla2 = new PlantillaEmail("Declaración de amor", "te amo.....rdido un perro jaja caiste", destinatarios, etiquetas);

        RegistroPlantilla registro = new RegistroPlantilla();
        registro.registrar("Excusa", plantilla1);
        registro.registrar("Declaracion", plantilla2);

        PlantillaEmail copia = (PlantillaEmail)registro.obtener("Declaracion");
        copia.getDestinatarios().add("Novia");
        copia.setAsunto("Broma");

        System.out.println(plantilla2);
        System.out.println(copia);
    }
}
