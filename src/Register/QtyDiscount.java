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
public class QtyDiscount implements DiscountStrategy {

    private double discountRate = 0.10;
    private int minQty = 3;
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
      if (qty>minQty){
          return unitPrice *qty *discountRate;
    } else{
    return 0;
      }
}

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    @Override
    public final double getDiscount() {
        
        return discountRate;
    }

    @Override
    public void setDiscount(double discount) {
        
    }
    
}
