package com.cxmscb.cxm.timerbuttonlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by cxm on 2016/8/5.
 */
public class TimerButton extends Button {


    private String afterText = "重发";
    private int ms = 10000;

    public TimerButton(Context context) {
        super(context);
    }

    public TimerButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.timerbutton);


        afterText = typedArray.getString(R.styleable.timerbutton_afterText);

        ms = typedArray.getInt(R.styleable.timerbutton_ms,10000);

        typedArray.recycle();



    }

    public TimerButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(String afterText,int ms){


        this.afterText = afterText;
        this.ms = ms;

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
                TimerButton.this.setText("0 s");
                TimerButton.this.setEnabled(true);
                TimerButton.this.setText(afterText);
            }
        }.start();

    }

}
