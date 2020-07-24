package ex.patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String log = "this is log";

    private ProgramLogger(){};

    public static ProgramLogger getProgramLogger(){
        if(programLogger == null){
            return new ProgramLogger();
        } else
            return programLogger;
    }

    public void addLogInfo(String logInfo){
        log+=logInfo;
    }

    public void showLog(){
        System.out.println(log);
    }
}
