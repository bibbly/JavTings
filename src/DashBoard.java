import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;

public class DashBoard extends JPanel implements ActionListener{
	private Timer timer;
	private Protagonist robotMe;
	private final int DELAY = 10;
	
	public DashBoard(){
		initDashBoard();
	}
	
	private void initDashBoard(){
		addKeyListener(new TAdapter());
		setFocusable(true);
		setVisible(true);
		setLayout(new BorderLayout());
		
		robotMe = new Protagonist();
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void doDrawing(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawRect(0, 240, 20, 240-robotMe.getThrottleL());
		g2d.drawRect(20, 240, 20, 240-robotMe.getThrottleR());
	}
	
	public void actionPerformed(ActionEvent e){
		robotMe.accelerator();
		repaint();
	}
	
	private class TAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e){robotMe.keyPressed(e);}
		public void keyReleased(KeyEvent e){robotMe.keyReleased(e);}
	}
}
