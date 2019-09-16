/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerinformation.CustomerData;

import java.util.Scanner;

/*Name: Erica Osborn
Date: 09/14/19
Description: Customer information database application.
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Customer Viewer: Version 1.0 ");
        Scanner scanner = new Scanner(System.in);
        
       
        
        String input = "y";
        while (input.equalsIgnoreCase("y")) {
        
        System.out.println("Please enter a customer number: ");
        int customer_number = scanner.nextInt();
        Customer customer= CustomerDB.getCustomer(customer_number);
        
        if (input == customer.getNameAndAddress()){
            
            System.out.println("\n" + customer.getNameAndAddress());
            
       }else{
            
             System.out.println("Customer number does not exist");
            
         }
        
        
        
        System.out.println("Display another customer number? (y/n) ");
        input = scanner.next();
    }
    
}
}
