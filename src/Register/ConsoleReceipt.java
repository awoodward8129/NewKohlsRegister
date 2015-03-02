
package Register;

import java.text.NumberFormat;
import java.util.Locale;


public class ConsoleReceipt implements getRetailRecieptStrategy {
//initalize an array of LinItems
    private LineItem[] items = new LineItem[0];;
    private LineItem item = new LineItem();
    //LSP RetailDatabase
   RetailDatabaseStrategy db = new FakeDatabase();
   Customer customer;
    int qty;
    NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);

    public ConsoleReceipt() {
    }
     
  public ConsoleReceipt(String custID) {
      customer = db.findCustomer(custID);
    
    }
 
    public void addItem(String prodId, int qty){
       
        this.qty = qty;
      
   
    Product prod = item.findProduct(prodId);
  //
    LineItem[] temp = new LineItem[items.length + 1];
    //copy the array to a temp array
        System.arraycopy(items, 0, temp , 0, items.length);
        //temp array is equal to as many items as necessary
        temp[items.length] = new LineItem(prod, qty); // put in new slot
        items= temp;  // transfer pointer to original
    }
    
     private  double getSubTotal(){
        double subTotal=0;
      for(int i=0; i < items.length; i++ ){
          subTotal +=  items[i].getOriginalSubTotal();
     }
       return subTotal;
     }
    
    private double getTotal(){
    
     double total=0;
    
     for(int i=0; i < items.length; i++ ){
       total +=  items[i].getOriginalSubTotal() - items[i].getDiscountAmt();
    }
    
    return total;
    }
    
    @Override
    public void getRecieptFormat(){
    
        System.out.println( customer.getCustName());
        System.out.println(customer.getAddress());
        System.out.println("Your Customer number is: " + customer.getCustID());
       
        System.out.println("");
               
        System.out.format("%1s%20s%15s%12s%20s%10s", "ItemNo", "Item Description", "Unit Price", "Quantity", "Discount Amount", "Total");
        System.out.println("");
        
        for(int i=0; i < items.length; i++ ){
         
             System.out.format("%1s%20s%15s%8s%20s%15s", 
        items[i].getProductNumber(), items[i].getProductDescription(), n.format(items[i].getProductPrice()),
        + items[i].getQty(), n.format(items[i].getDiscountAmt()),  n.format(items[i].getQty()*items[i].getProductPrice()) )
        ;
            System.out.println("");
        
        }
        
        System.out.println("");
        System.out.format("%82s","Your subtotal is: " +n.format(getSubTotal()) );
        System.out.println("");
        
        System.out.format("%82s","Your total is: " +n.format(getTotal()) );
    }    
    
}
