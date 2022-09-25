import java.util.Scanner;
public class EjercicioAreas {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int opc,preg;
        
        float base,altura,area = 0,radio;
        
        do{
            System.out.println("++++++++++ CALCULADORA DE AREA DE FIGURAS ++++++++++");
            System.out.println("Digite su opcion. 1: Area Cuadrado. 2:Area Circulo. 3:Area Triangulo");
            opc=sc.nextInt();
            
            switch(opc){
                case 1:{
                    System.out.println("++++++++++ AREA DEL CUADRADO ++++++++++");
                    System.out.println("Digite el valor del lado 1: ");
                    base = sc.nextFloat();
                    System.out.println("Digite el valor del lado 2: ");
                    altura = sc.nextFloat();
                    area=base*altura;
                    
                    System.out.println("El area del cuadrado es: "+area);
                    break;
                }
                case 2:{
                    System.out.println("++++++++++ AREA DEL CIRCULO ++++++++++");
                    System.out.println("Digite el valor del radio: ");
                    radio = sc.nextFloat();
                    area=(float) (Math.pow(area, 2)*Math.PI);
                    
                    System.out.println("El area del circulo es: "+area);
                    break;
                }
                case 3:{
                    System.out.println("++++++++++ AREA DEL TRIANGULO ++++++++++");
                    System.out.println("Digite el valor de la base: ");
                    base = sc.nextFloat();
                    System.out.println("Digite el valor de la altura: ");
                    altura = sc.nextFloat();
                    area=(base*altura)/2;

                    System.out.println("El area del triangulo es: "+area);
                    break;
                }
            }
            System.out.print("Quieres calcular otra area? (1:SI. 2:NO)");
            preg = sc.nextInt();
        }while(preg==1);
        
    }
            
}
