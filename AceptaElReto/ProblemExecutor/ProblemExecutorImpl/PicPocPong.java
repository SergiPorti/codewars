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

        String input = sc.next();
        boolean derecha = false;
        Map<String, Integer> map = new HashMap<>();
        map.put("d", 0);
        map.put("i", 0);

        while (!input.equals("0")) {
            input = sc.next();
            derecha = "PIC".equals(input) ? !derecha : derecha;

            map.put(derecha ? "d" : "i", map.get(derecha ? "d" : "i") + 1);
        }

        System.out.println(String.join(" ", String.valueOf(map.get("i")), String.valueOf(map.get("d"))));
        sc.close();

    }

}
