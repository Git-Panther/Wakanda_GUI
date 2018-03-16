package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconTest {

	private static boolean toggle = true;
	private static final ImageIcon userIcon = new ImageIcon(new ImageIcon("images/user.PNG").getImage().getScaledInstance(300, 300, 0));
	private static final ImageIcon tigerIcon = new ImageIcon(new ImageIcon("images/tiger.PNG").getImage().getScaledInstance(300, 300, 0));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("KT는 올해도 못 감 ㅋㅋ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JLabel label = new JLabel(userIcon);
		frame.add(label, "Center");
		
		JButton imageChgBtn = new JButton("Show Another");
		frame.add(imageChgBtn, "South");
		
		imageChgBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(toggle) {
					label.setIcon(tigerIcon);
					toggle = false;
				} else {
					label.setIcon(userIcon);
					toggle = true;
				}
			}
		});
		
		frame.setVisible(true);
	}

}
