public class InfoLogProcessor extends LogProcessor{

  InfoLogProcessor(LogProcessor logProcessor) {
    super(logProcessor);
  }
  
  public void log(int logLevel, String msg) {
    if (logLevel == INFO) {
      System.out.println("INFO " + msg);
    } else {
      super.log(logLevel, msg);
    }
  }
}
