package ian.com.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class myBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle("Broadcast");
        alertDialog.setMessage("我收到了");
        alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}
