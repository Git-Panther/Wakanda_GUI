package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class SliderTest {

	public static final int DEFAULT = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("KT는 올해도 못 감 ㅋㅋ");
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("images/icon.PNG").getImage());

		JLabel label = new JLabel("슬라이더 이동");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label, "North");

		JSlider slider = new JSlider(0, 100, DEFAULT);
		frame.add(slider, "Center");

		JPanel resetPanel = new JPanel();
		JButton resetBtn = new JButton("Reset");
		resetPanel.add(resetBtn);
		JLabel resultLabel = new JLabel();
		resetPanel.add(resultLabel);
		frame.add(resetPanel, "South");

//		slider.addChangeListener(new ChangeListener() {
//			// 슬라이더 위치가 바뀔 때마다
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				// TODO Auto-generated method stub
//				resultLabel.setText(String.valueOf(slider.getValue()));
//			}
//		});

		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				slider.setValue(DEFAULT);
			}
		});

		frame.setVisible(true);
	}
}
