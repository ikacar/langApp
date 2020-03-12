package com.example.studenti.viewObjects;

import java.math.BigDecimal;

public class ResultsInfoVO {
    private Integer id;
    private Integer studentId;
    private String name;
    private String surname;
    private BigDecimal result;
    private boolean done;

    public ResultsInfoVO() {
    }

    public ResultsInfoVO(Integer id, Integer studentId, String name, String surname, BigDecimal result, boolean done) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.result = result;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
