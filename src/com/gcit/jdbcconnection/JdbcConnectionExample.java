package com.gcit.jdbcconnection;

import java.sql.*;

public class JdbcConnectionExample {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("connection established successfully");

        JdbcConnectionExample jdbcConnectionExample = new JdbcConnectionExample();
        jdbcConnectionExample.insert(con);
        jdbcConnectionExample.update(con);
        jdbcConnectionExample.delete(con);
        jdbcConnectionExample.print(con);
    }

    private void insert(Connection con) throws SQLException {
        int nextEmpId = 0;
        Statement st1 = con.createStatement();
        String nextEmpIdQuery = "select max(employeeid) as nextEmpId from employee";
        ResultSet rs = st1.executeQuery(nextEmpIdQuery);
        rs.next();
        nextEmpId = rs.getInt("nextEmpId");
        System.out.println(nextEmpId);
        st1.close();

        Statement st2 = con.createStatement();
        String insert = "insert into employee values(" + (nextEmpId + 1) + ", 'sri' , 'chennai' , 9000)";
        int count = st2.executeUpdate(insert);
        System.out.println("record inserted : ");
        System.out.println(count);
        st2.close();
    }

    private void update(Connection con) throws SQLException {

        String query = "select * from employee";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String update = "update employee set employeename = 'sam' where employeeid = 1 ";
        int c = st.executeUpdate(update);
        System.out.println("record updated : ");
        System.out.println(c);
        st.close();
    }

    private void delete(Connection con) throws SQLException {
        String query = "select * from employee";
        Statement st = con.createStatement();
        ResultSet rt = st.executeQuery(query);

        String delete = "delete from employee where employeeid = 2";
        int count = st.executeUpdate(delete);
        System.out.println("record deleted : ");
        System.out.println(count);
        st.close();
    }

    private void print(Connection con) throws SQLException {
        Statement st= con.createStatement();
        String query = "select * from employee";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            int id = rs.getInt("employeeid");
            String name = rs.getString("employeename");
            String address = rs.getString("employeeaddress");
            int salary = rs.getInt("employeesalary");
            System.out.println("ID : " +id+ "  NAME : " +name+ "  ADDRESS : " +address+ " SALARY : " +salary);

        }
    }

}
