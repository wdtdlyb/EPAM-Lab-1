import java.util.Scanner;
import java.util.logging.Logger;

public class Services {
    private int rangeStart;
    private int rangeFinish;
    protected int sum;
    Scanner in = new Scanner(System.in);
    private final static Logger log = Logger.getLogger(String.valueOf(Services.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    public void enterRange(){
        InfoLevel();
        System.out.println("\nВведите начало диапазона: ");
        rangeStart = in.nextInt();
        System.out.println("Введите конец диапазона: ");
        rangeFinish = in.nextInt();
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public int getRangeFinish() {
        return rangeFinish;
    }
}
