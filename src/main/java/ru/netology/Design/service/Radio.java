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
        if (currentRadioStation >= 0 & currentRadioStation < amountRadioStation) {
            this.currentRadioStation = currentRadioStation;
        }

    }

    public void nextStation(int currentRadioStation) {
        if (currentRadioStation < amountRadioStation - 1) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= amountRadioStation - 1) {
            this.currentRadioStation = 0;
        }
    }

    public void prevStation(int currentRadioStation) {
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= 0) {
            this.currentRadioStation = amountRadioStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    public void volumeUp(int currentVolume) {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            this.currentVolume = 100;
        }
    }

    public void volumeDown(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }


}