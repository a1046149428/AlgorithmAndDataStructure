package util;

import java.util.Arrays;

/**
 * @author cherbini
 * 2018/11/13 16:45
 */
public class Mytools
{

    public static int[] generateRandomArray(int size, int multiple)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int) (Math.random() * multiple);

        return arr;
    }

    public static void printArray(int[] arr, String methodName)
    {
        System.out.println(methodName + ": " + Arrays.toString(arr));
    }
}
