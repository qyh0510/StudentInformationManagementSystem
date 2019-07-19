package cn.cuc.sims.data;

import java.sql.*;

public class DatabaseCreate {
	DatabaseConnection db;
	public DatabaseCreate() throws SQLException {
		db = new DatabaseConnection();
		Connection connect = db.connectDB();
		Statement stmt = connect.createStatement();
		
		//创建表
        stmt.executeUpdate("create table user(id char(20)  primary key ,password char (20) not null,name char(10) ,sex char(4) ,age int ,constraint ck_sex check(sex='男' or sex='女'),constraint ck_age check (age between 0 and 150) )");
        stmt.executeUpdate("create table student(id char(20) not null,sno char(20) primary key,credit int,foreign key(id) references user(id))");
        stmt.executeUpdate("create table teacher(id char(20),jno char(20) primary key,foreign key(id) references user(id))");
        stmt.executeUpdate("create table admin(id char(20),jno char(20) primary key )");
        stmt.executeUpdate("create table course(cno char(20) primary key,jno char(20),cname char(10),credit int,foreign key(jno) references teacher(jno))");
        stmt.executeUpdate("create table SC(sno char(20) ,cno char(20),grade int,primary key(sno,cno),foreign key(cno) references course(cno))");
       
        //添加数据
        stmt.executeUpdate("insert into user values('1001','aaadcs','Tom','男',20)");
        stmt.executeUpdate("insert into user values('1002','adsdxs','Amy','女',22)");
        stmt.executeUpdate("insert into user values('1003','adcers','Tosfm','男',20)");
        stmt.executeUpdate("insert into user values('1004','wdadcs','Lucy','女',20)");
        stmt.executeUpdate("insert into user values('1005','fjfjjf','Ben','男',18)");
        stmt.executeUpdate("insert into user values('1006','fjhfww','Daily','女',17)");
        stmt.executeUpdate("insert into user values('1007','aadaaa','Jeck','男',16)");
        stmt.executeUpdate("insert into user values('1008','bbdbbb','Mary','女',15)");
        stmt.executeUpdate("insert into user values('1009','cccccc','Henry','男',24)");
        stmt.executeUpdate("insert into user values('10010','dddddd','Deny','女',18)");
        stmt.executeUpdate("insert into user values('10011','ryvsrw','Chen','女',20)");
        stmt.executeUpdate("insert into user values('10012','etegvd','Huang','男',21)");
        stmt.executeUpdate("insert into user values('10013','tssees','Li','女',18)");
        stmt.executeUpdate("insert into user values('10014','rggrgw','Aaron','女',18)");
        stmt.executeUpdate("insert into user values('10015','qqqqqq','Abbott','女',19)");
        stmt.executeUpdate("insert into user values('10016','rsffrw','Adfrg','女',20)");
        stmt.executeUpdate("insert into user values('10017','eeehee','Abner','男',20)");
        stmt.executeUpdate("insert into user values('10018','rfwetw','Adam','女',22)");
        stmt.executeUpdate("insert into user values('10019','ettgee','Addison','男',21)");
        stmt.executeUpdate("insert into user values('10020','yyywyy','Adolph','女',18)");
        stmt.executeUpdate("insert into user values('10021','uufuuu','Ahern','男',19)");
        stmt.executeUpdate("insert into user values('10022','uuuwuu','Aubrey','女',22)");
        stmt.executeUpdate("insert into user values('10023','geytss','Avery','男',21)");
        stmt.executeUpdate("insert into user values('10024','hfjrew','Avery','女',18)");
        stmt.executeUpdate("insert into user values('10025','gtyath','Adam','男',22)");
        stmt.executeUpdate("insert into user values('10026','gryeyz','Baldwim','女',18)");
        stmt.executeUpdate("insert into user values('10027','gthrte','Bard','男',18)");
        stmt.executeUpdate("insert into user values('10028','thrtae','Barlow','女',19)");
        stmt.executeUpdate("insert into user values('10029','etysa4','Bart','男',20)");
        stmt.executeUpdate("insert into user values('10030','tyeare','Carey','女',21)");
        stmt.executeUpdate("insert into user values('10031','gjhhhh','Chad','男',26)");
        stmt.executeUpdate("insert into user values('10032','gtwwry','Cedric','男',30)");
        stmt.executeUpdate("insert into user values('10033','gthwqf','Carr','女',32)");
        stmt.executeUpdate("insert into user values('10034','ecdgwa','Chapman','男',40)");
        stmt.executeUpdate("insert into user values('10035','dfwwwj','Dana','女',28)");
        stmt.executeUpdate("insert into user values('10036','rgeyhw','Eli','女',27)");
        stmt.executeUpdate("insert into user values('10037','vfggwf','Egnert','男',30)");
        
        stmt.executeUpdate("insert into student values('1001','20171001', 20)");
        stmt.executeUpdate("insert into student values('1002','20171002', 22)");
        stmt.executeUpdate("insert into student values('1003','20171003', 17)");
        stmt.executeUpdate("insert into student values('1004','20171004', 23)");
        stmt.executeUpdate("insert into student values('1005','20171005', 26)");
        stmt.executeUpdate("insert into student values('1006','20171006', 18)");
        stmt.executeUpdate("insert into student values('1007','20171007', 19)");
        stmt.executeUpdate("insert into student values('1008','20171008', 20)");
        stmt.executeUpdate("insert into student values('1009','20171009', 21)");
        stmt.executeUpdate("insert into student values('10010','201710010', 23)");
        stmt.executeUpdate("insert into student values('10011','201710011', 22)");
        stmt.executeUpdate("insert into student values('10012','201710012', 20)");
        stmt.executeUpdate("insert into student values('10013','201710013', 23)");
        stmt.executeUpdate("insert into student values('10014','201710014', 26)");
        stmt.executeUpdate("insert into student values('10015','201710015', 19)");
        stmt.executeUpdate("insert into student values('10016','201710016', 27)");
        stmt.executeUpdate("insert into student values('10017','201710017', 25)");
        stmt.executeUpdate("insert into student values('10018','201710018', 23)");
        stmt.executeUpdate("insert into student values('10019','201710019', 22)");
        stmt.executeUpdate("insert into student values('10020','201710020', 24)");
        stmt.executeUpdate("insert into student values('10021','201710021', 23)");
        stmt.executeUpdate("insert into student values('10022','201710022', 20)");
        stmt.executeUpdate("insert into student values('10023','201710023', 23)");
        stmt.executeUpdate("insert into student values('10024','201710024', 26)");
        stmt.executeUpdate("insert into student values('10025','201710025', 26)");
        stmt.executeUpdate("insert into student values('10026','201710026', 23)");
        stmt.executeUpdate("insert into student values('10027','201710027', 27)");
        stmt.executeUpdate("insert into student values('10028','201710028', 30)");
        stmt.executeUpdate("insert into student values('10029','201710029', 28)");
        stmt.executeUpdate("insert into student values('10030','201710030', 29)");
       
        stmt.executeUpdate("insert into teacher values('10031', '001')");
        stmt.executeUpdate("insert into teacher values('10032', '002')");
        stmt.executeUpdate("insert into teacher values('10033', '003')");
        stmt.executeUpdate("insert into teacher values('10034', '004')");
        stmt.executeUpdate("insert into teacher values('10035', '005')");
        stmt.executeUpdate("insert into teacher values('10036', '006')");
        stmt.executeUpdate("insert into teacher values('10037', '007')");
        
        stmt.executeUpdate("insert into course values('0001','001','高等数学',4)");
        stmt.executeUpdate("insert into course values('0002','002','线性代数',4)");
        stmt.executeUpdate("insert into course values('0003',null,'计算机组成',4)");
        stmt.executeUpdate("insert into course values('0004','003','大学英语',3)");
        stmt.executeUpdate("insert into course values('0005','001','计算机网络',4)");
        stmt.executeUpdate("insert into course values('0006','004','python程序设计',2)");
        stmt.executeUpdate("insert into course values('0007','004','高等数学',4)");
        stmt.executeUpdate("insert into course values('0008','004','计算机网络',4)");
       
        stmt.executeUpdate("insert into SC values('20171001','0001',90)");
        stmt.executeUpdate("insert into SC values('20171001','0002',88)");
        stmt.executeUpdate("insert into SC values('20171001','0003',null)");
        stmt.executeUpdate("insert into SC values('20171002','0001',90)");
        stmt.executeUpdate("insert into SC values('20171002','0004',90)");
        stmt.executeUpdate("insert into SC values('20171002','0006',90)");
        stmt.executeUpdate("insert into SC values('20171003','0008',60)");
        stmt.executeUpdate("insert into SC values('20171003','0003',80)");
        stmt.executeUpdate("insert into SC values('20171004','0001',75)");
        stmt.executeUpdate("insert into SC values('20171004','0005',76)");
        
		stmt.executeUpdate("insert into admin values('10036','006')");
        stmt.executeUpdate("insert into admin values('10037','007')");
	}
}
