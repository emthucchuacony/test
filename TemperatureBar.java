package bt2;

import javax.swing.JProgressBar;

public class TemperatureBar extends JProgressBar implements Observer {
	private TemperatureModel model;

	public TemperatureBar(TemperatureModel model) {
		super(JProgressBar.VERTICAL, 0, 100);
		this.model = model;
		model.addObs(this);
		update();
	}

	@Override
	public void update() {
	     setValue((int)model.getCelcius());;
	   }

}
