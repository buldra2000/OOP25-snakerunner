package snakerunner.audio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AudioPlayerTest {

    @Test
    void testSoundEnabledFlag() {
        AudioPlayer.setSoundEnabled(true);
        assertTrue(AudioPlayer.isSoundEnable());
        
        AudioPlayer.setSoundEnabled(false);
        assertFalse(AudioPlayer.isSoundEnable());
    }
}
