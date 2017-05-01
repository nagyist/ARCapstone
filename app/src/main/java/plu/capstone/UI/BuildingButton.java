package plu.capstone.UI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Button;

/**
 * Created by playt on 4/5/2017.
 */

public class BuildingButton extends android.support.v7.widget.AppCompatButton {

    private float orientation[];
    public BuildingButton(Context context) {
        super(context);
    }

    public BuildingButton(Context context, int w, int h, float[] ori){
        super(context);
        orientation = ori;
        setBackgroundColor(Color.TRANSPARENT);
    }


    @Override
    public void setTranslationX(float x){
        super.setTranslationX(x-(this.getWidth()/2));
    }

    @Override
    public void setTranslationY(float y){
        super.setTranslationY(y-(this.getHeight()/2));
    }

    @Override
    public void setX(float x){
        super.setX(x-this.getWidth()/2);
    }

    @Override
    public void setY(float y){
        super.setY(y-(this.getHeight()/2));
    }

    /*
    @Override
    protected void onDraw(Canvas canvas){
        //canvas.rotate((float) (0.0f - Math.toDegrees(orientation[2])));
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, canvas.getHeight()/3, paint);
        super.onDraw(canvas);
    }*/
}