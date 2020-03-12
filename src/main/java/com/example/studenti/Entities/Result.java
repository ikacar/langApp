package com.example.studenti.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Integer studentId;
    private Integer examId;

    @Column(columnDefinition="TEXT")
    private String nativeTranslate;
    @Column(columnDefinition="TEXT")
    private String foreignTranslate;
    @Column(columnDefinition="TEXT")
    private String audioTranslate;
    @Column(nullable = true)
    private Integer result;
    private boolean done;

    public Result() {
    }

    public Result(Integer studentId, Integer examId, String nativeTranslate, String foreignTranslate, String audioTranslate, Integer result,boolean done) {
        this.studentId = studentId;
        this.examId = examId;
        this.nativeTranslate = nativeTranslate;
        this.foreignTranslate = foreignTranslate;
        this.audioTranslate = audioTranslate;
        this.result = result;
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
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

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getNativeTranslate() {
        return nativeTranslate;
    }

    public void setNativeTranslate(String nativeTranslate) {
        this.nativeTranslate = nativeTranslate;
    }

    public String getForeignTranslate() {
        return foreignTranslate;
    }

    public void setForeignTranslate(String foreignTranslate) {
        this.foreignTranslate = foreignTranslate;
    }

    public String getAudioTranslate() {
        return audioTranslate;
    }

    public void setAudioTranslate(String audioTranslate) {
        this.audioTranslate = audioTranslate;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
