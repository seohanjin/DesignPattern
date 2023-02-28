package 행위패턴.템플릿메서드;

// 기초 소셜 네트워크 클래스
public abstract class Network {
    String userName;
    String password;

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
