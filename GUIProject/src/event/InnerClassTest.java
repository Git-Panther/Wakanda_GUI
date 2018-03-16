package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class InnerClassTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3477035262767103290L;

	public InnerClassTest() {
		super("ㅓㅜㅘ");
		
		
		setBounds(100, 100, 1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon("images/icon.PNG").getImage());
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("은퇴하심씨오!");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(0, 0, 1594, 366);
		getContentPane().add(label);
		
		JButton button = new JButton("방출");
		button.setBounds(0, 849, 1594, 23);
		getContentPane().add(button);
		
		class MyEventListener implements ActionListener {
			
			public MyEventListener() {
				// TODO Auto-generated constructor stub
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(button)) {
					label.setText("코돈빈!!!");
				}
				
			}
			
		}
		
		button.addActionListener(new MyEventListener());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassTest();
	}

}
