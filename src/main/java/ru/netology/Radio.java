package ru.netology;
//Можно задавать количество радиостанций при создании объекта, по умолчанию — 10.
//Номер текущей радиостанции изменяется в пределах
// от 0 до количества радиостанций не включительно.
// То есть если станций 10, то номер последней — 9.
//Если текущая радиостанция — максимальная, и клиент нажал на кнопку next на пульте,
// то текущей должна стать нулевая.
//Если текущая радиостанция — 0, и клиент нажал на кнопку prev на пульте,
// то текущей должна стать максимальная.
//Всё так же должен присутствовать сеттер текущей станции.

public class Radio {
    private int currentRadioStation;
    private int volumeSound;
    private int aLotRadioStation;

    public Radio(int aLotRadioStation) {
        this.aLotRadioStation = aLotRadioStation;
    }

    public Radio() {
        aLotRadioStation = 10;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getALotRadioStation() {
        return aLotRadioStation;
    }


    public void nextNumberCurrentWave() {
        setCurrentRadioStation(getCurrentRadioStation() + 1);
    }

    public void prevNumberCurrentWave() {
        setCurrentRadioStation(getCurrentRadioStation() - 1);
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation  < 0) {
            newCurrentRadioStation = aLotRadioStation-1;
        }
        if (newCurrentRadioStation > (aLotRadioStation - 1)) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

//    клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100;
//    если уровень громкости звука достиг максимального значения,
//    то дальнейшее нажатие на + не должно ни к чему приводить;
//    если уровень громкости звука достиг минимального значения,
//    то дальнейшее нажатие на - не должно ни к чему приводить.

    public int getVolumeSound() {
        return volumeSound;
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

    public void increaseVolumeSound() {
        setVolumeSound(getVolumeSound() + 1);
    }

    public void decreaseVolumeSound() {
        setVolumeSound(getVolumeSound() - 1);
    }


}


