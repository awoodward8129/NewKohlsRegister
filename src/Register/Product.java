

package Register;


public class Product {
    private String prodNo;
    private String prodDesc;
    private double price = 20.00;

    private DiscountStrategy DiscountStrat;
    
    public Product() {
    }
        
    public Product(String prodNo, String prodDesc, double price) {
        this.prodNo = prodNo;
        this.prodDesc = prodDesc;
        this.price = price;
    }
    
    public Product(String prodNo, String prodDesc, double price, DiscountStrategy DiscountStrat) {
        setProdNo(prodNo);
        setProdDesc(prodDesc);
        setPrice(price);
        setDiscountStrat(DiscountStrat);
    }

    
     public String getProdNo() {
        return prodNo;
    }

    private final void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }
       public final String getProdDesc() {
        return prodDesc;
    }

    private final void setProdDesc(final String prodDesc) {
        this.prodDesc = prodDesc;
    }
    
    public double getPrice() {
        return price;
    }
    
    private final void setPrice(double price) {
        this.price = price;
    }


    public final DiscountStrategy getDiscountStrat() {
        return DiscountStrat;
    }

    private final void setDiscountStrat(final DiscountStrategy DiscountStrat) {
        this.DiscountStrat = DiscountStrat;
    }
    
 
}
