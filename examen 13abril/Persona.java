public class Persona {
    private int dni;
    private String nombre;
    private int edad;
    private String direccion;

    public Persona() {
        this.dni = 12312;
        this.nombre = "Juan";
        this.edad = 18;
        this.direccion = "callefalsa 123";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public boolean esUnAdultoJoven(){
        if (this.edad >= 18 && this.edad <= 35){
            return true;
        }
        return false;
    }


}
