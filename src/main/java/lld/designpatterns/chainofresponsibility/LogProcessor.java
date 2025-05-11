package lld.designpatterns.chainofresponsibility;

public abstract class LogProcessor {
    public static String INFO="INFO";
    public static String ERROR="ERROR";
    public static String DEBUG="DEBUG";
    LogProcessor nextLogProcessor;
    public LogProcessor(){
    }
    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }
    public void log(String logLevel, String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(logLevel, message);
        }
    }
}

class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO log: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}

class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("Error log: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}


class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("Debug log: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}