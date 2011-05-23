package root.classes.views;

import root.classes.viewManagers.FlashLightViewManager;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class FlashLightViewActivity extends Activity {
	FlashLightViewManager manager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		manager = new FlashLightViewManager(this);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		LinearLayout l = new LinearLayout(this);
		Bundle b = getIntent().getExtras();
		int color = b.getInt("color");				
		l.setBackgroundColor(color);
		l.setOnClickListener(manager);
		setContentView(l);
		
	}
	
	public void backToOptions(DialogInterface dialog){
		Intent intent = new Intent();
        setResult(Activity.RESULT_OK, intent);
        finish();
	}
	

	
	

}
