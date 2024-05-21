import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.*;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
    transient private Color color; // not persistent
    private boolean rectangular; // is persistent
    public Colors() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();
    }

    public boolean getRectangular() {
        return  rectangular;
    }


    public void setRectangular(boolean flag) {
        this.rectangular = flag;
        repaint();
    }

    public void change() {
        color = randomColor();
        repaint();
    }

    private Color randomColor() {
        int r = (int)(255*Math.random());
        int g = (int)(255*Math.random());
        int b = (int)(255*Math.random());
        return new Color(r, g, b);
    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);
        if(rectangular) {
            g.fillRect(0, 0, w-1, h-1);
        }
        else {
            g.fillOval(0, 0, w-1, h-1);
        }
    }

}




class ColorsBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new
                    PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor[] pd = {rectangular};
            return pd;
        } catch (Exception e) {
            System.out.println("Exception caught. " + e);
            return null;
        }
    }
}

class IntrospectorDemo {
    public static void main() {
        try {
            Class<?> c = Class.forName("Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);
            System.out.println("Properties:");
            PropertyDescriptor[] propertyDescriptor =
                    beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptor) {
                System.out.println("\t" + descriptor.getName());
            }

            System.out.println("Events:");
            EventSetDescriptor[] eventSetDescriptor =
                    beanInfo.getEventSetDescriptors();
            for (EventSetDescriptor descriptor : eventSetDescriptor) {
                System.out.println("\t" + descriptor.getName());
            }
        } catch (Exception e) {
            System.out.println("Exception caught. " + e);
        }
    }
}
