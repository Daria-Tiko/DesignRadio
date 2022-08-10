package ru.netology.Design.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    Radio station = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/radioStation.csv")
    public void shouldSetCurrentRadioStation(int newCurrentRadioStation, int expected) {

        station.setCurrentRadioStation(newCurrentRadioStation);

        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4",
            "9,0",
            "0,1"
    })
    public void shouldSetNextRadioStation(int newCurrentRadioStation, int expected) {

        station.nextStation(newCurrentRadioStation);

        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "5,4",
            "9,8"
    })
    public void shouldSetPrevRadioStation(int newCurrentRadioStation, int expected) {

        station.prevStation(newCurrentRadioStation);

        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Volume.csv")
    public void shouldSetCurrentVolume(int newCurrentVolume, int expected) {

        station.setCurrentVolume(newCurrentVolume);

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "10,10",
            "11,10"
    })
    public void shouldSetVolumeUp(int newCurrentVolume, int expected) {

        station.volumeUp(newCurrentVolume);

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,7",
            "0,0",
            "-1,0"
    })
    public void shouldSetVolumeDown(int newCurrentVolume, int expected) {

        station.volumeDown(newCurrentVolume);

        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}