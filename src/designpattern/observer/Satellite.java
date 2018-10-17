package designpattern.observer;

import java.util.Observer;
import java.util.Observable;

public class Satellite implements Observer{
    private String weather;

    @Override
    public void update(Observable obj, Object arg){
        weather = (String) arg;
        System.out.println("近期天气变化：" + weather);
    }

}
