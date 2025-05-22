import java.util.ArrayList;

public class GestorAgentes {
    private ArrayList<Agente> lista = new ArrayList<>();

    public void agregarAgente(Agente agente) {
        lista.add(agente);
    }

    public boolean modificarAgente(String id, String nuevoNombre, String nuevaMision, int nuevoPeligro, double nuevoPago) {
        Agente a = buscarAgente(id);
        if (a != null) {
            a.setNombre(nuevoNombre);
            a.setMision(nuevaMision);
            a.setPeligrosidad(nuevoPeligro);
            a.setPagoMensual(nuevoPago);
            return true;
        }
        return false;
    }

    public Agente buscarAgente(String id) {
        for (Agente a : lista) {
            if (a.getId().equals(id)) return a;
        }
        return null;
    }

    public ArrayList<Agente> getLista() {
        return lista;
    }
}
