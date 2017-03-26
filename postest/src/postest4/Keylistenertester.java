
package postest4;

import java.awt.*;
import java.awt.event.*;



public class Keylistenertester extends Frame implements KeyListener{
  TextField t1;
Label l1;

public Keylistenertester(String s){
   super(s);
    Panel p = new Panel();
    l1=new Label ("key listener !");
p.add(l1);
add(p);
addKeyListener (this);
setSize (200,100);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowsClosing(WindowEvent e)
{
    System.exit(0);
}
});
}
 public void keyTyped (KeyEvent e) {
     l1.setText("key Typed");
 }
 public void keyPressed (KeyEvent e){
     l1.setText("key pressed");
 }
 
 public void keyReleased (KeyEvent e){
     l1.setText("key released");
 }
    public static void main(String[] args) {
        new Keylistenertester("key listener tester");
    }
}


