import javax.swing.*;
public class CarRace {
public static void main(String args[])
{
	JFrame f=new JFrame("Car-Nihal Bhardwaj");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(1100,600);
	f.add(new Road());
	f.setVisible(true);
}
}