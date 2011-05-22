package root.classes.viewManagers;

import root.classes.helpers.ColorPickerDialog;
import root.classes.helpers.ColorPickerDialog.OnColorChangedListener;
import root.classes.model.FlashLightOptions;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class OptionsScreenManager implements OnClickListener, OnColorChangedListener{
	
	Context myContext;
	FlashLightOptions myOptions;
	
	
	
	public void colorChanged(int color) {
		// TODO Auto-generated method stub
		Toast toast = Toast.makeText(myContext, "The color is " + color + "", Toast.LENGTH_SHORT);
		toast.show();				
	}	
	
	public OptionsScreenManager(Context c){
		myContext = c;
		//TO DO: Method for getting it from previous configurations
		myOptions = new FlashLightOptions();
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		ColorPickerDialog c = new ColorPickerDialog(myContext, this, Color.WHITE);
		c.show();
		CharSequence text = "Hello toast!";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(myContext, text, duration);
		toast.show();
		
	}
	
	

}
