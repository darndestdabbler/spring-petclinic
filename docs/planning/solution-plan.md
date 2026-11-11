# Solution plan

## The repository as found

A Spring Boot 4.1 application at Java 17, built by its Maven wrapper, with
a Gradle build beside it that is left as it is. Code is a package per
feature under `org.springframework.samples.petclinic` (owner, vet, system),
controllers return Thymeleaf template names resolved under
src/main/resources/templates, and every page is laid out by
fragments/layout.html, whose `menuItem` fragment draws the navigation.
Every visible string is a message key: `I18nPropertiesSyncTest` fails on a
literal in a template and on a key missing from any translated
messages_*.properties (messages_en.properties is left empty by design).
Tests are JUnit Jupiter classes named `*Tests.java`; controller tests use
`@WebMvcTest` with MockMvc. `dabbler.yaml` declares one `maven` suite over
the wrapper, leaving out `PostgresIntegrationTests`, which needs a running
Docker daemon. All of this is kept: no dependency, plugin, Java-level or
Gradle change.

## Change 1: an online calculator page

**What changes.** A new package `org.springframework.samples.petclinic.calculator`
with `Calculator` (add and subtract two `BigDecimal`s) and
`CalculatorController`, mapped to `/calculator`: GET shows the form, POST
takes `left` and `right` and adds `sum` and `difference` to the model; both
return `calculators/calculator`. The template is
src/main/resources/templates/calculators/calculator.html in the existing
layout, layout.html gains a Calculator menu item, and six keys
(`calculator`, `firstNumber`, `secondNumber`, `calculate`, `sum`,
`difference`) go into messages.properties and each translated file. The
test is `CalculatorControllerTests` in the new package, a `@WebMvcTest`
checking the GET view and the POST model.

**How it is shown to work.** The wrapper's `test` runs
`CalculatorControllerTests` and `I18nPropertiesSyncTest` green; the maven
suite selects the new test by the plural `*Tests.java` glob.

## Change 2: documentation comments

**What changes.** Javadoc on `Calculator`, its methods,
`CalculatorController` and its handler methods, and an HTML comment at the
top of calculator.html. No code, markup or build file changes.

**How it is shown to work.** The wrapper's `test` still passes, and the
diff contains only comment lines.

## Out of scope

Any dependency, plugin, Java-level or Gradle change;
`PostgresIntegrationTests`; any other page; a release.
