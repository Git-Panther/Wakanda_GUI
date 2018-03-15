package layout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NullLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("킹존 1위 아프리카 2위 확정");
		
		window.setBounds(500, 500, 800, 450); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		window.setLayout(null);
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setLocation(50, 50);
		idLabel.setSize(100, 50);
		window.add(idLabel);
		
		JTextField idTF = new JTextField(30); // 30칸
		idTF.setBounds(160, 50, 100, 50); // 바운즈가 더 편할 수도 있다.
		window.add(idTF);
		
		JLabel pwLabel = new JLabel("PW");
		pwLabel.setBounds(50, 110, 100, 50);
		window.add(pwLabel);

		JPasswordField pwPF = new JPasswordField(30); // 30칸
		pwPF.setBounds(160, 110, 100, 50);
		window.add(pwPF);
	
		JButton joinButton = new JButton("Sign up"); // 보내기 버튼
		joinButton.setBounds(100, 180, 100, 50);
		window.add(joinButton);
		
		window.setVisible(true);
		
	}

}
