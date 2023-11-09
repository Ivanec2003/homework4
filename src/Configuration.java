public class Configuration {
    private static String url;
    private static String user;
    private  static String password;
    static {
        url = "https://classroom.google.com";
        user = "Ivanec Vlad";
        password = "2IvVlad3";
    }

    public static String getPassword() {
        return password;
    }

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }
}
