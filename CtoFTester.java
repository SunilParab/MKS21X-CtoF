// The functions should have a float to take in the non-converted temperature.
// The functions should return a float of the converted temperature.
public class CtoFTester {
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(68));
    System.out.println(fahrenheitToCelsius(0));
    System.out.println(fahrenheitToCelsius(68));
  }
  static float celsiusToFahrenheit(float temp) {
    return ((temp * 9) / 5 + 32);
  }
  static float fahrenheitToCelsius(float temp) {
    return (((temp - 32) * 5) / 9);
  }
}
