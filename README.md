# Geometry Line Package

## Problem Description
This repository aims to model a 2D line in cartesian coordinate. Currently, it can be used to : 
- Calculate its length
- To compare if two lines are equal based on the endpoints

## Dev Environment Setup
- Ensure that you have JDK 11 version or newer installed in your local machine.
- Ensure that you have Gradle 7.1 version or newer installed in your local machine.

## How to Test
- Run `./gradlew test` in your CLI to test all the available test cases.

## How to Build
- Run `./gradlew build` in your CLI.
- Navigate to `build/libs` directory, and you will see that `LineKamis1-1.0-SNAPSHOT.jar` is inside the directory.

## How to Use
- Create libs directory in your Java project if you haven't done that previously.
- Copy and paste the mentioned file `LineKamis1-1.0-SNAPSHOT.jar` above into your Java project `libs` directory.

### Using Gradle
```groovy
dependencies {
    implementation files('libs/LineKamis1-1.0-SNAPSHOT.jar')
}
```

### Usage Example
```java
package com.yourpackagename;

import com.geometry.Line;

public class ExampleClass {

    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 4, 7);
        // To use method to calculate the length line
        System.out.println(line1.length());

        Line line2 = new Line(1, 2, 4, 7);
        // To check if the lines are equal
        System.out.println(line1.isEqual(line2));
    }
}
```
