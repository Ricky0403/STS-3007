import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncrementalSieve {
    static ArrayList<Integer> incrementalSieve(int n){
        ArrayList<Integer>oddNo = new ArrayList<>();
        for(int i = 3;i<n;i+=2){
            oddNo.add(i);
        }
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i = 0;i<oddNo.size();i++){
            int check = oddNo.get(i);
            if(check!=-1) {
                primes.add(check);
                for (int j = i; j < oddNo.size(); j++) {
                    if (oddNo.get(j) % check == 0) {
                        oddNo.set(j, -1);
                    }
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(incrementalSieve(30));
    }
}
