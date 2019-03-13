package design.pattern.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Bryce
 * @date 2019/3/13 20:16
 */
public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
      imageURL = url;
    }



    public void paintIcon(final  Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover,please wait ... ", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    try {
                        imageIcon = new ImageIcon(imageURL, "Marvel heroine");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

                retrievalThread.start();
            }

        }

    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 800;
        }


    }
}
