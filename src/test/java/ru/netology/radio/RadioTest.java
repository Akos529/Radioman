package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume(5);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAtMaximum() {
        Radio radio = new Radio();
        radio.increaseVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAboveMaximum() {
        Radio radio = new Radio();
        radio.increaseVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume(5);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAtMinimum() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeBelowMinimum() {
        Radio radio = new Radio();
        radio.decreaseVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAbove9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.nextStation(5);
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationFrom9To0() {
        Radio radio = new Radio();
        radio.nextStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.previousStation(5);
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPreviousStationFrom0To9() {
        Radio radio = new Radio();
        radio.previousStation(0);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
}
