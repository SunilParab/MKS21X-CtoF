// The functions should have a float to take in the non-converted temperature.
// The functions should return a float of the converted temperature.
public class CtoFTester {
  public static void main(String[] args) {
    celsiusToFahrenheit(0)
    celsiusToFahrenheit(68)
    fahrenheitToCelsius(0)
    fahrenheitToCelsius(68)
  }
  static void celsiusToFahrenheit(float temp) {
    temp * 9 / 5 + 32
  }
  static void fahrenheitToCelsius(float temp) {
    (temp - 32) * 5 / 9
  }
}
