import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*</applet code="NewApplet" height=400 width=400></applet>*/
public class Construction extends Applet implements ItemListener,ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2;
  CheckboxGroup rb;
  Checkbox c,c1,c2,c3;
  Button b;
  int ccost =1200;
  int c1cost =1500;
  int c2cost =1800;
  int c3cost =2500;
  int total_cost;
    @Override
    public void init()
    {
        l1=new Label("SELECT THE MATERIAL");
        l3=new Label("Enter the total Sq Feet");
        t2= new TextField("200",50);
        l2 = new Label("estimated cost is");
        t1= new TextField("cost is",50);
        rb= new CheckboxGroup();
         c=new Checkbox("Standard Materials", rb, true);
         c1=new Checkbox("above Standard Materials", rb, true);
         c2=new Checkbox("High Standard Materials",rb, true);
         c3=new Checkbox("Fully Automated",rb, true);
           b=new Button("Subbmit"); 
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
        System.out.println("initialized");
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
        int s =Integer.parseInt(t2.getText());
        total_cost = ccost*s;
        repaint();
     }
    else if(c1.getState()== true )
      {
          System.out.println("initialized");
          String s1=t2.getText();
        int s =Integer.parseInt(s1);
        System.out.println(s);
        total_cost = c1cost*s; 
        System.out.println(total_cost);
         repaint(); 
      }
    else if(c2.getState()== true)
      {
          int s =Integer.parseInt(t2.getText());
        total_cost = c2cost*s;  
         repaint(); 
      }
    else if(c3.getState()== true )
      {
       int s =Integer.parseInt(t2.getText());
        total_cost = c3cost*s;  
        repaint();
      }	
    else if (false){}
    
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
    public void start()
    {
        System.out.println("started");
        
    }
    @Override
    public void paint(Graphics g)
    {
         //System.out.println("paint called");
         Checkbox chk = rb.getSelectedCheckbox(); 
		
	g.drawString(chk.getLabel()+ "is selected", 15 ,50);
         
    }
    @Override
    public void stop()
    {
       System.out.println("stopped");  
    }
    @Override
    public void destroy()
    {
        System.out.println("destroyed"); 
    }
    
}