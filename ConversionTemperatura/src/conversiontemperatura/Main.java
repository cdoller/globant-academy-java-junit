package conversiontemperatura;

public class Main {

    public static void main(String[] args) {
        ConversionTemperatura conversor = new ConversionTemperatura();
        System.out.println(conversor.toString());
        conversor.setTemperaturaKelvin(150.0);
        System.out.println(conversor.toString());
        conversor.setTemperaturaCelcius(25.5);
        System.out.println(conversor.toString());
        conversor.setTemperaturaFahrenheit(115.0);
        System.out.println(conversor.toString());
        conversor.setTemperaturaKelvin(-10.0);
        System.out.println(conversor.toString());
    }

}
