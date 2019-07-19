package cn.cuc.sims.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.AdminAction;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminUpdateView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	AdminAction ad;
	String id;
	String sid;
	String info;
	String type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUpdateView frame = new AdminUpdateView("");
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
	public AdminUpdateView(String id) {
		ad = new AdminAction();
		this.id = id;
		
		setTitle("\u4FEE\u6539\u5B66\u751F\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(352, 13, 66, 23);
		contentPane.add(button_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "姓名", "性别", "年龄", "学分" }));
		comboBox.setBounds(118, 125, 54, 21);
		contentPane.add(comboBox);

		JLabel lblid_1 = new JLabel("\u5B66\u751Fid");
		lblid_1.setBounds(118, 76, 54, 19);
		contentPane.add(lblid_1);

		textField_1 = new JTextField();
		textField_1.setBounds(186, 74, 102, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(186, 124, 102, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton button_2 = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sid = textField_1.getText();
				info = textField_2.getText();
				type = comboBox.getSelectedItem() + "";

				if (sid == null || sid.equals("")) {
					JOptionPane.showMessageDialog(textField_1, "请输入学生帐号");
				} else if (info == null || info.equals("")) {
					JOptionPane.showMessageDialog(textField_1, "请输入修改内容");
				} else {
					int i =ad.setStudentInfo(type, info, sid, id);
					if (i == 0) {
						JOptionPane.showMessageDialog(textField_1, "修改失败");
					}else if(i == 2) {
						JOptionPane.showMessageDialog(textField_1, "输入学生id有误");
					}else {
						JOptionPane.showMessageDialog(textField_1, "修改成功");
					}
				}
			}
		});
		button_2.setBounds(181, 176, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("\u4FEE\u6539\u5B66\u751F\u4FE1\u606F");
		label.setBounds(167, 13, 107, 23);
		contentPane.add(label);
	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminView ad = new AdminView("");
		ad.setVisible(true);
		this.dispose();
	}
}
