package snakerunner.audio;

import java.net.URL;

/*Class test for AudioPlayer */
public class AudioTest {
    public static void main(String[] args) {
        String fileName = "eat.wav";

        URL soundURL = AudioPlayer.class.getResource("/" + fileName);
        System.out.println("URL: " + soundURL);

        if (soundURL != null) {
            AudioPlayer.playSound(fileName);
        } else {
            System.out.println("File not found in classpath.");
        }

        try{ 
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
