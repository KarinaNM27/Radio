package ru.netology.statistic;

public class Radio {
    private int radiostations = 10;

    private int numberRadiostation;
    private int soundVolume;
    private int minNumberRadiostation = 0;
    private int maxNumberRadiostation = radiostations - 1;
    private int minSoundvolume = 0;
    private int maxSoundvolume = 100;


    public void setRadiostations(int radiostations) {
        this.radiostations = radiostations;
    }

    public int getRadiostations() {
        return radiostations;
    }


    public void setNumberRadiostation(int numberRadiostation) {
        if (numberRadiostation < minNumberRadiostation) {
            return;
        }
        if (numberRadiostation > maxNumberRadiostation) {
            return;
        }
        this.numberRadiostation = numberRadiostation;
    }

    public int getNumberRadiostation() {
        return numberRadiostation;
    }

    public Radio() {

    }

    public Radio(int radiostations) {
        this.radiostations = radiostations;
        this.maxNumberRadiostation = radiostations - 1;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundvolume) {
            return;
        }
        if (soundVolume > maxSoundvolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxSoundvolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minSoundvolume) {
            soundVolume = soundVolume - 1;
        }
    }

    public void next() {
        if (numberRadiostation < maxNumberRadiostation) {
            numberRadiostation = numberRadiostation + 1;

        } else {
            numberRadiostation = minNumberRadiostation;


        }


    }


    public void prev() {
        if (numberRadiostation > minNumberRadiostation) {
            numberRadiostation = numberRadiostation - 1;

        } else {
            numberRadiostation = maxNumberRadiostation;


        }

    }
}











