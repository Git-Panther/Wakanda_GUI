package component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("킹존 1위 아프리카 2위 확정");
		
		window.setBounds(500, 500, 800, 450); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
//		window.setLayout(new GridLayout());
		
//		JPanel panel = new JPanel();
//		panel.setLayout(new GridLayout());
//		
//		JLabel idLabel = new JLabel();
//		panel.add(idLabel);
//		JTextField idTF = new JTextField(30); // 30칸
//		panel.add(idTF);
//		
//		JLabel pwLabel = new JLabel();
//		panel.add(pwLabel);
//		JPasswordField pwPF = new JPasswordField(30); // 30칸
//		panel.add(pwPF);
//		
//		JTextArea area = new JTextArea(30, 30); // 30줄짜리 30칸
//		panel.add(area);
//	
//		JButton button = new JButton("send"); // 보내기 버튼
//		panel.add(button);
//		
//		window.add(panel, "Center");
//		window.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		
		JLabel idLabel = new JLabel("ID");
		panel.add(idLabel);
		JTextField idTF = new JTextField(30); // 30칸
		panel.add(idTF);
		
		JLabel pwLabel = new JLabel("PW");
		panel.add(pwLabel);
		JPasswordField pwPF = new JPasswordField(30); // 30칸
		panel.add(pwPF);
		
		JTextArea area = new JTextArea(5, 30); // 5줄짜리 30칸
	
		JButton button = new JButton("send"); // 보내기 버튼
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = "ID : " + idTF.getText() + "\n" + "Password : ";
				for(char ch : pwPF.getPassword()) {
					text += ch;
				}
				text +=  "\n";
				area.append(text);
			}
		});
		
		window.add(panel, "North");
		window.add(area, "Center");
		window.add(button, "South");
		
		window.setVisible(true);
	}

}
