import java.util.Scanner;

public class Extended_Euclid {
    class Result{
        int x;
        int y;
        Result(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static public int gcdExtended(int a, int b, Result result){
        if(a==0){
            result.x = 0;
            result.y = 1;
            return b;
        }
        Extended_Euclid.Result tempResult = new Extended_Euclid().new Result(1,1);
        int gcd = gcdExtended(b%a, a,tempResult);
        result.x = tempResult.y - (b/a)* tempResult.x;
        result.y = tempResult.x;
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 35,b = 15;
        Extended_Euclid.Result result = new Extended_Euclid().new Result(1,1);
        int g = gcdExtended(a,b,result);
        System.out.println("GCD is: "+g);
        System.out.println("x is "+result.x+" and y is "+result.y);
    }
}
