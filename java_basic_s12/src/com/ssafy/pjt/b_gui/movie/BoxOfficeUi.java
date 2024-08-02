package com.ssafy.pjt.b_gui.movie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.ssafy.day11.client.BoxOfficeCLI;
import com.ssafy.day11.dto.BoxOffice;
import com.ssafy.day11.parser.BoxOfficeDomParser;
import com.ssafy.day11.parser.BoxOfficeJsonParser;
import com.ssafy.day11.parser.BoxOfficeParser;

public class BoxOfficeUi extends JFrame {

    private static final long serialVersionUID = 1L;

    // 컴포넌트 선언
    JTextField tfType;
    JButton btnSearch;
    JTable tblBoxOffice;
    // table의 데이터를 관리하는 객체
    DefaultTableModel model = null;

    private BoxOfficeCLI cli = new BoxOfficeCLI();  // day11.client.BoxOfficeCLI

    public static void main(String[] args) {
        BoxOfficeUi ui = new BoxOfficeUi();
        ui.launchUi();
    }

    private void launchUi() {

        // 테이블 구성
        tblBoxOffice = new JTable();
        tblBoxOffice.setDefaultEditor(Object.class, null);
        String[] header = { "랭킹", "제목", "개봉일", "누적관객" };
        model = (DefaultTableModel) tblBoxOffice.getModel();
        model.setColumnIdentifiers(header);

        // 요소 배치
        this.add(makeNorthPanel(), BorderLayout.NORTH);
        this.add(new JScrollPane(tblBoxOffice), BorderLayout.CENTER);
        // 이벤트 listener 등록 처리
        addEventListener();

        this.setTitle("오늘의 영화 랭킹 Top 10");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setVisible(true);
    }

    private JPanel makeNorthPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("조회 방식 "), BorderLayout.WEST);
        tfType = new JTextField("S");  // SAX, COM, JSON 타입 결정
        panel.add(tfType, BorderLayout.CENTER);
        btnSearch = new JButton("조회");
        panel.add(btnSearch, BorderLayout.EAST);
        return panel;
    }

    private void addEventListener() {
        // TODO: btnSearch를 클릭하면 tfType에 기반해서 목록을 초기화 해보자.
    	btnSearch.addActionListener(e -> {
    		// 기존에 테이블에 데이터가 있었다면 -> reset
    		model.setRowCount(0); // 데이터 초기화
    		// 새로운 데이터 읽어오기
    		String type = tfType.getText();
    		try {
				Optional<List<BoxOffice>> list = cli.readBoxOfficeList(type.charAt(0));
				list.ifPresentOrElse(l -> {
					for(BoxOffice bo: l) {
						model.addRow(new Object[] {bo.rank(), bo.movieNm(), bo.openDt(), bo.audiAcc()});
					}
					showOptionPane("조회 완료");
					
				}, ()->showOptionPane("데이터가 없어요."));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	});
            // END
        

        // TODO:테이블에서 행을 더블클릭했을 때 발생하는 이벤트를 처리하여 showDetailFrame 메서드를 호출해보자.
    	tblBoxOffice.addMouseListener(new MouseAdapter() {
    		public void mouseClicked(java.awt.event.MouseEvent e) {
    			if(e.getClickCount()==2) {
    				showDetailFrame();
    			}
    		}
		});
        // END
    }
    
    private void showOptionPane(String msg) {  // 
        JOptionPane.showMessageDialog(this, msg);
    }

    private JFrame showDetailFrame() {
        JFrame frame = new JFrame();
        int row = tblBoxOffice.getSelectedRow();
        String nm = model.getValueAt(row, 1).toString();
        frame.add(new JLabel(String.format("선택된 영화 제목은 %s입니다.", nm)), BorderLayout.CENTER);
        frame.add(new JLabel("영화에 대한 상세 정보를 출력해보는건 어때요?"), BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

}
