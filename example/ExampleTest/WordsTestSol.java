package ExampleTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import example.Words;

public class WordsTestSol {

	public static Words words = new Words();
	public static String testWord;
	
	@BeforeClass
	public static void init() {
		testWord = "Hello World";

	}
	
	@Test
	public void wordTest() {
		assertEquals(testWord, words.createWord("Hello World"));
	}

}
