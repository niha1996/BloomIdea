import java.awt.*;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
public class Player {
Image img=new ImageIcon("C:/Users/Hp/eclipse-workspace/Resume/src/Images/nihal.png").getImage();
int v=0;
int dv=0;
int vt=0;
int s=0;
int x=30;
int y=100;
int layer1=0;
int layer2=1200;
public void move() {
	s+=v;
	v+=dv;
	y+=vt;
	if(layer2-v<=0) {
		layer1=0;
		layer2=1200;
	}
	else {
		layer1-=v;
		layer2-=v;
	}
}
public void keyPressed(KeyEvent e)
{
	int key=e.getKeyCode();
	if(key==KeyEvent.VK_RIGHT)
	{
		dv=1;
	}
	if(key==KeyEvent.VK_LEFT)
	{
		dv=-1;
	}
	if(key==KeyEvent.VK_UP)
	{
		vt=-1;
	}
	if(key==KeyEvent.VK_DOWN)
	{
		vt=1;
	}
	
}
public void keyReleased(KeyEvent e)
{
	int key=e.getKeyCode();
	if(key==KeyEvent.VK_RIGHT ||key==KeyEvent.VK_LEFT)
	{
		dv=0;
	}
}
}
