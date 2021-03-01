package arabaHareketi;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ekran extends JFrame {

	static int x;
	static int y;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ekran frame = new ekran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ekran() {
		setAlwaysOnTop(true);
		
		
		Image right = new ImageIcon(this.getClass().getResource("/sag.png")).getImage();
		Image left = new ImageIcon(this.getClass().getResource("/sol.png")).getImage();
		Image up = new ImageIcon(this.getClass().getResource("/yukari.png")).getImage();
		Image down = new ImageIcon(this.getClass().getResource("/asagi.png")).getImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 850, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel car = new JLabel("");
		car.setBounds(0, 0, 128, 64);
		car.setIcon(new ImageIcon(right));
		contentPane.add(car);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					car.setIcon(new ImageIcon(right));
					x = (int) car.getBounds().getX();
					y = (int) car.getBounds().getY();
					
					if(x<(829-(car.getBounds().getWidth()))) x += 5;
					
					car.setBounds(x, y, 128, 64);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					car.setIcon(new ImageIcon(left));
					x = (int) car.getBounds().getX();
					y = (int) car.getBounds().getY();
					
					if(x>0) x -= 5;
					
					car.setBounds(x, y, 128, 64);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					//car.setBounds(0, 0, 128, 128);
					car.setIcon(new ImageIcon(down));
					x = (int) car.getBounds().getX();
					y = (int) car.getBounds().getY();
					
					if(y<(600-car.getBounds().getHeight())) y += 5; 
					
					car.setBounds(x, y, 128, 128);
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					//car.setBounds(0, 0, 128, 128);
					car.setIcon(new ImageIcon(up));
					x = (int) car.getBounds().getX();
					y = (int) car.getBounds().getY();
					
					if(y>0) y -= 5; 
					
					car.setBounds(x, y, 128, 128);
				}
				
				
				
			}
		});
	}
}
