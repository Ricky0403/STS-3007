public class Eulers_Phi {
    int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
    int Phi(int n){
        int result = n;
        for(int p = 2;p*p<=n;++p){
            if(n%p==0){
                while(n%p==0){
                    n/=p;
                }
                result-=result/p;
            }
        }
        if(n>1){
            result-=result/n;
        }
        return result;
    }
    public static void main(String [] args){
        int n = 60;
        Eulers_Phi sol = new Eulers_Phi();
        System.out.println(sol.Phi(n));
    }
}
