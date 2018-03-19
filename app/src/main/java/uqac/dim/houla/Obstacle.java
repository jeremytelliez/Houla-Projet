package uqac.dim.houla;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

/**
 * Created by User on 10/03/2018.
 */

public class Obstacle implements GameObject {

    private Rect rectangle;
    private int color;
    private int currY;
    private int startX;

    public Rect getRectangle(){
        return rectangle;
    }

    public Obstacle(Rect rectangle, int color){
        this.rectangle = rectangle;
        this.color = color;
    }

    public boolean playerCollide(Player player){
        return rectangle.contains(player.getRectangle().left,player.getRectangle().top)
                || rectangle.contains(player.getRectangle().right,player.getRectangle().top)
                || rectangle.contains(player.getRectangle().left,player.getRectangle().bottom)
                || rectangle.contains(player.getRectangle().right,player.getRectangle().bottom);
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);

        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update() {
    }


    public void update(Point point) {
        rectangle.set(point.x - rectangle.width()/2
                , point.y - rectangle.height()/2
                , point.x + rectangle.width()/2
                , point.y + rectangle.height()/2);
    }

    public void incrementY(float y){
        rectangle.top += y;
        rectangle.bottom += y;
    }
}