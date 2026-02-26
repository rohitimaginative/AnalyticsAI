package com.analyticsai.mcp;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnalyticsToolsTest {

    private final AnalyticsTools analyticsTools = new AnalyticsTools();

    @Test
    void summarizeNumbersReturnsExpectedStats() {
        Map<String, Double> result = analyticsTools.summarizeNumbers(List.of(1.0, 2.0, 3.0, 4.0));

        assertEquals(4.0, result.get("count"));
        assertEquals(1.0, result.get("min"));
        assertEquals(4.0, result.get("max"));
        assertEquals(2.5, result.get("average"));
        assertEquals(10.0, result.get("total"));
    }

    @Test
    void summarizeNumbersRejectsEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> analyticsTools.summarizeNumbers(List.of()));
    }
}
