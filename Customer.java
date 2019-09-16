/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerinformation.CustomerData;

//*Name: Erica Osborn
//Date: 09/14/19
//Description: Customer information database application.


public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
   
    public Customer (String name, String address, String city, String state, 
            String zipCode){
            this.name = name;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            
            
    }
    
    
    
    public String getname(){
        return name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getcity(){
        return city;
    }
    
    public String getstate(){
        return state;
    }
    
    public String getzipCode(){
        return zipCode;
    }
    
    
    public void setname(String name){
        this.name = name;
    }
    
    public void setaddress(String address){
        this.address = address;
    }
    
    public void setcity(String city){
        this.city = city;
    }
    
    public void setstate(String state){
        this.state = state;
    }
    
     public void setzipCode(String zipCode){
        this.zipCode = zipCode;
    }
    
    
    public String getNameAndAddress(){
        
        System.out.println(name + address); 
        return this.name + this.address;
    }
    
    
    
    
    
}
