package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;

import javax.swing.JButton;
import javax.swing.JLabel;

public class AdminClassView extends JFrame {

	private JPanel contentPane;
	TeacherAction teacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminClassView frame = new AdminClassView();
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
	public AdminClassView() {
		teacher = new TeacherAction();
		
		setTitle("\u8BBE\u7F6E\u8BFE\u7A0B\u4FE1\u606F");
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
		button_1.setBounds(352, 10, 66, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\u8BFE\u7A0B\u4FE1\u606F");
		label_1.setBounds(175, 10, 72, 23);
		contentPane.add(label_1);
		
		JLabel l;
		JButton[] b1 = new JButton[8];
		String[] str = new String[8];
		int i = 0;
		for(String s: teacher.searchCourse()) {
			str[i] = s;
			l = new JLabel(s);
			l.setBounds(50, 55+i*25, 250, 18);
			l.setFont(new Font("宋体", Font.PLAIN, 13));
			contentPane.add(l);
			
			b1[i] = new JButton("设置教师");
			b1[i].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
			b1[i].setBounds(280, 55+i*25, 80, 20);
			contentPane.add(b1[i]);
			i++;
		}
		
		b1[0].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[0].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[1].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[1].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[2].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[2].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[3].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[3].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[4].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[4].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[5].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[5].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[6].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[6].substring(0, 4));
				cs.setVisible(true);
			}
		});
		b1[7].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AsetTeacherView cs = new AsetTeacherView(str[7].substring(0, 4));
				cs.setVisible(true);
			}
		});
	}

	@SuppressWarnings("unused")
	private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {
		AdminView ad = new AdminView("");
		ad.setVisible(true);
		this.dispose();
	}

}
