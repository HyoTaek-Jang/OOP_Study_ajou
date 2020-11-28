package ╟╢га╫г╫ю13аж;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ButtonTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new ButtonFrame();
			frame.setTitle("ButtonTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}