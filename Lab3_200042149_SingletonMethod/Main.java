package Lab3_200042149_SingletonMethod;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nazmul", "DHK", "0171234244");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        User user2 = new User("Anan", "DHK", "0123456575");

        Request req1 = new Request(user1, "GET", "www.iut.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Request req2 = new Request(user2, "POST", "www.instagram.com");

        Log.getInstance().ShowLog();
    }
}
