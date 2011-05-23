package root.classes.viewManagers;

import root.classes.views.MainScreenActivity;
import root.classes.views.OptionsActivity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainViewManager implements OnClickListener {
	
	MainScreenActivity myContext;
			
	public MainViewManager(MainScreenActivity c){
		myContext  = c;
	}

	public void onClick(View v) {
		myContext.toOptions(v);		
	}
	
	

}
