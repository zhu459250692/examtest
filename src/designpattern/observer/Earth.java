package designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Earth extends Observable {
    private String weather = "晴朗";

    public String getWeather() {
        return weather;
    }

    //核心在于，被观察物体一改变就notify观察者。
    public void setWeather(String weather) {
        this.weather = weather;
        //将change这个flag=true
        setChanged();
        //告诉监听器,调用监听器的update方法。parameters是object，任意对象。
        notifyObservers(weather);
    }


}
