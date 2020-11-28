package ╟╢га╫г╫ю13аж;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");
		buttonPanel = new JPanel();

		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);

		add(buttonPanel);

		yellowButton.addActionListener(event -> {

			Color backgroundColor = Color.YELLOW;

			buttonPanel.setBackground(backgroundColor);
		});

		blueButton.addActionListener(event -> {

			Color backgroundColor = Color.BLUE;

			buttonPanel.setBackground(backgroundColor);
		});

		redButton.addActionListener(event -> {

			Color backgroundColor = Color.RED;

			buttonPanel.setBackground(backgroundColor);
		});
	}

}