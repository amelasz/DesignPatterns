package at.sam.games.wintergame;

import at.sam.games.firstgame.Rectangles;
import org.newdawn.slick.*;

public class WinterGameMain extends BasicGame{
    public WinterGameMain(String title) {
        super(title);
    }
    private int x,y;

    @Override
    public void init(GameContainer gc) throws SlickException {
        // 1 mal aufgerufen
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // Delta = Zeit seit dem letzten Aufruf -> konstnate Geschwindigkeiten
        this.x++;
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        // nur aufgerufen, wenn notwendig -> zeichnen
        graphics.drawRect(this.x, this.y, 50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new WinterGameMain("Winter Game"));
            container.setDisplayMode(800,600,false);
            container.start(); // dadurch beginnt das System (ruft Methoden auf)
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}

