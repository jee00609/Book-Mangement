import java.awt.*;
import javax.swing.*;

public class CLoginFrame extends JFrame { //Client �α��� â
	
	/*
	 * �̸�
	 * ��ȭ��ȣ
	 * Ȯ��
	 * 
	 * */
	
	JTextField name; // �̸��� ĥ ����
	JPasswordField passPhonenum; //�н����带 ��ȭ��ȣ�� ����Ѵ�
	JButton bt; //Ŭ���ϸ� �α��� ���� ����
	
    // ����
    public static void main(String[] args) {
        new CLoginFrame();
    }
 
    // ������
    public CLoginFrame() {
        setTitle("SK Library");
        setLocation(450,150);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //�ȿ� �� ���빰��, ���̾ƿ�, �гμ���, ������Ʈ��
        
        
        
        
        
        
        
        setVisible(true);
    }
}
