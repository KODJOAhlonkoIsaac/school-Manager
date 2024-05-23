package com.app.schoolmanager.models;

import com.app.schoolmanager.DBconfig.IDConfig;
import com.app.schoolmanager.Interface.StudentInterface;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Student extends User implements StudentInterface {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private int state = 0;
    private int classroomId;


    private Connection connection;






    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void create(Student student) throws SQLException {



        connection = IDConfig.getConnection();
        if(connection != null){
            String req = "INSERT INTO student(firstname, lastname, dateOfBirth, placeOfBirth, state, classroomId) VALUES (?,?,?,?,?,?);";


            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            prepareStatement.setString(1, getFirstname());
            prepareStatement.setString(2, getLastname());
            prepareStatement.setDate(3, Date.valueOf(getDateOfBirth()));
            prepareStatement.setString(4, getPlaceOfBirth());
            prepareStatement.setInt(5, getState());
            prepareStatement.setInt(6, getClassroomId());

            prepareStatement.execute();

            prepareStatement.close();

            this.connection.close();

        }
    }

    @Override
    public List<Student> read(int id) {
        return null;
    }

    @Override
    public void uptade(Student student) {

    }

    @Override
    public void delete(Student student) {

    }
}
