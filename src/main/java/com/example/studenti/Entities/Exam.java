package com.example.studenti.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition="TEXT")
    private String NativeText;
    @Column(columnDefinition="TEXT")
    private String ForeignText;
    @Column(columnDefinition="TEXT")
    private String AudioText;

    @Column(columnDefinition="DATE")
    private Date StartTime;
    @Column(columnDefinition="DATE")
    private Date EndTime;

    //da li da stavim byte zato sto nikada nece biti preko 128 poena realno
    //kako reprezentovati byte u bazi
    private Integer points;

    private boolean required;

    private boolean ended;

    public Exam() {
    }

    public Exam(String nativeText, String foreignText, String audioText, Date startTime, Date endTime, Integer points, boolean required, boolean ended) {
        NativeText = nativeText;
        ForeignText = foreignText;
        AudioText = audioText;
        StartTime = startTime;
        EndTime = endTime;
        this.points = points;
        this.required = required;
        this.ended = ended;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNativeText() {
        return NativeText;
    }

    public void setNativeText(String nativeText) {
        NativeText = nativeText;
    }

    public String getForeignText() {
        return ForeignText;
    }

    public void setForeignText(String foreignText) {
        ForeignText = foreignText;
    }

    public String getAudioText() {
        return AudioText;
    }

    public void setAudioText(String audioText) {
        AudioText = audioText;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
}
