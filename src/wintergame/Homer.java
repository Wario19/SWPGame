package wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Homer implements Actor{
    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawString("I love League of Legends",400,400);
    }
}
