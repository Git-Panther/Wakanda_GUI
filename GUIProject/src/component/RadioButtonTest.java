package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("KT는 올해도 못 감 ㅋㅋ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("주문 메뉴 선택");
		panel.add(label);
		frame.add(panel, "North");
		
		JPanel buttonPanel = new JPanel();
		LinkedList<JRadioButton> radioList = new LinkedList<JRadioButton>();
		radioList.add(new JRadioButton("소의 고환"));
		radioList.add(new JRadioButton("엄티살"));
		radioList.add(new JRadioButton("씹덕살"));
		radioList.add(new JRadioButton("테디베어"));
		radioList.add(new JRadioButton("박효신"));
		radioList.add(new JRadioButton("익수"));
		radioList.getLast().setSelected(true); // 기본 선택
		
		frame.add(buttonPanel, "Center");
		
		JLabel resultLabel = new JLabel("메뉴를 선택하세요.");
		frame.add(resultLabel, "South");
		
		ButtonGroup radioGroup = new ButtonGroup(); // 그룹으로 묶이면 그 중 하나만 가능
		
		Iterator<JRadioButton> itr = radioList.iterator();
		JRadioButton itrButton = null;
		while(itr.hasNext()) {
			itrButton = itr.next();
			itrButton.addActionListener(new ActionListener() {		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println(radioList.get(0).isSelected() + " / " + radioList.get(1).isSelected() + " / " + radioList.get(2).isSelected() + " / " + radioList.get(3).isSelected() + " / " + radioList.get(4).isSelected() + " / " + radioList.get(5).isSelected() );
					resultLabel.setText( ((JRadioButton)e.getSource()).getText() + " has Selected.");
					// 소스가 JRadioButton임이 확정이므로 강제 형변환하여 추출
				}
			});
			buttonPanel.add(itrButton);
			radioGroup.add(itrButton);
		}		
		
		frame.setVisible(true);
	}

}
