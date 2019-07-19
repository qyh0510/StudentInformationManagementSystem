package cn.cuc.sims.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeditScoreView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String id;
	String cno;
	String sno;
	String grade;
	private JTextField textField_1;
	TeacherAction teacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeditScoreView frame = new TeditScoreView("", "");
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
	public TeditScoreView(String id, String cno) {
		this.id = id;
		this.cno = cno;
		teacher = new TeacherAction();

		setTitle("\u4FEE\u6539\u5BC6\u7801");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\u66F4\u65B0\u6210\u7EE9");
		label_1.setBounds(174, 27, 66, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u5B66\u53F7");
		label_2.setBounds(107, 67, 45, 19);
		contentPane.add(label_2);

		textField = new JTextField();
		textField.setBounds(160, 67, 109, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sno = textField.getText();
				grade = textField_1.getText();
				int i = teacher.editGrade(id, cno, sno, grade);
				if(i == 0) {
					JOptionPane.showMessageDialog(textField_1, "输入学号有误");
				}else if(i == 2) {
					JOptionPane.showMessageDialog(textField_1, "您输入的成绩不在合法范围内");
				}else {
					JOptionPane.showMessageDialog(textField_1, "修改成功");
				}
				
			}
		});
		button.setBounds(162, 154, 93, 23);
		contentPane.add(button);
		
		JLabel label_3 = new JLabel("\u65B0\u6210\u7EE9");
		label_3.setBounds(107, 102, 45, 19);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 101, 109, 21);
		contentPane.add(textField_1);
	}

}
