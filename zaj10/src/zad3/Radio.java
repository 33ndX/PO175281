package zad3;

import java.lang.invoke.MutableCallSite;

public class Radio implements MusciPlayer{
    @Override
    public void turnOn() {
        System.out.println("Radio włączone");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio wyłączone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Zmieniono stację radiową");
    }

    public static void main(String[] args) {
        MusciPlayer radio = new Radio();
        radio.turnOn();
        radio.turnOff();
        radio.nextTrack();
    }
}
