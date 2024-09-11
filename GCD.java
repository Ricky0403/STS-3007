import java.util.*;
public class GCD {
    static int Eucled(int a, int b){
        if(a==0){
            return b;
        }
        return Eucled(b%a,a);
    }
    public static int extendedEuclid(int a, int b, int x,
                                  int y)
    {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }

        int x1 = 1, y1 = 1;
        int gcd = extendedEuclid(b % a, a, x1, y1);

        x = y1 - (b / a) * x1;
        y = x1;

        return gcd;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println(extendedEuclid(a,b,1,1));
    }
}
