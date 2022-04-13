package com.mycompany.borrador3;
import java.util.Scanner;
public class Borrador3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        double matematica,quimica,fisica;
        double promedio;
        System.out.print("cual es tu nombre: ");
        nombre=entrada.nextLine();
        
        System.out.print("requerimos tus calificaciones\n");
        
        System.out.print("matematica: ");
        matematica=entrada.nextInt();
        
        System.out.print("quimica: ");
        quimica=entrada.nextInt();
        
        System.out.print("fisica: ");
        fisica=entrada.nextInt();
        
        promedio=(matematica+quimica+fisica)/3;
        
        System.out.println("el promedio final de "+nombre+" es "+promedio);
    }
}
