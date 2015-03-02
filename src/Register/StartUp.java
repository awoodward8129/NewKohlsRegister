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
public class StartUp {
    
      public static void main(String[] args) {
        
    Register CashRegister = new Register();
    
    CashRegister.startNewSale("100");
    
          CashRegister.addProductToSale("A123", 2);
          CashRegister.addProductToSale("B136", 3);
          CashRegister.addProductToSale("C368", 4);
          
         CashRegister.printReciept();
         
         CashRegister.endSale();
         
         
    }
}
