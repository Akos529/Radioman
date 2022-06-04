package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume == 10){
            currentVolume = newCurrentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0){
            currentVolume = newCurrentVolume;
        }
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int nextStation(int newCurrentStation) {
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int previousStation(int newCurrentStation) {
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}
