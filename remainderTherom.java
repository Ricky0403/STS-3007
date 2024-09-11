import java.util.Scanner;
class remainderTherom{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of congruent relations:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the values of the remainders:");
        for(int i = 0; i<size;i++){
            a[i] = sc.nextInt();
        }
        int m[] = new int[size];
        int M = 1;
        System.out.println("Enter the values of moduli:");
        for(int i = 0;i<size;i++){
            m[i] = sc.nextInt();
            M*=m[i];
        }
        System.out.println("The solution is "+ CRT(a,m,size,M));
    }
    static int CRT(int[] a, int[] m, int n, int M){
        int x = 0;
        for(int i = 0;i<n;i++){
            int M1 = M/m[i];
            int y = 0;
            for(int j = 0; j<m[i];j++){
                if((M1*j)%m[i]==1){
                    y = j;
                    break;
                }
            }
            x+=a[i]*M1*y;
        }
        return x%M;
    }
}