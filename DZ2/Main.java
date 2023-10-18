import server.*;
import client.ClientGUI;
import client.ClientView;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Storage();
        ServerView serverView= new ServerWindow();
        Server server = new Server(repository, serverView);
        serverView.setServer(server);
        new ClientGUI(server);
        new ClientGUI(server);
    }
}