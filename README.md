# TimerButton

> Androidƽ̨�µĵ���ʱ��ť Countdown-Button

### Use in Gradle

> compile 'com.cxmscb:TimerButtonLib:0.0.4'


### ʹ�÷�ʽ / Java
```
		private TimerButton timerButton;
		
        timerButton = (TimerButton) findViewById(R.id.timer_Button);

		timerButton.setText("��ȡ��֤��");
        timerButton.init("�� ��",10000); // can set in XML

        timerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
			
                timerButton.startTimer();
				
				//TODO YOURS
				
                //Toast.makeText(MainActivity.this,"TODO",Toast.LENGTH_SHORT).show();
				
            }
        });
```
### XML 
```
    <com.cxmscb.cxm.timerbuttonlib.TimerButton
        android:id="@+id/libBtn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="17sp"
        android:gravity="center"
        app:afterText="�� ��"
        app:ms="10000"
        />
```
