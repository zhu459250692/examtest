package designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Earth extends Observable {
    private String weather = "����";

    public String getWeather() {
        return weather;
    }

    //�������ڣ����۲�����һ�ı��notify�۲��ߡ�
    public void setWeather(String weather) {
        this.weather = weather;
        //��change���flag=true
        setChanged();
        //���߼�����,���ü�������update������parameters��object���������
        notifyObservers(weather);
    }


}
