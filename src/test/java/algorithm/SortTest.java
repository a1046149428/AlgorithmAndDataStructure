package algorithm;

import org.junit.Test;

import static algorithm.Sort.*;
import static util.Mytools.*;

/**
 * @author cherbini
 * 2018/11/13 16:44
 */
public class SortTest
{
    @Test
    public void quickSortTest()
    {
        int[] arr = generateRandomArray(10000, 1000);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr, "quick");
    }


    @Test
    public void bubbleSortTest()
    {
        int[] arr = generateRandomArray(10, 1000);
        bubbleSort(arr);
        printArray(arr, "bubble");
    }

    @Test
    public void selectionSortTest()
    {
        int[] arr = generateRandomArray(10, 1000);
        selectionSort(arr);
        printArray(arr, "selection");
    }

    @Test
    public void test()
    {
        char[] chars = new char[26];
        int[] ints = new int[26];
        for (int i = 0; i < 26; i++)
        {
            chars[i] = (char) (97 + i);
            ints[i] = i + 1;
        }
    }
}