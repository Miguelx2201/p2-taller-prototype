package punto4;

import punto1.Prototipo;

import java.util.HashMap;
import java.util.Map;

public class RegistroLogos {
    private Map<String, Prototipo1> cache = new HashMap<>();

    public void registrar(String clave, Prototipo1 proto) {
        cache.put(clave, proto);
    }

    public Prototipo1 obtener(String clave) {
        Prototipo1 proto = cache.get(clave);
        if (proto == null) throw new RuntimeException("No existe:"+clave);
        return proto.clonar();
    }
}
