import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
 /* 
<applet code="calci" width=1000 height=1000>
</applet>
*/
 

public class calci extends Applet implements ActionListener
{
int var1,var2,result;
int pow=1,fac=1;
int i;
int bi;
int ar[]=new int[10];
double fahr,lb,ft,inve;
char ope;
String oper;
TextField t1;
String msg="";
Button but[]=new Button[10];
Button add,sub,mul,div,clear,mod,EQ,power,fact,inv;
Button wt,temp,dis,bin;
public void init()
	{
		Color k=new Color(120,90,90);
		setBackground(k);
		t1=new TextField(100);
		GridLayout gl=new GridLayout(5,5);
		setLayout(gl);
		setBackground(Color.white);
		Font f=new Font("Courier Bold",50,50);
		t1.setFont(f);
		for(int i=0;i<10;i++)
		{
			but[i]=new Button(""+i);
		}
		wt=new Button("Kg-Lbs");
		temp=new Button("Cel-Fahr");
		dis=new Button("Cms-Ft");
		bin=new Button("Dec-Bin");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		power=new Button("x^n");
		fact=new Button("x!");
		mod=new Button("%");
inv=new Button("1/x");
		clear=new Button("C");
		EQ=new Button("=");
		t1.addActionListener(this);
		add(t1);
		add.setFont(f);
add.setBackground(Color.white);
add.setForeground(Color.black);
		sub.setFont(f);
sub.setBackground(Color.white);
		sub.setForeground(Color.black);
		mul.setFont(f);
mul.setBackground(Color.white);
		mul.setForeground(Color.black);
		div.setFont(f);
div.setBackground(Color.white);
		div.setForeground(Color.black);
		power.setFont(f);
power.setBackground(Color.white);
		power.setForeground(Color.black);
		fact.setFont(f);
fact.setBackground(Color.white);
		fact.setForeground(Color.black);
		clear.setFont(f);
clear.setBackground(Color.white);
		clear.setForeground(Color.red);
		mod.setFont(f);
mod.setBackground(Color.white);
		mod.setForeground(Color.black);
		EQ.setFont(f);
		EQ.setBackground(Color.white);
		EQ.setForeground(Color.red);
inv.setFont(f);
inv.setBackground(Color.white);
inv.setForeground(Color.black);
wt.setFont(f);
wt.setBackground(Color.white);
wt.setForeground(Color.red);
add(wt);
temp.setFont(f);
temp.setBackground(Color.white);
temp.setForeground(Color.red);
add(temp);
dis.setFont(f);
dis.setBackground(Color.white);
dis.setForeground(Color.red);
add(dis);
bin.setFont(f);
bin.setBackground(Color.white);
bin.setForeground(Color.red);
add(bin);

 		for(int i=0;i<10;i++)
		{	
			but[i].setFont(f);
			but[i].setBackground(Color.white);
		        but[i].setForeground(Color.black);
			add(but[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(power);
		add(fact);
add(inv);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++)
		{
			but[i].addActionListener(this);
		}
wt.addActionListener(this);
temp.addActionListener(this);
dis.addActionListener(this);
bin.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		power.addActionListener(this);
		fact.addActionListener(this);
inv.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
 
public void actionPerformed(ActionEvent ae)
	{
	String str=ae.getActionCommand();
	char ch=str.charAt(0);
	if ( Character.isDigit(ch))
	t1.setText(t1.getText()+str);
	else
	if(str.equals("+"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='+';
		msg="Addition";
		t1.setText("");
	}
	else if(str.equals("-"))
	{
		var1=Integer.parseInt(t1.getText());	
		ope='-';
		msg="Subtraction";
		t1.setText("");
	}
	else if(str.equals("*"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='*';
		msg="Multiplication";
		t1.setText("");
	}
	else if(str.equals("/"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='/';
		msg="Division";
		t1.setText("");
	}
	else if(str.equals("%"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='%';
		msg="Modulus";
		t1.setText("");
	}
	else if(str.equals("x^n"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='^';
		msg="Power";
		t1.setText("");
	}
	else if(str.equals("x!"))
	{
		var1=Integer.parseInt(t1.getText());
		ope='!';
		msg="Not operation";
		t1.setText("");
	}
	else if(str.equals("1/x"))
	{
		var1=Integer.parseInt(t1.getText());
		float in=1/var1;
		t1.setText(""+in);
	}
	else if(str.equals("Kg-Lbs"))
	{
		var1=Integer.parseInt(t1.getText());
		lb=(float)(var1)*2.2;
		t1.setText(lb+"lbs");
	}
	else if(str.equals("Cms-Ft"))
	{
		var1=Integer.parseInt(t1.getText());
		ft=(float)(var1)/30.48;
		t1.setText(ft+"ft");
	}
	else if(str.equals("Cel-Fahr"))
	{
		var1=Integer.parseInt(t1.getText());
		fahr=((9*var1)/5)+32;
		t1.setText(fahr+"F");
	}
	else if(str.equals("Dec-Bin"))
	{i=0;
		bi=Integer.parseInt(t1.getText());
		while(bi>0)
{ar[i++]=bi%2;
bi=bi/2;
}
int re=0;
for(int j=i-1;j>=0;j--)
{
re=(re*10)+ar[j];
}
t1.setText(""+re);
		
	}
	if(str.equals("="))
	{
		var2=Integer.parseInt(t1.getText());
		if(ope=='+')	
			result=var1+var2;
		else if(ope=='-')
			result=var1-var2;
		else if(ope=='*')
			result=var1*var2;
		else if(ope=='/')
			result=var1/var2;
		else if(ope=='%')
			result=var1%var2;
		else if(ope=='^')
		{	
			pow=1;
			for(i=1;i<=var2;i++)
			{
			pow=pow*var1;
			}
			result=pow;
		}
		else if(ope=='!')
		{
		fac=1;
		for(i=1;i<=var1;i++)
		{
			fac=fac*i;
		}
		result=fac;
		}

		t1.setText(""+result);
	}	
		if(str.equals("C"))
		{
			t1.setText("");
		}
	}
}