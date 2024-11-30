public class IfElse {
    public static void main(String[] args) {
        int num = -4;
        String color = "red";
        if (num>0 || num==0){
            System.out.println("The number is positive");
        }else if (num % 2 ==0 || num > 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is not positive");
        }

        String result = (num>0) ? "positive" : "not positive";
        String result2 = (color.equals("red")) ? "red" : "dont know";
        //if=? color = red, the result is red, :=else
        System.out.println("Ternary result: " + result);
        System.out.println("Ternary result: " + result2);
    }
    
}
//if both condition match, java will pick the first one