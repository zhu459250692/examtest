package designpattern.observer;

public class WeatherService {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Satellite satellite = new Satellite();

        earth.addObserver(satellite);
        System.out.println("����Ԥ��");

        earth.setWeather("̨��");
        earth.setWeather("�󵽱���");
        earth.setWeather("��������");
    }
}
