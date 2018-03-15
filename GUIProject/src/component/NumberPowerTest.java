package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NumberPowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("킹존 1위 아프리카 2위 확정");
		
		window.setBounds(500, 500, 800, 450); // 사이즈와 좌표 한번에
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 정리 깔끔
		window.setIconImage(new ImageIcon("images/icon.PNG").getImage());
		window.setResizable(false);
		window.setLayout(null);
		
		JTextField numTF = new JTextField(30); // 30칸
		numTF.setBounds(80, 50, 250, 50); // 바운즈가 더 편할 수도 있다.
		window.add(numTF);
	
		JTextField resultTF = new JTextField(30); // 30칸
		resultTF.setBounds(80, 110, 250, 50); // 바운즈가 더 편할 수도 있다.
		resultTF.setEditable(false); // 화면상에서 수정 불가
		window.add(resultTF);
		
		JButton joinButton = new JButton("Power"); // 제곱 버튼
		joinButton.setBounds(160, 180, 100, 50);
		joinButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num = 0;
				try {
					num = Integer.parseInt(numTF.getText());
					if( num > Math.sqrt(Integer.MAX_VALUE) ) // 정수 최대값의 제곱근보다 큰 값을 제곱하려면 못하게 막는다.
						throw new Exception();
					else
						resultTF.setText(String.valueOf(num*num));
				} catch (Exception exp) {
					resultTF.setText("Cannot square the number.");
				}
				
			}
		});
		
		window.add(joinButton);
		
		window.setVisible(true);
	}

}
