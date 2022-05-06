package com.parasmani_start.StoredProcedure.bean;

public class SumInput {
    Integer A;
    Integer B;

    public SumInput(Integer A,Integer B)
    {
        this.A = A;
        this.B = B;
    }

    public SumInput() {
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    @Override
    public String toString() {
        return "SumInput{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
