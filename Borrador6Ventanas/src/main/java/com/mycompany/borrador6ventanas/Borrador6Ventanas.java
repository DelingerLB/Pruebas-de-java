
package com.mycompany.borrador6ventanas;
import javax.swing.JOptionPane;

public class Borrador6Ventanas {
    
    public static void main(String[] args) {
        /**
        String saludo="HM";
        JOptionPane.showMessageDialog(null,saludo,"AVISO",2);
        **/
        
        /**
        String texto;
        texto=JOptionPane.showInputDialog(null,"REGISTRE TEXTO");
        System.out.println(texto);
        **/
        
        //EDAD
        // if (var1 instanceof String)
        String nacimiento,actual;
        int auxiliar,nac,act,edad;
        while(true){
            nacimiento=JOptionPane.showInputDialog(null,"REGISTRE AÑO DE NACIMIENTO","SOLICITUD",2);
            if (nacimiento!=null){
                try{
                    auxiliar=Integer.parseInt(nacimiento);
                    if (auxiliar>=0){
                        nac=auxiliar;
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"EL DATO NO ES POSITIVO---REINTENTAR","ERROR",0);
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"EL DATO NO ES ENTERO---REINTENTAR","ERROR",0);
                }
            }
            else{
                continue;
            }
        }
        while(true){
            actual=JOptionPane.showInputDialog(null,"REGISTRE AÑO ACTUAL","SOLICITUD",2);
            if (actual!=null){
                try{
                    auxiliar=Integer.parseInt(actual);
                    if (auxiliar>=0){
                        act=auxiliar;
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"EL DATO NO ES POSITIVO---REINTENTAR","ERROR",0);
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"EL DATO NO ES ENTERO---REINTENTAR","ERROR",0);
                }
            }
            else{
                continue;
            }
        }
        edad=act-nac;
        JOptionPane.showMessageDialog(null,"TU EDAD ES "+edad,"AVISO",1);
    }
    /**
    yCARDENAS@OUTLOOK.COM
    **/
}
