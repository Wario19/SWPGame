package wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Snowflake implements Actor{
    private double x,y;


    public Snowflake(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update (GameContainer gc, int delta)
    {
        if(this.y <= 800){
            this.y++;
        } else if (this.y >= 800) {
            this.y = 50;
        }
    }

    public void render (Graphics graphics){
        graphics.fillOval((float)this.x,(float)this.y,20,20,5);
    }
}
