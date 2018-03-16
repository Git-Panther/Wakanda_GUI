package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmDialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ㅓㅜㅘ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JButton messageBtn = new JButton("Accept");
		messageBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "Accept message printed");
			}
		});
		
		frame.add(messageBtn, "North");
		
		JButton inputBtn = new JButton("Input word");
		inputBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String inputMessage = JOptionPane.showInputDialog("Input any word.");
				if(inputMessage != null)
					System.out.println(inputMessage);
			}
		});
		
		frame.add(inputBtn, "Center");
		
		JButton confirmBtn = new JButton("Yes / No");
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(frame, "Do you like this program?");
				System.out.println(result); // 0 : 긍정, 1 : 부정, 2 : 취소
			}
		});
		
		frame.add(confirmBtn, "South");
		
		frame.setVisible(true);
	}
	
}
