package com.ssafy.pjt.b_gui.gugu;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ssafy.pjt.b_gui.gugu.dto.Problem;
import com.ssafy.pjt.b_gui.gugu.service.ProblemService;

public class LayoutTest extends JFrame {
    private ProblemService service = ProblemService.getService();
    
    private static final long serialVersionUID = 1L;
    private JLabel lNum1, lNum2, lCorrectCnt, lWrongCnt;
    private JTextField tfAns;  // 사용자가 값을 입력
    private Problem problem;

    public static void main(String[] args) {
        LayoutTest lt = new LayoutTest();
        lt.launchUi();
    }

    private void launchUi() {
        this.add(new JLabel("구구단을 외자!"), BorderLayout.NORTH);

        makeResultPanel();
        makeProblemPanel();
        // Frame 기본 설정
        this.setTitle("layout test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void makeProblem() {
        problem = service.makeProblem();
        lNum1.setText(problem.num1() + "");
        lNum2.setText(problem.num2() + "");
        tfAns.setText("");
    }

    private void makeResultPanel() {
        // TODO: 결과를 보여줄 panel을 구성하시오.
    	JPanel panel = new JPanel();
    	panel.add(new JLabel("정답 개수:"));
    	lCorrectCnt = new JLabel("0");
    	panel.add(lCorrectCnt);
    	panel.add(new JLabel("오답 개수:"));
    	lWrongCnt = new JLabel("0");
    	panel.add(lWrongCnt);
    	this.makeProblem();
    	this.add(panel, BorderLayout.SOUTH);
        // END
    }

    private void makeProblemPanel() {
        // TODO: 문제를 출제할 패널을 구성하시오.
    	JPanel panel = new JPanel();
    	lNum1 = new JLabel();
    	lNum2 = new JLabel();
    	tfAns = new JTextField(10);
    	panel.add(lNum1);
    	panel.add(new JLabel(" * "));
    	panel.add(lNum2);
    	panel.add(new JLabel(" = "));
    	panel.add(tfAns);  // tfAns : 이벤트 발생
    	tfAns.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyPressed(KeyEvent e) {
    			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
    				int ans = Integer.parseInt(tfAns.getText());
    				boolean result = service.isCorrect(problem, ans);
    				if(result) {
    					updateStatusLabel(lCorrectCnt);
    				}else {
    					updateStatusLabel(lWrongCnt);
    				}
    				makeProblem();
    			}
    		}
    		
    	});
    	this.add(panel, BorderLayout.CENTER);
        // END
    }
    
    private void updateStatusLabel(JLabel label) {
        int newText = Integer.parseInt(label.getText())+1;
        label.setText(newText+"");
    }

}
