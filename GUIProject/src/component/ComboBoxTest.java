package component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ComboBoxTest {

	private static final String[] animals = {"기프트", "맵도날드", "고통빈"};
	private static JComboBox<String> animalCombo = new JComboBox<String>(animals);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("KT는 올해도 못 감 ㅋㅋ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		
		
		frame.add(animalCombo, "North");
		
		JLabel imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(imageLabel, "Center");
		
		animalCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				String animal = (String) animalCombo.getSelectedItem();
				String animal = null;
//				JOptionPane.showMessageDialog(frame, animal); // 다이얼로그
				switch( (String) animalCombo.getSelectedItem() ) {
				case "기프트":
					animal = "dog";
					break;
				case "맵도날드":
					animal = "cat";
					break;
				case "고통빈":
					animal = "user";
					break;
				}
				Image img = new ImageIcon("images/" + animal + ".PNG").getImage().getScaledInstance(300, 300, 0);
				imageLabel.setIcon(new ImageIcon(img));
			}
		});
		
		frame.setVisible(true);
	}

}
