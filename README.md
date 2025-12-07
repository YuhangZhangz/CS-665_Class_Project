
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Yuhang Zhang               |
| Date         | 12/7/2025                  |
| Course       | Fall                       |
| Assignment # | final                      |

# Assignment Overview
This project demonstrates the Builder design pattern by constructing a structured DailyFitnessPlan, which conceptually represents a common type of day-planning scenario involving two independent components:
(1) a workout schedule and
(2) a nutrition schedule.

The focus of the project is software design abstraction, not domain expertise.
The fitness domain is used purely as a concrete example because it conveniently contains:

a complex product composed of multiple sub-objects,

step-by-step construction requirements,

and multiple variations that follow the same construction process but result in different final outputs.

This makes the domain an ideal fit to demonstrate the intent of the Builder pattern.

# GitHub Repository Link:
https://github.com/YuhangZhangz/CS-665_Class_Project 

# Implementation Description 


For each assignment, please answer the following:

- This implementation offers high flexibility because the building process is abstracted within the `DailyPlanBuilder` interface, and different concrete Builders (muscle gain, fat loss, beginner) only need to implement their respective details. If new plan types are needed in the future, such as a powerlifting plan or a recovery day plan, simply adding a new Builder class will suffice, without modifying the Director or existing code; the system structure can be extended naturally.
- The entire design is structured according to the single responsibility principle, with each class responsible for only one specific function: the Product class stores data, the Builder is responsible for assembling the structure, and the Director controls the steps. Class and method names are intuitive and easy to understand, making the construction process "read like natural language." This clear structure makes the code easy to read, understand, and maintain, even for beginners.
- This implementation avoids code duplication through a unified build process. All planned creation steps are uniformly executed by the Director calling the Builder interface.  The specific Builder is only responsible for the differing parts, avoiding repetition of the overall process logic. This not only reduces redundancy but also means that future modifications to the build process (such as adding default fields) only require changes in one place, significantly reducing maintenance costs and the probability of errors.
- This project utilizes the Builder design pattern because it is ideally suited for constructing complex objects composed of multiple parts and having multiple versions (in this case, daily fitness and diet plans). This pattern separates the "construction steps" from the "different results of the construction," allowing the same process to generate different types of plans while maintaining a stable and maintainable structure. Choosing the Builder pattern clearly demonstrates abstraction, extensibility, and software design principles, which aligns perfectly with the course objectives.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




