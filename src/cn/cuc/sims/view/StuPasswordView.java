package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.UserAction;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class StuPasswordView extends JFrame implements ActionListener{

	private JPanel contentPane;
	UserAction user;
	String id;
	String newPWD;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuPasswordView frame = new StuPasswordView("");
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
	public StuPasswordView(String id) {
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
				newPWD = textField_1.getText();

				if (newPWD == null || newPWD.equals("")) {
					JOptionPane.showMessageDialog(textField_1, "密码不能为空");
				}
				else {
					if (user.changePassword(newPWD, id) == 0) {
						JOptionPane.showMessageDialog(textField_1, "新密码与旧密码相同");
					}
					else {
						JOptionPane.showMessageDialog(textField_1, "修改成功");
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
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(145, 86, 133, 24);
		contentPane.add(textField_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根

	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		StudentView st = new StudentView(id);
		st.setVisible(true);
		this.dispose();
	}
}
