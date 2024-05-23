package com.app.schoolmanager.Interface;

import com.app.schoolmanager.models.Classroom;

import java.sql.SQLException;
import java.util.List;

public interface ClassroomInterface {
    List<Classroom> list() throws SQLException;

}
