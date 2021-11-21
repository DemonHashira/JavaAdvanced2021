import java.util.ArrayList;

public class CityClass {

    private String cityName;
    private String countryName;
    private long population;

    public CityClass(String cityName, String countryName, long population) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "CityClass{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                '}';
    }
}
