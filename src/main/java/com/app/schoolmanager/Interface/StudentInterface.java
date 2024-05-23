package com.app.schoolmanager.Interface;

import com.app.schoolmanager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface {
    void create (Student student) throws SQLException;
    List<Student> read(int id);
    void  uptade (Student student);
    void delete (Student student);

}
