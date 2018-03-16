package event;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OtherClassEventTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1426637998193250966L;

	public OtherClassEventTest() {
		super("ㅓㅜㅘ");
		setBounds(100, 100, 1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JLabel lblNewLabel = new JLabel("은퇴하심씨오!");
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("방출");
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new MyEventListener(lblNewLabel, btnNewButton));

		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OtherClassEventTest();
	}

}
