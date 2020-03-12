package com.example.studenti.viewObjects;

import java.math.BigDecimal;

public class StudentResultsInfoVO {
    private Integer examId;
    private boolean done;
    private BigDecimal result;

    public StudentResultsInfoVO() {
    }

    public StudentResultsInfoVO(Integer examId, boolean done, BigDecimal result) {
        this.examId = examId;
        this.done = done;
        this.result = result;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }
}
