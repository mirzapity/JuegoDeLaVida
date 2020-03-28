import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Interfaz extends JPanel {
	
	private static JButton btn;
	private static JTextArea textArea;
	

	public static void main(String[] args){
		
		JFrame frame = new JFrame("GOL");
		JButton btnNext = new JButton("Next");
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		
		jPanel1.setLayout(null);
		jPanel1.setBounds(200, 200, 10, 10);
		jPanel1.add(jPanel2);
		btnNext.setBounds(100, 100, 15, 15);
		
		jPanel2.setBorder(BorderFactory.createRaisedBevelBorder());
		jPanel2.setBounds(new Rectangle(19, 268, 384, 39));
		jPanel2.setLayout(null);
		jPanel2.add(btnNext);
		
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.add(jPanel1);
		
		
		btn = new JButton("Click me");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");				
			}
		});
		
		frame.setVisible(true);
		
		
		
		Game game = new Game();
		frame.add(game);	

	}
	
	

}
