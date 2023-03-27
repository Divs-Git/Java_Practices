// AP is : 1 4 7 10 13 16.....

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // AP formula a + (n-1)*d

        n = 1 + (n-1)*3;
        System.out.println(n);
    }
}
