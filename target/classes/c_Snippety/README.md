<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java Podstawy - Snippety
> Krótkie kawałki kodu, które pokazują zależności, rozwiązują popularne problemy oraz pokazują jak używać niektórych funkcji.

#### Najważniejsze adnotacje w JUnit

   * **@Test** - oznaczenie metody testującej.
   * **@BeforeClass** - oznaczenie metody uruchamianej przed wszystkimi metodami testującymi.
   * **@AfterClass** - oznaczenie metody uruchamianej po wszystkich metodach testujących.
   * **@Before** - oznaczenie metody uruchamianej przed każdym testem.
   * **@After** - oznaczenie metody uruchamianej po każdym teście.
   * **@Ignore** - oznaczona metoda tą adnotacją nie zostanie wywołana.
   
#### Przykład klasy testującej

````java
public class SimpleSampleTest {
 
    @Test
    public void simpleStringTest() {
        String testString = "CodersLabJava";
        String firstHalf = Main6.firstHalf(testString);
        assertEquals("CodersLabJava", firstHalf);
        assertTrue(firstHalf.startsWith("Coder"));
    }
 
    @Test
    public void simpleTestList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        assertEquals(list.size(), 4);
        assertEquals((Integer) 2, list.get(1));
        assertEquals((Integer) 4, list.get(3));
    }
}   
````

#### Przykład zestawu testów

````java
package pl.coderslab.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Calculator2Test.class, CalculatorTest.class, FirstTest.class })

public class AllTests {

}
````


#### Przykład testu w konwencji `given when then`

````java
@Test
public void sumPositiveNumbers() {
    // given
    // ustalam założenia początkowe
    int a = 2;
    int b = 4;
    int expected = 6;
 
    // when
    // wywołanie metody którą sprawdzamy
    Calculator calculator = new Calculator();
    long valueToCheck = calculator.add(a, b);
 
    // then
    // sprawdzanie czy wynik jest zgodny z oczekiwaniem
    assertEquals(expected, valueToCheck);
}
````

##### Import statyczny dla Asercji z JUnit
````java
import static org.junit.Assert.*;
````

#### Najważniejsze asercje
````java
assertEquals(String message, long expected, long actual)
assertNull(java.lang.Object object); 
assertNotNull(java.lang.Object object); 
assertSame(Object expected, Object actual);  
assertTrue(boolean condition);
fail(String message);
````
