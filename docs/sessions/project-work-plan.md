# Project work plan — sessions

**Written by `dabbler` as a fold of `activity-log.json`.**
Hand edits are overwritten by the next append. The record is the log;
this page is one view of it.

---

## Sessions

The numbered sessions are declared from `session-plan.md`; each one's task is what its own plan step declared.

| # | Session | Releasable | Declared |
| ---: | --- | --- | --- |
| 1 | Author or import the change plan | no | 2026-11-10 |
| 2 | Break the change plan into numbered sessions | no | 2026-11-10 |
| 3 | The calculator page | no | 2026-11-10 |
| 4 | Documentation comments on the calculator | — | not declared |

### Session 1 — Author or import the change plan

**Releasable: no.**

Session 1 writes docs/planning/solution-plan.md from docs/planning/brief.md and nothing else: one paragraph on the repository as found -- a Spring Boot 4.1 application at Java 17 built by its Maven wrapper (a Gradle build beside it, left as it is), a package per feature, Thymeleaf templates laid out by fragments/layout.html, every visible string a message key kept in messages.properties and every translated messages_*.properties as I18nPropertiesSyncTest enforces, and JUnit Jupiter tests named *Tests.java with @WebMvcTest -- and one section per change: the calculator page (a calculator package with Calculator and CalculatorController at /calculator, calculators/calculator.html, a menu item, six message keys in every messages file, and CalculatorControllerTests), and the documentation comments on what it added, with nothing else changed.

### Session 2 — Break the change plan into numbered sessions

**Releasable: no.**

Session 2 appends two numbered sessions to docs/sessions/session-plan.md from docs/planning/solution-plan.md and writes nothing else: Session 3, the calculator page -- Calculator and CalculatorController in a new calculator package, calculators/calculator.html in the existing layout, a menu item, six message keys in messages.properties and every translated file, and CalculatorControllerTests with @WebMvcTest, run by the wrapper's test -- and Session 4, Javadoc on what session 3 added and an HTML comment atop its template, with no code, markup or build file changed. No release session is planned, because the brief names none.

### Session 3 — The calculator page

**Releasable: no.**

Session 3 adds an online calculator page to the Spring Boot petclinic inside its existing shape: a new package org.springframework.samples.petclinic.calculator with Calculator.java (add and subtract over BigDecimal) and CalculatorController.java mapped to /calculator (GET shows the form, POST adds sum and difference to the model, both returning calculators/calculator), the template src/main/resources/templates/calculators/calculator.html in the existing layout with every string a message key, a Calculator menu item in fragments/layout.html, the six keys calculator, firstNumber, secondNumber, calculate, sum and difference in messages.properties and every translated messages_*.properties except messages_en.properties, and CalculatorControllerTests as a @WebMvcTest. Each step is shown by the Maven wrapper; the last runs CalculatorControllerTests and the repository's own I18nPropertiesSyncTest.
