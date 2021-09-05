import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Scanner;

public class Befehle {

    ArrayList<String> lieder = new ArrayList<>();

    public Befehle(){

    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------Discord Befehle----------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    //4112-6442-1120
    public void startGroovy(){

        File liederWIN = new File("C:\\Users\\jmenn\\Desktop\\video game remix.txt");
        File liederPI = new File("/home/pi/Desktop/video game remix.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(liederWIN);
        } catch (FileNotFoundException e) {
            try {
                sc = new Scanner(liederPI);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }

        while (sc.hasNextLine()) {
            String lied = sc.nextLine();
            lieder.add(lied);
        }



        for(int i = 0; i < lieder.size(); i++){
            try {
                String text2 = "/";
                StringSelection stringSelection2 = new StringSelection(text2);
                Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard2.setContents(stringSelection2, stringSelection2);

                Thread.sleep(200);
                hold(KeyEvent.VK_CONTROL, true);
                Thread.sleep(200);
                click(KeyEvent.VK_V);
                Thread.sleep(200);
                hold(KeyEvent.VK_CONTROL, false);


                Thread.sleep(500);
                click(KeyEvent.VK_P);
                Thread.sleep(500);
                click(KeyEvent.VK_L);
                Thread.sleep(500);
                click(KeyEvent.VK_A);
                Thread.sleep(500);
                click(KeyEvent.VK_Y);
                Thread.sleep(500);
                click(KeyEvent.VK_SPACE);
                Thread.sleep(500);


                writeRobot(lieder.get(i));
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    //424-597-1120
    public void stopGroovy(){
        try {
            String text2 = "/";
            StringSelection stringSelection2 = new StringSelection(text2);
            Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard2.setContents(stringSelection2, stringSelection2);

            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(200);
            click(KeyEvent.VK_V);
            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, false);


            Thread.sleep(500);
            click(KeyEvent.VK_S);
            Thread.sleep(500);
            click(KeyEvent.VK_T);
            Thread.sleep(500);
            click(KeyEvent.VK_O);
            Thread.sleep(500);
            click(KeyEvent.VK_P);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //49657-82-1120
    public void pauseGroovy(){
        try {
            String text2 = "/";
            StringSelection stringSelection2 = new StringSelection(text2);
            Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard2.setContents(stringSelection2, stringSelection2);

            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(200);
            click(KeyEvent.VK_V);
            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, false);


            Thread.sleep(500);
            click(KeyEvent.VK_P);
            Thread.sleep(500);
            click(KeyEvent.VK_A);
            Thread.sleep(500);
            click(KeyEvent.VK_U);
            Thread.sleep(500);
            click(KeyEvent.VK_S);
            Thread.sleep(500);
            click(KeyEvent.VK_E);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //40-760-1120
    public void unpauseGroovy(){
        try {
            String text2 = "/";
            StringSelection stringSelection2 = new StringSelection(text2);
            Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard2.setContents(stringSelection2, stringSelection2);

            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(200);
            click(KeyEvent.VK_V);
            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, false);


            Thread.sleep(500);
            click(KeyEvent.VK_U);
            Thread.sleep(500);
            click(KeyEvent.VK_N);
            Thread.sleep(500);
            click(KeyEvent.VK_P);
            Thread.sleep(500);
            click(KeyEvent.VK_A);
            Thread.sleep(500);
            click(KeyEvent.VK_U);
            Thread.sleep(500);
            click(KeyEvent.VK_S);
            Thread.sleep(500);
            click(KeyEvent.VK_E);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //4-39-96-95-1120
    public void skipGroovy(){
        try {
            String text2 = "/";
            StringSelection stringSelection2 = new StringSelection(text2);
            Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard2.setContents(stringSelection2, stringSelection2);

            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(200);
            click(KeyEvent.VK_V);
            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, false);


            Thread.sleep(500);
            click(KeyEvent.VK_S);
            Thread.sleep(500);
            click(KeyEvent.VK_K);
            Thread.sleep(500);
            click(KeyEvent.VK_I);
            Thread.sleep(500);
            click(KeyEvent.VK_P);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //4-103-28-113-1120
    public void disconnectGroovy(){
        try {
            String text2 = "/";
            StringSelection stringSelection2 = new StringSelection(text2);
            Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard2.setContents(stringSelection2, stringSelection2);

            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(200);
            click(KeyEvent.VK_V);
            Thread.sleep(200);
            hold(KeyEvent.VK_CONTROL, false);


            Thread.sleep(500);
            click(KeyEvent.VK_D);
            Thread.sleep(500);
            click(KeyEvent.VK_I);
            Thread.sleep(500);
            click(KeyEvent.VK_S);
            Thread.sleep(500);
            click(KeyEvent.VK_C);
            Thread.sleep(500);
            click(KeyEvent.VK_O);
            Thread.sleep(500);
            click(KeyEvent.VK_N);
            Thread.sleep(500);
            click(KeyEvent.VK_N);
            Thread.sleep(500);
            click(KeyEvent.VK_E);
            Thread.sleep(500);
            click(KeyEvent.VK_C);
            Thread.sleep(500);
            click(KeyEvent.VK_T);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            click(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------PC Befehle---------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------



    public void openYoutube(){
        click(KeyEvent.VK_WINDOWS);

        try {
            Thread.sleep(500);


            String text1 = "firefox";
            StringSelection stringSelection1 = new StringSelection(text1);
            Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard1.setContents(stringSelection1, stringSelection1);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);

            Thread.sleep(3000);

            String toOpen = "youtube";

            String text = toOpen;
            StringSelection stringSelection = new StringSelection(text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, stringSelection);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);

            Thread.sleep(500);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_ENTER);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openGoogle(){
        click(KeyEvent.VK_WINDOWS);

        try {
            Thread.sleep(500);


            String text1 = "firefox";
            StringSelection stringSelection1 = new StringSelection(text1);
            Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard1.setContents(stringSelection1, stringSelection1);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);
            Thread.sleep(500);
            click(KeyEvent.VK_ENTER);

            Thread.sleep(3000);

            String toOpen = "google";

            String text = toOpen;
            StringSelection stringSelection = new StringSelection(text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, stringSelection);

            hold(KeyEvent.VK_CONTROL, true);
            click(KeyEvent.VK_V);
            hold(KeyEvent.VK_CONTROL, false);

            Thread.sleep(500);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_TAB);

            Thread.sleep(250);

            click(KeyEvent.VK_ENTER);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void lockPC(){
        Runtime rt = Runtime.getRuntime();
        try {
            Process pr = rt.exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void shutdownPC(){
        Runtime runtime = Runtime.getRuntime();
        try {
            Process proc = runtime.exec("shutdown -s -t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public void openTaskManager(){
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            Thread.sleep(50);
            r.keyPress(KeyEvent.VK_SHIFT);
            Thread.sleep(50);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(50);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_SHIFT);
            r.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }











    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------Externe Methoden---------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void writeRobot(String text){
        try {


            String text1 = text;
            StringSelection stringSelection1 = new StringSelection(text1);
            Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard1.setContents(stringSelection1, stringSelection1);

            Thread.sleep(1000);
            hold(KeyEvent.VK_CONTROL, true);
            Thread.sleep(1000);
            click(KeyEvent.VK_V);
            Thread.sleep(1000);
            hold(KeyEvent.VK_CONTROL, false);

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(KeyEvent.VK_ENTER);
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

}
