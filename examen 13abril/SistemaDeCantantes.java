import java.util.ArrayList;

public class SistemaDeCantantes {
    private ArrayList<Cantante> cantantes;

    public SistemaDeCantantes() {
        this.cantantes = new ArrayList<>();
    }

    public ArrayList<Cantante> obtenerCantantesJovenes(){
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();
        for (Cantante unCantante:cantantes){
            if(unCantante.esUnAdultoJoven()) cantantesJovenes.add(unCantante);
        }
        return cantantesJovenes;
    }

    public void agregarCancion(String nombreArtistico, String nombreCancion, int duracionEnSegundos){
        for (Cantante unCantante:cantantes) {
            if (unCantante.getNombreArtistico()==nombreArtistico){
                Cancion unaCancion = new Cancion(nombreCancion,duracionEnSegundos);
                ArrayList<Cancion> cancionesAux = unCantante.getCanciones();
                cancionesAux.add(unaCancion);
                unCantante.setCanciones(cancionesAux);
            }
        }
    }

    public static void main(String[] args){

        Cantante nuevoCantante = new Cantante();
        System.out.println(nuevoCantante.getNombreArtistico());
        nuevoCantante.setNombreArtistico("maradona");
        System.out.println(nuevoCantante.getNombreArtistico());


    }

}
