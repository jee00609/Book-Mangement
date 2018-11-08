import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectPage extends JFrame {
	CLoginDialog Clogin = null;
	MLoginDialog Mlogin = null;
	SignUps signups = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectPage();
	}
	
	// 생성자
    public SelectPage(){
        setTitle("SK Library");
        setLocation(450,150);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /*안에 들어갈 내용물들을 삽입하는 공간들*/
        
        Container contentpane = getContentPane();
        //contentpane.setLayout(null); -->후회한다 하지마
        
        /*패널 설정 공간*/
        JPanel pane1 = new JPanel(); //그림 넣을 공간
        JPanel pane2 = new JPanel(); // 고객 사서 라벨 및 버튼
        pane2.setLayout(new GridLayout(2, 2));
        
        JPanel pane3 = new JPanel(); //회원가입 버튼 넣을 곳
        
        JLabel label0 = new JLabel("도서관 ICON");
        JLabel label1= new JLabel("고객"); //고객
        JLabel label2= new JLabel("사서"); //사서
        
        JButton button1 = new JButton("고객"); //고객
        JButton button2 = new JButton("사서"); //사서
        JButton button3 = new JButton("신규 고객은 회원가입을 해주세요"); //회원가입
        
        /*라벨을 쓸 때 모두 가운데 정렬을 쓸것*/
        label1.setHorizontalAlignment(label1.CENTER); //고객 가운데 정렬 
        label2.setHorizontalAlignment(label1.CENTER); //사서 가운데 정렬
        
        /*버튼 사이즈 변경 공간*/
        button1.setPreferredSize(new Dimension(45, 28)); //사이즈가 바뀌질 않는다 왜?
        
        /*Panel에 삽입하는 부분*/
        //pane1
        pane1.add(label0);
        
        //pane2
        pane2.add(button1);
        pane2.add(button2);
        pane2.add(label1);
        pane2.add(label2);
        
        button1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Clogin = new CLoginDialog();
				
				
				Clogin.setSize(200,300);
				Clogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Clogin.setVisible(true);
				
			}
		});
        
        button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mlogin = new MLoginDialog();
				
				Mlogin.setSize(200,300);
				Mlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Mlogin.setVisible(true);
				
			}
		});
        
        
        button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signups = new SignUps();
				
				signups.setSize(200,300);
				signups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				signups.setVisible(true);
			}
		});
        
        //pane3
        pane3.add(button3);
        
        /*ContentPane에 삽입하는 부분*/
        contentpane.add(pane1, BorderLayout.NORTH);
        contentpane.add(pane2, BorderLayout.CENTER);
		contentpane.add(pane3, BorderLayout.SOUTH);

		/*출력 파트*/
		//pack(); -->후회한다. 하지마
        setVisible(true);
    }

}
