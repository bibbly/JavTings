import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class RichardPryor extends JFrame{
	public void RichardPryor(){
		initUI();
	}
	
	private void initUI(){
		setLayout(new BorderLayout());
		add(new DashBoard(), BorderLayout.CENTER);
		pack();
		setResizable(false);
		setVisible(true);
		
		setTitle("Bot Business");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				RichardPryor rP = new RichardPryor();
				rP.setVisible(true);
			}
		});
	}
}
