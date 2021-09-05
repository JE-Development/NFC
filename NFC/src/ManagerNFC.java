import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ManagerNFC extends Thread implements KeyListener{

    static JFrame jf;
    static JLabel load;
    static JLabel loadText;
    static boolean switcher = true;

    int width = 800;
    int height = 500;

    JScrollPane vertical;
    static JTextArea console;

    public ManagerNFC(){

    }

    public void run(){
        jf = new JFrame();
        jf.setSize(450,250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(false);
        jf.setTitle("Console");
        jf.addKeyListener(new MKeyListener());

        console = new JTextArea(15, 40);

        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(vertical);




        jf.repaint();
    }

    static void cText(String text){
        console.append("\n "+text);
        jf.repaint();
    }
    static void clear(){
        console.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key is typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

class MKeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_F11){
            System.out.println(ManagerNFC.switcher);
            if(ManagerNFC.switcher){
                ManagerNFC.switcher = false;
                ManagerNFC.jf.setVisible(false);
                ManagerNFC.jf.repaint();

                System.out.println("invisible");
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_F12){
            System.exit(0);
        }
    }
}
