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
public class Customer {
    
  
    
    private String custID;
    private String custName;
    private String address;

    public Customer() {
    }

    public Customer(String custID, String custName, String address) {
     setCustID(custID);
       setCustName(custName);
       setAddress(address);
    }

    public String getCustID() {
        return custID;
    }

    private void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    private void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }
    
    
   
}
