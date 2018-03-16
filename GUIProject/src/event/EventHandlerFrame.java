package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EventHandlerFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3815567191262109887L;

	private JLabel label;
	private JButton button;
	
	public EventHandlerFrame() {
		// TODO Auto-generated constructor stub
		super("ㅓㅜㅘ");
		
		setBounds(100, 100, 1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon("images/icon.PNG").getImage());
		getContentPane().setLayout(null);
		
		label = new JLabel("은퇴하심씨오!");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(0, 0, 1594, 366);
		getContentPane().add(label);
		
		button = new JButton("방출");
		button.setBounds(0, 849, 1594, 23);
		getContentPane().add(button);
		
		button.addActionListener(this); // 자신이 이미 리스너 기능을 가진 클래스
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			label.setText("코돈빈!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventHandlerFrame();
	}

}
