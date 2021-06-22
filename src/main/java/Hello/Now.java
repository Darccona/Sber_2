package Hello;

public class Now {

    private final String data;
    private final String time;

    Now(String data, String time) {
        this.data = data;
        this.time = time;
    }

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }
}
