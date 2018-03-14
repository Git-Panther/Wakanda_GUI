package layout;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("GridLayoutTest");
		window.setBounds(500, 500, 1920, 1080); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		int number = 5;
		window.setLayout(new GridLayout(number, number)); // 5 * 5로 버튼들 담을 예정
		
		for(int index = 0; index < number*number; index++) {
			window.add(new JButton( "Button " + (index + 1) ));
		}
		
		window.setVisible(true);
		
	}

}
