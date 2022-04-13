package com.mycompany.borrador2;

public class Borrador2 {

    public static void main(String[] args) {
        /**
        //PRUEBA DE DATOS ENTEROS
        int numero1=1;
        int numero2=2;
        int suma=numero1+numero2;
        System.out.println("La suma de "+numero1+" y "+numero2+" es "+suma);**/
        
        /**
        //PRUEBA DE NUMEROS DECIMALES
        double num1=2.5;
        double num2=3.8;
        double sum=num1+num2;
        System.out.println("El resultado de la suma de "+num1+" y "+num2+" es "+sum);**/
        
        /**
        //PRUEBA DE VARIABLE CHAR
        char letra1='a';
        char letra2='b';
        String frase="falta la dorada miel";
        System.out.println("la letra es "+letra1);
        System.out.println("la letra es "+letra2);
        System.out.println("la frase es "+frase);**/
        
        /**
        //PRUEBA DE CONDICIONALES
        int num1=13;
        int num2=25;
        
        if(num1>num2){
            System.out.println("el numero "+num1+" es mayor que "+num2);
        }
        else{
            System.out.println("El numero "+num2+" es mayor o igual que "+num1);
        }**/
        
        /**
        //PRUEBA DE BUCLE
        int contador=0;
        while(contador<10){
            contador++;
        }
        System.out.println("El valor del contador al final es "+contador);
        **/
        
        /**
        //CICLO FOR
        for (int i = 1; i < 21; i=i+2) {
            System.out.println("El valor de i es "+i);
        }**/
        //perro();
        //System.out.println(entero(3));
        
        //REFERENCIANDO LA CLASE Y LUEGO AL METODO (INSTANCIAR)
        Perro perrito=new Perro();
        perrito.ladrar();
        Gato gatito=new Gato();
        gatito.mauiar();
    }
}
