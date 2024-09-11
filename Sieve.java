import java.util.Scanner;
public class Sieve
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		boolean[] arr = new boolean[n+1];
		for(int i = 0;i<=n;i++){
		    arr[i] = true;
		}
		for(int i = 2;i<Math.sqrt(n);i++){
		    if(arr[i]){
		        for(int j = i*i;j<=n;j+=i){
		            arr[j]= false;
		        }
		    }
		}
		for(int i = 2;i<=n;i++){
		    if(arr[i]){
		    System.out.println(i);
		    }
		}
	}
}