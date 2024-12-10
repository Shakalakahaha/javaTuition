
import java.util.Scanner;

class Car{
    void price(){
        System.out.println("Hello");
    }
}

class toyota extends Car{
    void price(){
        System.out.println("The price of Toyota is RM25,000");
    }
}

class bmw extends Car{
    void price(){
        System.out.println("The price of BMW is RM85,000");
    }
}

class tesla extends Car{
    void price(){
        System.out.println("The price of Tesla is RM75,000");
    }
}

public class ass10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = scan.nextLine();
        if(carType.equalsIgnoreCase("toyota")){
            Car car = new toyota();
            car.price();
        }
        else if(carType.equalsIgnoreCase("bmw")){
            Car car1 = new bmw();
            car1.price();
        }
        else if(carType.equalsIgnoreCase("tesla")){
            Car car2 = new tesla();
            car2.price();
        }
    }
}
