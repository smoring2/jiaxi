# Code Intelligence Report

## Build System
- Maven (pom.xml detected)
- No Gradle build files

## Language Versions
- Java: 1.8 (source property `java.version`)
- Kotlin: not detected

## Jackson Usage
- Files with Jackson imports: 0
- Custom serializers/deserializers: 0

## Spring Security
- SecurityFilterChain methods: 0
- @EnableWebSecurity: 0
- Security dependencies: none

## Testing Infrastructure
- @MockBean usage: 0
- @SpyBean usage: 0
- Testcontainers usage: none
- Test files: 1

## Observability
- Micrometer dependencies: none
- OpenTelemetry dependencies: none
- Actuator dependencies: none

## Reactive / WebFlux
- Reactive files: 0

## Size Metrics
- Modules: 1
- Java files: 3
- Kotlin files: 0
- Estimated LOC: 38

## Build Dependencies
  org.springframework.boot:spring-boot-starter-parent
  org.springframework.boot:spring-boot-starter-thymeleaf
  org.springframework.boot:spring-boot-starter-web
  org.springframework.boot:spring-boot-devtools
  org.springframework.boot:spring-boot-starter-test
  org.springframework.boot:spring-boot-maven-plugin

## Deprecated Boot 3.x APIs
- javax.* imports (non-SE): 0
- WebSecurityConfigurerAdapter: 0
- antMatchers: 0
