# Brief

Two changes to this Spring Boot application, each its own session, inside
the repository's existing shape: one Maven project built by its wrapper at
Java 17 (the Gradle build beside it is left as it is), a package per
feature under `org.springframework.samples.petclinic`, Thymeleaf templates
under src/main/resources/templates laid out by fragments/layout.html, every
visible string a message key present in messages.properties and in every
translated messages_*.properties (the repository's own
I18nPropertiesSyncTest enforces both), and JUnit Jupiter tests named
`*Tests.java` using `@WebMvcTest` and MockMvc.

1. **An online calculator page.** A page that takes two numbers and shows
   their sum and their difference (add and subtract): a new
   `org.springframework.samples.petclinic.calculator` package holding the
   arithmetic and a `CalculatorController` mapped to `/calculator`, a
   Thymeleaf view in the existing layout, a menu item, the message keys in
   every messages file, and `CalculatorControllerTests` in the same style
   as the other controller tests, which the suite's plural `*Tests.java`
   glob selects.
2. **Documentation comments.** Javadoc on the classes and public methods
   the calculator change added, and an HTML comment at the top of its
   template. Nothing else changes: no code, no markup, no build file.

Out of scope: any dependency, plugin or Java-level change; the Gradle
build; `PostgresIntegrationTests`, which needs a running Docker daemon
this machine does not have and fails before any change; any other page; a
release.
