package Day22;

public class Problem7 {
    class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i < j) {
            char start =  s.charAt(i);
            char end =  s.charAt(j);

            if(start >= 65 && start<= 90) {
                start +=  (char) 32;
            }

            if(end >= 65 && end<= 90) {
                end +=  (char) 32;
            }

            if( (start < 97 || start > 122 )&& (start < 48 || start > 57)) {
                i++;
                continue;
            }

            if( ( end < 97 || end > 122 ) && (end < 48 || end > 57)) {
               j--;
               continue;
            }

            if(start != end) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

    
}
