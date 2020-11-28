package ╟╢га╫г╫ю13аж;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

// A frame with a panel that demonstrates color change actions.
public class ActionFrame extends JFrame {
	private JPanel buttonPanel;
	JPanel DrawPanel = new JPanel();
//	private static final int DEFAULT_WIDTH = 1000;
//	private static final int DEFAULT_HEIGHT = 1000;

	public ActionFrame() {
		//setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		buttonPanel = new JPanel();
// define actions
		Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.gif"), Color.YELLOW);
		Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"), Color.BLUE);
		Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.RED);
// add buttons for these actions
		buttonPanel.add(new JButton(yellowAction));
		buttonPanel.add(new JButton(blueAction));
		buttonPanel.add(new JButton(redAction));
//add panel to frame
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.NORTH);
		add(new DrawComponent(), BorderLayout.CENTER);
		DrawPanel.add(new DrawComponent());
		add(DrawPanel, BorderLayout.CENTER);
		pack();
//associate the Y, B, and R keys with names
		InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
		imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
		imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");
//associate the names with actions
		ActionMap amap = buttonPanel.getActionMap();
		amap.put("panel.yellow", yellowAction);
		amap.put("panel.blue", blueAction);
		amap.put("panel.red", redAction);
	}

	public class ColorAction extends AbstractAction {
		public ColorAction(String name, Icon icon, Color c) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
			putValue("color", c);
		}

		public void actionPerformed(ActionEvent event) {
			
			DrawPanel.add(new DrawComponent());
			add(DrawPanel, BorderLayout.CENTER);
			
//			Color c = (Color) getValue("color");
//			buttonPanel.setBackground(c);
		}
	} // end of inner class ColorAction

	class DrawComponent extends JComponent {
		private static final int DEFAULT_WIDTH = 400;
		private static final int DEFAULT_HEIGHT = 400;
		
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.BLUE);
			
			double leftX = 100;
			double topY = 100;
			double width = 200;
			double height = 150;
			Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
			g2.draw(rect);
//draw the enclosed ellipse
			Ellipse2D ellipse = new Ellipse2D.Double();
			ellipse.setFrame(rect);
			g2.draw(ellipse);
////draw a diagonal line
			g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
//draw a circle with the same center
			double centerX = rect.getCenterX();
			double centerY = rect.getCenterY();
			double radius = 150;
			Ellipse2D circle = new Ellipse2D.Double();
			circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
			g2.draw(circle);
		}
		
		public Dimension getPreferredSize() {
			return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		}
	}

}
