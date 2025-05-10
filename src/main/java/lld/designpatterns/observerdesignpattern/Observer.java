package lld.designpatterns.observerdesignpattern;

public class Observer implements ObserverInterface{
    public String userName;
    public ObservableInterface observable;
    public Observer(String userName, ObservableInterface observable){
        this.userName = userName;
        this.observable = observable;
    }
    public void update(ObservableInterface observable){
        sendMessage(userName, "Product "+ observable.getName() + " is in stock, hurry up!");
    }

    public void  sendMessage(String userName, String message){
        System.out.println("Message sent to: "+userName);
        // Write main logic to send message here
        System.out.println(message);
    }
}
