package ian.com.broadcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String FILTER_ACTION="123";
    myBroadcast reciever=new myBroadcast();
    Intent intent =new Intent(FILTER_ACTION);
    private Button btnBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBroadcast = (Button)findViewById(R.id.btnBroadcast);

        IntentFilter filter=new IntentFilter();
        filter.addAction(FILTER_ACTION);
        registerReceiver(reciever,filter);
        btnBroadcast.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(reciever);
    }


}