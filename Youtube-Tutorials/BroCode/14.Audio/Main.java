import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("movement-200697.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        // Attempting to paly in BG thread but our program is not waiting for BG
        // threads..
        // As soon as you run the code, it will be terminated.
        // We need to keep our program open and running.

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.println("Enter your choise: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response!");
                    break;
            }
        }

        System.out.println("Audio-Player Closed!");
    }
}