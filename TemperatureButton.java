package bt2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TemperatureButton  extends JButton{
	private TemperatureModel model;
	private double increment;
	public TemperatureButton(TemperatureModel model,String title, double increment) {
		super(title);
		this.model = model;
		this.increment = increment;
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setCelsius(model.getCelcius() + increment);
				
			}
		});
	}
	
}
