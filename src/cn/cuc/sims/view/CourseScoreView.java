package cn.cuc.sims.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.cuc.sims.service.TeacherAction;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseScoreView extends JFrame {

	private JPanel contentPane;
	TeacherAction teacher;
	String id;
	String cno;
	private final JButton button = new JButton("\u4FEE\u6539\u6210\u7EE9");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseScoreView frame = new CourseScoreView("", "");
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
	public CourseScoreView(String id, String cno) {
		this.id = id;
		this.cno = cno;
		teacher = new TeacherAction();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		button.setBounds(107, 177, 207, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeditScoreView cs = new TeditScoreView(id, cno);
				cs.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u5220\u9664\u6210\u7EE9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TdeleteScoreView cs = new TdeleteScoreView(id, cno);
				cs.setVisible(true);
			}
		});
		button_1.setBounds(107, 213, 207, 27);
		contentPane.add(button_1);
		
		JLabel l;
		int i = 0;
		for(String s: teacher.searchGrade(cno)) {
			l = new JLabel(s);
			l.setBounds(130, 15+i*30, 250, 18);
			l.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
			contentPane.add(l);
			i++;
		}
	}

}
