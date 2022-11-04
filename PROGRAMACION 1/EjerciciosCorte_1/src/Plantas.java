public class Plantas { 
    String nombre;
    float tamaño,crecimiento;
    int dias;

    public Plantas(String nombre, float tamaño, float crecimiento) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.crecimiento = crecimiento;
    }
     static void Crecimiento (Plantas p1,Plantas p2,Plantas p3){
      int dias=1;
      float tamaFinP1=p1.tamaño,tamaFinP2=p2.tamaño,tamaFinP3=p3.tamaño;
      boolean tbP1=true, tbP2=true, tbP3=true;
      
        while ((tamaFinP1<=30) && (tamaFinP2<=30) && ( tamaFinP3<=30)){
            dias ++;
            tamaFinP1=(tamaFinP1*p1.crecimiento)+tamaFinP1;
        }
        dias=1;
        while(tamaFinP2!=30){
            dias++;
            tamaFinP2=(tamaFinP2*p2.crecimiento)+tamaFinP2;
            p2.dias=dias;
        }
        dias=1;
        while(tamaFinP3!=30){
            dias++;
            tamaFinP3=p3.crecimiento+tamaFinP3;
            p3.dias=dias;
        }
     }
     
    static void GetMenor(Plantas p1,Plantas p2,Plantas p3){
        int primero,segundo,tercero;
    }
    
    public static void main(String[] args) {

      Plantas p1= new Plantas("Clementina",(float) 10, (float) 0.01); 
      Plantas p2= new Plantas("Crisis", (float)20, (float) 0.005); 
      Plantas p3= new Plantas("Lucho", (float)5, (float) 0.5); 
      Crecimiento(p1,p2,p3);
      
    }
}