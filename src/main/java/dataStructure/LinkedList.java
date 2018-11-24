package dataStructure;

/**
 * @author cherbini
 * 2018/11/23 17:24
 */
public class LinkedList<T extends Comparable<? super T>>
{
    private static class Node<T>
    {
        T element;
        Node<T> next;

        public Node(T element)
        {
            this(element, null);
        }

        public Node(T element, Node next)
        {
            this.element = element;
            this.next = next;
        }
    }

    private Node<T> head;
    public LinkedList<T> reverse(LinkedList<T> linkedList)
    {
        if (linkedList == null) return null;
        LinkedList<T> temp = new LinkedList<>();
        Node<T> next = linkedList.head;
        while (next != null)
        {
            temp.add(next.element);
            next = next.next;
        }
        return temp;

    }


    public void add(T element)
    {
        head = add(element, head);

    }

    private synchronized Node<T> add(T element, Node<T> head)
    {
        if (head == null) return new Node<>(element);
        Node temp = new Node<>(element);
        temp.next = head;
        return temp;
    }


    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++)
        {
            int temp = (int) (Math.random() * 10);
            list.add(temp);
        }
        Node<Integer> temp2 = list.head;
        while (temp2 != null)
        {
            System.out.println(temp2.element);
            temp2 = temp2.next;
        }

        System.out.println("-----分割线-----");

        Node<Integer> temp = list.reverse(list).head;
        while (temp != null)
        {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
}