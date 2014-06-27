package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExampleObserverPattern {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingExampleObserverPattern window = new SwingExampleObserverPattern();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingExampleObserverPattern() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go();
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
