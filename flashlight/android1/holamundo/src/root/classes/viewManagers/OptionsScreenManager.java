package root.classes.viewManagers;

import root.classes.helpers.ColorPickerDialog;
import root.classes.helpers.ColorPickerDialog.OnColorChangedListener;
import root.classes.model.FlashLightOptions;
import root.classes.views.OptionsActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class OptionsScreenManager implements OnClickListener, OnColorChangedListener{
	
	OptionsActivity myContext;
	FlashLightOptions myOptions;
	public static final int CHANGE_COLOR_BUD_ID = 1;
	public static final int START_FLASHLIGHT_BUT_ID = 2;
	
	
	/**
	 * @author hernan.metaute
	 * Method called when user selects a color on the selector
	 */
	public void colorChanged(int color) {
		// TODO Auto-generated method stub		
		myOptions.setColor(color);
	}	
	
	public OptionsScreenManager(OptionsActivity c){
		myContext = c;
		//TO DO: Method for getting it from previous configurations
		myOptions = new FlashLightOptions();
	}

	public void onClick(View v) {
				
		switch (v.getId()){
			
		case CHANGE_COLOR_BUD_ID:
			ColorPickerDialog c = new ColorPickerDialog(myContext, this, Color.WHITE);
			c.show();
			break;
		case START_FLASHLIGHT_BUT_ID:			
			myContext.startFlashLight(v, myOptions);
			break;
		default:
	    	
			break;
		}
		
	}
	
	

}
