/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johannes
 */

import java.util.Scanner;

public class Coverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menu\n");
        System.out.println("1. Feet to Meters\n"
                + "2. Pounds to Kilograms\n"
                + "3. Fahrenheit to Celcius\n");
        
        int option = scan.nextInt();
        double value;
        
        switch(option){
        
            case 1:
                System.out.print("Eneter Value: ");
                value = scan.nextFloat();
                System.out.println(value + " Feet = " + 0.305*value + " meters");
            break;
            case 2:
                System.out.print("Eneter Value: ");
                value = scan.nextFloat();
                System.out.println(value + " Pounds = " + 0.454*value + " Kilograms");
            break;
            case 3:
                System.out.print("Eneter Value: ");
                value = scan.nextFloat();
                System.out.println(value + " degrees Fahrenheit = "  + ((value-32)/1.8) + " degrees Celcius"); 
            break;
            default:
                System.out.println("Wrong output");
        }
    }
    
}
