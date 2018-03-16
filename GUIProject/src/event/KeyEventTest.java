package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8739352195012171398L;

	public KeyEventTest(){
		setTitle("좆벤 롤갈 거르고 킹존 13SKT + 15SKT 보다 강함");
		setBounds(100, 100, 1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JTextField textField = new JTextField();
		textField.addKeyListener(this);
		
		add(textField, "Center");
		
		setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("키 char : " + e.getKeyChar());
		System.out.println("키 code : " + e.getKeyCode());
		System.out.println("특수 키 확인 : " + e.isAltDown() + ", " + e.isControlDown() + ", " + e.isShiftDown());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
	}

	public static void main(String[] args) {
		new KeyEventTest();
	}
}
