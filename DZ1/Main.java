public class Main {
    public static void main(String[] args) {
        Server server=new Server();
        new Client(server,"111","12345");
        new Client(server,"222","12345");
    }
}