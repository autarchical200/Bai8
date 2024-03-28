package org.coolstyles.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Hiển thị thông báo
        NotificationHelper.showNotification(context, "Thông báo", "Đã đến giờ!");
    }
}
