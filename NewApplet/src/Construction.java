import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*</applet code="Construction" height="400" width="400"></applet>*/
public class Construction extends Applet implements ItemListener,ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2;
  CheckboxGroup rb;
  Checkbox c,c1,c2,c3;
  Button b;
  int standardmaterials =1200;
  int abovestandardmaterials =1500;
  int highstandardmaterials =1800;
  int highstandardmaterialsandfullyautomated =2500;
  int total_cost;
    @Override
    public void init()
    {
        l1=new Label("SELECT THE MATERIAL");
        l3=new Label("Enter the total Sq Feet");
        t2= new TextField("",50);
        l2 = new Label("Estimated cost is");
        t1= new TextField("",50);
        rb= new CheckboxGroup();
         c=new Checkbox("Standard Materials", rb, true);
         c1=new Checkbox("above Standard Materials", rb, true);
         c2=new Checkbox("High Standard Materials",rb, true);
         c3=new Checkbox("Fully Automated",rb, true);
           b=new Button("Submit"); 
        add(l1);
        add(c);
        add(c1);
        add(c2);
        add(c3);
        add(l3);
        add(t2);   
        add(b);
        add(l2);
        add(t1);
	c.addItemListener(this);
	c1.addItemListener(this);
	c2.addItemListener(this);
        c3.addItemListener(this);
        b.addActionListener(this);
    }

  @Override 
  public void itemStateChanged(ItemEvent e) 
{  
     if(c.getState()== true )
     {    
        String s1=t2.getText();
        int s =Integer.parseInt(s1);
        total_cost = standardmaterials*s;
        repaint();
     }
    else if(c1.getState()== true )
      {
          String s1=t2.getText();
        int s =Integer.parseInt(s1);
         total_cost =abovestandardmaterials*s; 
          repaint(); 
      }
    else if(c2.getState()== true)
      {
          String s1=t2.getText();
        int s =Integer.parseInt(s1);
        total_cost = highstandardmaterials*s;  
         repaint(); 
      }
    else if(c3.getState()== true )
      {
      String s1=t2.getText();
        int s =Integer.parseInt(s1);
        total_cost =highstandardmaterialsandfullyautomated*s;  
        repaint();
      }	
    else if (false){
    }
    
}

  @Override  
  public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {   
            t1.setText(String.valueOf(total_cost));
        }  
    }  
     @Override
    public void paint(Graphics g)
    {
                 Checkbox chk = rb.getSelectedCheckbox(); 
	            }
    }
