
public class Personas {

   private int dni;
   private int edad;
   private int telefono;
   private String nombre;
   private String direccion;

    //Crea un constructor de clase para Personas
    public Personas() {

        this.nombre="Juan Jose Atilio";
        this.dni = 45111222;
        this.edad = 18;
        this.telefono = 52224356;


    }

    public Personas(String name){
        this.nombre = name;

    }

    public Personas(String name, int edad1, int fono, int id, String dir){
        this.nombre = name;
        this.dni = id;
        this.edad = edad1;
        this.telefono = fono;
        this.direccion = dir;
    }

    /*---------------------------*/
            /* Edad */

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad1){
        this.edad = edad1;
    }
    /*---------------------------*/
            /* Nombre */

    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre1) {
         this.nombre = nombre1;
    }
    /*---------------------------*/

    /*---------------------------*/
            /* Telefono */

    public int getTelefono() {
        return this.telefono;
    }


    public void setTelefono(int telefono1) {
        this.telefono = telefono1;
    }
    /*---------------------------*/


    public boolean sonLaMismaPersona(Personas p){
        if (this.dni == p.dni) return true;
        else return false;
    }

    public void duplicarEdad(){
        this.edad = this.edad*2;
    }



    public static void main(String[] args) {

        Personas Persona1 = new Personas(); // Create an object of class Personas (Llama al constructor default)

        Personas Persona2 = new Personas("JUJA"); //Llama al constructor del string

        Personas Persona3 = new Personas("Vegetta777", 60, 4545189, 46123569, "Avenida Cochabamba 231");

        System.out.println("*--------------------------*");

        System.out.println("Prueba get " +Persona3.getEdad());

        if (Persona1.sonLaMismaPersona(Persona2)) System.out.println("Son la misma persona");

        else System.out.println("No son la misma persona");

        Persona2.setTelefono(4811231);

        System.out.println("*--------------------------*");

        System.out.println(Persona1.edad + " Antes de duplicar la edad");

        Persona1.duplicarEdad();


        System.out.println(Persona1.edad + " Se duplico la edad");

        System.out.println("*--------------------------*");
        System.out.println("P3:");

        System.out.println("Dni: " + Persona3.edad+ " Edad: "+ Persona3.edad);
        System.out.println("Nombre: " + Persona3.nombre+ " Direccion: "+Persona3.direccion);
        System.out.println("Telefono: " + Persona3.telefono);




    }
