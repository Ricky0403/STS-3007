import java.util.*;
public class KaratsubaAlgo {
    int ans(int x, int y){
        int n = Math.max(len(x),len(y));
        int a = (int)(x/Math.pow(10,n/2));
        int b = (int)(x%Math.pow(10,n/2));
        int c = (int)(y/Math.pow(10,n/2));
        int d = (int)(y%Math.pow(10,n/2));
        int ac = ans(a,c);
        int bd = ans(b,d);
        int abcd = ans(a+b,c+d);
        int diff = abcd-bd-ac;
        int xy = (int)(ac*Math.pow(10,n)+diff*Math.pow(10,n/2)+bd);
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
