import java.util.*;
public class Plantas { 
    String nombre;
    float tamaño,crecimiento;
    int dias;
    String cultivador;
    public Plantas(String cultivador,String nombre, float tamaño, float crecimiento) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.crecimiento = crecimiento;
        this.cultivador=cultivador;
    }
     static void Crecimiento (Plantas p1,Plantas p2,Plantas p3){
      int dias=0;
      float tamaFinP1=p1.tamaño,tamaFinP2=p2.tamaño,tamaFinP3=p3.tamaño;
      boolean tbP1=true, tbP2=true, tbP3=true;
        while (tamaFinP1<=30){
            dias ++;
            tamaFinP1=(tamaFinP1*p1.crecimiento)+tamaFinP1;
            p1.dias=dias;
            p1.tamaño=(float) Math.floor(tamaFinP1);
        }
        dias=0;
        while(tamaFinP2<=30){
            dias++;
            tamaFinP2=(tamaFinP2*p2.crecimiento)+tamaFinP2;
            p2.dias=dias;
            p2.tamaño=(float) Math.floor(tamaFinP2);
        }
        dias=0;
        while(tamaFinP3<=30){
            dias++;
            tamaFinP3=p3.crecimiento+tamaFinP3;
            p3.dias=dias;
            p3.tamaño=(float) Math.floor(tamaFinP3);
        }
     }
    static void GetMenor(Plantas p1,Plantas p2,Plantas p3){
        Scanner sc = new Scanner(System.in);
        int primero=1,segundo=1,tercero=1;
        Plantas obj1 = p1;
        Plantas obj2 = p1;
        Plantas obj3 = p1;
        
        if((p1.dias<p2.dias) && (p1.dias<p3.dias) ){
            primero=p1.dias;
            obj1=p1;
            if(p2.dias<p3.dias){
                segundo=p2.dias;
                obj2=p2;
                tercero=p3.dias;
                obj3=p3;
            }
            else{
                segundo=p3.dias;
                obj2=p3;
                tercero=p2.dias;
                obj3=p2;
                
            }
        }
        else{
            if((p2.dias<p1.dias)&&(p2.dias<p3.dias)){
                obj1=p2;
                primero=p2.dias;
                if(p1.dias<p3.dias){
                    segundo=p1.dias;
                    obj2=p1;
                    tercero=p3.dias;
                    obj3=p3;
                }
                else{
                    segundo=p3.dias;
                    obj2=p3;
                    tercero=p1.dias;
                    obj3=p1;
                }
            }
            else{
                if((p3.dias<p1.dias)&&(p3.dias<p2.dias)){
                    primero=p3.dias;
                    obj1=p3;
                    if(p1.dias<p2.dias){
                        segundo=p1.dias;
                        obj2=p1;
                        tercero=p2.dias;
                        obj3=p2;
                    }
                    else{
                        segundo=p2.dias;
                        obj2=p2;
                        tercero=p1.dias;
                        obj3=p1;
                    }
                }
            }
        }
        String obj1Tam=Float.toString(obj1.tamaño);
        String obj2Tam=Float.toString(obj2.tamaño);
        String obj3Tam=Float.toString(obj2.tamaño);
        
        String obj1Dias=Integer.toString(obj1.dias);
        String obj2Dias=Integer.toString(obj2.dias);
        String obj3Dias=Integer.toString(obj3.dias);
        
        String [] titulo={"Cultivador","Nombre Planta","Tamaño Final","Numero Dias"};
        String [][] matriz={{obj1.cultivador,obj1.nombre,obj1Tam,obj1Dias},
                            {obj2.cultivador,obj2.nombre,obj2Tam,obj2Dias},
                            {obj3.cultivador,obj3.nombre,obj3Tam,obj3Dias}};
        for(int i=0;i<4;i++){
            System.out.print(titulo[i]+"  ");
        }
        System.out.println("");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
      Plantas p1= new Plantas("Juan","Clement",(float) 10, (float) 0.01); 
      Plantas p2= new Plantas("Luis","Crisis", (float)20, (float) 0.005); 
      Plantas p3= new Plantas("Ana","Lucho", (float)5, (float) 0.5); 
      Crecimiento(p1,p2,p3);
      GetMenor(p1, p2, p3);
    }
}