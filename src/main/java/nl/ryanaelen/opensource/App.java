package nl.ryanaelen.opensource;

import nl.ryanaelen.opensource.textdraw.CenterText;
import nl.ryanaelen.opensource.textdraw.ITextToScreen;
import nl.ryanaelen.opensource.time.Timmer;
import processing.core.PApplet;

import java.time.LocalTime;

public class App extends PApplet {
    ITextToScreen center;
    Timmer timer;

    public static void main(String[] args) {
        PApplet.main("nl.ryanaelen.opensource.App");
    }

    @Override
    public void settings() {
        size(200, 400);

    }

    @Override
    public void setup() {
        surface.setResizable(true);
        center = new CenterText(this);
        timer = new Timmer(LocalTime.of(1, 0));
    }

    @Override
    public void draw() {
        background(0);
        center.text(timer.getTimeLeftString());
    }
}
