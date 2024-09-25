public class Hyphen {
    static void moveSpaceInFront(char str[]){
        int i = str.length-1;
        for(int j = i;j>=0;j--){
            if(str[j]!='-'){
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i--;
            }
        }
    }

    static void moveSpaceInFront2(char str[]){
        int i = str.length-1;

        for(int j = i;j>=0;j--){
            if(str[j]!='-'){
                str[i--] = str[j];
            }
        }

        while(i>=0){
            str[i--] = '-';
        }
    }

    public static void main(String[] args) {
        char str[] = "Code- 4 - lyf".toCharArray();
        moveSpaceInFront2(str);
        System.out.println(String.valueOf(str));
    }
}
