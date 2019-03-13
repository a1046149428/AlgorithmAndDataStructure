package design.pattern.proxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/**
 * @author Bryce
 * @date 2019/3/13 20:26
 */
public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame jFrame = new JFrame("Favorite Marvel heroine");
    JMenuBar menuBar;
    JMenu menu;
    HashMap<String, String> cds = new HashMap();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Black Widow", "http://d.ifengimg.com/w600/e0.ifengimg.com/01/2018/1203/4C9E8942761CF0ACE582B3CBF3F0909A8C2652E5_size586_w1000_h665.jpeg");
        cds.put("Scarlet Witch", "https://imgs.nmplus.hk/wp-content/uploads/2018/05/-2018-05-04-7.37.23_11847690315aec468834bbe-501x800.jpg");
        cds.put("Wonder Woman", "http://n.sinaimg.cn/ent/transform/20170620/XVz8-fyhfxph4581411.jpg");
        URL initialURL = new URL(cds.get("Wonder Woman"));
        menuBar = new JMenuBar();
        menu = new JMenu("Marvel heroine");
        menuBar.add(menu);
        jFrame.setJMenuBar(menuBar);

        cds.keySet().forEach(
                key -> {
                    JMenuItem menuItem = new JMenuItem(key);
                    menu.add(menuItem);
                    menuItem.addActionListener(event -> {
                        imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                        jFrame.repaint();
                    });

                });

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
