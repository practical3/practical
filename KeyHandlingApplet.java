import java.applet.Applet;
import java.awt.event.*;
import java.awt.Graphics;

public class KeyHandlingApplet extends Applet implements KeyListener
{
    String msg = "";
 
    public void init()
    {
        addKeyListener(this);
    }
 
    public void keyReleased(KeyEvent k)
    {
        showStatus("Key Released");
        repaint();
    }
 
    public void keyTyped(KeyEvent k)
    {
        showStatus("Key Typed");
        repaint();
    }
 
    public void keyPressed(KeyEvent k)
    {
        showStatus("Key Pressed");
        repaint();
    }
 
    public void paint(Graphics g)
    {
        g.drawString(msg, 100, 10);
    }
}
