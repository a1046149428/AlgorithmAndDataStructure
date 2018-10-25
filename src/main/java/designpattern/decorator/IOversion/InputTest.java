package designpattern.decorator.IOversion;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author cherbini
 * 2018/10/25 17:40
 */
public class InputTest
{
    public static void main(String[] args)
    {
        int c;
        try
        {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("F:\\xx\\xxx.txt")));
            while ((c = in.read()) >= 0)
            {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
