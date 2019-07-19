package cn.cuc.sims.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import cn.cuc.sims.service.UserAction;

public class LoginView extends JFrame {

	/** Creates new form LoginFrame */
	public LoginView() {
		initComponents();
	}

	String id;
	String PWD;
	String type;

	@SuppressWarnings("unchecked")
	private void initComponents() {
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JPasswordField();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));

		jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));

		jLabel2.setText("\u7528\u6237\u5E10\u53F7");
		jLabel2.setBounds(70, 103, 70, 30);
		jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setText("\u5BC6\u7801");
		jLabel3.setBounds(80, 157, 36, 15);
		jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField2.setBounds(140, 149, 140, 30);
		jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField1.setBounds(140, 103, 140, 30);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setText("\u767B\u5F55");
		jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(120, 215, 70, 23);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setText("取消");
		jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(210, 215, 80, 21);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "学生", "教师", "管理员" }));
		jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});
		jComboBox1.setBounds(294, 103, 80, 26);
		jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE));

		JLabel label = new JLabel("\u6559\u52A1\u7BA1\u7406\u7CFB\u7EDF");
		label.setBounds(164, 38, 114, 30);
		jLayeredPane1.add(label);

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		id = jTextField1.getText();
		PWD = jTextField2.getText();
		type = jComboBox1.getSelectedItem() + "";

		if (id == null || id.equals("")) {
			JOptionPane.showMessageDialog(jTextField1, "请输入帐号");
		} else if (PWD == null || PWD.equals("")) {
			JOptionPane.showMessageDialog(jTextField1, "请输入密码");
		} else {
			UserAction ua = new UserAction();
			if (ua.login(type, id, PWD) == 0) {
				if (type.equals("学生")) {
					StudentView st = new StudentView(id);
					st.setVisible(true);
					this.dispose();
				} else if (type.equals("教师")) {
					TeacherView tc = new TeacherView(id);
					tc.setVisible(true);
					this.dispose();
				} else if (type.equals("管理员")) {
					AdminView ad = new AdminView(id);
					ad.setVisible(true);
					this.dispose();
				}
			} else if (ua.login(type, id, PWD) == 1) {
				JOptionPane.showMessageDialog(jTextField1, "账号错误");
			} else if (ua.login(type, id, PWD) == 2) {
				JOptionPane.showMessageDialog(jTextField1, "帐号与用户类型不匹配");
			} else if (ua.login(type, id, PWD) == 3) {
				JOptionPane.showMessageDialog(jTextField1, "密码错误");
			}
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				LoginView fr = new LoginView();
				fr.setResizable(false);
				fr.setVisible(true);
				fr.setTitle("教务管理系统");
				fr.setBounds(400, 200, 428, 295);
			}
		});
	}

	// Variables declaration - do not modify
	public javax.swing.JButton jButton1;
	public javax.swing.JButton jButton2;
	public javax.swing.JComboBox jComboBox1;
	public javax.swing.JLabel jLabel2;
	public javax.swing.JLabel jLabel3;
	public javax.swing.JLayeredPane jLayeredPane1;
	public javax.swing.JTextField jTextField1;
	public javax.swing.JTextField jTextField2;

}
