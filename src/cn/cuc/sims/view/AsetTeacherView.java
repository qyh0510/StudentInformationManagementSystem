package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.AdminAction;

public class AsetTeacherView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	AdminAction admin;
	String cno;
	String jno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsetTeacherView frame = new AsetTeacherView("");
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
	public AsetTeacherView(String cno) {
		this.cno = cno;
		admin = new AdminAction();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u8BBE\u7F6E\u8BFE\u7A0B\u6559\u5E08");
		label.setBounds(155, 14, 93, 21);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\u6559\u5DE5\u53F7");
		label_1.setBounds(103, 75, 54, 21);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(171, 74, 108, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton button = new JButton("\u8BBE\u4E3A\u6559\u5E08");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jno = textField_1.getText();

				if (jno == null || jno.equals("")) {
					JOptionPane.showMessageDialog(textField_1, "请输入教工号");
				}
				else {
					if(admin.setTeacher(cno, jno) == 0) {
						JOptionPane.showMessageDialog(textField_1, "教工号错误");
					}
					else {
						JOptionPane.showMessageDialog(textField_1, "设置成功");
					}
				}
			}
		});
		button.setBounds(155, 138, 99, 23);
		contentPane.add(button);
	}

}
