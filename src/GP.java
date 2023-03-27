import java.util.*;

public class GP {
    static double gp(int a,int r,int n) {
        double ans = a*(Math.pow(r,n-1));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        double value = gp(a,r,n);
        System.out.println((int)value);
    }
}
