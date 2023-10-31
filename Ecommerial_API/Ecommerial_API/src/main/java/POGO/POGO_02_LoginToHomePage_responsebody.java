package POGO;
public class POGO_02_LoginToHomePage_responsebody {
    private String token;
    private String userId;
    private String message;
    public void setToken(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserId() {
        return userId;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
