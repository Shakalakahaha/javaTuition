import java.util.Scanner;
public class ass8 {

    private class BMI{
        private String name;
        private int age;
        private double height;
        private double weight;

        public BMI (String name, int age, double height, double weight){
            this.name=name;
            this.age=age;
            this.height=height;
            this.weight=weight;
        }

        public String getName(){
            return name;
        }
    
        public int getAge(){
            return age;
        }
    
        public double getHeight(){
            return height;
        }
    
        public double getWeight(){
            return weight;
        }

        public double calculateBMI(){
            return weight/(height*height);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ass8 program = new ass8();
        BMI person1 = program.getPersonDetails(scan);
        double bmiValue = person1.calculateBMI();
        System.out.println("The person's name is " + person1.getName() + ", and he/she is " + person1.getAge() + " years old, and his/her BMI is " + bmiValue);
        scan.close();
    }

    private BMI getPersonDetails(Scanner scan) {
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your height (in meters): ");
        double height = scan.nextDouble();

        System.out.println("Enter your weight (in kilograms): ");
        double weight = scan.nextDouble();

        return new BMI(name, age, height, weight);
    }
}
