import java.util.*;
public class KaratsubaAlgo {
    int ans(int x, int y){
        if(x<10 || y<10){
            return x*y;
        }
        int n = Math.max(len(x),len(y));
        int halfN = n/2;
        int pow10 = (int)Math.pow(10,halfN);
        int a = x/pow10;
        int b = x%pow10;
        int c = y/pow10;
        int d = y%pow10;
        int ac = ans(a,c);
        int bd = ans(b,d);
        int abcd = ans(a+b,c+d);
        int diff = abcd-bd-ac;
        int xy = ac*(int)Math.pow(10,2*halfN)+diff*pow10+bd;
        return xy;
    }
    int len(int x){
        if(x==0){
            return 1;
        }
        int count = 0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int y = sc.nextInt();
        KaratsubaAlgo sol = new KaratsubaAlgo();
        System.out.println(sol.ans(x,y));
    }
}
