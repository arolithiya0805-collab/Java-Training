package Day23;
import java.util.*;

public class Problem4 {

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b)
                    return false;
            } else {
                if (reverse.containsKey(b))
                    return false;

                map.put(a, b);
                reverse.put(b, a);
            }
        }

        return true;
    }
}
    
}
