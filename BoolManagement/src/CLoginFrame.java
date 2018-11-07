import java.awt.*;
import javax.swing.*;

public class CLoginFrame extends JFrame { //Client 로그인 창
	
	/*
	 * 이름
	 * 전화번호
	 * 확인
	 * 
	 * */
	
	JTextField name; // 이름을 칠 공간
	JPasswordField passPhonenum; //패스워드를 전화번호로 대신한다
	JButton bt; //클릭하면 로그인 성공 실패
	
    // 메인
    public static void main(String[] args) {
        new CLoginFrame();
    }
 
    // 생성자
    public CLoginFrame() {
        setTitle("SK Library");
        setLocation(450,150);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //안에 들어갈 내용물들, 레이아웃, 패널설정, 컴포넌트들
        
        
        
        
        
        
        
        setVisible(true);
    }
}
