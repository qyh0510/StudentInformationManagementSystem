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

public class StuInfoView extends JFrame implements ActionListener {

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
					StuInfoView frame = new StuInfoView("");
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
	public StuInfoView(String id) {
		student = new StudentAction();
		this.id = id;
		
		setTitle("\u5B66\u751F\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u5B66\u751F\u4FE1\u606F");
		label.setBounds(186, 10, 60, 32);
		contentPane.add(label);

		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_1ActionPerformed(evt);
			}
		});
		button_1.setBounds(186, 205, 68, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		label_1.setBounds(136, 55, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(136, 86, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setBounds(136, 117, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u5E74\u9F84");
		label_4.setBounds(136, 148, 72, 18);
		contentPane.add(label_4);
		
		JLabel lblNewLabel = new JLabel(student.searchSno(id));
		lblNewLabel.setBounds(196, 55, 127, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(student.searchName(id));
		lblNewLabel_1.setBounds(196, 86, 127, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(student.searchSex(id));
		lblNewLabel_2.setBounds(196, 117, 127, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(student.searchAge(id));
		lblNewLabel_3.setBounds(196, 148, 127, 18);
		contentPane.add(lblNewLabel_3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根

	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		StudentView st = new StudentView(id);
		st.setVisible(true);
		this.dispose();
	}
}
