package ex.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("l1");
        ProgramLogger.getProgramLogger().addLogInfo("l2");
        ProgramLogger.getProgramLogger().addLogInfo("l3");

        ProgramLogger.getProgramLogger().showLog();
    }
}
