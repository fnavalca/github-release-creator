# GitHub Release Creator

Learning purpose project. It is a simple application that is in charge to create a new release in GitHub for every 
commit pushed to `master` branch.

## Purposes

I want to learn more about:

- Java 8: I am used to Java 7 and I want to improve my knowledge of the new features of Java 8 (Lambda expressions, 
streams...)
- TDD: I have heard a lot about it but I have never used in a real project (only in trainings).
- Gradle: I am used to Maven and I want to try an alternative to it.
- AWS (CodeBuild, CodePipeline and Lambda): in my current job, we use all of these tools but I have never started
 a project with this technology from scratch.
- Git and GitHub: create a project from scratch, use Pull Request, best practices...
- IntelliJ IDEA: why not? I am used to use in my work but I want to know more about it.
 
## Initial setup

I have chosen Gradle as a build automation tool. The version chosen was 5.2.1 because was installed directly from IntelliJ IDEA (Build #IC-193.5233.102).
After having set up the project, I have some files related with Gradle:

- build.gradle: file with all project's configuration.
- gradlew: binary file to manage the Gradle installation and execution.
- gradlew.bat: similar to gradlew but for Windows.
- setting.gradle: contains configuration for multi-project build [more info](https://www.baeldung.com/gradle-build-settings-properties)

In order to install it, you should execute:

- UNIX systems:
```bash
./gradlew
```
or Windows systems:
```bash
gradlew.bat
```

Check that the installation was successful executing:

```bash
./gradlew --version
```
or
```bash
gradlew.bat --version
```