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
    private int minNumberradiostation = 0;
    private int maxNumberradiostation = 9;
    private int minSoundvolume = 0;
    private int maxSoundvolume = 100;


    public Radio(int radiostations){
this.radiostations = radiostations;
   }



    public void setNumberRadiostation(int numberRadiostation) {
        if (numberRadiostation < minNumberradiostation) {
            return;
        }
        if (numberRadiostation > maxNumberradiostation) {
            return;
        }
        this.numberRadiostation = numberRadiostation;
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
        if (numberRadiostation < maxNumberradiostation) {
            numberRadiostation = numberRadiostation + 1;

        } else {
            numberRadiostation = minNumberradiostation;


        }


    }


    public void prev() {
        if (numberRadiostation > minNumberradiostation) {
            numberRadiostation = numberRadiostation - 1;

        } else {
            numberRadiostation = maxNumberradiostation;


        }

    }

}









