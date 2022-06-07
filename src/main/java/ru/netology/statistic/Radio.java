package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int radiostations = 10;

    private int numberRadiostation;
    private int soundVolume;
    private int minNumberRadiostation = 0;
    private int maxNumberRadiostation = 9;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public Radio(int radiostations) {
        this.radiostations = radiostations;
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


    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundVolume) {
            return;
        }
        if (soundVolume > maxSoundVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }


    public void increaseVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minSoundVolume) {
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