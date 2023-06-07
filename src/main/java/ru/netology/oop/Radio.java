package ru.netology.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxCurrentStationNumber = 9;
    private int minCurrentStationNumber;
    private int currentStationNumber = minCurrentStationNumber;
    private int maxSoundVolume = 100;
    private int minSoundVolume;
    private int soundVolume = minSoundVolume;

    public Radio(int sizeStation) {
        maxCurrentStationNumber = minCurrentStationNumber + sizeStation - 1;
        maxSoundVolume = minSoundVolume + sizeStation;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxCurrentStationNumber) {
            return;
        }
        if (newCurrentStationNumber < minCurrentStationNumber) {
            newCurrentStationNumber = maxCurrentStationNumber;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > maxSoundVolume) {
            newSoundVolume = maxSoundVolume;
        }
        if (newSoundVolume < minSoundVolume) {
            newSoundVolume = minSoundVolume;
        }
        soundVolume = newSoundVolume;
    }

    public void maxCurrentStationNumber() {
        currentStationNumber = maxCurrentStationNumber;
    }

    public void maxSoundVolume() {
        soundVolume = maxSoundVolume;
    }

    public void nextStationNumber() {
        if (currentStationNumber >= maxCurrentStationNumber) {
            currentStationNumber = minCurrentStationNumber;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prevStationNumber() {
        if (currentStationNumber <= minCurrentStationNumber) {
            currentStationNumber = maxCurrentStationNumber;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public void moreSound() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = soundVolume;
        }
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void lessSound() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = soundVolume;
        }
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }

}