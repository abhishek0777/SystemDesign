package lld.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface{
    public String name;
    List<ObserverInterface> observers = new ArrayList<>();
    int stock = 0;

    public Observable(String name){
        this.name = name;
    }
    @Override
    public void add(ObserverInterface observer){
        observers.add(observer);
        System.out.println("Observer added in the list of observers");
    }
    @Override
    public void remove(ObserverInterface observer){
        observers.remove(observer);
        System.out.println("Observer removed in the list of observers");
    }
    @Override
    public int getStock() {
        return stock;
    }
    @Override
    public void setStock(int stock){
        this.stock = stock;
        notifyObservers();
    }
    @Override
    public void notifyObservers(){
        for(ObserverInterface observer: observers){
            observer.update(this);
        }
    }
    @Override
    public String getName(){
        return name;
    }
}
