package Lab3_200042149_SingletonMethod;

public class User {
    private String name, address, phoneNo;
    public User(String name, String address, String phoneNo){
        Log.getInstance().arrayList.add("A new user " + name + " was created at: " + java.time.LocalDateTime.now());
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getName(){
        return name;
    }
}
