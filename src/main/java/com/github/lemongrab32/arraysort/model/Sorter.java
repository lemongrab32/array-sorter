package com.github.lemongrab32.arraysort.model;

import java.util.Arrays;

public class Sorter {

    private String nums;
    private boolean correct = true;

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean getCorrect() {
        return this.correct;
    }

    public String getNums() {
        return nums;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public int[] sort() {
        String[] temp = this.nums.replace(" ", "").split(",");
        int[] res = new int[temp.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(temp[i]);
        }

        return Arrays.stream(res).sorted().toArray();
    }

}
