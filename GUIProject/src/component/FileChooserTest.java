package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooserTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ㅓㅜㅘ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JButton messageBtn = new JButton("Choose a file");
		messageBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				int status = jfc.showOpenDialog(frame);
				if(status == 0) {
					System.out.println("True Path : " + jfc.getSelectedFile().getPath());
					System.out.println("File Path : " + jfc.getSelectedFile().getParent());
					System.out.println("File Name : " + jfc.getSelectedFile().getName());
				}
				
//				System.out.println(status); // 선택 성공시 0, 취소하거나 실패시 1
			}
		});
		frame.add(messageBtn, "North");
		
		frame.setVisible(true);
	}
}
