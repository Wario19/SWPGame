package wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Circle implements Actor{
    private double x,y;


    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update (GameContainer gc, int delta)
    {
        if(this.x <= 700 && this.y == 100)
        {
            this.x++;
        } else if (this.x >= 700 && this.y <= 700) {
            this.y++;
        } else if (this.y >= 700 && this.x >= 100) {
            this.x--;
        } else if (this.x <= 100 ) {
            this.y--;
        }
    }

    public void render (Graphics graphics){
        graphics.drawOval((float)this.x,(float)this.y,20,20);
    }
}
