package ru.netology.Design.service;


public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }

    }

    public void prevStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}