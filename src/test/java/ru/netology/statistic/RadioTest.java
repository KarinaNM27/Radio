package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void findRadiostations() {

        radio.setNumberRadiostation(15);
        int actual = radio.getRadiostations();

        assertEquals(10, actual);
    }

    @Test
    void findMinNumber() {

        radio.setNumberRadiostation(-1);
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findMaxNumber() {

        radio.setNumberRadiostation(10);
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findMinVolume() {

        radio.setSoundVolume(-1);
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findMaxVolume() {

        radio.setSoundVolume(101);
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findNextNumber() {

        radio.setNumberRadiostation(9);
        radio.next();
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findNextNumber1() {

        radio.setNumberRadiostation(8);
        radio.next();
        int actual = radio.getNumberRadiostation();

        assertEquals(9, actual);

    }

    @Test
    void findPrevNumber() {

        radio.setNumberRadiostation(0);
        radio.prev();
        int actual = radio.getNumberRadiostation();

        assertEquals(9, actual);

    }

    @Test
    void findPrevNumber1() {

        radio.setNumberRadiostation(1);
        radio.prev();
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findNextVolume() {

        radio.setSoundVolume(100);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(100, actual);

    }

    @Test
    void findNextVolume1() {

        radio.setSoundVolume(99);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(100, actual);

    }

    @Test
    void findPrevVolume() {

        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findPrevVolume1() {

        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findRadiostations3() {

        Radio radio1 = new Radio(30);


        assertEquals(30, radio1.getRadiostations());

    }


}
