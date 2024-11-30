import java.util.Scanner;

class CarPriceCalculator {
    private double car1Price;
    private double car2Price;
    private double car3Price;

    // Constructor to initialize car prices
    public CarPriceCalculator(double car1Price, double car2Price, double car3Price) {
        this.car1Price = car1Price;
        this.car2Price = car2Price;
        this.car3Price = car3Price;
    }

    // Method to calculate the average price
    public double calculateAverage() {
        return (car1Price + car2Price + car3Price) / 3;
    }
}

public class ass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read prices and convert to double
        System.out.println("Price for car1: ");
        double pModel1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Price for car2: ");
        double pModel2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Price for car3: ");
        double pModel3 = Double.parseDouble(scanner.nextLine());

        // Create an object of CarPriceCalculator and calculate the average
        CarPriceCalculator calculator = new CarPriceCalculator(pModel1, pModel2, pModel3);
        double average = calculator.calculateAverage();

        // Print the result
        System.out.printf("The average price of the cars is: %.2f%n", average);
    }
}
