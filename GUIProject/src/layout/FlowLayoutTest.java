package layout;

import java.awt.FlowLayout;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("FlowLayoutTest");
		window.setBounds(500, 500, 1920, 1080); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		window.setLayout(new FlowLayout()); // 옆으로 증식함(흐르듯이)
		
		List<JButton> buttonList = new LinkedList<JButton>();
		buttonList.add(new JButton("동"));
		buttonList.add(new JButton("서"));
		buttonList.add(new JButton("남"));
		buttonList.add(new JButton("북"));
		buttonList.add(new JButton("중앙"));
		
		window.add(buttonList.get(3), "North");
		window.add(buttonList.get(2), "South");
		window.add(buttonList.get(0), "East");
		window.add(buttonList.get(1), "West");
		window.add(buttonList.get(4), "Center");
		
		window.setVisible(true);
		
	}

}
