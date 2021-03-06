package container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameTest1 extends JFrame{ // JFrame 상속하는 프레임
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameTest1() {
		this.setLocation(100, 100); // 화면 좌측 상단 기준으로부터 떨어지는 거리
		this.setSize(1280, 720); // 화면 크기(가로, 세로)
		this.setTitle("FrameTest1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x창
		this.setIconImage(new ImageIcon("images/icon.PNG").getImage()); // 창 아이콘 설정
		this.setResizable(false); // 사이즈 조절 가능 : 불가
		
		this.setVisible(true); // 보이는 여부
	}
	
	public static void main(String[] args) { // 테스트용
		new FrameTest1();
	}
	
}
