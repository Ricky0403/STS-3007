import java.util.*;
public class Strobogrammatic {
    ArrayList<String>strobogrammaticNum(int n){
        ArrayList<String>result = numDef(n,n);
        return result;
    }
    ArrayList<String> numDef(int n, int length){
        ArrayList<String>result = new ArrayList<>();
        if(n==0){
            result.add("");
            return result;
        }
        else if(n==1){
            result.add("0");
            result.add("1");
            result.add("8");
            return result;
        }
        ArrayList<String> middles = numDef(n-2,length);
        for(String middle:middles){
            if(n!=length){
                result.add("0"+middle+"0");
            }
            result.add("1"+middle+"1");
            result.add("8"+middle+"8");
            result.add("6"+middle+"9");
            result.add("9"+middle+"6");
        }
        return result;
    }
    boolean is_Strobogrammatic(String n) {
        // Check for null or empty string
        if (n == null || n.length() == 0) {
            return true;
        }
        // Create a HashMap to store Strobogrammatic pairs
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        // Use two pointers to traverse the string from both ends
        int left = 0;
        int right = n.length() - 1;
        // Continue until the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Check if the characters at the current positions are valid Strobogrammatic pairs
            if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right))) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }
        // If the loop completes, the string is Strobogrammatic
        return true;
    }
    public static void main(String[] args) {
        Strobogrammatic sol = new Strobogrammatic();
        System.out.println(sol.strobogrammaticNum(3));
        System.out.println(sol.is_Strobogrammatic("18"));
    }
}
