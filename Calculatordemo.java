import java.awt.*;
import java.awt.event.*;
class Calculatordemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2,tf3;
	Calculatordemo()
	{
		setLayout(null);
		setBackground(Color.red);
		
		Label l1=new Label("******Pratik Calculator******");
		Label l2=new Label("Enter First Number:");
		Label l3=new Label("Enter Second Number:");  
        Label l4=new Label("Result: "); 		
		tf1=new TextField(30);
		tf2=new TextField(30);
		tf3=new TextField(30);
		b1=new Button("ADD");
		b2=new Button("SUB");
		b3=new Button("MUL");
		b4=new Button("DIV");
		b5=new Button("CLEAR");
		Font f1=new Font("Times New Roman",Font.BOLD,25);
		Font f2=new Font("Times New Roman",Font.BOLD,17);
		l1.setFont(f1);
		l1.setBounds(140,50,500,80);
		setFont(f2);
		l2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		l3.setBounds(50,260,180,40);
		l4.setBounds(50,340,180,40);
		tf2.setBounds(260,260,160,40);
		tf3.setBounds(260,340,160,40);
		b1.setBounds(50,420,100,50);
		b2.setBounds(170,420,100,50);
		b3.setBounds(290,420,100,50);
		b4.setBounds(410,420,100,50);
		b5.setBounds(530,420,100,50);
		add(l1);add(l2);add(l3);add(l4);
		add(tf1);add(tf2);add(tf3);
		add(b1);add(b2);add(b3);add(b4);
		add(l4);add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent Ae)
	{
		int no=Integer.parseInt(tf1.getText());
		int no1=Integer.parseInt(tf2.getText());
		int z;
		String str=Ae.getActionCommand();
		if (str.equals("ADD"))
		{
			z=no+no1;
			tf3.setText(""+z);
		}
		else if (str.equals("SUB"))
		{
			z=no-no1;
			tf3.setText(""+z);
		}
		else if (str.equals("MUL"))
		{
			z=no*no1;
			tf3.setText(""+z);
		}
		else if (Ae.getSource()==b4)
		{
			z=no/no1;
			tf3.setText(""+z);
		}
		else if(Ae.getSource()==b5)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		
	}
	public static void main(String args[])
	{
		Calculatordemo f1=new Calculatordemo();
		f1.setVisible(true);
		f1.setTitle("Simple Calculator");
		f1.setSize(700,700);
	}
}