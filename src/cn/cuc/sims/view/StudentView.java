package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.StudentAction;

public class StudentView extends JFrame implements ActionListener {

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
					StudentView frame = new StudentView("");
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
	public StudentView(String id) {
		student = new StudentAction();
		this.id = id;
		
		setTitle("\u5B66\u751F\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("欢迎" + student.searchName(id) + "登陆");
		label.setBounds(14, 13, 209, 24);
		contentPane.add(label);

		JButton button = new JButton("\u4E2A\u4EBA\u4FE1\u606F");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(160, 50, 93, 23);
		contentPane.add(button, javax.swing.JLayeredPane.DEFAULT_LAYER);

		JButton btnNewButton = new JButton("\u4E2A\u4EBA\u6210\u7EE9");
		btnNewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewButtonActionPerformed(evt);
			}
		});
		btnNewButton.setBounds(160, 100, 93, 23);
		contentPane.add(btnNewButton);

		JButton button_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(160, 152, 93, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("\u9000\u51FA");
		button_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_2ActionPerformed(evt);
			}
		});
		button_2.setBounds(160, 204, 93, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton("\u8FD4\u56DE");
		button_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_3ActionPerformed(evt);
			}
		});
		button_3.setBounds(360, 11, 64, 23);
		contentPane.add(button_3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		StuInfoView sf = new StuInfoView(id);
		sf.setVisible(true);
		this.dispose();
	}

	private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
		StuScoreView sc = new StuScoreView(id);
		sc.setVisible(true);
		this.dispose();
	}

	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		StuPasswordView ps = new StuPasswordView(id);
		ps.setVisible(true);
		this.dispose();
	}

	private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {
		LoginView lg = new LoginView();
		lg.setVisible(true);
		this.dispose();
	}

	private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

}
