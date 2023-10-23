package wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class _04_AddInterface extends BasicGame {

    private List<Actor> actors;

    public _04_AddInterface(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        this.actors.add(new Homer());
        this.actors.add(new Rectangle(400,0));
        this.actors.add(new Snowflake(100,0));
        this.actors.add(new Circle(400,100));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for( Actor actor : this.actors){
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new _04_AddInterface("Wintergame"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}