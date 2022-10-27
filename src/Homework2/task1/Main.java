import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++){
            a[i] = Math.abs(a[i] - 1);
            System.out.print(a[i]);
            System.out.print(' ');
        }
    }
}
