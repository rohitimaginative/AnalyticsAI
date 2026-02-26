# AnalyticsAI

Test project to build an analytics project using GenAI.

## Java Maven Setup

This repository includes a Maven-based Java project.

## Java MCP Server Setup (Spring AI)

The repo now includes a **Java-based MCP server** built with Spring Boot + Spring AI MCP server.

- **Tool**: `summarizeNumbers(values: List<Double>)`
- **Resource**: `analytics://project-info`
- **Client config**: `mcp.json`

### Relevant files

- `src/main/java/com/analyticsai/mcp/AnalyticsAiMcpServerApplication.java`
- `src/main/java/com/analyticsai/mcp/AnalyticsTools.java`
- `src/main/java/com/analyticsai/mcp/ProjectInfoResource.java`
- `src/main/resources/application.yml`

## Run

```bash
mvn test
mvn spring-boot:run
```

MCP clients can use `mcp.json` to run the server over stdio.
