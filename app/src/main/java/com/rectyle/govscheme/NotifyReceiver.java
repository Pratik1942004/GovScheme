package com.rectyle.govscheme;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

public class NotifyReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Notification Get",Toast.LENGTH_SHORT).show();
        Intent home = new Intent(context,GetNotification.class);
        PendingIntent pi = PendingIntent.getActivities(context,21, new Intent[]{home},0);
        NotificationCompat.Builder nb=new NotificationCompat.Builder(context)
                .setContentText("एकात्मिक फलोत्पादन विकास अभियान")
                .setContentTitle("Farmer")
                .setSmallIcon(R.mipmap.ic_app_logo)
                .setContentIntent(pi)
                .setAutoCancel(true);

        String channelId="Alarm";
        NotificationChannel channel= new NotificationChannel(channelId,"Alarm Clocked", NotificationManager.IMPORTANCE_HIGH);
        NotificationManager manager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.createNotificationChannel(channel);
        nb.setChannelId(channelId);
        manager.notify(0,nb.build());
    }
}
