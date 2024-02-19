public class Ford extends Car{
    //EX5c
    int year;
    int manufacturerDiscount;
    public double getSalePrice()
    {
        this.regularPrice=super.regularPrice-this.manufacturerDiscount;
        return this.regularPrice;
    }
}