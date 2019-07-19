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

import cn.cuc.sims.service.TeacherAction;

public class TdeleteScoreView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String id;
	String cno;
	String sno;
	String grade;
	TeacherAction teacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TdeleteScoreView frame = new TdeleteScoreView("", "");
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
	public TdeleteScoreView(String id, String cno) {
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

		JLabel label_1 = new JLabel("\u5220\u9664\u6210\u7EE9");
		label_1.setBounds(174, 27, 66, 15);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u5B66\u53F7");
		label_2.setBounds(107, 67, 45, 19);
		contentPane.add(label_2);

		textField = new JTextField();
		textField.setBounds(160, 67, 109, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton button = new JButton("\u786E\u8BA4\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sno = textField.getText();;
				int i = teacher.deleteGrade(id, cno, sno);
				if(i == 0) {
					JOptionPane.showMessageDialog(textField, "输入学号有误");
				}else if(i == 1) {
					JOptionPane.showMessageDialog(textField, "删除成功");
				}else {
					JOptionPane.showMessageDialog(textField, "该生无该课程成绩，删除失败");
				}
				
			}
		});
		button.setBounds(160, 116, 93, 23);
		contentPane.add(button);
	}

}
