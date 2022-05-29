package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void findMinnumber(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(-1);
        int actual = radio.getNumberRadiostation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findMaxnumber(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(10);
        int actual = radio.getNumberRadiostation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findMinvolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int actual = radio.getSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findMaxvolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(11);
        int actual = radio.getSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findNextnumber(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(9);
        radio.next();
        int actual = radio.getNumberRadiostation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findNextnumber1(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(8);
        radio.next();
        int actual =  radio.getNumberRadiostation();
        int expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    void findPrevnumber(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(0);
        radio.prev();
        int actual = radio.getNumberRadiostation();
        int expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    void findPrevnumber1(){
        Radio radio = new Radio();
        radio.setNumberRadiostation(1);
        radio.prev();
        int actual = radio.getNumberRadiostation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findNextvolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void findNextvolume1(){
        Radio radio = new Radio();
        radio.setSoundVolume(9);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void findPrevvolume(){
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void findPrevvolume1(){
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

}
