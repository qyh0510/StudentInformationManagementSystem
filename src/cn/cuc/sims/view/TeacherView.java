package cn.cuc.sims.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;
import cn.cuc.sims.service.UserAction;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class TeacherView extends JFrame {

	private JPanel contentPane;
	String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherView frame = new TeacherView("");
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
	public TeacherView(String id) {
		this.id = id;
		
		setTitle("\u6559\u5E08\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("»¶Ó­" + id + "ºÅ½ÌÊ¦µÇÂ½");
		label.setBounds(14, 13, 189, 23);
		contentPane.add(label);

		JButton button = new JButton("\u8BBE\u7F6E\u672C\u4EBA\u8BFE\u7A0B");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(141, 56, 118, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u67E5\u770B\u8BFE\u7A0B\u4FE1\u606F");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(141, 92, 118, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("\u67E5\u8BE2\u8BFE\u7A0B\u6210\u7EE9");
		button_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_2ActionPerformed(evt);
			}
		});
		button_2.setBounds(141, 128, 118, 23);
		contentPane.add(button_2);

		JButton button_5 = new JButton("\u4FEE\u6539\u5BC6\u7801");
		button_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_5ActionPerformed(evt);
			}
		});
		button_5.setBounds(141, 168, 118, 23);
		contentPane.add(button_5);

		JButton button_6 = new JButton("\u8FD4\u56DE");
		button_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_6ActionPerformed(evt);
			}
		});
		button_6.setBounds(345, 13, 73, 23);
		contentPane.add(button_6);
		
		JButton button_3 = new JButton("\u9000\u51FA");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_3.setBounds(141, 204, 118, 23);
		contentPane.add(button_3);
	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		TsetCourseView td = new TsetCourseView(id);
		td.setVisible(true);
		this.dispose();
	}

	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		TcheckCourseView ts = new TcheckCourseView(id);
		ts.setVisible(true);
		this.dispose();
	}

	private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		TsearchCourseView ta = new TsearchCourseView(id);
		ta.setVisible(true);
		this.dispose();
	}

	private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		TeacherPasswordView ps = new TeacherPasswordView(id);
		ps.setVisible(true);
		this.dispose();
	}

	private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		LoginView lg = new LoginView();
		lg.setVisible(true);
		this.dispose();
	}
}
