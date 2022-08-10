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
        public int nextStation(int newCurrentRadioStation) {
            if (newCurrentRadioStation < 9) {
                currentRadioStation = newCurrentRadioStation + 1;
            }
            if (newCurrentRadioStation >= 9) {
                currentRadioStation = 0;
            }
            return currentRadioStation;
        }
        public int prevStation(int newCurrentRadioStation) {
            if (newCurrentRadioStation > 0) {
                currentRadioStation = newCurrentRadioStation - 1;
            }
            if (newCurrentRadioStation <= 0) {
                currentRadioStation = 9;
            }
            return currentRadioStation;
        }

        public void setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume >= 0 & newCurrentVolume <= 10) {
                currentVolume = newCurrentVolume;
            }
        }
        public int volumeUp(int newCurrentVolume) {
            if (newCurrentVolume < 10) {
                currentVolume = newCurrentVolume + 1;
            }
            if (newCurrentVolume >= 10) {
                currentVolume = 10;
            }
            return currentVolume;
        }
        public int volumeDown(int newCurrentVolume) {
            if (newCurrentVolume > 0) {
                currentVolume = newCurrentVolume -1;
            }
            if (newCurrentVolume <= 0) {
                currentVolume = 0;
            }
            return currentVolume;
        }


    }