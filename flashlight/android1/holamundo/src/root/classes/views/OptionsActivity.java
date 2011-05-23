package root.classes.views;

import root.classes.model.FlashLightOptions;
import root.classes.viewManagers.OptionsScreenManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OptionsActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//Layout init
		LinearLayout layout2 = new LinearLayout(this);
		//Elements init
		TextView title = new TextView(this);
		Button goToFlashLight = new Button(this);
		Button changeColor = new Button(this);
		
		
		//Widgets attribute assignment
		title.setText("Options pane");
		title.setGravity(Gravity.CENTER);
		
		goToFlashLight.setText("Start Flashlight!");
		changeColor.setText("Change Light Color");
		//ID assignment for on click
		goToFlashLight.setId(OptionsScreenManager.START_FLASHLIGHT_BUT_ID);
		changeColor.setId(OptionsScreenManager.CHANGE_COLOR_BUD_ID);
		
		
		OptionsScreenManager optionsManager = new OptionsScreenManager(this);
		
		goToFlashLight.setOnClickListener(optionsManager);
		changeColor.setOnClickListener(optionsManager);
		
		layout2.setOrientation(LinearLayout.VERTICAL);
		layout2.addView(title);
		layout2.addView(changeColor);
		layout2.addView(goToFlashLight);
		
		setContentView(layout2);
						
	}
	
	public void startFlashLight(View v, FlashLightOptions o){
		Intent intent = new Intent(v.getContext(), FlashLightViewActivity.class);
		Bundle b = new Bundle();
		b.putInt("color", o.getColor());
		intent.putExtras(b);
		startActivityForResult(intent, 0);
	}
	
	
	
	

}
