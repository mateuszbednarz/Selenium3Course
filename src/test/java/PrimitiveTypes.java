import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PrimitiveTypes {

    @Test
    public void sayHello()
    {
        System.out.println("Hej, witaj w kursie Selenium na Udemy!");
    }

    WebDriver ffDriver = new FirefoxDriver();

    /* Typy prymitywne - liczby stałoprzecinkowe */
    byte eByte;           // od -128 do 127
    short eShort;         // od -32768 do 32767
    int eInt;             // od -2.147.483.648 do 2.147.483.647
    long eLong;           // od -2^63 do 2^63

    /* Typy prymitywne - liczby zmiennoprzecinkowe */
    float eFloat;        // maksymalnie około 7 miejsc po przecinku
    double eDouble;      // maksymalnie około 15 miejsc po przecinku

    /* Typy prymitywne - znakowe: */
    char eChar;          // pojedynczy znak

    /* Typy prymitywne - logiczne */
    boolean eBoolean;    // może przymować wartość TRUE lub FALSE

    /* Znaki specjalne:
       t  - tabulator
       \n - znak nowej linii
       \" - cudzysłów
    */

    /*
        Do wykonywania operacji finansowych w naszych aplikacjach powinniśmy używać dedykowanych typów obiektowych
        BigInteger oraz BigDecimal ZAMIAST typów prymitywnych (chodzi o dokładność)
     */
}
