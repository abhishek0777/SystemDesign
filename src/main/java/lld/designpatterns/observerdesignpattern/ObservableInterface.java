package lld.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public interface ObservableInterface {

    public void add(ObserverInterface observer);
    public void remove(ObserverInterface observer);
    public void setStock(int x);
    public int getStock();
    public void notifyObservers();
    public String getName();


}
