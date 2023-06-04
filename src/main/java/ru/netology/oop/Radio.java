package ru.netology.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxCurrentStationNumber = 10;
    private int minCurrentStationNumber;
    private int currentStationNumber = minCurrentStationNumber;
    private int maxSoundVolume = 100;
    private int minSoundVolume;
    private int soundVolume = minSoundVolume;

}
