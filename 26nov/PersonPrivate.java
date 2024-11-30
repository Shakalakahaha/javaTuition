public class PersonPrivate {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    public void displayDetails(){
        double bmi = weight / height + age;
        System.out.println("Name: " + name);
        System.out.println(name + "bmi is: " + bmi);
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("Tan", 20, 175.65, 95.4);
        person.displayDetails();
    }
}
