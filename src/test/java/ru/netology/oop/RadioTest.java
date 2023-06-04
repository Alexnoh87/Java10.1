package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio rad = new Radio(11, 0, 0, 100, 0, 0);

        rad.setCurrentStationNumber(5);

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(11, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(5, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(54);

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(54, rad.getSoundVolume());
    }

    @Test
    public void shouldSetMaxCurrentStation() {
        Radio rad = new Radio();

        rad.setMaxCurrentStationNumber(8);

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(8, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio rad = new Radio();

        rad.setMaxSoundVolume(100);

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(0, rad.getSoundVolume());
    }

}
