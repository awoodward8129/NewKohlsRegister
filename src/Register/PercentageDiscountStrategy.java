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
public class PercentageDiscountStrategy implements DiscountStrategy {
    private double discount =.10;

    public PercentageDiscountStrategy() {
    }
  

    public PercentageDiscountStrategy(double rate) {
        setDiscount(rate);
    }

   
    
    @Override
    public double getDiscount(){
    
    return discount;
    }

    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
       
       
        return discount * unitPrice * qty;
    }

    @Override
    public void setDiscount(double discount) {
     
        this.discount = discount;
    }
    
}
