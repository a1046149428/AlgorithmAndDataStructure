package algorithm;

import com.google.common.hash.Hashing;

import java.util.*;

/**
 * @author bryce
 * 2019/6/20 15:36
 */
public class LeetCode
{


    public static int lengthOfLongestSubstring(String s)
    {

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>((int) (s.length() / 0.70)); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++)
        {
            if (map.containsKey(s.charAt(j)))
            {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;


    }

    private static int getLength(int length, Set<String> stringSet)
    {
        if (stringSet.size() > length)
        {
            length = stringSet.size();
        }
        return length;
    }


    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
