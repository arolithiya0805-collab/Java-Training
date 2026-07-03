package Day12;

public class Problem11 {
    class Solution {

    public String toLowerCase(String s) {

        String res = "";

        int itr;

        for (itr = 0; itr < s.length(); itr++) {

            char ch = s.charAt(itr);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            res = res + ch;
        }

        return res;
    }
}
    
}
