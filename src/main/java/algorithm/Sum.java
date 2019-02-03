package algorithm;


/**
 * 最大子列和，面試中出現的一道題
 *
 * @author cherbini
 * 2018/11/20 11:43
 */
public class Sum
{
    /**
     * 暴力求解最大子列和
     * 时间复杂度O(n^3)
     *
     * @param a 待求数列
     * @param n 待求的前n项
     * @return 最大子列和
     */
    public int maxSubSum1(int[] a, int n)
    {
        int thisSum, maxSum = 0;
        for (int i = 0; i < n; i++) // i是子列左端位置
        {
            for (int j = i; i < n; j++) // j是子列右端位置
            {
                thisSum = 0;
                for (int k = i; k <= j; k++)
                {
                    thisSum += a[k];
                    if (maxSum < thisSum) maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    /**
     * 暴力求解最大子列和优化版
     * 时间复杂度O(n^2)
     *
     * @param a 待求数列
     * @param n 待求的前n项
     * @return 最大子列和
     */
    public int maxSubSum2(int[] a, int n)
    {
        int thisSum, maxSum = 0;
        for (int i = 0; i < n; i++)
        {
            thisSum = 0;
            for (int j = i; j < n; j++)
            {
                thisSum += a[j];
                if (thisSum > maxSum) maxSum = thisSum;
            }
        }

        return maxSum;
    }

    /**
     * 求解最大子列和只有O(n)的时间复杂度
     *
     * @param a 待求数列
     * @param n 待求的前n项
     * @return 最大子列和
     */
    public int maxSubSum3(int[] a, int n)
    {
        int thisSum = 0, maxSum = 0;
        for (int i = 0; i < n; i++)
        {
            thisSum += a[i];
            if (thisSum > maxSum) maxSum = thisSum;
            else if (thisSum < 0) thisSum = 0;
        }
        return maxSum;
    }

    int max3(int A, int B, int C)
    { /* 返回3个整数中的最大值 */
        return A > B ? (A > C ? A : C) : (B > C ? B : C);
    }

    public int divideAndConque(int[] list, int left, int right)
    {//分治法求list[left]到list[right]的最大子列和
        int maxLeftSum, maxRightSum;//存放左右问题的解
        int maxLeftBorderSum, maxRightBorderSum;//存放跨分界线的结果
        int leftBorderSum, rightBorderSum;
        int center, i;
        if (left == right) //递归终止条件，子列只有一个数字
        {
            if (list[left] > 0) return list[left];
            else return 0;
        }
        //下面是分的过程
        center = (right + left) / 2; //取的中心点
        maxLeftSum = divideAndConque(list, left, center);
        maxRightSum = divideAndConque(list, center, right);

        //下面求跨分界线的最大子列和
        maxLeftBorderSum = 0;
        leftBorderSum = 0;
        for (i = center; i >= left; i--) /* 从中线向左扫描 */
        {
            leftBorderSum += list[i];
            if (leftBorderSum > maxLeftBorderSum) maxLeftBorderSum = leftBorderSum;

        }/* 左边扫描结束 */
        maxRightBorderSum = 0;
        rightBorderSum = 0;
        for (i = center + 1; i <= right; i++) /* 从中线向右扫描 */
        {
            rightBorderSum += list[i];
            if (rightBorderSum > maxRightBorderSum) maxLeftBorderSum = rightBorderSum;
        }/* 右边扫描结束 */
        /* 下面返回"治"的结果 */
        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }

    public int maxSubSum4(int[] list, int n)
    {
        return divideAndConque(list, 0, n - 1);

    }
}
