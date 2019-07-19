package cn.cuc.sims.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.AdminAction;
import cn.cuc.sims.service.StudentAction;

import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminView extends JFrame {

	private JPanel contentPane;
	AdminAction admin;
	String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView("");
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
	public AdminView(String id) {
		this.id = id;

		setTitle("\u7BA1\u7406\u5458");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("\u8BBE\u7F6E\u8BFE\u7A0B\u4FE1\u606F");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(160, 57, 114, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(172, 180, 93, 23);
		contentPane.add(button_1);

		JButton btnNewButton = new JButton("\u4FEE\u6539\u5B66\u751F\u4FE1\u606F");
		btnNewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewButtonActionPerformed(evt);
			}
		});
		btnNewButton.setBounds(160, 90, 114, 23);
		contentPane.add(btnNewButton);

		JButton button_2 = new JButton("\u67E5\u8BE2\u6210\u7EE9");
		button_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_2ActionPerformed(evt);
			}
		});
		button_2.setBounds(160, 125, 114, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton("\u8FD4\u56DE");
		button_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_3ActionPerformed(evt);
			}
		});
		button_3.setBounds(350, 13, 68, 23);
		contentPane.add(button_3);

		JButton button_4 = new JButton("\u9000\u51FA");
		button_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_4ActionPerformed(evt);
			}
		});
		button_4.setBounds(172, 213, 93, 23);
		contentPane.add(button_4);

		JLabel lblnull = new JLabel("ª∂”≠" + id + "∫≈π‹¿Ì‘±µ«¬Ω");
		lblnull.setBounds(14, 13, 199, 23);
		contentPane.add(lblnull);
	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminClassView ac = new AdminClassView();
		ac.setVisible(true);
		this.dispose();
	}

	private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminUpdateView au = new AdminUpdateView(id);
		au.setVisible(true);
		this.dispose();
	}

	private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AsearchCourseView ack = new AsearchCourseView(id);
		ack.setVisible(true);
		this.dispose();
	}

	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminPasswordView aps = new AdminPasswordView(id);
		aps.setVisible(true);
		this.dispose();
	}

	private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		LoginView lg = new LoginView();
		lg.setVisible(true);
		this.dispose();
	}

	private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}
}
