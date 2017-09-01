/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.app.simpleapp;

import java.util.Scanner;
import simple.app.simpleapp.util.Calculator;

/**
 *
 * @author satye
 */
public class program {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        //Order
        Scanner input = new Scanner(System.in);
        Calculator calc=new Calculator();
           
        while (true) {
            System.out.println("Enter x");
            double x = input.nextDouble();
            System.out.println("Enter y");
            double y = input.nextDouble();

            //Menu
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mult");
            System.out.println("4. Div");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Power");
            System.out.println("8. Exit");
            System.out.println("9. Enter Your Choice [1-8]:");
            
            
            
            double total=0;
            switch(input.nextInt()){
                case 1:
                    total=calc.add(x, y);
                    break;
                case 2:
                    total=calc.sub(x, y);
                    break;
                case 3:
                    total=calc.mul(x, y);
                    break;
                case 4:
                    total=calc.div(x, y);
                    break;
                case 5:
                    total=calc.max(x, y);
                    break;
                case 6:  
                    total=calc.min(x, y);
                    break;
                case 7:
                    total=calc.power(x, y);
                    break;
                case 8:
                    System.exit(0);
                    break;
                    
                
            }

            System.out.println("The Total is " + total);
            System.out.println("Do you want to continue[y/N]:");
            
            if(input.next().equalsIgnoreCase("n")){
                System.exit(1);
            }
        } 
    }

}
