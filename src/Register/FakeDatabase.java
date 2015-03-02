/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

/**
 *
 * @author Alex
 */
//Strategy PAttern
public class FakeDatabase implements RetailDatabaseStrategy  {

  
    Customer[] customers = {
       new Customer("100","Alex Woodward","259 Lakeridge Dr"),
       new Customer("200","Jim James","888 PoolHouse Rd"), 
       new Customer("300","Tyrion Lanister","Castlevania")
    
    };
    
    
  Product[] products = { 
      new Product("A123", "Scarf", .2, new PercentageDiscountStrategy(.10) ),
      new Product("B136", "Soy", 20.00, new NoDiscount() ),
      new Product("C368", "Cd", 15.00, new QtyDiscount() )
  };

  
    @Override
    public final Product findProduct(final String prodId) {
    if (prodId == null || prodId.length() == 0){
        
        return null;
    }
    
    Product product = null;
    
    for(Product p:products){
     if(prodId.equals(p.getProdNo())){
         product = p;
         break;
     }   

       }
      return product; 
    }
    
    @Override
     public final Customer findCustomer(final String custID) {
    if (custID== null || custID.length() ==0){
        
        return null;
    }
    
    Customer customer = null;
    
    for(Customer c:customers){
     if(custID.equals(c.getCustID())){
         customer = c;
         break;
     }   

       }
      return customer; 
    }
    
 
};
  
  



