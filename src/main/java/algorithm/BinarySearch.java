package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author bryce
 */
public class BinarySearch
{

    /**
     * 通过二分查找位置，list本身有indexOf，那是通过遍历查找的，查找null，请用自带indexOf()
     * 如果参数在列表中不唯一，则查找的到是其中一个，用顺序查找的话则是第一个,写了一个好像很鸡肋的方法，QAQ
     *
     * @param list 已排序的列表
     * @param t    待查找对象
     * @param <T>  实现了Comparable的实体类
     * @return 返回对象在列表中的位置
     * @throws IllegalAccessException 非法访问
     * @throws NullPointerException   传入参数为空
     */
    public static <T extends Comparable> int binarySearch(List<T> list, T t) throws IllegalAccessException
    {
        Optional.ofNullable(list).filter(child -> child.size() != 0).orElseThrow(IllegalAccessException::new);
        Optional.ofNullable(t).orElseThrow(NullPointerException::new);
        
        int low = 0;
        int high = list.size() - 1;
        int mid;
        T temp;
        while (low <= high)
        {
            mid = (low + high) / 2;
            temp = list.get(mid);
            if (temp.compareTo(t) == 0)
            {
                return mid;
            }
            else if (temp.compareTo(t) > 0)
            {
                high = --mid;
            }
            else
            {
                low = ++mid;
            }
        }


        return Integer.parseInt(null);
    }

    public static void main(String[] args) throws IllegalAccessException
    {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        System.out.println(binarySearch(integers, 2));
        System.out.println(integers.indexOf(2));


        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("adc");
        strings.add("bac");
        strings.add("bca");
        strings.add("cab");
        strings.add("cba");

        System.out.println(binarySearch(strings,"bca"));

    }
}
