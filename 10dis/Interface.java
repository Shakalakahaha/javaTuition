interface Animal{
    void eat();
    void sleep();
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat eats fish");
    }

    public void sleep(){
        System.out.println("Cat sleeps for 12 hours");
    }
}

class Bear implements Animal{
    public void eat(){
        System.out.println("Bear eats honey");
    }

    public void sleep(){
        System.out.println("Bear sleeps the entire wenter");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal animal1=new Cat();
        animal1.eat();
        animal1.sleep();

        Animal animal2=new Bear();
        animal2.eat();
    }
}
