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
	
	// ������
    public SelectPage(){
        setTitle("SK Library");
        setLocation(450,150);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /*�ȿ� �� ���빰���� �����ϴ� ������*/
        
        Container contentpane = getContentPane();
        //contentpane.setLayout(null); -->��ȸ�Ѵ� ������
        
        /*�г� ���� ����*/
        JPanel pane1 = new JPanel(); //�׸� ���� ����
        JPanel pane2 = new JPanel(); // �� �缭 �� �� ��ư
        pane2.setLayout(new GridLayout(2, 2));
        
        JPanel pane3 = new JPanel(); //ȸ������ ��ư ���� ��
        
        JLabel label0 = new JLabel("������ ICON");
        JLabel label1= new JLabel("��"); //��
        JLabel label2= new JLabel("�缭"); //�缭
        
        JButton button1 = new JButton("��"); //��
        JButton button2 = new JButton("�缭"); //�缭
        JButton button3 = new JButton("�ű� ���� ȸ�������� ���ּ���"); //ȸ������
        
        /*���� �� �� ��� ��� ������ ����*/
        label1.setHorizontalAlignment(label1.CENTER); //�� ��� ���� 
        label2.setHorizontalAlignment(label1.CENTER); //�缭 ��� ����
        
        /*��ư ������ ���� ����*/
        button1.setPreferredSize(new Dimension(45, 28)); //����� �ٲ��� �ʴ´� ��?
        
        /*Panel�� �����ϴ� �κ�*/
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
        
        /*ContentPane�� �����ϴ� �κ�*/
        contentpane.add(pane1, BorderLayout.NORTH);
        contentpane.add(pane2, BorderLayout.CENTER);
		contentpane.add(pane3, BorderLayout.SOUTH);

		/*��� ��Ʈ*/
		//pack(); -->��ȸ�Ѵ�. ������
        setVisible(true);
    }

}
