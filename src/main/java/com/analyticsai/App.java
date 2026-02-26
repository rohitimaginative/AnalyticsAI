package com.analyticsai;

public class App {
    public String greeting() {
        return "Hello from AnalyticsAI";
    }

    public static void main(String[] args) {
        System.out.println(new App().greeting());
    }
}
