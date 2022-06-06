package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void findRadiostations1() {

        radio.setRadiostations(15);
        int actual = radio.getRadiostations();

        assertEquals(15, actual);
    }


    @Test
    void findMinnumber() {

        radio.setNumberRadiostation(-1);
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findMaxnumber() {

        radio.setNumberRadiostation(10);
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findMinvolume() {

        radio.setSoundVolume(-1);
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findMaxvolume() {

        radio.setSoundVolume(101);
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findNextnumber() {

        radio.setNumberRadiostation(9);
        radio.next();
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findNextnumber1() {

        radio.setNumberRadiostation(8);
        radio.next();
        int actual = radio.getNumberRadiostation();

        assertEquals(9, actual);

    }

    @Test
    void findPrevnumber() {

        radio.setNumberRadiostation(0);
        radio.prev();
        int actual = radio.getNumberRadiostation();

        assertEquals(9, actual);

    }

    @Test
    void findPrevnumber1() {

        radio.setNumberRadiostation(1);
        radio.prev();
        int actual = radio.getNumberRadiostation();

        assertEquals(0, actual);

    }

    @Test
    void findNextvolume() {

        radio.setSoundVolume(100);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(100, actual);

    }

    @Test
    void findNextvolume1() {

        radio.setSoundVolume(99);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(100, actual);

    }

    @Test
    void findPrevvolume() {

        radio.setSoundVolume(0);

        radio.decreaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findPrevvolume1() {

        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();

        assertEquals(0, actual);

    }

    @Test
    void findRadiostations() {

        Radio radio1 = new Radio(30);


        assertEquals(30, radio1.getRadiostations());

    }


}
