/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras66228;
import java.util.Scanner;
/**
 *
 * @author End User
 */
public class NumLetras66228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner entrada= new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO MENOR A 100");
        num=entrada.nextInt();
        
        
        String text = null;
        
        if (num>99){
            System.out.println("FAVOR DE INGRESAR UN NÚMERO MENOR A 100");
        }else{
            
        if (num<20){
        switch (num) {
            case 0:
                text="CERO";
                break;
            case 1:
                text="UNO";
                break;
            case 2:
                text="DOS";
                break;
            case 3:
                text="TRES";
                break;
            case 4:
                text="CUATRO";
                break;
            case 5:
                text="CINCO";
                break;
            case 6:
                text="SÉIS";
                break;
            case 7:
                text="SIETE";
                break;
            case 8:
                text="OCHO";
                break;
            case 9:
                text="NUEVE";
                break;
            case 10:
                text="DIEZ";
                break;
            case 11:
                text="ONCE";
                break;
            case 12:
                text="DOCE";
                break;
            case 13:
                text="TRECE";
                break;
            case 14:
                text="CATORCE";
                break;
            case 15:
                text="QUINCE";
                break;
            case 16:
                text="DIECISÉIS";
                break;
            case 17:
                text="DIECISIETE";
                break;
            case 18:
                text="DIECIOCHO";
                break;
            case 19:
                text="DIECINUEVE";
                break;
            default:
               
                break;
        }
        
        }
         if (num<30){
        switch (num) {
        case 20:
                text="VEINTE";
                break;
            case 21:
                text="VEINTIUNO";
                break;
            case 22:
                text="VEINTIDOS";
                break;
            case 23:
                text="VEINTITRES";
                break;
            case 24:
                text="VEINTICUATRO";
                break;
            case 25:
                text="VEINTICINCO";
                break;
            case 26:
                text="VEINTISÉIS";
                break;
            case 27:
                text="VEINTINUEVE";
                break;
            case 28:
                text="VEINTIOCHO";
                break;
            case 29:
                text="VEINTINUEVE";
                break;    
            default:
               
                break;
        }
        
          System.out.println(text);
          
        }
        
        if (num>30){
        String stext = null;
        int dec;
        int num2;
        num2=num%10;
        num=num/10;
        dec=num%10;
            
            switch (dec) {
                case 3:
                    stext="TREINETA";
                    break;
                case 4:
                    stext="CUARENTA";
                    break;
                case 5:
                    stext="CINCUENTA";
                    break;
                case 6:
                    stext="SESENTA";
                    break;
                case 7:
                    stext="SETENTA";
                    break;
                case 8:
                    stext="OCHENTA";
                    break;
                case 9:
                    stext="NOVENTA";
                    break;
                default:
                    
                    break;
           
        }
            
            switch (num2) {
                case 1:
                    text="UNO";
                    break;
                case 2:
                    text="DOS";
                    break;
                case 3:
                    text="TRES";
                    break;
                case 4:
                    text="CUATRO";
                    break;
                case 5:
                    text="CINCO";
                    break;
                case 6:
                    text="SÉIS";
                    break;
                case 7:
                    text="SIETE";
                    break;
                case 8:
                    text="OCHO";
                    break;
                case 9:
                    text="NUEVE";
                    break;
                default:

                   break;
            }
        
                       System.out.println(stext + " Y " + text);
        }
         
         
         }
    
}
}
