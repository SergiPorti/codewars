package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class PicPocPong extends ProblemExecutorAbstractClassName {

    public PicPocPong() {
        super(PicPocPong.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);

        String input = "";
        boolean derecha = false;
        Map<String, Integer> map = new HashMap<>();

        while (sc.hasNextLine()) {
            map.put("d", 0);
            map.put("i", 0);
            input = sc.nextLine();
            if (input.equals("0"))
                break;
            String[] splittedInput = input.split(" ");

            for (int i = 1; i <= Integer.valueOf(splittedInput[0]); i++) {
                derecha = "PIC".equals(splittedInput[i]) ? !derecha : derecha;

                map.put(derecha ? "d" : "i",
                        "PONG!".equals(splittedInput[i]) ? map.get(derecha ? "d" : "i") + 1
                                : map.get(derecha ? "d" : "i"));
            }
            System.out.println(String.join(" ", String.valueOf(map.get("i")), String.valueOf(map.get("d"))));
        }

        sc.close();

    }

}
