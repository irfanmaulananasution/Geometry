# Line Length

### Description
Simple library to calculate length of a line for a cartesius coordinate

### Requirement
- Gradle 7.1
- Java (JDK 16)
- Junit 5

### How to test
```
./gradlew test
```

### How to build
```
./gradlew build
```

### How to use
1. Casually import this library to your project
2. model a line with Line class. then use the length() function
```
//example to find the length between (1,1) and (4,5)
Line line = new Line(1, 1, 4, 5);
double length = line.length();
```
