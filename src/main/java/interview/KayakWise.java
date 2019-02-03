package interview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author cherbini
 * 2018/11/25 1:24
 */
public class KayakWise
{
    /**
     * 输入年月日，计算是输入年份的第几天
     *
     * @param year  年
     * @param month 月
     * @param day   日
     * @return 天数
     */
    public static int checkDayOfYear(int year, int month, int day)
    {
        int total = 0;
        for (int i = 1; i < month; i++)
        {
            switch (i)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    total += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    total += 30;
                    break;
            }

        }
        if (month > 2 && year % 4 == 0 && year % 400 == 0 && year % 100 != 0) total += 29;
        else if (month > 2) total += 28;
        return day + total;
    }

    public static void printfRepeatValueAndPosition(int[] a)
    {
        List<Integer> noRepeatList = new ArrayList<>();
        List<Integer> repeatList = new ArrayList<>();
        List<Set> indexList = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
        {
            if (!noRepeatList.contains(a[i])) noRepeatList.add(a[i]);
            else
            {
                noRepeatList.add(null);
                if (!repeatList.contains(a[i]))
                {
                    repeatList.add(a[i]);
                    Set set = new HashSet();
                    set.add(noRepeatList.indexOf(a[i]));
                    indexList.add(set);
                }
                indexList.get(repeatList.indexOf(a[i])).add(i);
            }
        }
        for (int i = 0; i < repeatList.size(); i++)
        {
            System.out.print("value: " + repeatList.get(i) + " position:");
            indexList.get(i).forEach(item -> System.out.printf(item + " "));
            System.out.println();
        }
    }


}
