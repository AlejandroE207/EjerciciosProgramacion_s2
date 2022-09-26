import java.lang.Math;
public class POO_areaCirculo {
    private float area;
    private float radio;
    
    public POO_areaCirculo(float radio){
           this.radio = radio;
    }
    public float obtener_area(){
        float area = (float) (Math.PI*Math.pow(this.radio, 2));
        return area;
    }
    
    public static void main(String [] args){
        float r1= 2, r2=1;
        
        POO_areaCirculo c1 = new POO_areaCirculo(r1);
        POO_areaCirculo c2 = new POO_areaCirculo(r2);
     
        System.out.println("Area del circulo 1: "+c1.obtener_area());
        System.out.println("Area del circulo 2: "+c2.obtener_area());
    }
}


