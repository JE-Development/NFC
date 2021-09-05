import jdk.jshell.execution.Util;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.smartcardio.*;

public class Main {

    static boolean einmal = true;

    static Befehle befehle;
    static boolean isTerminal = true;

    public static void main(String[] args) throws CardException {

        befehle = new Befehle();

        ManagerNFC nfc = new ManagerNFC();
        nfc.start();

        //Empfang e1 = new Empfang();
        //e1.start();

        while(true) {

            TerminalFactory factory = TerminalFactory.getDefault();
            List<CardTerminal> terminals = null;
            try {
                terminals = factory.terminals().list();
                isTerminal = true;
            } catch (CardException e) {
                if(isTerminal) {
                    System.out.println("------------------there is no card reader");
                    System.exit(0);
                    isTerminal = false;
                }
            }

// (this is the correct terminal)
            CardTerminal terminal = null;
            try {
                terminal = terminals.get(0);
            }catch (Exception e){
                isTerminal = false;
                System.exit(0);
            }

            if(isTerminal){
                if(!terminal.isCardPresent()) {
                    einmal = true;
                }
            }

            try {
                if(isTerminal) {
                    if (terminal.waitForCardPresent(500000000)) {
                        if (einmal) {
                            einmal = false;
                            Card card = terminal.connect("*");

                            CardChannel channel = card.getBasicChannel();

                            // (I tried both 0x00 and 0x01 as P1, as well as 0x05 for Le)
                            CommandAPDU getAts = new CommandAPDU(0xFF, 0xCA, 0x00, 0x00, 0x04);
                            ResponseAPDU response = channel.transmit(getAts);

                            ManagerNFC.cText(String.valueOf(response.getSW()));
                            ManagerNFC.cText(String.valueOf(response.getSW1()));
                            ManagerNFC.cText(String.valueOf(response.getSW2()));
                            ManagerNFC.cText(String.valueOf(response.getData()));
                            ManagerNFC.cText(String.valueOf(response.getBytes()));
                            ManagerNFC.cText(String.valueOf(response.getNr()));
                            ManagerNFC.cText(String.valueOf(response.toString()));

                            String s = Arrays.toString(response.getData());
                            String s1 = Arrays.toString(response.getBytes());

                            ManagerNFC.cText(String.valueOf("\n" + s));
                            ManagerNFC.cText(String.valueOf(s1));


                            byte[] bytes = response.getBytes();

                            String combo = "";

                            for (int i = 0; i < bytes.length; i++) {
                                combo = combo + bytes[i];
                            }

                            ManagerNFC.cText("combo: " + combo);

                            switch (combo) {
                                //start groovy
                                case "4112-6442-1120":
                                    befehle.startGroovy();
                                    break;

                                //stop groovy
                                case "424-597-1120":
                                    befehle.stopGroovy();
                                    break;

                                //pause groovy
                                case "49657-82-1120":
                                    befehle.pauseGroovy();
                                    break;

                                //unpause groovy
                                case "40-760-1120":
                                    befehle.unpauseGroovy();
                                    break;

                                //skip groovy
                                case "4-39-96-95-1120":
                                    befehle.skipGroovy();
                                    break;

                                //disconnect groovy
                                case "4-103-28-113-1120":
                                    befehle.disconnectGroovy();
                                    break;

                                //open youtube
                                case "4-3228-81-1120":
                                    befehle.openYoutube();
                                    break;

                                //open google
                                case "4-112-43-91-1120":
                                    befehle.openGoogle();
                                    break;

                                //lock pc
                                case "480-7610-1120":
                                    befehle.lockPC();
                                    break;

                                //shutdown pc
                                case "465-3135-1120":
                                    befehle.shutdownPC();
                                    break;

                                //open Task Manager
                                case "4-8044-121-1120":
                                    befehle.openTaskManager();
                                    break;

                                default:
                                    break;
                            }
                        }

                    }
                }
            } catch (CardException e) {
                System.out.println("--------------------- card read fail");
                System.exit(0);
            }





        /*try {

            Socket s = new Socket("192.168.178.74",1234);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hallo");
            dout.flush();
            dout.close();
            s.close();
            ManagerNFC.cText(String.valueOf("erfolgreich abgesendet");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        ManagerNFC nfc = new ManagerNFC();
        nfc.createGUI();

        Empfang e = new Empfang();
        e.start();
    }*/
        }
    }
}