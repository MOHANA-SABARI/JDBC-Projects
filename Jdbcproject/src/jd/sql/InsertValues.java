package jd.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class InsertValues {
	
		public static void main(String args[]) throws Exception{
			
//			String id ="Sabari";String val = "100";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oranium",
					"root", "Moha12Villan13");
//			//type 1
//			PreparedStatement statement = connection.prepareStatement("insert into student value('oranium',"+ " 60)");
//			
//			//type2
//			PreparedStatement statemen = connection.prepareStatement("insert into student value('"+id+"',"+ "'"+val+"')");
//			
//			
			//type 3
			String querys = "insert into stu value(?,?);";
			PreparedStatement third = connection.prepareStatement(querys);
			third.setString(1, "mohan");
			third.setInt(2, 9000);
			
			String que= "select * from stu";
			PreparedStatement thid = connection.prepareStatement(que);

			ResultSet res = thid.executeQuery();
			System.out.println(res.next());
			while (res.next()) { 
                int i = res.getInt("mark");
                String name = res.getString("title");
                System.out.println(i + "\t" + name);
            }
			System.out.println(res.next());
			//System.out.println(cc.getTitle());
			boolean executeobj = thid.execute();	
//			int exe = statemen.executeUpdate();
			int thi = third.executeUpdate();
//			int thd = thid.executeUpdate();
			if(executeobj) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
			}
			if(thi>0)
			{
				System.out.println("Values inserted successfully");
			}
			else {
				System.out.println("Insertion failed");
			}
			
			connection.close();
	}
}



