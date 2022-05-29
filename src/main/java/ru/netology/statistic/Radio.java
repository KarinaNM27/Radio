package ru.netology.statistic;

public class Radio {
    private int numberRadiostation;
    private int soundVolume;

    public void setNumberRadiostation(int numberRadiostation) {
        if (numberRadiostation < 0) {
            return;
        }
        if (numberRadiostation > 9) {
            return;
        }
        this.numberRadiostation = numberRadiostation;
    }

    public int getNumberRadiostation() {
        return numberRadiostation;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void next() {
        if (numberRadiostation < 9) {
            numberRadiostation = numberRadiostation + 1;

        } else {
            numberRadiostation = 0;


        }


    }


    public void prev() {
        if (numberRadiostation > 0) {
            numberRadiostation = numberRadiostation - 1;

        } else  {
            numberRadiostation = 9;


        }

    }

    }









