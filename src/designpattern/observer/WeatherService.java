package designpattern.observer;

public class WeatherService {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Satellite satellite = new Satellite();

        earth.addObserver(satellite);
        System.out.println("天气预报");

        earth.setWeather("台风");
        earth.setWeather("大到暴雨");
        earth.setWeather("天气炎热");
    }
}
