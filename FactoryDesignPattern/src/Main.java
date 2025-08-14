import java.util.Scanner;

enum LogLevel{
    HIGH, MEDIUM, LOW
}
interface ILogger{
    public void Log(String msg);
}
class ErrorLogger implements ILogger{
    public void Log(String msg){
        System.out.println("Error Logger : "+msg);
    }
}
class DebugLogger implements ILogger{
    public void Log(String msg){
        System.out.println("Debug Logger : "+msg);
    }
}
class InfoLogger implements ILogger{
    public void Log(String msg){
        System.out.println("Info Logger : "+msg);
    }
}
class FactoryClass{
    public static ILogger createLogMethod(LogLevel log){
        if(log.equals(LogLevel.HIGH)){
            return new ErrorLogger();
        }
        if(log.equals(LogLevel.MEDIUM)){
            return new DebugLogger();
        }
        if(log.equals(LogLevel.LOW)){
            return new InfoLogger();
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Log level....!");
        Scanner sc = new Scanner(System.in);
        String log = sc.nextLine();
        ILogger iLogger = FactoryClass.createLogMethod(LogLevel.valueOf(log));
        iLogger.Log("This is "+ log +" level log");
    }
}