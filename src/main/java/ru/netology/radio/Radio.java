package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int numberOfStations = 10;
    private int lastStation;
    private int currentVolume;

    public Radio (){
        this.lastStation = numberOfStations - 1;

    }
    public Radio (int numberOfStations){
        this.numberOfStations = numberOfStations;
        this.lastStation = numberOfStations - 1;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
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
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int nextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == lastStation) {
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
            currentStation = lastStation;
        }
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > lastStation) {
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
