package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(20);

    @Test
    void shouldPrevNumberCurrentWave() {
        radio.setCurrentRadioStation(10);
        radio.prevNumberCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetCurrentRadioStation() {
        radio.setCurrentRadioStation(14);
        int expected = 14;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNextNumberCurrentWave() {
        radio.setCurrentRadioStation(9);
        radio.nextNumberCurrentWave();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotIncreaseVolumeLimitUp() {
        radio.setVolumeSound(100);
        int expected = 100;
        radio.increaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void shouldNotDecreaseVolumeLimitDown() {
        radio.setVolumeSound(0);
        int expected = 0;
        radio.decreaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }


    @Test
    void ShouldIncreaseNumberCurrentWave() {
        radio.setCurrentRadioStation(5);
        int expected = 6;
        radio.nextNumberCurrentWave();
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseNumberCurrentWave() {
        radio.setCurrentRadioStation(7);
        int expected = 6;
        radio.prevNumberCurrentWave();
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeSound() {
        radio.setVolumeSound(50);
        int expected = 51;
        radio.increaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void shouldDDecreaseVolumeSound() {
        radio.setVolumeSound(51);
        int expected = 50;
        radio.decreaseVolumeSound();
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void shoulSetVolumeSound() {
        radio.setVolumeSound(50);
        int expected = 50;
        Assertions.assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void shouldSetALotRadioStation() {
        Radio newRadio = new Radio(40);
        int expected = 40;
        Assertions.assertEquals(expected, newRadio.getALotRadioStation());
    }

    @Test
    void shouldDefaultCountStation() {
        Radio radioDefault = new Radio();
        int expected = 10;
        Assertions.assertEquals(expected, radioDefault.getALotRadioStation());
    }

    @Test
    void SetNumberRadioWaveDown() {

        radio.setCurrentRadioStation(0);
        radio.prevNumberCurrentWave();
        int expected = 19;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void SetNumberCurrentUp() {

        radio.setCurrentRadioStation(19);
        radio.nextNumberCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }
}

