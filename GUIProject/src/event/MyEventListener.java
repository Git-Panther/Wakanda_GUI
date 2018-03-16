package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MyEventListener implements ActionListener {
	private JLabel label;
	private JButton button;	
	
	public MyEventListener() {
		// TODO Auto-generated constructor stub
	}
	
	public MyEventListener(JLabel label, JButton button) {
		this.label = label;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			label.setText("코돈빈!!!");
		}
		
	}
	
}
