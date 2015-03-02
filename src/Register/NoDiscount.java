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
public class NoDiscount implements DiscountStrategy {

    private double discountRate = 0;
    
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
       return 0;
    }

    @Override
    public double getDiscount() {
        return discountRate;
    }

    @Override
    public void setDiscount(double discount) {
       this.discountRate = 0;
    }
    
}
