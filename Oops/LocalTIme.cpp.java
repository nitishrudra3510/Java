import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {
    void getDateTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fdatetime = time.format(dateTimeFormatter);
        System.out.println(fdatetime);
    }

    public static void main(String[] args) {
        LocalTime program = new LocalTime();
        program.getDateTime();
    }
}
