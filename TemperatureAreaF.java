package bt2;

import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TemperatureAreaF  extends JTextArea implements Observer{
	private TemperatureModel model;
	
	
	public TemperatureAreaF(TemperatureModel model) {
		super("Temperature: " + Double.parseDouble(String.format("%.2f", model.getFahrenheit())));
		this.model = model;
		model.addObs(this);
		setEditable(false);
	}

	@Override
	public void update() {
	      setText("Temperature: "  + Double.parseDouble( String.format("%.2f",model.getFahrenheit() )) + " F");

		
	}

}
