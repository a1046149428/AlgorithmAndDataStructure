package design.pattern.composite;

import org.junit.Test;

/**
 * @author cherbini
 * 2018/11/7 10:30
 */
public class NodeTest
{
    public void createTree(Node node) throws Exception
    {
        java.io.File file = new java.io.File(node.getName());
        java.io.File[] f = file.listFiles();
        for (java.io.File file1 : f)
        {
            if (file1.isFile())
            {
                File file2 = new File(file1.getAbsolutePath());
                node.addNode(file2);
            }
            if (file1.isDirectory())
            {
                Noder noder=new Noder(file1.getAbsolutePath());
                node.addNode(noder);
                createTree(noder);
            }

        }


    }

    @Test
    public void TestTree() throws Exception
    {
        Node noder=new Noder("F:\\BaiduNetdiskDownload");
        createTree(noder);
        noder.display();
    }

    @Test
    public void TestComposite() throws Exception
    {
        Node root = new Noder("E:/");
        Node file = new File("1.txt");
        root.addNode(file);
        Node directory = new Noder("new1/");
        Node file2 = new File("2.txt");
        root.addNode(directory);
        directory.addNode(file2);
        root.display();

    }
}