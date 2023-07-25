package conversiontemperatura;

public class ConversionTemperatura {

    private Double temperaturaCelcius;
    private Double temperaturaKelvin;
    private Double temperaturaFahrenheit;

    public ConversionTemperatura() {
        setTemperaturaCelcius(0.0);
    }

    public void setTemperaturaCelcius(Double temperaturaCelcius) {
        this.temperaturaCelcius = temperaturaCelcius;
        this.temperaturaFahrenheit = temperaturaCelcius * 1.8 + 32.0;
        this.temperaturaKelvin = temperaturaCelcius + 273.15;
        if(!temperaturaValida(temperaturaKelvin))
            setTemperaturaCelcius(0.0);
    }

    public void setTemperaturaKelvin(Double temperaturaKelvin) {
        this.temperaturaKelvin = temperaturaKelvin;
        this.temperaturaCelcius = temperaturaKelvin - 273.15;
        this.temperaturaFahrenheit = 1.8 * (temperaturaKelvin - 273.15) + 32.0;
        if(!temperaturaValida(temperaturaKelvin))
            setTemperaturaCelcius(0.0);
    }
    
    public void setTemperaturaFahrenheit(Double temperaturaFahrenheit){
        this.temperaturaFahrenheit = temperaturaFahrenheit;
        this.temperaturaCelcius = (temperaturaFahrenheit - 32.0) / 1.8;
        this.temperaturaKelvin = 5.0 / 9.0 * (temperaturaFahrenheit - 32.0) + 273.15;
        if(!temperaturaValida(temperaturaKelvin))
            setTemperaturaCelcius(0.0);
    }

    public Double getTemperaturaCelcius() {
        return temperaturaCelcius;
    }

    public Double getTemperaturaKelvin() {
        return temperaturaKelvin;
    }

    public Double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }
    
    private Boolean temperaturaValida(Double temperaturaKelvin){
        return temperaturaKelvin>=0;
    }

    @Override
    public String toString() {
        return "temperaturaCelcius=" + temperaturaCelcius + ", temperaturaKelvin=" + temperaturaKelvin + ", temperaturaFahrenheit=" + temperaturaFahrenheit + '}';
    }
    
}
