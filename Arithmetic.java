import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Arithmetic implements ActionListener
{
Frame f;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5,b6;
Label l1,l2,l3;
Arithmetic()
{
f=new Frame("Arithmetic Operations");
f.setVisible(true);
f.setSize(300,200);
f.setLayout(new FlowLayout());
l1=new Label("enter a value");
l2=new Label("enter b value");
l3=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("Add");
b2=new Button("Sub");
b3=new Button("Mul");
b4=new Button("Div");
b5=new Button("Reset");
b6=new Button("Cancel");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(l3);
f.add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
f.setBackground(Color.yellow);
f.setForeground(Color.red);
}
public void actionPerformed(ActionEvent o)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
if(o.getSource().equals(b1))
{
int c=a+b;
t3.setText(String.valueOf(c));
}
else if(o.getSource().equals(b2))
{
int c=a-b;
t3.setText(String.valueOf(c));
}
else if(o.getSource().equals(b3))
{
int c=a*b;
t3.setText(String.valueOf(c));
}
else if(o.getSource().equals(b4))
{
try
{
int c=a/b;
t3.setText(String.valueOf(c));
}
catch(Exception x)
{
JOptionPane.showMessageDialog(null,x);
}
}
else if(o.getSource().equals(b5))
{
t1.setText("");
t2.setText("");
t3.setText("");
}
else
{
f.setVisible(false);
}
}
public static void main(String...poori)
{
new Arithmetic();
}
}
