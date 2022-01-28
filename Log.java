import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Log extends JFrame{
    String user,pass;
public Log(){
    setTitle("Login Page");
        JPanel jp=new JPanel();
        JLabel u=new JLabel("Username");
        JTextField uname=new JTextField(20);
        JLabel p=new JLabel("Password");
        JPasswordField psw=new JPasswordField(20);
        JButton log=new JButton("LOGIN");
        JButton can=new JButton("RESET");
        JButton su=new JButton("SignUp");
        JButton help=new JButton("HELP");
            jp.add(u);
            jp.add(uname);
            jp.add(p);
            jp.add(psw);            
            log.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    // String user,pass;
                    user=uname.getText();
                    pass=psw.getText();
                    if(user.equals("admin")&&pass.equals("dav123")){
                        System.out.println("Login Sucessful");
                        JOptionPane.showMessageDialog(null,"Login Sucessful");
                    }
                    else{
                        System.out.println("Invalid");
                            JOptionPane.showMessageDialog(null,"Re-enter your password");
                    }
                }
            });
            can.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    user="";
                    pass="";
                    uname.setText(user);
                    psw.setText(pass);
                }
            }
            );
            su.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                   dispose();
                   SignUp obj=new SignUp();
                   obj.setVisible(true);
                }
            }
            );
            jp.add(log);
            jp.add(can);
            jp.add(su);
            jp.add(help);
            add(jp);
            setVisible(true);
            setSize(300,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public static void main(String args[]){
new Log();
}


}
