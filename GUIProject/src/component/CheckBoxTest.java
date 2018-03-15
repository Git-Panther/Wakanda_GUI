package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("킹존 1위 아프리카 2위 확정");
		
		window.setBounds(500, 500, 800, 450); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		
		LinkedList<JCheckBox> checkBoxList = new LinkedList<JCheckBox>();
		JPanel panel = new JPanel();
		
		checkBoxList.add(new JCheckBox("Khan"));
		panel.add(checkBoxList.getLast());
		
		checkBoxList.add(new JCheckBox("Peanut"));
		panel.add(checkBoxList.getLast());
		
		checkBoxList.add(new JCheckBox("Bdd"));
		panel.add(checkBoxList.getLast());
		
		checkBoxList.add(new JCheckBox("PraY&GorillA"));
		panel.add(checkBoxList.getLast());

		JLabel result = new JLabel("안 고를 시 아프리카");
		
		class CheckBoxActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String message = new String();
				if(checkBoxList.get(0).isSelected())
					message += "Khan";
				if(checkBoxList.get(1).isSelected())
					message += "Peanut";
				if(checkBoxList.get(2).isSelected())
					message += "Bdd";
				if(checkBoxList.get(3).isSelected())
					message += "PraY and GorillA";
				if(checkBoxList.get(0).isSelected() || checkBoxList.get(1).isSelected() || checkBoxList.get(2).isSelected() || checkBoxList.get(3).isSelected())
					message += " has selected.";
				else
					message = "Nothing has selected.";
					
				result.setText(message);
			}
		}
		
		Iterator<JCheckBox> itr = checkBoxList.iterator();
		while(itr.hasNext())
			itr.next().addActionListener(new CheckBoxActionListener());
		
		window.add(panel, "North");
		window.add(result, "South");
		
		window.setVisible(true);
	}

}
