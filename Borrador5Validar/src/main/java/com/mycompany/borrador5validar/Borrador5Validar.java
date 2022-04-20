package com.mycompany.borrador5validar;
import java.util.Scanner;
public class Borrador5Validar {

    public static void main(String[] args) {
        //VALIDAR DATOS
        int entero;
        Scanner entrada=new Scanner(System.in);
        while(true){
            try{
                System.out.print("Registre numero: ");
                entero=entrada.nextInt();
                System.out.println("REGISTRO CORRECTO");
                break;
            }
            catch(Exception e){
                System.out.println("EL DATO NO ES ENTERO :( ");
            }
        }
    }
}
