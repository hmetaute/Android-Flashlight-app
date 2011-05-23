package root.classes.model;

import android.graphics.Color;

/**
 * Class encapsulating flashlight options
 * @author hernan
 *
 */
public class FlashLightOptions {
	
	private int color;
	private int duration;
	
	public FlashLightOptions(){
		color = Color.WHITE;
		duration = 10000;
	}
	
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
