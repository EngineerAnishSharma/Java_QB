import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorChanger implements ActionListener
{
	JLabel l1;
	JFrame f;
	JButton b1,b2;
	public ColorChanger()
	{
		f=new JFrame();
		l1=new JLabel("Color changer:");
		f.add(l1);
		b1=new JButton("Green Button");
		f.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Red Button");
		f.add(b2);
		b2.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			f.getContentPane().setBackground(Color.GREEN);
		}
		else if(e.getSource()==b2)
			f.getContentPane().setBackground(Color.RED);
	}
}
class ColorChange
{
	public static void main(String[] args)
	{
		ColorChanger c1=new ColorChanger();
	}
}
