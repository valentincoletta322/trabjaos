import java.util.ArrayList;

public class Persona {

    private int dni;
    private String nombre;
    private int edad;
    private int telefono;
    private String direccion;

    public Persona() {
        this.dni = 1000000;
        this.nombre = "Martin Martinez";
        this.edad = 18;
        this.telefono = 150000;
        this.direccion = "Calle falsa 123";
    }

    /* getters */
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    /* setters */
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

class Madre extends Persona{
    private String nombreDeEmpresa;
    private ArrayList<Hijo> listaHijos = new ArrayList<>();



    public String getNombreDeEmpresa() {
        return nombreDeEmpresa;
    }

    public void setNombreDeEmpresa(String nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }

    public ArrayList<Hijo> getListaHijos() {
        return listaHijos;
    }

    public void setListaHijos(ArrayList<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
    }

    public Madre() {
    }

    public Madre(String nombreDeEmpresa, ArrayList<Hijo> listaHijos) {

        this.nombreDeEmpresa = nombreDeEmpresa;
        this.listaHijos = listaHijos;
    }

    public Madre(String nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }

    public ArrayList<Hijo> devolverHijosMenores() {
        ArrayList<Hijo> hijosMenores = new ArrayList<>();



        for (Hijo unHijo : listaHijos) {
            if(unHijo.getEdad()>17){
                hijosMenores.add(unHijo);
            }
        }
        return hijosMenores;
    }



}

class Hijo extends Persona{
    private String escuela;
    private String juegoFavorito;

    public Hijo() {
    }

    public Hijo(String escuela, String juegoFavorito) {
        this.escuela = escuela;
        this.juegoFavorito = juegoFavorito;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }
}