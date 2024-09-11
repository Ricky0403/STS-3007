import java.util.ArrayList;
import java.util.Scanner;
public class segmentedSieve {
    static int N = 100000;
    static boolean[] arr = new boolean[N+1];
    static void simpleSeve(){
        for(int i = 0;i<=N;i++){
            arr[i] = true;
        }
        for(int i = 2;i<Math.sqrt(N);i++){
            if(arr[i]){
                for(int j = i*i;j<=N;j+=i){
                    arr[j] = false;
                }
            }
        }
    }
    static ArrayList<Integer> generatePrime(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(arr[i]){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lower");
        int l = sc.nextInt();
        System.out.println("Upper");
        int u = sc.nextInt();
        boolean[] dummy = new boolean[u-l+1];
        for(int i = 0;i<u-l+1;i++){
            dummy[i] = true;
        }
        simpleSeve();
        ArrayList<Integer>primes = generatePrime(u);
        for(int prime:primes){
            int firstMultiple = (l/prime)*prime;
            if(firstMultiple<l){
                firstMultiple+=prime;
            }
            int start = Math.max(firstMultiple,prime*prime);
            for(int j = start;j<=u;j+=prime){
                dummy[j-l] = false;
            }
        }
        for(int i = 0;i<u-l+1;i++){
            if(dummy[i]){
                System.out.println(i+l);
            }
        }
    }
}
