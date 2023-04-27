package bt2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		TemperatureModel model = new TemperatureModel();

		TemperatureAreaF label1 = new TemperatureAreaF(model);
		label1.setPreferredSize(new Dimension(250, 10));
		TemperatureAreaC label2 = new TemperatureAreaC(model);
		label2.setPreferredSize(new Dimension(250, 10));
		TemperatureBar bar = new TemperatureBar(model);
		TemperatureButton raiseC = new TemperatureButton(model, "Raise C", 1.0);
		TemperatureButton lowerC = new TemperatureButton(model, "Lower C", -1.0);
		TemperatureButton raiseF = new TemperatureButton(model, "Raise F", 1.8);
		TemperatureButton lowerF = new TemperatureButton(model, "Lower F", -1.8);

		JPanel panel = new JPanel(new GridLayout(1, 2));
		JPanel panelLeft = new JPanel(new GridLayout(2, 1));
		JPanel panelRight = new JPanel();
		JPanel panelF = new JPanel(new GridLayout(2, 1, 20, 20));
		panelF.setBorder(BorderFactory.createTitledBorder("F"));
		
		JPanel panelC = new JPanel(new GridLayout(2, 1, 20, 20));
		panelC.setBorder(BorderFactory.createTitledBorder("C"));
		JPanel panelButtonF = new JPanel();
		JPanel panelButtonC = new JPanel();
		panelButtonF.add(raiseF);
		panelButtonF.add(lowerF);
		panelButtonC.add(raiseC);
		panelButtonC.add(lowerC);
		panelF.add(label1);
		panelF.add(panelButtonF);
		panelC.add(label2);
		panelC.add(panelButtonC);
		
		panelLeft.add(panelF);
		panelLeft.add(panelC);
		panelRight.add(bar);
		panel.add(panelLeft);
		panel.add(panelRight);
		
		
		

	JFrame frame = new JFrame("Temperature Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	
 
}
