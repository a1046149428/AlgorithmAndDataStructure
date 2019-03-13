package design.pattern.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bryce
 * @date 2019/3/13 21:30
 */
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void painComponent(Graphics graphics) {
        super.printComponent(graphics);
        icon.paintIcon(this, graphics, (800 - icon.getIconWidth()) / 2, (600 - icon.getIconHeight()) / 2);
    }
}
