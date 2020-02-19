import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*</applet code="Simple" height=400 width=400></applet>*/
public class Interest extends Applet implements ItemListener,ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2,t3,t4;
  CheckboxGroup rb;
  Checkbox c,c1;
  Button b;
float result,i;
public void init() 
{
l1=new Label("Enter Principle amount");
l2=new Label("Enter rate of interest");
l3=new Label("Enter time period");
t1=new TextField("",50);
t2=new TextField("",50);
t3=new TextField("",50);
t4=new TextField("",50);
rb= new CheckboxGroup();
c=new Checkbox("Simple Interest", rb, true);
c1=new Checkbox("Compound Interest", rb, true);
b=new Button("Submit"); 
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(c);
add(c1);
add(b);
add(t4);
c.addItemListener(this);
c1.addItemListener(this);
  b.addActionListener(this);
}
  @Override
  public void itemStateChanged(ItemEvent e) 
{ 
if(c.getState()== true )
     {    
        float p =Float.parseFloat(t1.getText());
       float q =Float.parseFloat(t2.getText());
        float r =Float.parseFloat(t3.getText());
	result=(p*q*r)/100;
        repaint();
     }
    else 
      {
        float s =Float.parseFloat(t1.getText());
        float t =Float.parseFloat(t2.getText());
        float u =Float.parseFloat(t3.getText());
	result=(float)(s*Math.pow(1.0+t/100.0,u)-s);
        i=(float)(s*Math.pow(1.0+t/100.0,u)-s);
         repaint(); 
      }
}
  @Override
  public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {   
            t4.setText(String.valueOf(result));
        }  
    }
  @Override
  public void paint(Graphics g)
{
Checkbox chk = rb.getSelectedCheckbox();
String s= String.valueOf(result);
}
}
