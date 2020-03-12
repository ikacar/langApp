package com.example.studenti.viewObjects;

import java.math.BigDecimal;
import java.util.List;

public class ExamResultsVO {

    private Integer examId;
    private Integer mark;
    private boolean done;
    private List<ResultsInfoVO> resultsInfoVOS;

    public ExamResultsVO() {
    }

    public ExamResultsVO(Integer examId, Integer mark, boolean done, List<ResultsInfoVO> resultsInfoVOS) {
        this.examId = examId;
        this.mark = mark;
        this.done = done;
        this.resultsInfoVOS = resultsInfoVOS;
    }



    public List<ResultsInfoVO> getResultsInfoVOS() {
        return resultsInfoVOS;
    }

    public void setResultsInfoVOS(List<ResultsInfoVO> resultsInfoVOS) {
        this.resultsInfoVOS = resultsInfoVOS;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
