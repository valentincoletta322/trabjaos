import java.util.ArrayList;

public class Cantante extends Persona{
    private String nombreArtistico;
    private ArrayList<Cancion> canciones;

     public Cantante() {
        super();
        this.nombreArtistico = "El indio Solari";
        this.canciones = new ArrayList<>();
    }

    public Cantante(String nombreArtistico) {
        super();
        this.nombreArtistico = nombreArtistico;
        this.canciones = new ArrayList<>();
    }


    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Cancion> obtenerCancionesLargas(){
        ArrayList<Cancion> cancionesLargas = new ArrayList<>();
        for(Cancion unaCancion : canciones){
            if (unaCancion.esUnaCancionlarga()) cancionesLargas.add(unaCancion);
        }
        return cancionesLargas;
    }

}
