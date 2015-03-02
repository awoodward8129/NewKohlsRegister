

package Register;


public class Register {
   getRetailRecieptStrategy reciept ;
   int itemCounter =0;
    public Register() {
        
    }
    public void startNewSale(final String custNo ){
    reciept = new ConsoleReceipt(custNo);
   
       
    }

    public void addProductToSale(final String prodId, final int qty){
       itemCounter++;
        reciept.addItem(prodId, qty);

    }
    
    public void printReciept(){
   if(itemCounter > 0)
    reciept.getRecieptFormat();
     else
        System.out.println("Please Enter an item to begin a new sale");
    }
    
    public void endSale(){
        System.out.println("");
         System.out.println("Thank you for shopping with us! ");
        System.out.println("End Sale");
        }
       
    }
    
    

