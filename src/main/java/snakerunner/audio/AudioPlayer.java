package snakerunner.audio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public final class AudioPlayer {

    private static final Logger LOGGER = Logger.getLogger(AudioPlayer.class.getName());
    private static boolean soundEnable = true;

    private AudioPlayer(){} //Empty constructor

    public static void setSoundEnabled(final boolean enable){
        soundEnable = enable;
    }

    public static boolean isSoundEnable() {
        return soundEnable;
    }

    public static void playSound(final String fileName) {

        if (!soundEnable) {
            return;
        }

        //Try-with-resources
        try ( InputStream sound = AudioPlayer.class.getResourceAsStream("/" + fileName);
              BufferedInputStream bstream = new BufferedInputStream(sound);
              AudioInputStream audioStream = AudioSystem.getAudioInputStream(bstream);
            ) {

                if (sound == null) {
                    LOGGER.log(Level.WARNING, "File not found.", fileName);
                    return;
                }

                final Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();

                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                    }
                });

            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
                LOGGER.log(Level.SEVERE, "Format audio not supported: " + fileName, e);
            }
    }
}
