package com.example.itcell;

import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.widget.ProgressBar;

public class FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        final ProgressBar progress = (ProgressBar)findViewById(R.id.progressBar1);
        TimerTask tt = new TimerTask(){
        	public void run(){
        		try{
        			for(int i=1;i<100;i++){
        			progress.setProgress(i);
        			}
        			Thread.sleep(20);
        		}catch(Exception ex){}
        		startActivity(new Intent(FlashActivity.this,QuestionActivity.class));
        	}
        };
        Timer timer = new Timer();
        timer.schedule(tt,2000);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.flash, menu);
        return true;
    }
    
}
