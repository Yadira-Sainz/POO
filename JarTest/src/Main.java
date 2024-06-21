import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numb = new ArrayList<Double>(Arrays.asList(4.0,  1.0, 3.0, 3.0, 3.0,3.0, 1.0, 2.0));
        System.out.println(ProbabilityAndStatics.mode(numb));

    }
}
