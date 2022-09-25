
import java.util.Scanner;

public class EjercicioCentrosTuristicos {

    public static void main(String[] arg) {
        Scanner sc = new Scanner (System.in);
        Scanner tc = new Scanner (System.in);
        int cantCT, sumH  = 0, opcion, mayor = 0, menor = 999999999, pos = 0;
        System.out.print("Digite la cantidad de Centros Turisticos: ");
        cantCT = sc.nextInt();
        String ct [] = new String [cantCT];
        int h [] = new int [cantCT * 2];
        int r [] = new int [cantCT];
        for (int i = 0; i < cantCT; i++){
            System.out.println("Digite el nombre del Centro Turistico: ");
            ct[i] = tc.nextLine();
            System.out.println("Digite la cantidad de habitaciones sencillas del Centro Turistico: ");
            h[i * 2] = sc.nextInt();
            System.out.println("Digite la cantidad de habitaciones dobles del Centro Turistico: ");
            h[i * 2 + 1] = sc.nextInt();
            System.out.println("Digite la cantidad de restaurantes del Centro Turistico: ");
            r[i] = sc.nextInt();
        }
        do{
            System.out.println("   Menu\n1. Centro Turistico con mas Restaurantes\n2. Centro Turistico con mas Habitaciones\n3. Consultar habitaciones por cada centro turistico\n4. Centro Turistico con mas restaurantes en relacion con las habitaciones\n5. Salir ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    for (int i = 0; i < cantCT; i++){
                        if (r[i] > mayor){
                            mayor = r[i];
                            pos = i;
                        }
                    }
                    System.out.println("El centro Turistico con mas restaurantes es: " + ct[pos]);
                    break;
                case 2:
                    for (int i = 0; i < cantCT; i++){
                        sumH = h[i * 2] + h[i * 2 + 1];
                        if (sumH > mayor){
                            mayor = sumH;
                            pos = i;
                        }
                    }
                    System.out.println("El Centro Turistico con mas Habitaciones (Sencillas y Dobles) es: " + ct[pos]);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del Centro Turistico del cual quiera conocer su informacion: ");
                    String cT = tc.nextLine();
                    for (int i = 0; i < cantCT; i++){
                        if (ct[i].equals(cT)){
                            pos = i;
                            sumH = h[i * 2] + h[i * 2 + 1];
                        }
                    }
                    System.out.println("El Centro Turistico " + ct[pos] + " tiene una cantidad de " + sumH + " habitaciones");
                    break;
                case 4:
                    for (int i = 0; i < cantCT; i++){
                        sumH = h[i * 2] + h[i * 2 + 1];
                        float prom = r[i] / sumH;
                        if (prom < menor){
                            menor = r[i];
                            pos = i;
                        }
                    }
                    System.out.println("El Centro Turistico con mas restaurantes en relacion con las habitaciones es: " + ct[pos]);
                    break;
            }
        }while (opcion != 5);
        System.out.println("Proceso Finalizado");
    }
}
