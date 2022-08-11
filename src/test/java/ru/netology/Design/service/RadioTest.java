package ru.netology.Design.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    Radio station = new Radio();

    @Test
    public void testRadioStation() {

        Assertions.assertEquals(10, station.getAmountRadioStation());
    }

    @Test
    public void amountRadioStation() {
        Radio amountStation = new Radio(15);

        Assertions.assertEquals(15, amountStation.getAmountRadioStation());
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioStation.csv")
    public void shouldSetCurrentRadioStation(int currentRadioStation, int expected) {

        station.setCurrentRadioStation(currentRadioStation);

        Assertions.assertEquals(expected, station.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "9,0",
            "5,6"
    })
    public void shouldSetNextRadioStation(int currentRadioStation, int expected) {

        station.nextStation(currentRadioStation);

        Assertions.assertEquals(expected, station.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "5,4",
            "9,8"
    })
    public void shouldSetPrevRadioStation(int currentRadioStation, int expected) {

        station.prevStation(currentRadioStation);

        Assertions.assertEquals(expected, station.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Volume.csv")
    public void shouldSetCurrentVolume(int currentVolume, int expected) {

        station.setCurrentVolume(currentVolume);

        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "100,100",
            "50,51",
            "0,1"
    })
    public void shouldSetVolumeUp(int currentVolume, int expected) {

        station.volumeUp(currentVolume);

        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "100,99",
            "50,49",
            "0,0"
    })
    public void shouldSetVolumeDown(int currentVolume, int expected) {

        station.volumeDown(currentVolume);

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}