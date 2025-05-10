package lld.designpatterns.observerdesignpattern;

/*
Take it as Amazon website
We as a user can subscribe to HP Laptop so that we will get notified when stock will be available.
We create Laptop as Observable object
We create users (or our notification systems like email alert, whatsapp alert) as observers
* */

public class Amazon {
    public static void main(String[] args){
        ObservableInterface  laptopStockObservable = new Observable("Laptop");
        ObserverInterface iMessageAlert = new Observer("abhishek777vaishnav@gmail.com", laptopStockObservable);
        laptopStockObservable.add(iMessageAlert);
        laptopStockObservable.setStock(1);
    }
}
