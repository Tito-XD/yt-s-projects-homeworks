import java.sql.*;

public class sql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            String url = "jdbc:mysql://127.0.0.1:3306/java_test";
            String username = "root";
            String password = "tito";
            con = DriverManager.getConnection(url, username, password);
            System.out.println("已连接数据库");

            String sql="select * from user";
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery(sql);

            while(rs.next()){
                String name=rs.getString("username");
                int age=rs.getInt("age");
                System.out.println("字段："+name+","+age);
                name=rs.getString(2);
                age=rs.getInt(3);
                System.out.println("索引到："+name+","+age);
            }
        } catch (Exception e) {
            System.out.println("连接失败" + e.toString());
        }
    }
}
