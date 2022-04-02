public class Product
{
    private String productName;
    private String productID;
    private double productPrice;

    public Product(String pName, String pID, double pPrice)    //contructor
    {
        this.productName = pName;
        this.productID = pID;
        this.productPrice = pPrice;
    }

    public void setproductName(String pName)  //set product name  
    {
        this.productName = pName;
    }

    public void setproductID(String pID)    //set product ID
    {
        this.productID = pID;
    }

    public void setproductPrice(double pPrice) //set product price
    {
        this.productPrice = pPrice;
    }

    public String getproductName()  //get product name
    {
        return productName;
    }

    public String getproductID()    //get product ID
    {
        return productID;
    }

    public double getproductPrice()    //get product price
    {
        return productPrice;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " [NAME: " + getproductName() + "] " + "[ID: " + getproductID() + "] " + "[PRICE: $" + getproductPrice() + "] ";
    }
}