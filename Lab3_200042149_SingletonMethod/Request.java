package Lab3_200042149_SingletonMethod;

public class Request {
    private String type, dest;
    private User user;
    public Request(User user, String type, String dest){
        Log.getInstance().arrayList.add(user.getName() + " sent a " + type + " request for " + dest + " at: " + java.time.LocalDateTime.now());
        user = this.user;
        type = this.type;
        dest = this.dest;
    }
}
