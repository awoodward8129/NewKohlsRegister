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
public class LineItem {
    private RetailDatabaseStrategy db = new FakeDatabase();
    private Product product;
    private int qty;

    public LineItem() {
    }

    public LineItem(Product Product, int qty) {
        this.product = Product;
        setQty(qty);
    }

    public final Product findProduct(final String prodID){
       return  db.findProduct(prodID);
    }
    public final Product getProduct() {
        return product;
    }

   public final double getProductPrice(){
   
   return product.getPrice();
   }
   
   public final String getProductNumber(){
       
       return product.getProdNo();
   }
    public final String getProductDescription(){
   
   return product.getProdDesc();
   }
    public final void setProduct(final Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

   private void setQty(final int qty) {
        this.qty = qty;
    }
    
    public final double getOriginalSubTotal(){
    
    return product.getPrice() *qty;
    }
    public final double getDiscountAmt(){
    
        return product.getDiscountStrat().getDiscountAmt(product.getPrice(), qty);
    }
    
  
    
    
}
