package server;

public interface Repository {
    String readLog();
    void saveInLog(String text);

}