package com.example.studenti.viewObjects;

import java.util.List;

public class StudentInfoVO {

    private String name;
    private String surname;
    private String br_indeksa;
    private List<StudentResultsInfoVO> studentResultsInfoVO;

    public StudentInfoVO() {
    }

    public StudentInfoVO(String name, String surname, String br_indeksa, List<StudentResultsInfoVO> studentResultsInfoVO) {
        this.name = name;
        this.surname = surname;
        this.br_indeksa = br_indeksa;
        this.studentResultsInfoVO = studentResultsInfoVO;
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

    public String getBr_indeksa() {
        return br_indeksa;
    }

    public void setBr_indeksa(String br_indeksa) {
        this.br_indeksa = br_indeksa;
    }

    public List<StudentResultsInfoVO> getStudentResultsInfoVO() {
        return studentResultsInfoVO;
    }

    public void setStudentResultsInfoVO(List<StudentResultsInfoVO> studentResultsInfoVO) {
        this.studentResultsInfoVO = studentResultsInfoVO;
    }
}
