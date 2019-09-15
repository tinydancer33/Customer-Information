/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerinformation.Customer;

//*Name: Erica Osborn
//Date: 09/14/19
//Description: Customer information database application.


public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String dummynameadd;
    
   public Customer (String name, String address, String city, String state, 
            String zipCode){
            this.name = name;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            
    }
    //name info
    public String getname(){
        return name;
    }
     public void setname(String name){
        this.name =name;
    }
     
    //address info
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    //city info
    public String getcity(){
        return city;
    }
    public void setcity(String city){
        this.city = city;
    }
    //state info
    public String getstate(){
        return state;
    }
     public void setstate(String state){
        this.state = state;
    }
    public String getzipCode(){
        return zipCode;
    }
    public void setzipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }
    public String getNameAndAddress()
    {
        dummynameadd=name+"\n"+address+" "+city+", "+state+" "+zipCode;
        return dummynameadd;
    } 
    
    
    
}
