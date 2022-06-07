package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return currentStation;
        }
        if (currentStation == 0) {
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
