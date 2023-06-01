package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio rad = new Radio(11);

        rad.setCurrentStationNumber(5);

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(10, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(5, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio rad = new Radio(12);

        rad.setCurrentStationNumber(12);

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(11, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(9, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(9, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio rad = new Radio(15);

        rad.maxCurrentStationNumber();

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(14, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(14, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumber() {
        Radio rad = new Radio(10);

        rad.setCurrentStationNumber(5);
        rad.nextStationNumber();

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(9, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldNextMoreMaxStationNumber() {
        Radio rad = new Radio(10);

        rad.setCurrentStationNumber(9);
        rad.nextStationNumber();

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(9, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumber() {
        Radio rad = new Radio(10);

        rad.setCurrentStationNumber(7);
        rad.prevStationNumber();

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(9, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, rad.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevLessMinStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(0);
        rad.prevStationNumber();

        Assertions.assertEquals(0, rad.getMinCurrentStationNumber());
        Assertions.assertEquals(9, rad.getMaxCurrentStationNumber());
        Assertions.assertEquals(9, rad.getCurrentStationNumber());
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
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(100, rad.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(0, rad.getSoundVolume());
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio rad = new Radio();

        rad.maxSoundVolume();

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(100, rad.getSoundVolume());
    }

    @Test
    public void shouldMoreSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(52);
        rad.moreSound();

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(53, rad.getSoundVolume());
    }

    @Test
    public void shouldMoreMaxSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);
        rad.moreSound();

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(100, rad.getSoundVolume());
    }

    @Test
    public void shouldLessSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(48);
        rad.lessSound();

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(47, rad.getSoundVolume());
    }

    @Test
    public void shouldLessMinSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);
        rad.lessSound();

        Assertions.assertEquals(0, rad.getMinSoundVolume());
        Assertions.assertEquals(100, rad.getMaxSoundVolume());
        Assertions.assertEquals(0, rad.getSoundVolume());
    }
}