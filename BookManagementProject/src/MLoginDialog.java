import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MLoginDialog extends JDialog{//extends JDialog
	
	/*
	String password;
	
	if (password.equals("1234")) {
        return true;
    }
    return false;

	  */
	private String password="1234";
	
	JLabel pass;
	JPasswordField MangerPassword; //패스워드
	JButton bt; //클릭하면 로그인 성공 실패
	
	public MLoginDialog() {
		setTitle("Manager Login");
        setLocation(450,150);
        setSize(400,600);
        
        Container contentpane = getContentPane();
        JPanel MlPane1 = new JPanel();
        //MlPane1.setLayout(new GridLayout(2,2));
        
        JPanel MlPane2 = new JPanel();
        //MlPane2.setLayout(new GridLayout(2,2));
        
        pass = new JLabel("비밀번호");
        MangerPassword = new JPasswordField(5);
        bt= new JButton("확인");
        
        
        bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
        MlPane1.add(pass,BorderLayout.WEST);
        MlPane1.add(MangerPassword,BorderLayout.EAST);
        MlPane2.add(bt,BorderLayout.SOUTH);
        
        contentpane.add(MlPane1, BorderLayout.CENTER);
        contentpane.add(MlPane2,BorderLayout.SOUTH);
        setVisible(true);
	}

}
