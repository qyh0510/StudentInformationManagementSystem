package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class TsetCourseView extends JFrame {

	private JPanel contentPane;
	TeacherAction teacher;
	String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TsetCourseView frame = new TsetCourseView("");
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
	public TsetCourseView(String id) {
		teacher = new TeacherAction();
		this.id = id;
		
		setTitle("\u8BBE\u7F6E\u8BFE\u7A0B");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u8BBE\u7F6E\u8BFE\u7A0B");
		label.setBounds(182, 13, 63, 23);
		contentPane.add(label);

		JButton button = new JButton("\u8FD4\u56DE");
		button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonActionPerformed(evt);
			}
		});
		button.setBounds(348, 13, 70, 23);
		contentPane.add(button);
		
		JLabel l;
		JButton[] b1 = new JButton[16];
		String[] str = new String[8];
		int i = 0 , j = 0;
		for(String s: teacher.searchCourse()) {
			str[i] = s;
			l = new JLabel(s);
			l.setBounds(50, 55+i*25, 250, 18);
			l.setFont(new Font("宋体", Font.PLAIN, 13));
			contentPane.add(l);
			
			b1[j] = new JButton("添加");
			b1[j].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
			b1[j].setBounds(280, 55+i*25, 50, 20);
			contentPane.add(b1[j]);
			
			b1[1+j] = new JButton("删除");
			b1[1+j].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
			b1[1+j].setBounds(348, 55+i*25, 50, 20);
			contentPane.add(b1[1+j]);
			j = j + 2;
			i++;
		}
		
		b1[0].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println(str[0].substring(0, 4));
				if(teacher.addCourse(id, str[0].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[1].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[0].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[2].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[1].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[3].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[1].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[4].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[2].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[5].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[2].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[6].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[3].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[7].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[3].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[8].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[4].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[9].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[4].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[10].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[5].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[11].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[5].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[12].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[6].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[13].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[6].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		b1[14].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.addCourse(id, str[7].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "添加成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "该课程已有教师");
				}
			}
		});
		b1[15].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(teacher.deleteCourse(id, str[7].substring(0, 4)) == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
				}
				else {
					JOptionPane.showMessageDialog(null, "您不是该课程的教师");
				}
			}
		});
		
	}

	@SuppressWarnings("unused")
	private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		TeacherView te = new TeacherView(id);
		te.setVisible(true);
		this.dispose();
	}
}
