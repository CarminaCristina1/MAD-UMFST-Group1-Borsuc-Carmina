public  class Sedan extends Car{
    //EX5d
    int length;
    @Override
    public double getSalePrice() {
        if (this.length > 20)
        {
            this.regularPrice = super.regularPrice - 0.05*super.regularPrice;
        }
        else
        {
            this.regularPrice = super.regularPrice - 0.1*super.regularPrice;
        }
        return this.regularPrice;
    }
}