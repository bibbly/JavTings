import java.awt.event.KeyEvent;

public class Protagonist {
	
	private int dThrottleL;
	private int dThrottleR;
	private int throttleL;
	private int throttleR;
	private int batteryLevel;
	private int x;
	private int y;
	private int dx;
	private int dy;
	
	public Protagonist(){
		initMe();
	}
	
	private void initMe(){
		x = 100;
		y = 40;
	}
	
	public void accelerator(){	
		if(throttleL > 0){
			throttleL = Math.min(throttleL + dThrottleL, 50);
		}else{
			throttleL = Math.max(throttleL + dThrottleL, -50);
		}
		
		if(throttleR > 0){
			throttleR = Math.min(throttleR + dThrottleR, 50);
		}else{
			throttleR = Math.max(throttleR + dThrottleR, -50);
		}
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_Q){dThrottleL = 1;}
		if(key == KeyEvent.VK_A){dThrottleL = -1;}
		if(key == KeyEvent.VK_P){dThrottleR = 1;}
		if(key == KeyEvent.VK_L){dThrottleR = -1;}
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_Q){dThrottleL = -3;}
		if(key == KeyEvent.VK_A){dThrottleL = 3;}
		if(key == KeyEvent.VK_P){dThrottleR = -3;}
		if(key == KeyEvent.VK_L){dThrottleR = 3;}
	}
	
	public int getThrottleL(){
		return throttleL;
	}
	public int getThrottleR(){
		return throttleR;
	}
}
