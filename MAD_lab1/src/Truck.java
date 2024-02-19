public class Truck extends Car {
    //EX5b
    int weight;
    public double getSalePrice() {
        if (this.weight>2000) {
            this.regularPrice=this.regularPrice-0.1*this.regularPrice;
        } else {
            this.regularPrice=this.regularPrice-0.2*this.regularPrice;
        }
        return this.regularPrice;
    }
}