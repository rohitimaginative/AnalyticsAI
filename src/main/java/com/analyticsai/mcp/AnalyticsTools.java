package com.analyticsai.mcp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class AnalyticsTools {

    @Tool(description = "Summarize numeric values and return basic statistics")
    public Map<String, Double> summarizeNumbers(List<Double> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("values must contain at least one number");
        }

        double min = values.stream().mapToDouble(Double::doubleValue).min().orElseThrow();
        double max = values.stream().mapToDouble(Double::doubleValue).max().orElseThrow();
        double total = values.stream().mapToDouble(Double::doubleValue).sum();

        Map<String, Double> stats = new LinkedHashMap<>();
        stats.put("count", (double) values.size());
        stats.put("min", min);
        stats.put("max", max);
        stats.put("average", total / values.size());
        stats.put("total", total);
        return stats;
    }
}
