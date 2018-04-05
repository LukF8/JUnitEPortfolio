# JUnitEPortfolio

## 1 JUnit
JUnit is an open source framework that has been designed for the purpose of writing and running tests in the java programming language. Origininally it was written by Erich Gamma and Kent Beck. The goal of the framework is to accelerate programming and to increase the quality of code. It is one of a family of unit testing framework which is collectively known as XUnit.

## 2 Software Testing
A software test is a piece of code, which executes another piece of software. It validates if that code results in the expected state (state testing) or executes the expected sequence of events (behavior testing). This helps to verify that logic of a program is correct and creates a relation ship between developing and testing. 

### 2.1 Phases of testing
 
 Bild von Pfeil
 
### 2.2 Advantages
Software unit tests help the developer to verify that the logic of the program is correct. Running tests automatically helps to identify software regressions in the source code. Having a high test coverage of your code allows you to continue developing features without having to perform lots of manual tests.

## 3 Using JUnit
JUnit is a test framework that uses annotations to identify methods that specify a test. 

### 3.1 How to define a test in JUnit?
A Junit test is a method contained in a class which is only used for testing. This is called a _Test class_. To define a certain method is a test method, annotate it with the `@Test` annotation. 
In addition to this annotations there are also some other annotations that are used in JUnit.
##### Annotation Types Summary
| After | If you allocate external resources in a Before method you need to release them after the test runs. |
| AfterClass | If you allocate expensive external resources in a BeforeClass method you need to release them after all the tests in the class have run. |
| Before | When writing tests, it is common to find that several tests need similar objects created before they can run. |
| BeforeClass | Sometimes several tests need to share computationally expensive setup (like logging into a database). |
| Ignore | Sometimes you want to temporarily disable a test or a group of tests. |
| Test | The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case |

### 3.2 Example JUnit test
The following code shows a test using JUnit4. This test assumes that the `Calc` class exists and has  `add(int a, int b); sub(int a, int b); mul(int a, int b); div(int a, int b)`methods.
Bild vom Code
### 3.3 JUnit naming conventions


## 4 JUnit integration in Eclipse
