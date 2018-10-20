import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Form
{
Form()
{
    JFrame window = new JFrame("Day Calculator");

window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(800,800);
    window.setVisible(true);  


     JLabel label_1,label_2,label_3;
    JTextField txtbx_1,txtbx_2,txtbx_3;
    JButton submit,cancel,back;
    
    label_1 = new JLabel(" Enter the Date : ");
    label_1.setBounds(50,50, 100,30);
label_2 = new JLabel("Enter the Month : ");
    label_2.setBounds(50,100, 100,30);
        

    label_3 = new JLabel("Enter the Year : ");
    label_3.setBounds(50,150, 100,30);


    txtbx_1 = new JTextField();
    txtbx_1.setBounds(170,50, 100,30);
    txtbx_2 = new JTextField();
    txtbx_2.setBounds(170,100, 100,30);
    txtbx_3 = new JTextField();
    txtbx_3.setBounds(170,150, 100,30);

    submit = new JButton("Show Day");
    submit.setBounds(50,250, 100,30);
submit.addActionListener(new ActionListener()
{
   
        public void actionPerformed(ActionEvent e)
{
    int date=0,year=0,add=0,rem=0,leap=0;
    int notleap=0,total=0,odd1=0,odd2=0,odd3=0;
    String month;
    String st = "Welcome";
    date=Integer.parseInt(txtbx_1.getText());
    month = txtbx_2.getText();
    year=Integer.parseInt(txtbx_3.getText());
    if(month.equals("1")||month.equals("01"))
{
    add=0;
}
if(month.equals("2")||month.equals("02"))
{
    add=3;
}
if(month.equals("3")||month.equals("03"))
{
    add=3;
}
if(month.equals("4")||month.equals("04"))
{
    add=6;
}
if(month.equals("5")||month.equals("05"))
{
    add=8;
}
if(month.equals("6")||month.equals("06"))
{
    add=11;
}
if(month.equals("7")||month.equals("07"))
{
    add=13;
}
if(month.equals("8")||month.equals("08"))
{
    add=16;
}
if(month.equals("9")||month.equals("09"))
{
    add=19;
}

if(month.equals("10"))
{
    add=21;
}
if(month.equals("11"))
{
    add=24;
}
if(month.equals("12"))
{
    add=26;
}
if(year % 400 == 0)
{
    if(month.equals("1")||month.equals("2")||month.equals("01")||month.equals("02"))
    {

    }
    else
    {
 add++;
    }
}
else if(year % 4 == 0)
{
    
    if(month.equals("1")||month.equals("2")||month.equals("01")||month.equals("02"))
    {

    }
    else
    {
 add++;
    }

}
year--;
if(year<400)
{

}
else if(year<800)
{
    year=year-400;
}

else if(year<1200)
{
    year=year-800;
}

else if(year<1600)
{
    year=year-1200;
}

else if(year<2000)
{
    year=year-1600;
}

else if(year<2400)
{
    year=year-2000;
}
else if(year<2800)
{
    year=year-2400;
}
else if(year<3200)
{
    year=year-2800;
}
else if(year<3600)
{
    year=year-3200;
}
else if(year<4000)
{
    year=year-3600;
}


else if(year<4400)
{
    year=year-4000;
}

else if(year<4800)
{
    year=year-4400;
}

else if(year<5200)
{
    year=year-4800;
}
        if(year>300)
        {
            rem=1;
            year=year-300;
        }
        else if(year>200)
        {
            rem=1;
            year=year-200;
        }
        
        else if(year>100)
        {
            rem=1;
            year=year-100;
        }
        leap=year/4;
        notleap=year-leap;
        leap=leap*2;
        total=leap+notleap;
        odd1=total%7;
        odd2=add+date;
        odd2=odd2%7;
        odd3=odd1+odd2+rem;
        if(odd3>=7)
        {
            odd3=odd3%7;
        }
        if(odd3==0)
        {
            st="It's a Sunday ";         
        }
        
        if(odd3==1)
        {
            st="It's a Monday ";     
        }
        if(odd3==2)
        {
            st="It's a Tuesday ";     
        }
        if(odd3==3)
        {
            st="It's a Wednesday ";     
        }
        if(odd3==4)
        {
            st="It's a Thrusday ";     
        }
        if(odd3==5)
        {
            st="It's a Friday ";     
        }
        if(odd3==6)
        {
            st="It's a Saturday ";     
        }
        
       JOptionPane.showMessageDialog(null, st,"Result",
                                        JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, st);
   
    

}
});
    cancel = new JButton("Clear");
    cancel.setBounds(180,250, 100,30);

cancel.addActionListener(new ActionListener()
{  
        public void actionPerformed(ActionEvent e)
{  
txtbx_1.setText("");
txtbx_2.setText("");
txtbx_3.setText("");

}
});
    back = new JButton("About Us");
    back.setBounds(120,300, 100,30);

back.addActionListener(new ActionListener()
{  
        public void actionPerformed(ActionEvent e)
{  
    
String st1 = "Developed by, Suresh Arunachalam T";
JOptionPane.showMessageDialog(null, st1);
}
});

    window.add(submit);
    window.add(back);

    window.add(cancel);
    window.add(label_1);
    window.add(label_2);
    window.add(label_3);
   
   window.add(txtbx_1);
    window.add(txtbx_2);
    window.add(txtbx_3);
    
    window.setSize(400,400);
    window.setLayout(null);  
    window.setVisible(true);  

}
public static void main(String[] args)
{
new Form();
}
}