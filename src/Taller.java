/**
 * Created by USER on 17/10/2016.
 */    import java.util.*;

public class Taller {

        private Map<Persona, Coche> reparaciones =
                new TreeMap<>(Comparator.comparing(Persona::getNombre));

        public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.put(persona,coche);
        }

        public Coche obtenerCoche(Persona persona){
                return reparaciones.get(persona);
        }

        public Set<Persona> obtenerClientes(){
                return reparaciones.keySet();
        }
        public Collection <Coche> obtenerColleccionCoches(){
                return reparaciones.values();
        }

}
