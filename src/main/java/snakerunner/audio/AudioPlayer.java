package snakerunner.audio;

import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {

    private static boolean soundEnable = true;

    public AudioPlayer(){}

    public static void setSoundEnabled(boolean enable){
        soundEnable = enable;
    }

    public static boolean isSoundEnable() {
        return soundEnable;
    }

    public static void playSound(String fileName){

        if (!soundEnable) {
            return;
        }

        try {
            final InputStream sound = AudioPlayer.class.getResourceAsStream("/" + fileName);
            System.out.println("stream: " + sound);

            if (sound == null) {
                System.out.println("Sound not found.");
                return;
            }

            final BufferedInputStream bstream = new BufferedInputStream(sound);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bstream);
            System.out.println("stream: " + bstream);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            clip.addLineListener(event -> {
                if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                clip.close();
                }
            });


        } catch (Exception e) {
            System.out.println("Error playing sound.");
            e.printStackTrace();
        }
    }
}
