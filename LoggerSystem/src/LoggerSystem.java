// Chain of responsibility
// ATM, Loggers
// When we enter amout in atm machine, we do not care about internal modules like 500 note module, 200 note module etc that works internally to check if the final amout can be encashed
public class LoggerSystem {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Logger system");
        System.out.println();

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happened");
        logObject.log(LogProcessor.DEBUG, "need to debug");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}
