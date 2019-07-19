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

public class AsearchCourseView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	TeacherAction teacher;
	String id;
	String cno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsearchCourseView frame = new AsearchCourseView("");
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
	public AsearchCourseView(String id) {
		this.id = id;
		teacher = new TeacherAction();
		
		setTitle("\u67E5\u8BE2\u5B66\u751F\u6210\u7EE9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u67E5\u8BE2\u8BFE\u7A0B\u6210\u7EE9");
		label.setBounds(155, 14, 93, 21);
		contentPane.add(label);

		JLabel label_1 = new JLabel("\u8BFE\u7A0B\u53F7");
		label_1.setBounds(101, 54, 54, 21);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(155, 53, 108, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cno = textField_1.getText();

				if (cno == null || cno.equals("")) {
					JOptionPane.showMessageDialog(textField_1, "«Î ‰»ÎøŒ≥Ã∫≈");
				}
				else {
					if(teacher.searchCourseTeacher(id, cno) == 2) {
						JOptionPane.showMessageDialog(textField_1, "øŒ≥Ã∫≈¥ÌŒÛ");
					}
					else {
						CourseScoreView cs = new CourseScoreView(id, cno);
						cs.setVisible(true);
					}
				}
			}
		});
		button.setBounds(287, 53, 74, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(350, 13, 68, 23);
		contentPane.add(button_1);
	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AdminView te = new AdminView(id);
		te.setVisible(true);
		this.dispose();
	}

}
