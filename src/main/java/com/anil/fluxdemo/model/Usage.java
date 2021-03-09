package com.anil.fluxdemo.model;


public class Usage {

    private String recommendations;


    public Usage() {
    }

    public Usage(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }
}
