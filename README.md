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
| Annotation JUnit4 | Description |
|----|----|
| import org.junit.* | Import statement for using the following annotations. |
| @After | Executed after each test. It is used to cleanup the test environment (e.g., delete temporary data, restore defaults). It can also save memory by cleaning up expensive memory structures. |
| @AfterClass | Executed once, after all tests have been finished. It is used to perform clean-up activities, for example, to disconnect from a database. Methods annotated with this annotation need to be defined as static to work with JUnit. |
| @Before | Executed before each test. It is used to prepare the test environment (e.g., read input data, initialize the class). |
| @BeforeClass | Executed once, before the start of all tests. It is used to perform time intensive activities, for example, to connect to a database. Methods marked with this annotation need to be defined as static to work with JUnit. |
| @Ignore | Marks that the test should be disabled. This is useful when the underlying code has been changed and the test case has not yet been adapted. Or if the execution time of this test is too long to be included. It is best practice to provide the optional description, why the test is disabled. |
| @Test | Identifies a method as a test method. |
| @Test(expected = Exception.class) | Fails if the method does not throw the named exception. |
| @Test(timeout=100) | Fails if the method takes longer than 100 milliseconds. |


### 3.2 Assert statements
JUnit provides static methods to test for certain conditions via the *Assert* class. These assert statements typically start with *assert*. They allow you to specify the error message, the expected and the actual result. An assertion method compares the actual value returned by a test to the expected value. It throws an *AssertionException* if the comparison fails.
The following table gives an overview of these methods. Parameters in [] brackets are optional and of type String.
##### Assert statements
| Statement | Description |
|----|----|
| fail([message]) | Let the method fail. Might be used to check that a certain part of the code is not reached or to have a failing test before the test code is implemented. The message parameter is optional. |
| assertTrue([message,] boolean condition) | Checks that the boolean condition is true. |
| assertFalse([message,] boolean condition) | assertFalse([message,] boolean condition) |
| assertEquals([message,] expected, actual) | Tests that two values are the same. Note: for arrays the reference is checked not the content of the arrays. |
| assertEquals([message,] expected, actual, tolerance) | Test that float or double values match. The tolerance is the number of decimals which must be the same. |
| assertNull([message,] object) | Checks that the object is null. |
| assertNotNull([message,] object) | Checks that the object is not null. |
| assertSame([message,] expected, actual) | Checks that both variables refer to the same object. |
| assertNotSame([message,] expected, actual)  | Checks that both variables refer to different objects. |



### 3.3 Example JUnit test
The following code shows a test using JUnit4. This test assumes that the `Calc` class exists and has  `add(int a, int b); sub(int a, int b); mul(int a, int b); div(int a, int b)`methods.
```java
import static org.junit.Assert.*;

import org.junit.Test;

import test.Calc;

public class CalcTest {

	@Test
	public void test() {
		Calc cal = new Calc(2,2);
		
		int add = cal.add();
		assertEquals(add, 4);
		
		int sub = cal.sub();
		assertEquals(sub, 0);
		
		int mul = cal.mul();
		assertEquals(mul, 4);
		
		int div = cal.div();
		assertEquals(div, 1);
	}

}

```
### 3.4 JUnit naming conventions
There are several potential naming conventions for JUnit tests. A widely-used solution for classes is to use the "Test" suffix at the end  of test classes names. A test name should explain what the test does. If that is done correctly, reading the actual implemantation can be avoided.
One possible convention is to use the "should" in the test method name. For example "balanceShouldIncrease". This gives a hint what should happen if the test method is executed. 
Another approach is to use "Given[ExplainYourInput]When[WhatIsDone]Then[ExpectedResult]" for the display name of the test method.


## 4 JUnit integration in Eclipse


