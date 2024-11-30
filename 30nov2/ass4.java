public class ass4 {
    public static void main(String[] args) {

        String[][] cars = {
            {"2015", "Toyota Vios"},
            {"2019", "Honda Accord"},
            {"2021", "BMW 3 Series"}
        };

        double[] prices = {30000, 40000, 90000};

        System.out.println("Cars with prices above 50,000 RM:");
        for (int i = 0; i < cars.length; i++) {
            if (prices[i] > 50000) {
                System.out.println(cars[i][1] + " " + cars[i][0] +" - " + prices[i] + " RM");
            }
        }
        
        /*Object[][] cars = {
            {"2015", "Toyota Vios",30000},
            {"2019", "Honda Accord",40000},
            {"2021", "BMW 3 Series",60000}
        };

        System.out.println("Cars with prices above 50,000 RM:");
        for (int i = 0; i < cars.length; i++) {
            // Cast price to Integer
            int price = (int) cars[i][2]; 
            if (price > 50000) {
                System.out.println(cars[i][1] + " (" + cars[i][0] + ") - " + price + " RM");
            }
        }*/

        
    }
}