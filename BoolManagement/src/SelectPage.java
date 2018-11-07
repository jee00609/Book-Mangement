import java.awt.*;
import javax.swing.*;

public class SelectPage extends JFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectPage();
	}
	
	// ������
    public SelectPage(){
        setTitle("SK Library");
        setLocation(450,150);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
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
