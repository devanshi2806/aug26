package com.itexps.shoppingcart.mygrade;

public class Grade {

    private String name;
    private int math;
    private int sci;
    private int eng;

    @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", math=" + math + ", sci=" + sci + ", eng=" + eng + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Grade() {
    }

    public Grade(String name, int math, int sci, int eng) {
        this.name = name;
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

    public String getGrade() {
        int total = this.math + this.eng + this.sci;
        int avg = total / 3;
        if (avg < 60) {
            return "fail";
        } else {
            return "pass";
        }
    }

}
