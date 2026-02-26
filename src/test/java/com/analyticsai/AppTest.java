package com.analyticsai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetingReturnsExpectedMessage() {
        App app = new App();
        assertEquals("Hello from AnalyticsAI", app.greeting());
    }
}
