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


    public boolean detectCapitalUse(String word)
    {

        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (Character.isUpperCase(word.charAt(i)))
            {
                count++;
            }
        }
        if (count == len)
        {
            return true;
        }
        if (count == 0)
        {
            return true;
        }
        return Character.isUpperCase(word.charAt(0)) && count == 1;
    }

    public int[] findDiagonalOrder(int[][] matrix)
    {

        int row = matrix.length;
        int col = matrix[0].length;
        int[] arr = new int[row * col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (i != j)
                {

                }

            }
        }
        return null;

    }


    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root)
    {
        if (Objects.isNull(root))
        {
            return null;
        }
        return resucive(root);


    }

    private TreeNode resucive(TreeNode root)
    {
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.left = right;
        root.right = left;
        if (right != null)
        {
            resucive(right);
        }
        if (left != null)
        {
            resucive(left);
        }
        return root;

    }

    public int[][] matrixReshape(int[][] nums, int r, int c)
    {
        int[][] result = new int[r][c];

        List<Integer> linkedList = new LinkedList<>();

        for (int x = 0; x < nums.length; x++)
        {
            for (int z = 0; z< nums[0].length; z++)
            {
                linkedList.add(nums[x][z]);
            }
        }
        Iterator<Integer> iterator = linkedList.iterator();
        for (int i = 0; i < r; i++)
        {
            if (c==0){

            }
            for (int j = 0; j < c; j++)
            {
                if (iterator.hasNext())
                {
                    result[i][j] = iterator.next();
                }
                else
                {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
