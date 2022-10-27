import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[8];
        for (int i = 1; i < a.length; i++){
            a[i] = a[i - 1] + 3;
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
