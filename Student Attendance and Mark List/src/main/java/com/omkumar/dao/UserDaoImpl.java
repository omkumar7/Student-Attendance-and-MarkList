package com.omkumar.dao;

import com.omkumar.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public int register(Student student) {
    String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { student.getRollno(),student.getName(),student.getPhone(),
    student.getDept(),student.getStatus(),student.getMark1(),student.getMark2(),student.getMark3(),
    student.getMark4(),student.getMark5(), student.getTotal(),student.getGrade()});
  }

  public List<Student> view() {

    String sql = "SELECT * FROM student";

    List<Student> students = jdbcTemplate.query( sql,new UserMapper());

    return students;

  }
  public List<Student> viewgrade(){
    String sql ="select * from student order by total DESC";

    List<Student> students = jdbcTemplate.query(sql,new UserMapper());
    return students;
  }


  public int present(Student student){
    String sql ="update student set status = 'Present'  where rollno ="+ " ' " + student.getRollno() + "'"  ;

    return jdbcTemplate.update(sql);
  }
  public int absent(Student student){
    String sql ="update student set status = 'Absent'  where rollno ="+ " ' " + student.getRollno() + "'" ;

    return jdbcTemplate.update(sql);
  }


  public Student validate(Student student){
    String sql = "select * from student where  rollno='" + student.getRollno()
            + "'";
    List<Student> students = jdbcTemplate.query(sql, new UserMapper());

    return students.size() > 0 ? students.get(0) : null;
  }

  public int addmark(Student student){
    String sql= " update student set mark1 = '" + student.getMark1() + "',mark2= '" +
    student.getMark2()+"',mark3= '"+student.getMark3()+"' ,mark4= '" + student.getMark4()+
    "' , mark5= '"+ student.getMark5()+  "' ,total= '"+ student.getTotal()
            +"' ,grade= '"+student.getGrade()+    "' where rollno='" + student.getRollno()+ "'";

    return jdbcTemplate.update(sql);
  }









}

class UserMapper implements RowMapper<Student> {

  public Student mapRow(ResultSet rs, int arg1) throws SQLException {
    Student student = new Student();

    student.setRollno(rs.getInt("rollno"));
    student.setName(rs.getString("name"));
    student.setPhone(rs.getString("phone"));
    student.setDept(rs.getString("dept"));
    student.setStatus(rs.getString("status"));
    student.setMark1(rs.getInt("mark1"));
    student.setMark2(rs.getInt("mark2"));
    student.setMark3(rs.getInt("mark3"));
    student.setMark4(rs.getInt("mark4"));
    student.setMark5(rs.getInt("mark5"));
    student.setTotal(rs.getInt("total"));
    student.setGrade(rs.getString("grade"));


    return student;
  }
}