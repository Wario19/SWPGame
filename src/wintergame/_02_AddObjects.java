package wintergame;

import org.newdawn.slick.*;

public class _02_AddObjects extends BasicGame {

    private Circle c1;
    private Rectangle r1;

    public _02_AddObjects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.c1 = new Circle(100,100);
        this.r1= new Rectangle(400,0);

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.c1.update(gc,delta);
        this.r1.update(gc,delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.c1.render(graphics);
        this.r1.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new _02_AddObjects("Wintergame"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}