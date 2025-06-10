package desafios.conversorTemperatura;

public class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32);
    }
}
