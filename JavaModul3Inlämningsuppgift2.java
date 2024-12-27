/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamodul3inlämningsuppgift2;
import java.util.Scanner;


public class JavaModul3Inlämningsuppgift2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char fortsätt;
        
        do{
            // kön läses in genom att 'k'=kvinna eller 'm'=man väljes
            System.out.print("Ange kön(k/m): "); 
            char kön = input.next().charAt(0);
            // kontrollerar att antingen kvinna eller man valts
            if(!(kön == 'k' || kön == 'm')){ 
                break;                       
            }
            
            // längd läses in angivet i meter
            System.out.print("Ange längd i m (OBS - min 0,5 och max 2,2 m): ");
            float längd = input.nextFloat();
            // kontrollerar att längden är inom det angivna intervallet
            if (längd <0.5 || längd >2.2){
                break;
            }
            
            // vikt läses in angivet i kilogram
            System.out.print("Ange vikt i kg (OBS - min 10 och max 300 kg): ");
            float vikt = input.nextFloat();
            // kontrollerar att vikten är inom det angivna intervallet
            if (vikt <10 || vikt >300){
                break;
            }
            
            // anropar metoden bmi
            float bmi = bmi(längd, vikt); 
            
            // anropar metoden kalorier
            float bmr = kalorier(längd, vikt);
            
            // beräknar bmr för en man och skriver ut bmr samt bmi
            if (kön =='m'){
                float bmrman = bmr + 5;
                System.out.println("BMI är " +bmi +" och BMR är: " +bmrman);
             }
            // beräknar bmr för en kvinna och skriver ut bmr samt bmi
            else if (kön =='k'){
            float bmrkvinna = bmr - 161;
            System.out.println("BMI är " +bmi +" och BMR är: " +bmrkvinna);
             }
             
            // frågar användaren om man vill fortsätta eller avsluta programmet
            System.out.print("En gång till? (j/n)");
            fortsätt = input.next().charAt(0);
        
        }
        // om användaren väljer JA(j eller J) börjar programmet om, annars inte
            while (fortsätt =='j' || fortsätt=='J');
                               
              
}
        // huvudet för metoden bmi med parametrarna längd och vikt
        static float bmi(float längd, float vikt){
            
            //bmi beräknas 
            double bmi = (1.3*vikt)/Math.pow(längd, 2.5);
            
            //det uträknade värdet för bmi returneras till main
            return (float)bmi;
            
        }
        
        // huvudet för metoden kalorier med parametrarna längd och vikt
        static float kalorier(float längd, float vikt){
            Scanner input = new Scanner(System.in);
            
            // ålder läses in
            System.out.print("Ange ålder: ");
            int ålder = input.nextInt();
            
            // bmr beräknas
            float bmr = (float)(9.99 * vikt) + (float)(625 * längd) - (float)(4.92 * ålder);
            
            // det uträknade värdet för bmr returneras till main
            return bmr;
            
        }
}
    

