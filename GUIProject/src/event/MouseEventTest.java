package event;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseEventTest extends JFrame implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 475618688104471097L;

	LinkedList<Point> points = new LinkedList<Point>();
	
	public MouseEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("좆벤 롤갈 거르고 킹존 13SKT + 15SKT 보다 강함");
		setBounds(100, 100, 1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);

		setVisible(true);
		
		points.add(new Point(20, 20));
		points.add(new Point(150, 150));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 클릭되었을 때 클릭 횟수 " + e.getClickCount());
		System.out.println("클릭 위치 : " + e.getX() + ", " + e.getY());
		Point temp = null; // 비교 대상
		int x = e.getX();
		int y = e.getY();
		
		Iterator<Point> itr = points.iterator();
		while(itr.hasNext()) {
			temp = itr.next();
			if(temp.x <= x && x <= temp.x + 20 && 
					temp.y <= y && y <= temp.y + 20){
				JOptionPane.showMessageDialog(null, "찾았습니다.");
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 들어왔습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 나갔습니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스를 눌렀습니다.");
		System.out.println("누른 위치 : " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스를 놓았습니다.");
		System.out.println("놓은 위치 : " + e.getX() + ", " + e.getY());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventTest();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Drag!");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Move!");
	}

}
