package Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingObserver {
	JFrame frame;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserver example = new SwingObserver();
	}
	
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Should i do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER,button);
	}
	class AngelListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("Don't do it, you might regret it");
		}
	}
	class DevilListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("Come on, do it!");
		}
	}
}
