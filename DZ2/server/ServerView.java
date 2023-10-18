package server;

public interface ServerView {
    void setServer(Server server);
    void appendLog(String text);
}