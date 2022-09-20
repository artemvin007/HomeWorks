public class Main {

    public static void checkPositive(int a){
        if (a >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        checkPositive(5);
        checkPositive(-7);
    }
}
