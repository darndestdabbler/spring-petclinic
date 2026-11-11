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
| 2 | Break the change plan into numbered sessions | — | not declared |

### Session 1 — Author or import the change plan

**Releasable: no.**

Session 1 writes docs/planning/solution-plan.md from docs/planning/brief.md and nothing else: one paragraph on the repository as found -- a Spring Boot 4.1 application at Java 17 built by its Maven wrapper (a Gradle build beside it, left as it is), a package per feature, Thymeleaf templates laid out by fragments/layout.html, every visible string a message key kept in messages.properties and every translated messages_*.properties as I18nPropertiesSyncTest enforces, and JUnit Jupiter tests named *Tests.java with @WebMvcTest -- and one section per change: the calculator page (a calculator package with Calculator and CalculatorController at /calculator, calculators/calculator.html, a menu item, six message keys in every messages file, and CalculatorControllerTests), and the documentation comments on what it added, with nothing else changed.
