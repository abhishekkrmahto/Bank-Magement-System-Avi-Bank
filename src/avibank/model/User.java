package avibank.model;

public class User {
    private String name;
    private long userId;
    private long phone;
    private boolean freeze = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public User() {
    }

    public User(String name, long userId, long phone) {
        this.name = name;
        this.userId = userId;
        this.phone = phone;
    }

    public boolean isFreeze() {
        return freeze;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

}
