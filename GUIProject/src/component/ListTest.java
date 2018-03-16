package component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest {
	public static void main(String[] args) {
		String[] kingzone = {"김동하", "한왕호", "곽보성", "김종인", "강범현", "문우찬", "강동훈"};
		JFrame frame = new JFrame("ㅓㅜㅘ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		JList<String> cityList = new JList<String>(kingzone);
		cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.add(cityList, "Center");
		
		JLabel resultLabel = new JLabel("Select a King-Zone Member you want.");
		frame.add(resultLabel, "South");
		
		cityList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				resultLabel.setText((String)cityList.getSelectedValue());
			}
		});

		frame.setVisible(true);

	}
}
