package com.rectyle.govscheme;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GetNotification extends AppCompatActivity {
CheckBox farmer,women,labour,student,startup;
TextView notify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_notification);
        farmer=findViewById(R.id.chk_farmers);
        women=findViewById(R.id.chk_women);
        labour=findViewById(R.id.chk_labour);
        student=findViewById(R.id.chk_student);
        startup=findViewById(R.id.chk_startups);
      notify=findViewById(R.id.txt_notification);

      notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (farmer.isChecked()){
                 int  tm=10;
                    Intent notify= new Intent(GetNotification.this,NotifyReceiver.class);
                    PendingIntent pi = PendingIntent.getBroadcast(GetNotification.this,21,notify,PendingIntent.FLAG_CANCEL_CURRENT);
                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                    alarmManager.set(AlarmManager.RTC_WAKEUP,(int)System.currentTimeMillis()+(tm*1000),pi);
                    Toast.makeText(getApplicationContext(),"Notification",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Error occured",Toast.LENGTH_SHORT).show();
                }
            }
        });





    }


}