package layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("CardLayoutTest");
		window.setBounds(500, 500, 1920, 1080); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		
		CardLayout layout = new CardLayout(); 
		window.setLayout(layout); // 카드 패널
		
		// 이하는 카드 패널 설정
		LinkedList<JPanel> panels = new LinkedList<JPanel>();
		panels.add(new JPanel());
		panels.getLast().setBackground(Color.RED);
		panels.getLast().add(new JLabel("R"));
		panels.getLast().addMouseListener(new MouseAdapter() { // 마우스 이벤트 추가

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("R has been clicked.");
				if(e.getButton() == 1) { // 마우스 왼쪽
					System.out.println("R -> G");
					layout.next(panels.get(0).getParent());
				}
				
				if(e.getButton() == 3) // 마우스 오른쪽
				{
					System.out.println("R -> B");
					layout.previous(panels.get(0).getParent());
				}
				
			}
			
		});
		
		panels.add(new JPanel());
		panels.getLast().setBackground(Color.GREEN);
		panels.getLast().add(new JLabel("G"));
		panels.getLast().addMouseListener(new MouseAdapter() { // 마우스 이벤트 추가

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("G has been clicked.");
				if(e.getButton() == 1) { // 마우스 왼쪽
					System.out.println("G -> B");
					layout.next(panels.get(1).getParent());
				}
				
				if(e.getButton() == 3) // 마우스 오른쪽
				{
					System.out.println("G -> R");
					layout.previous(panels.get(1).getParent());
				}
				
				
			}
			
		});	
		
		panels.add(new JPanel());
		panels.getLast().setBackground(Color.BLUE);
		panels.getLast().add(new JLabel("B"));
		panels.getLast().addMouseListener(new MouseAdapter() { // 마우스 이벤트 추가

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("B has been clicked.");
				if(e.getButton() == 1) { // 마우스 왼쪽
					System.out.println("B -> R");
					layout.next(panels.get(2).getParent());
				}
				
				if(e.getButton() == 3) // 마우스 오른쪽
				{
					System.out.println("B -> G");
					layout.previous(panels.get(2).getParent());
				}
				
			}
			
		});
		
		// 카드 패널 추가
		window.add(panels.get(0));
		window.add(panels.get(1));
		window.add(panels.get(2));
		
		window.setVisible(true);
		
	}

}
