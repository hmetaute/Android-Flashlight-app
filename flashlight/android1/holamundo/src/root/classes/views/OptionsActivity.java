package root.classes.views;

import root.classes.viewManagers.OptionsScreenManager;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OptionsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		LinearLayout layout2 = new LinearLayout(this);
		TextView mySecondTextView = new TextView(this);
		Button goToFlashLight = new Button(this);
		
		//Cosas más interesantes
		mySecondTextView.setText("Este es el segundo y me va a quedar muy pero muy bien");
		
		
		OptionsScreenManager optionsManager = new OptionsScreenManager(this);
		
		goToFlashLight.setOnClickListener(optionsManager);
		layout2.setOrientation(LinearLayout.VERTICAL);
		layout2.addView(mySecondTextView);
		layout2.addView(goToFlashLight);
		
		setContentView(layout2);
		
		
		
	}
	
	
	
	

}
