package ru.netology;

public class Radio {
    private int numberCurrentWave;
    private int volumeSound;

    public int getNumberCurrentWave() {
        return numberCurrentWave;
    }

    public void increaseNumberCurrentWave() {
        setNumberCurrentWave(getNumberCurrentWave() + 1);
    }

    public void decreaseNumberCurrentWave() {
        setNumberCurrentWave(getNumberCurrentWave() - 1);
    }

    public void setNumberCurrentWave(int newNumberCurrentWave) {
        if (newNumberCurrentWave < 0) {
            newNumberCurrentWave = 9;
        }
        if (newNumberCurrentWave > 9) {
            newNumberCurrentWave = 0;
        }
        numberCurrentWave = newNumberCurrentWave;
    }

    // sound sound sound sound sound sound sound sound sound sound
    // sound sound sound sound sound sound sound sound sound sound
    // sound sound sound sound sound sound sound sound sound sound
    // sound sound sound sound sound sound sound sound sound sound

    public int getVolumeSound() {
        return volumeSound;
    }

    public void increaseVolumeSound() {
        setVolumeSound(getVolumeSound() + 1);
    }

    public void decreaseVolumeSound() {
        setVolumeSound(getVolumeSound() - 1);
    }

    public void setVolumeSound(int newVolumeSound) {
        if (newVolumeSound < 0) {
            return;
        }
        if (newVolumeSound > 100) {
            return;
        }
        volumeSound = newVolumeSound;
    }


}


