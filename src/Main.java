import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListHandler handler = new ListHandler();
        List<Integer> example = handler.listGenerator(7);
        List<Integer> solution = handler.eliminator(13, example);
        System.out.println(solution);
    }
}
