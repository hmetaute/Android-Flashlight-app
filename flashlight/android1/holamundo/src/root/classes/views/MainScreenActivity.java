package root.classes.views;

import root.classes.viewManagers.ManejadorVentanaPrincipal;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        Button button = new Button(this);
        TextView textView = new TextView(this);
        ManejadorVentanaPrincipal man = new ManejadorVentanaPrincipal(this);
        button.setText("Press this button for the lamest thing ever");
        button.setOnClickListener(man);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.addView(textView);
        linearLayout.addView(button);
        textView.setText("Este es el texto que defino y me queda una chimba dentro de un androidazo");                                
        setContentView(linearLayout);
    }
    
    public void toOptions(View v){
    	Intent intent = new Intent(v.getContext(), OptionsActivity.class);
		startActivityForResult(intent, 0);
    }

	
    
}