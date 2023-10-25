/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import config.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import models.Semesters;

/**
 *
 * @author Dell
 */
public class SemestersRepository {

    public List<Semesters> select() throws SQLException {

        List<Semesters> list = null;
        //Tạo connection để kết nối vào DBMS
        Connection con = DBContext.getConnection();
        //Tạo đối tượng statement
        Statement stm = con.createStatement();
        //Thực thi lệnh SELECT
        ResultSet rs = stm.executeQuery("select * from [dbo].[Semesters]");
        list = new ArrayList<>();
        while (rs.next()) {
            Semesters semesters = new Semesters();
            semesters.setSemesterID(rs.getString("semesterID"));
            semesters.setSemesterName(rs.getString("semesterName"));
            semesters.setStartDay(rs.getTimestamp("startDay"));
            semesters.setEndDay(rs.getTimestamp("endDay"));
            list.add(semesters);
        }
        con.close();
        return list;
    }

    public Semesters read(String semesterID) throws SQLException {
        Semesters semesters = null;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("select * from Semesters where semesterID = ? ");
        stm.setString(1, semesterID);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            semesters = new Semesters();
            semesters.setSemesterID(rs.getString("semesterID"));
            semesters.setSemesterName(rs.getString("semesterName"));
            semesters.setStartDay(rs.getTimestamp("startDay"));
            semesters.setEndDay(rs.getTimestamp("endDay"));
           
        }
        con.close();
        return semesters;
    }

    public void create(Semesters semesters) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("insert into Semesters values(?, ?, ?, ?)");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(1, semesters.getSemesterID());
        stm.setString(2, semesters.getSemesterName());
        stm.setString(3, sdf.format(semesters.getStartDay()));
        stm.setString(4, sdf.format(semesters.getEndDay()));
        int count = stm.executeUpdate();
        con.close();
    }

    public void update(Semesters semesters) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("update Semesters set semesterName = ?, startDay = ?, endDay = ? where semesterID = ?");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        stm.setString(1, semesters.getSemesterName());
        stm.setString(2, sdf.format(semesters.getStartDay()));
        stm.setString(3, sdf.format(semesters.getEndDay()));
        stm.setString(4, semesters.getSemesterID());
        int count = stm.executeUpdate();
        con.close();
    }

    public void delete(String semesterID) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("delete from Semesters where semesterID = ? ");
        stm.setString(1, semesterID);
        int count = stm.executeUpdate();
        con.close();
    }

}
