# Hello-Java

A sample project to follow when building a program for class.

## Requirements

In order to run or build source code, the following requirements are needed.

- An IDE such as [Visual Studio Code](https://code.visualstudio.com/).
- Java Development Kit (JDK) such as [OpenJDK](https://adoptopenjdk.net/).
- Build Tool such as [Gradle](https://gradle.org/install).

## Run the source code

```bash
% ./gradlew run
Starting a Gradle Daemon (subsequent builds will be faster)

> Task :app:run
Hello World!

BUILD SUCCESSFUL in 2s
2 actionable tasks: 2 executed
```

## Build the application

Gradle will build and produce an archive of compiled code in two formats: 
- app/build/distributions/app.tar 
- app/build/distributions/app.zip

```bash
% ./gradlew build

BUILD SUCCESSFUL in 1s
7 actionable tasks: 6 executed, 1 up-to-date

% ls -l app/build/distributions
-rw-r--r--  1 vjulio  staff  3256320 Aug 28 05:02 app.tar
-rw-r--r--  1 vjulio  staff  2837854 Aug 28 05:02 app.zip
```

## Run the application
```bash

# unpack archive

% tar -xvf app.tar

% tree app 
app
├── bin
│   ├── app
│   └── app.bat
└── lib
    ├── app.jar
    ├── checker-qual-3.12.0.jar
    ├── error_prone_annotations-2.7.1.jar
    ├── failureaccess-1.0.1.jar
    ├── guava-31.0.1-jre.jar
    ├── j2objc-annotations-1.3.jar
    ├── jsr305-3.0.2.jar
    └── listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar

# run the application

% cd app/bin

% ./app
Hello World!

```