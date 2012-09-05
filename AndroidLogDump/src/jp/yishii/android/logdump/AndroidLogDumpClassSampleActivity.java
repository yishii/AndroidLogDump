package jp.yishii.android.logdump;

import android.app.Activity;
import android.os.Bundle;

public class AndroidLogDumpClassSampleActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onResume(){
    	super.onResume();
    	
    	byte[] b = new byte[1024];
    	int i;
    	for(i=0;i<1024;i++){
    		b[i] = (byte) (i % 256);
    	}

    	// Send debug-debuglog to logcat!
    	
    	LogDump.i("Hello",b);
    	LogDump.v("Hello2",b,128);
    	LogDump.d("DUMP", b,-1,false);
    }
}