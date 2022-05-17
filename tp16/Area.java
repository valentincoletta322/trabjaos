import static java.lang.Math.PI;

public class Area {

    public static float circulo(float radio){
        return PI * radio * radio;
    }
  
    public static float esfera(float radio){
        return 4 * PI * radio * radio;
    }
  
    public static float cuadrado(float lado){
        return lado * lado;
    }
  
    public static float cubo(float lado){
        return lado * lado * 6;
    }
  
    public static float cuadrado(float base, float altura){
        return (base * altura)/2;
    }
  
}
