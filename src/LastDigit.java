import java.util.*;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = Math.abs(n);

        System.out.println(num%10);
    }
}
