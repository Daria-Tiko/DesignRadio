package ru.netology.Design.service;


public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > amountRadioStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void nextStation() {
        if (currentRadioStation == amountRadioStation - 1) {
            currentRadioStation = 0;
        } else currentRadioStation = currentRadioStation + 1;
    }


    public void prevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }


    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}