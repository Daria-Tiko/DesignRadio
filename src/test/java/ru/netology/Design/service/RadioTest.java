package ru.netology.Design.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    Radio station = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioStation.csv")
    public void shouldSetCurrentRadioStation(int currentRadioStation, int expected) {

        station.setCurrentRadioStation(currentRadioStation);

        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4",
            "9,0",
            "0,1"
    })
    public void shouldSetNextRadioStation(int currentRadioStation, int expected) {

        station.setCurrentRadioStation(currentRadioStation);
        station.nextStation();


        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "5,4",
            "9,8"
    })
    public void shouldSetPrevRadioStation(int currentRadioStation, int expected) {
        station.setCurrentRadioStation(currentRadioStation);
        station.prevStation();

        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Volume.csv")
    public void shouldSetCurrentVolume(int currentVolume, int expected) {

        station.setCurrentVolume(currentVolume);

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "10,10",
            "11,1"
    })
    public void shouldSetVolumeUp(int currentVolume, int expected) {
        station.setCurrentVolume(currentVolume);
        station.volumeUp();

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,7",
            "0,0",
            "-1,0"
    })
    public void shouldSetVolumeDown(int currentVolume, int expected) {
        station.setCurrentVolume(currentVolume);
        station.volumeDown();

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}