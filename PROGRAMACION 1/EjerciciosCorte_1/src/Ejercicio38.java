/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] arg){
         Scanner sc= new Scanner (System.in);
        double  a, b, c, d, f, g, h, jA, jB, fIA, fIB, pI, i, tanA, tanB;

        System.out.println("ingrese el valor de i");
        i=sc.nextInt(); 
        tanA=0;
        tanB=0;
        for (int n=1; n<=i; n++){

            c= n-1;
            d= Math.pow(-1, c);
            f= 2*n-1;
            g=d/f;
            h=2*n-1;
            jA=Math.pow(0.2,h);
            jB=Math.pow(0.00390625, h);
            fIA=g*jA;
            fIB=g*jB; 


              tanA=tanA+fIA;
              tanB=tanB+fIB;

        }
        a=16*tanA;
        b=4*tanB; 
        pI=a-b;
        System.out.println(pI);

    }
}
