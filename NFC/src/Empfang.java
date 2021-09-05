import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Empfang extends Thread{

    public Empfang(){

    }

    public void run(){
        while(true){
            try {
                System.out.println("Empfang gestartet");
                ServerSocket ss = new ServerSocket(1234);
                Socket s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String empfang = (String) dis.readUTF();

                System.out.println("erfolgreicher empfang");
                ManagerNFC.load.setVisible(false);
                ManagerNFC.loadText.setText(empfang);
                if(empfang.contains("http")){
                    try {
                        Desktop.getDesktop().browse(new URL(empfang).toURI());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(empfang.contains("open")){
                    openCommand(empfang);
                }



                ss.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error im empfang");
            }
        }
    }

    public void click(int key){
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(key);
        r.keyRelease(key);
    }

    public void hold(int key, boolean press){
        if(press) {
            Robot r = null;
            try {
                r = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            r.keyPress(key);
        }else{
            Robot r = null;
            try {
                r = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            r.keyRelease(key);
        }
    }

    public void openCommand(String command){
        click(KeyEvent.VK_WINDOWS);

        try {
            sleep(500);


            String text1 = "firefox";
            StringSelection stringSelection1 = new StringSelection(text1);
            Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard1.setContents(stringSelection1, stringSelection1);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);
            sleep(500);
            click(KeyEvent.VK_ENTER);

            sleep(3000);

            String[] splitter = command.split(";");
            String toOpen = splitter[1];

            String text = toOpen;
            StringSelection stringSelection = new StringSelection(text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, stringSelection);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);

            sleep(500);

            click(KeyEvent.VK_TAB);

            sleep(250);

            click(KeyEvent.VK_TAB);

            sleep(250);

            click(KeyEvent.VK_TAB);

            sleep(250);

            click(KeyEvent.VK_ENTER);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
