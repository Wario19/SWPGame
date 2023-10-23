package wintergame;

import org.newdawn.slick.*;

public class _01_MainGame extends BasicGame {

    private int x,y,a,b;


    public _01_MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.a = 400;
        this.b = 50;
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
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

        if(this.b <= 800){
            this.b++;
        } else if (this.b >= 800) {
            this.b = 50;
        }

    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y, 50, 50);

        graphics.drawOval(this.a, this.b,50,50);

        graphics.setBackground(Color.lightGray);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new _01_MainGame("Wintergame"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}