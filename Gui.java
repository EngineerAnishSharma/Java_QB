import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginID implements ActionListener
{
	JFrame f;
	JTextField t1,t2;
	JPasswordField p;
	JButton b1,b2;
	JLabel l1,l2;
	public LoginID()
	{
		f=new JFrame();
		l1=new JLabel("UserName");
		f.add(l1);
		t1=new JTextField(20);
		t2=new JTextField(20);
		f.add(t1);
		l2=new JLabel("Password");
		f.add(l2);
		p=new JPasswordField(20);
		f.add(p);
		b1=new JButton("Submit");
		f.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Reset");
		f.add(b2);
		b2.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String name,pass;
			name=t1.getText();
			pass=p.getText();
			if(name.equals("Anish") && pass.equals("pass@123"))
				{t2.setText("Welcome "+name);
				f.add(t2);}
			else{
				
				t2.setText("Incorrect");
				f.add(t2);
			}
		}
		else if(e.getSource()==b2){
			t1.setText("");
			p.setText("");
		}
	}
}
class Gui
{
	public static void main(String[] args)
	{
		LoginID l=new LoginID();
	}
}