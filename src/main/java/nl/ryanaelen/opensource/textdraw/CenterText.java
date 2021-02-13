package nl.ryanaelen.opensource.textdraw;

import processing.core.PApplet;

public class CenterText implements ITextToScreen {
    PApplet app;

    public CenterText(PApplet app) {
        this.app = app;
    }

    @Override
    public void text(String text) {
        if (checkIfNullOrEmpty(text)) return;
        app.pushStyle();
        app.textSize((int) (PApplet.min(app.width, app.height) / text.length() * 1.8));
        app.textAlign(app.CENTER, app.CENTER);
        app.text(text, (int) (app.width / 2.0), (int) (app.height / 2.0));
        app.popStyle();
    }
}
