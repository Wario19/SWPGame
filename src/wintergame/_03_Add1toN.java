package wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class _03_Add1toN extends BasicGame {

    private List<Circle> circles;
    private List<Rectangle> rectangles;

    public _03_Add1toN(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gc) throws SlickException {
        this.circles = new ArrayList<>();
        this.rectangles = new ArrayList<>();

        this.circles.add(new Circle(400,100));
        this.rectangles.add(new Rectangle(400,0));

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Circle cr : this.circles)
        {
            cr.update(gc,delta);
        }
        for (Rectangle rc : this.rectangles){
            rc.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Circle cr : this.circles)
        {
            cr.render(graphics);
        }
        for (Rectangle rc : this.rectangles){
            rc.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new _03_Add1toN("Wintergame"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}