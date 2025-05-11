package lld.designpatterns.chainofresponsibility;

public class Client {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        logProcessor.log(LogProcessor.DEBUG,"need to debug this");
        logProcessor.log(LogProcessor.ERROR,"exception happened");
        logProcessor.log(LogProcessor.INFO,"just for info");
    }
}
