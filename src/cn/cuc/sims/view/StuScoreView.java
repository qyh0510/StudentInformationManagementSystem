package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.StudentAction;

public class StuScoreView extends JFrame implements ActionListener {

	private JPanel contentPane;
	StudentAction student;
	String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuScoreView frame = new StuScoreView("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StuScoreView(String id) {
		student = new StudentAction();
		this.id = id;
		
		setTitle("\u5B66\u751F\u6210\u7EE9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u4E2A\u4EBA\u6210\u7EE9");
		label.setBounds(172, 13, 78, 23);
		contentPane.add(label);

		JButton button = new JButton("\u8FD4\u56DE");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(348, 13, 70, 23);
		contentPane.add(button);
		
		JLabel l;
		int i = 0;
		for(String s: student.searchGrade(id)) {
			l = new JLabel(s);
			l.setBounds(105, 70+i*40, 250, 18);
			l.setFont(new Font("宋体", Font.PLAIN, 13));
			contentPane.add(l);
			i++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根

	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		StudentView st = new StudentView(id);
		st.setVisible(true);
		this.dispose();
	}

}
