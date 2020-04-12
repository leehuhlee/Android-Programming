package com.example.broadcastreceiverexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView tv_state;
    private NetworkReciever reciver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_state = findViewById(R.id.tv_state);

        IntentFilter filter = new IntentFilter();
        reciver = new NetworkReciever();
        filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        registerReceiver(reciver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //브로드 캐스트 리시버 해제
        unregisterReceiver(reciver);
        
    }
}
