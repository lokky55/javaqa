import ru.netology.javaqa.MathService;

public class Main {
    public static void main(String[] args) {
        MathService service = new MathService();
        int res = service.crazyCount(400);
        System.out.println(res);

    }
}