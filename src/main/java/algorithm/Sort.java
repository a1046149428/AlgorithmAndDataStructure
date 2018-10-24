package algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author cherbini
 * 2018/10/15 10:31
 */
public class Sort
{
    public void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[i];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void selectionSort(int[] arr)
    {
        if ((arr == null) || (arr.length == 0)) return;
        int minIndex;
        for (int i = 0; i < arr.length; i++)
        {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if (i != minIndex)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }

    public void bubbleSort(int[] arr)
    {
        if ((arr == null) || (arr.length == 0)) return;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] arr, int left, int right)
    {
        if (left >= right || arr == null || arr.length <= 1) return;
        int i = left, j = right, key = arr[(i + j) / 2];
        while (i <= j)
        {
            while (arr[i] < key) ++i;
            while (arr[j] > key) --j;
            if (i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i;
                --j;
            }
            else if (i == j)
            {
                ++i;
            }
        }
        quickSort(arr, i, right);
        quickSort(arr, left, j);
    }

    public int[] generateRandomArray(int size, int multiple)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int) (Math.random() * multiple);

        return arr;
    }

    public void printArray(int[] arr, String methodName)
    {
        System.out.println(methodName + ": " + Arrays.toString(arr));
    }

    @Test
    public void quickSortTest()
    {
        int[] arr = generateRandomArray(10, 1000);
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

}
