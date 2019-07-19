package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;

import javax.swing.JLabel;
import javax.swing.JButton;

public class TcheckCourseView extends JFrame {

	private JPanel contentPane;
	String id;
	TeacherAction teacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TcheckCourseView frame = new TcheckCourseView("");
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
	public TcheckCourseView(String id) {
		this.id = id;
		teacher = new TeacherAction();

		setTitle("\u67E5\u770B\u8BFE\u7A0B\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u8BFE\u7A0B\u4FE1\u606F");
		label.setBounds(167, 13, 79, 23);
		contentPane.add(label);

		JButton button = new JButton("\u8FD4\u56DE");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(355, 13, 63, 23);
		contentPane.add(button);

		JLabel l;
		int i = 0;
		for (String s : teacher.searchCourseInfo(id)) {
			l = new JLabel(s);
			l.setBounds(105, 70 + i * 40, 250, 18);
			l.setFont(new Font("ËÎÌו", Font.PLAIN, 13));
			contentPane.add(l);
			i++;
		}
	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		TeacherView te = new TeacherView(id);
		te.setVisible(true);
		this.dispose();
	}

}
