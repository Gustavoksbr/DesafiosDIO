import java.time.LocalTime;
import java.util.Scanner;


class TimeFactory {

    public static LocalTime createTime(String string) {

      return LocalTime.parse(string);
    }
    
}

public class MeetingScheduler {

    private static final LocalTime MIN_TIME = LocalTime.of(9, 0); 
    private static final LocalTime MAX_TIME = LocalTime.of(18, 0); 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String desiredTimeInput = scanner.nextLine();
        LocalTime desiredTime = TimeFactory.createTime(desiredTimeInput);

        String currentTimeInput = scanner.nextLine();
        LocalTime currentTime = TimeFactory.createTime(currentTimeInput); //nao sei pra q serve esse currentTimte, eu nunca uso kkkkk
         

        if (isMeetingSchedulable(desiredTime)) {
            System.out.println("Reuniao pode ser agendada.");
        } else {
            System.out.println("Reuniao nao pode ser agendada. Horario fora do intervalo permitido.");
        }
    }

    private static boolean isMeetingSchedulable(LocalTime desiredTime) {
        return !desiredTime.isBefore(MIN_TIME) && !desiredTime.isAfter(MAX_TIME);
    }
}

