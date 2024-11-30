public class ass1 {
    private int year;
    private double price;
    private String name;

    public ass1(int year, double price, String name){
        this.year=year;
        this.price=price;
        this.name=name;
    }

    public void carPrice(){
        double carPrice=year*price;
        System.out.println("The price of " + name + "is: " + carPrice);
    }

    public static void main(String[] args) {
        ass1 car = new ass1(10, 200, "Hilux");
        car.carPrice();
    } 
}
