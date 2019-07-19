package cn.cuc.sims.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.UserAction;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminPasswordView extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	UserAction user;
	String id;
	String newPWD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPasswordView frame = new AdminPasswordView("");
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
	public AdminPasswordView(String id) {
		user = new UserAction();
		this.id = id;
		
		setTitle("\u4FEE\u6539\u5BC6\u7801");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		label.setBounds(179, 24, 68, 23);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\u65B0\u5BC6\u7801");
		label_1.setBounds(82, 88, 56, 21);
		contentPane.add(label_1);

		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newPWD = textField.getText();

				if (newPWD == null || newPWD.equals("")) {
					JOptionPane.showMessageDialog(textField, "密码不能为空");
				}
				else {
					if (user.changePassword(newPWD, id) == 0) {
						JOptionPane.showMessageDialog(textField, "新密码与旧密码相同");
					}
					else {
						JOptionPane.showMessageDialog(textField, "修改成功");
					}
				}
			}
		});
		button.setBounds(163, 172, 101, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(350, 24, 68, 23);
		contentPane.add(button_1);
		
		textField = new JPasswordField();
		textField.setBounds(145, 86, 133, 24);
		contentPane.add(textField);
	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminView ad = new AdminView(id);
		ad.setVisible(true);
		this.dispose();
	}
}
