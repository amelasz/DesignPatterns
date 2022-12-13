package at.sam.games.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private int x;


    private static String Rectangles;
    private static final String title = Rectangles ;

    public Rectangles() {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    // am Anfang einmal hier drin aufrufen (Variablen initialisieren, Objekte bauen)
        this.x = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
    // wird die ganze Zeit immer wieder aufgerufen
        this.x++;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    // auch die ganze Zeit (wenn notwendig) zum Zeichnen
        // Graphics zeigt auf Spielfeld (kann zeichnen)
        graphics.drawRect(this.x,100, 100, 100);
        graphics.drawString("Hello Mr. Riedmann!", 50, 50  );
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles());
            container.setDisplayMode(800,600,false);
            container.start(); // dadurch beginnt das System (ruft Methoden auf)
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
