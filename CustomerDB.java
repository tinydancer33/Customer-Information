/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import package.Customer;
package customerinformation.CustomerData;


/**
 *
 * @author eosborn3
 */
public class CustomerDB {
public static Customer getCustomer(int customer_number) {
    Customer Customer = new Customer();
    if (customer_number==123){
    return new Customer("Michael Martin","1376 Hill Street","Luckey","OH","43443");
    }
    
    return null;
}
}