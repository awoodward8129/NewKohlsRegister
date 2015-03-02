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
public interface DiscountStrategy {
    abstract double getDiscountAmt(double unitPrice, int qty);
    abstract double getDiscount();
    abstract void setDiscount(double discount);
}
