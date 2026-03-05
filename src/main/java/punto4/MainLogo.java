package punto4;

import java.util.ArrayList;
import java.util.List;

public class MainLogo {
    public static void main(String[] args) {
        RegistroLogos registro=new RegistroLogos();

        List<String> coloresCorp= new ArrayList<>();
        coloresCorp.add("rojo");
        coloresCorp.add("verde");
        coloresCorp.add("azul");
        Logo logoCorporativo=new Logo("logoCorp",coloresCorp,12,10,"PDF","logo corporativo");

        List<String> coloresMinim= new ArrayList<>();
        coloresMinim.add("blanco");
        coloresMinim.add("negro");
        coloresMinim.add("gris");
        Logo logoMinimalista=new Logo("logoMini",coloresMinim,16,10,"PNG","logo minimalista");

        registro.registrar("corporativo",logoCorporativo);
        registro.registrar("minimalista",logoMinimalista);

        Logo copiaCorporativo= (Logo) registro.obtener("corporativo");

        List<String>coloresCopia=new ArrayList<>();
        coloresCopia.add("morado");
        coloresCopia.add("rosado");
        coloresCopia.add("dorado");

        copiaCorporativo.setColores(coloresCopia);

        System.out.println("colores logo corporativo original: "+logoCorporativo.getColores());
        System.out.println("colores copia logo corporativo: "+copiaCorporativo.getColores());


    }
}
