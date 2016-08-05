# TimerButton

> Android平台下的倒计时按钮 Countdown-Button


### 使用方式 / USE
```
		private TimerButton timerButton;
		
        timerButton = (TimerButton) findViewById(R.id.timer_Button);

        timerButton.init("获取验证码","重发",10000);

        timerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
			
                timerButton.startTimer();
				
				//TODO YOURS
				
                //Toast.makeText(MainActivity.this,"TODO",Toast.LENGTH_SHORT).show();
				
            }
        });
```
