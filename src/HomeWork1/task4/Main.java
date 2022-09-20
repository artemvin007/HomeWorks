public class Main {

    public static boolean check(int a, int b){
        return (((a + b) > 9) && ((a + b) < 21));
    }

    public static void main(String[] args) {
        System.out.println(check(5, 5));
        System.out.println(check(7, 14));
    }
}
