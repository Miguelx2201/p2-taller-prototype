package punto1;

import java.util.HashMap;
import java.util.Map;

public class RegistroPlantilla {
    private Map<String, Prototipo> cache = new HashMap<>();

    public void registrar(String clave, Prototipo proto) {
        cache.put(clave, proto);
    }

    public Prototipo obtener(String clave) {
        Prototipo proto = cache.get(clave);
        if (proto == null) throw new RuntimeException("No existe:"+clave);
        return proto.clonar();
    }

}
