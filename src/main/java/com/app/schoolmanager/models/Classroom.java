package com.app.schoolmanager.models;

import com.app.schoolmanager.Interface.ClassroomInterface;

import java.sql.SQLException;
import java.util.List;

public class Classroom implements ClassroomInterface {
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Classroom> list() throws SQLException {
        return null;
    }
}
