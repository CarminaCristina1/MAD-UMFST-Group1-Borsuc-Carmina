public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.color = "blue";
        sedan.speed = 100;
        sedan.length = 20;
        System.out.println(sedan.getSalePrice());
        Ford ford1 = new Ford();
        ford1.year = 2003;
        ford1.manufacturerDiscount = 500;
        ford1.speed = 125;
        ford1.color = "red";
        Ford ford2 = new Ford();
        ford2.year = 2011;
        ford2.manufacturerDiscount = 210;
        ford2.speed = 134;
        ford2.color = "black";
        Car car = new Car();
        car.color = "green";
        car.speed = 92;
        //sedan.getSalePrice(regularPrice);
        System.out.println("Pret Sedan : " + sedan.getSalePrice());
        System.out.println("Pret Ford 1 : " + ford1.getSalePrice());
        System.out.println("Pret Ford 2 : " + ford2.getSalePrice());
    }
}