

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by cxm on 2016/8/5.
 */
public class TimerButton extends Button {

    private String beforeText ;
    private String afterText = "重发";
    private int ms = 10000;

    public TimerButton(Context context) {
        super(context);
    }

    public TimerButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimerButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(String beforeText,String afterText,int ms){

        this.beforeText = beforeText;
        this.afterText = afterText;
        this.ms = ms;
        this.setText(beforeText);
    }

    public void startTimer(){

        new CountDownTimer(ms,1000){

            @Override
            public void onTick(long finish) {
                TimerButton.this.setEnabled(false);
                TimerButton.this.setText(finish/1000+" s");
            }

            @Override
            public void onFinish() {
                TimerButton.this.setEnabled(true);
                TimerButton.this.setText(afterText);
            }
        }.start();

    }

}
