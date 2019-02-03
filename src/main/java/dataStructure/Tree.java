package dataStructure;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的实现与遍历
 *
 * @author cherbini
 * 2018/11/19 19:58
 */
public class Tree<AnyType extends Comparable<? super AnyType>>
{
    private static class BinaryNode<AnyType>
    {
        BinaryNode(AnyType theElement)
        {
            this(theElement, null, null);
        }

        BinaryNode(AnyType theElemet, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt)
        {
            element = theElemet;
            left = lt;
            right = rt;
        }

        AnyType element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;
    }

    // 一棵树总有根节点
    private BinaryNode<AnyType> root;

    public void insert(AnyType x)
    {
        root = insert(x, root);
    }

    private synchronized BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t)
    {
        if (t == null)
        {
            return new BinaryNode<>(x, null, null);
        }
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
        {
            t.left = insert(x, t.left);
        }
        else if (compareResult > 0)
        {
            t.right = insert(x, t.right);
        }
        return t;
    }

    /**
     * 先序遍历
     * 先遍历根节点，然后遍历左子树，最后遍历右子树
     *
     * @param node 遍历节点
     */
    public void preOrder(BinaryNode<AnyType> node)
    {
        if (node != null)
        {
            System.out.println(node.element + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 先序遍历非递归
     *
     * @param node 需要遍历的节点
     */
    public void preOrder1(BinaryNode<AnyType> node)
    {
        Stack<BinaryNode> stack = new Stack<>();
        while (node != null || !stack.empty())
        {
            while (node != null)
            {
                System.out.println(node.element + " ");
                stack.push(node);
                node = node.left;
            }
            if (!stack.empty())
            {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    /**
     * 中序遍历
     * 先遍历左子树，然后遍历根节点，最后遍历右子树
     *
     * @param node 节点
     */
    public void midOrder(BinaryNode<AnyType> node)
    {
        if (node != null)
        {
            midOrder(node.left);
            System.out.println(node.element + " ");
            midOrder(node.right);
        }
    }

    public void midOrder1(BinaryNode<AnyType> node)
    {
        Stack<BinaryNode> stack = new Stack<>();
        while (node != null || !stack.empty())
        {
            while (node != null)
            {
                stack.push(node); //寻找左子树，找到就压栈
                node = node.left;
            }
            if (!stack.empty())
            {
                node = stack.pop(); // 出栈显示
                System.out.println(node.element + " ");
                node = node.right;
            }
        }
    }

    /**
     * 后序遍历
     * 先遍历左子树，然后遍历右子树，最后遍历根节点
     *
     * @param node 节点
     */
    public void posOrder(BinaryNode<AnyType> node)
    {
        if (node != null)
        {
            posOrder(node.left);
            posOrder(node.right);
            System.out.println(node.element + " ");
        }
    }

    public void posOrder1(BinaryNode<AnyType> node)
    {
        Stack<BinaryNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int i = 1;
        while (node != null || !stack1.empty())
        {
            while (node != null)
            {
                stack1.push(node);
                stack2.push(0);
                node = node.left;
            }
            while (!stack1.empty() && stack2.peek() == i)
            {
                stack2.pop();
                System.out.println(stack1.pop().element + "  ");
            }
            if (!stack1.empty())
            {
                stack2.pop();
                stack2.push(1);
                node = stack1.peek();
                node = node.right;
            }
        }

    }

    /**
     * 层序遍历
     * 逐层遍历
     *
     * @param node 遍历节点
     */
    public void levelOrder(BinaryNode<AnyType> node)
    {
        if (node == null) return;
        int depth = depth(node);
        for (int i = 1; i <= depth; i++)
        {
            levelOrder(node, i);
        }
    }

    public void levelOrder1(BinaryNode<AnyType> node)
    {
        if (node == null) return;
        BinaryNode<AnyType> binaryNode;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() != 0)
        {
            binaryNode = queue.poll();
            System.out.println(binaryNode.element + "  ");
            if (binaryNode.left != null) queue.offer(binaryNode.left);
            if (binaryNode.right != null) queue.offer(binaryNode.right);
        }
    }

    private void levelOrder(BinaryNode<AnyType> node, int level)
    {
        if (node == null || level < 1) return;
        if (level == 1)
        {
            System.out.println(node.element + " ");
            return;
        }
        // 左子树
        levelOrder(node.left, level - 1);
        // 右子树
        levelOrder(node.right, level - 1);
    }

    private int depth(BinaryNode<AnyType> node)
    {
        if (node == null) return 0;
        int l = depth(node.left);
        int r = depth(node.right);
        if (l > r) return l + 1;
        else return r + 1;
    }

    public static void main(String[] args)
    {
        int[] ins = {4, 2, 6, 1, 3, 5, 7, 8, 10};
        Tree<Integer> tree = new Tree<>();
        for (int i = 0; i < ins.length; i++)
        {
            tree.insert(ins[i]);
        }

        System.out.println("递归前序遍历： ");
        tree.preOrder(tree.root);

        System.out.println("非递归前序遍历： ");
        tree.preOrder1(tree.root);

        System.out.println("中序遍历： ");
        tree.midOrder(tree.root);
        System.out.println("非递归中序遍历： ");
        tree.midOrder1(tree.root);
        System.out.println("后序遍历： ");
        tree.posOrder(tree.root);
        System.out.println("非递归后序遍历： ");
        tree.posOrder1(tree.root);
        System.out.println("层序遍历： ");
        tree.levelOrder(tree.root);
        System.out.println("非递归层序遍历： ");
        tree.levelOrder1(tree.root);

    }
}
