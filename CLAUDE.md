# Claude Code Instructions

This file provides context and coding standards for Claude when reviewing PRs
or assisting with code in this repository.

## Project Overview
- **Language**: Java 17
- **Build Tool**: Maven
- **Framework**: Spring Boot (if applicable)
- **Testing**: JUnit 5 + Mockito

## Coding Standards

### Java Style
- Follow Google Java Style Guide
- Max line length: 120 characters
- Use `final` for method parameters and local variables where possible
- Prefer `var` for obvious local variable types (Java 10+)
- All public methods must have Javadoc comments

### Naming Conventions
- Classes: `PascalCase`
- Methods/Variables: `camelCase`
- Constants: `UPPER_SNAKE_CASE`
- Packages: `lowercase`

### Error Handling
- Never swallow exceptions silently
- Always use specific exception types, not raw `Exception`
- Use try-with-resources for all `Closeable` resources
- Log errors with context before re-throwing

### Architecture Rules
- Follow SOLID principles strictly
- Max class size: 300 lines
- Max method size: 30 lines
- No static mutable state
- Prefer constructor injection over field injection

### Security Rules
- Never log sensitive data (passwords, tokens, PII)
- Always validate and sanitize user input
- Use parameterized queries — no string concatenation in SQL
- No hardcoded credentials or secrets

### Testing Requirements
- Minimum 80% code coverage for new code
- All public methods must have unit tests
- Use Mockito for mocking dependencies
- Test naming: `methodName_scenario_expectedResult`

## What Claude Should Flag

### 🔴 Always block (REQUEST_CHANGES)
- Security vulnerabilities
- NullPointerExceptions (unguarded null usage)
- Resource leaks (unclosed streams, connections)
- Hardcoded secrets or credentials
- Missing input validation on public APIs

### 🟡 Should suggest (COMMENT)
- Missing Javadoc on public methods
- Test coverage below 80%
- Methods longer than 30 lines
- Classes with more than one responsibility

### 🟢 Worth praising
- Proper use of Java 17 features (records, sealed classes, pattern matching)
- Clean exception handling
- Well-structured tests with clear naming
- Good use of design patterns
