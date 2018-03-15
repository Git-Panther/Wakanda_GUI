package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("킹존 1위 아프리카 2위 확정");
		
		window.setBounds(500, 500, 800, 450); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		
		JTextArea chatArea = new JTextArea(10, 30);
		chatArea.setEditable(false);
		JTextField inputMessage = new JTextField(30);
		inputMessage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chatArea.append(inputMessage.getText() + "\n");
			}
		});
		
		window.add(chatArea, "Center");
		window.add(inputMessage, "South");
		
		window.setVisible(true);
	}

}
