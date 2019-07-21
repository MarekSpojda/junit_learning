<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Podstawy - TDD

Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  

	
#### Zadanie 1 - rozwiązywane z wykładowcą.

W pliku `FirstTest.java`

1. Utwórz testy do metod klasy `First.java`;
	* testConcatString
	* testMultiply

 
#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `SimpleCalculatorTest.java`

1. Utwórz testy do metod klasy `SimpleCalculator.java`;
2. Utwórz test sprawdzający wystąpienie wyjątku.

-----------------------------------------------------------------------------	

#### Zadanie 3

1. W klasie `MaxValue.java` znajduje się metoda, która wyszukuje największą wartość w tablicy.
2. Napisz testy do tej funkcji sprawdzając poprawność wskazań.
3. Jeżeli to konieczne popraw implementację metody.

#### Zadanie 4

1. Utwórz klasę `Calculator.java`, która będzie implementowała cztery działania matematyczne 
	* dodawanie
	* odejmowanie
	* mnożenie 
	* dzielenie
	* porównanie 2 wartości (boolean greater(int a, int b))

2. Utwórz klasę `CalculatorTest.java`, która będzie implementowała testy dla tej klasy.

#### Zadanie 5	

1. Uzupełnij klasę testującą o poniższy test:
````java
@Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.eval("1+2+3");
    assertEquals(6, sum);
  }

````
2. Dodaj do klasy `Calculator` implementację metody tak by test zakończył się powodzeniem.


**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
