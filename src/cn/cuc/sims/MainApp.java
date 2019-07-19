package cn.cuc.sims;
import java.sql.SQLException;

//import cn.cuc.sims.data.DatabaseCreate;
import cn.cuc.sims.view.LoginView;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		//DatabaseCreate db = new DatabaseCreate();
		LoginView fr = new LoginView();
		fr.setResizable(false);
		fr.setVisible(true);
		fr.setTitle("教务管理系统");
		fr.setBounds(400, 200, 428, 295);
	}

}
