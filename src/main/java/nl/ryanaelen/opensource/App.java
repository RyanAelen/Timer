package nl.ryanaelen.opensource;

import nl.ryanaelen.opensource.textdraw.CenterText;
import nl.ryanaelen.opensource.textdraw.ITextToScreen;
import nl.ryanaelen.opensource.time.Timer;
import processing.core.PApplet;

import java.time.LocalTime;
import java.util.Scanner;

public class App extends PApplet {
    ITextToScreen center;
    Timer timer;
    Boolean tijdbekent = false;

    public static void main(String[] args) {
        PApplet.main("nl.ryanaelen.opensource.App");
    }

    @Override
    public void settings() {
        size(400, 400);

    }

    @Override
    public void setup() {
        surface.setResizable(true);
        center = new CenterText(this);
        timer = new Timer(LocalTime.of(21, 10));
    }

    @Override
    public void draw() {
        background(0);
        if (tijdbekent) {
            center.text(timer.getTimeLeftString());
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter hours: ");
            int hh = Integer.parseInt(scan.nextLine());
            System.out.println("Enter minuts: ");
            int mm = Integer.parseInt(scan.nextLine());
            timer = new Timer(LocalTime.of(hh, mm));
            tijdbekent = true;
        }
    }
}
