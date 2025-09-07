package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void SetNumberRadioWaveDown() {
        Radio radio = new Radio();
        radio.setNumberCurrentWave(0);
        radio.decreaseNumberCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getNumberCurrentWave());

    }

    @Test
    void SetNumberCurrentUp() {
        Radio radio = new Radio();
        radio.setNumberCurrentWave(9);
        radio.increaseNumberCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getNumberCurrentWave());
    }

    @Test
    void IncreaseVolumeLimitUp() {
        Radio radio = new Radio();
        radio.setVolumeSound(100);
        int expected = 100;
        radio.increaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void DecreaseVolumeLimitDown() {
        Radio radio = new Radio();
        radio.setVolumeSound(0);
        int expected = 0;
        radio.decreaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }


    @Test
    void increaseNumberCurrentWave() {
        Radio radio = new Radio();
        radio.setNumberCurrentWave(5);
        int expected = 6;
        radio.increaseNumberCurrentWave();
        Assertions.assertEquals(expected, radio.getNumberCurrentWave());
    }

    @Test
    void decreaseNumberCurrentWave() {
        Radio radio = new Radio();
        radio.setNumberCurrentWave(7);
        int expected = 6;
        radio.decreaseNumberCurrentWave();
        Assertions.assertEquals(expected, radio.getNumberCurrentWave());
    }

    @Test
    void setNumberCurrentWave() {
        Radio radio = new Radio();
        radio.setNumberCurrentWave(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getNumberCurrentWave());
    }

    @Test
    void increaseVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(50);
        int expected = 51;
        radio.increaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void decreaseVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(51);
        int expected = 50;
        radio.decreaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void setVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(50);
        int expected = 50;

        Assertions.assertEquals(expected, radio.getVolumeSound());
    }
}

