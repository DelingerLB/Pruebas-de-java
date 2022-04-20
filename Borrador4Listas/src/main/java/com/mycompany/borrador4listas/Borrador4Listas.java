package com.mycompany.borrador4listas;
import java.util.Scanner;
public class Borrador4Listas {

    public static void main(String[] args) {
        String[] nombres=new String[5];
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("REGISTRE NOMBRE: ");
            nombres[i]=entrada.nextLine();
        }
        System.out.printf("\nLas personas son:\n%s\n%s\n%s\n%s\n%s",nombres[0],nombres[1],nombres[2],nombres[3],nombres[4]);
    }
}
