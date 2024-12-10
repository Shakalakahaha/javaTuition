import java.util.Scanner;

interface Car{
    void message();
    void price();
}

class tesla implements Car{
    public void message(){
        System.out.println("Yes, Tesla is the best electric car");
    }

    public void price(){
        System.out.println("The price of Tesla is RM75,000");
    }
}

class bmw implements Car{
    public void message(){
        System.out.println("BMW is one of the coolest car in the world");
    }

    public void price(){
        System.out.println("The price of BMW is RM85,000");
    }
}

public class ass12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = scan.nextLine();
        if(carType.equalsIgnoreCase("bmw")){
            Car car1 = new bmw();
            car1.message();
            car1.price();
        }
        else if(carType.equalsIgnoreCase("tesla")){
            Car car2 = new tesla();
            car2.message();
            car2.price();
        }
    }
}
