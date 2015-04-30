package com.kamran.demo.basics.mydemoapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Notification notification = new NotificationCompat.Builder(MyService.this)
                .setContentTitle("Demo Application")
                .setContentText("MyService is running")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setOngoing(true)
                .build();

        NotificationManagerCompat.from(MyService.this).notify(0, notification);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Notification notification = new NotificationCompat.Builder(MyService.this)
                .setContentTitle("Demo Application")
                .setContentText("MyService has stopped")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setOngoing(false)
                .build();

        NotificationManagerCompat.from(MyService.this).notify(0, notification);

        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
