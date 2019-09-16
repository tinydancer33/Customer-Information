/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerinformation.CustomerData;
import java.util.Scanner;


//*Name: Erica Osborn
//Date: 09/14/19
//Description: Customer information database application.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import customerinformation.CustomerData.CustomerDB;
/**
 *
 * @author eosborn3
 */
public class CustomerDB {
public static Customer getCustomer(int customer_number) {
   
    if (customer_number==123){
    return new Customer("Michael Martin","1376 Hill Street","Luckey","OH","43443");
    }
    
    if (customer_number==124){
    return new Customer("Marjorie Galvan","3144 Hillcrest Avenue","Cambridge,","MA","02141");
    }
    
    if (customer_number==125){
    return new Customer("Rebecca Cain","3572 New Street","Jefferson,","OR","97352");
    }
    
    if (customer_number==126){
    return new Customer("Erica Osborn","3490 West Virginia Street","Lakewood","CO","80226");
    }
    
    return null;
}
}
    
    

