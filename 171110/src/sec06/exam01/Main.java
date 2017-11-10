package sec06.exam01;

import java.awt.*;

class FrameTest extends Frame {
	public FrameTest()
	{
		super("두 번째 프레임입니다.");
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
}

class PanelTest extends Frame 
{
	public PanelTest(String str) 
	{
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTest Obj = new FrameTest();
		new PanelTest("패널 테스트");
	}

}
