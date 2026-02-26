package com.analyticsai.mcp;

import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.spec.McpSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectInfoResource {

    @Bean
    McpServerFeatures.SyncResourceSpecification projectInfoResource() {
        McpSchema.Resource resource = new McpSchema.Resource(
                "analytics://project-info",
                "project-info",
                "Repository context for AnalyticsAI MCP sample",
                "text/plain",
                null
        );

        return new McpServerFeatures.SyncResourceSpecification(
                resource,
                (exchange, request) -> new McpSchema.ReadResourceResult(
                        java.util.List.of(new McpSchema.TextResourceContents(
                                request.uri(),
                                "text/plain",
                                "AnalyticsAI is a Maven + Spring-based sample project exposing MCP tools/resources."
                        ))
                )
        );
    }
}
