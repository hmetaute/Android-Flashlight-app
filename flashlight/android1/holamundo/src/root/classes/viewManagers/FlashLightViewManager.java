package root.classes.viewManagers;

import root.classes.views.FlashLightViewActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class FlashLightViewManager implements OnClickListener{
	FlashLightViewActivity myActivity;
	
	public FlashLightViewManager(FlashLightViewActivity activity){
		myActivity = activity;
	}
		
	public void onClick(View v) {		
        new AlertDialog.Builder(v.getContext())
        .setIcon(android.R.drawable.ic_dialog_alert)
        .setTitle("Stop FlashLight")
        .setMessage("Do you want to stop the flashlight?")
        .setPositiveButton("Stop", new DialogInterface.OnClickListener() {

            
            public void onClick(DialogInterface dialog, int which) {
            	myActivity.backToOptions(dialog);
            }

        })
        .setNegativeButton("Stay", null)
        .show();	
	}
	
	private void ret(View v){
		
	}


	

}
