# TimerButton

> Androidƽ̨�µĵ���ʱ��ť Countdown-Button


### ʹ�÷�ʽ / USE
```
		private TimerButton timerButton;
		
        timerButton = (TimerButton) findViewById(R.id.timer_Button);

        timerButton.init("��ȡ��֤��","�ط�",10000);

        timerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
			
                timerButton.startTimer();
				
				//TODO YOURS
				
                //Toast.makeText(MainActivity.this,"TODO",Toast.LENGTH_SHORT).show();
				
            }
        });
```
