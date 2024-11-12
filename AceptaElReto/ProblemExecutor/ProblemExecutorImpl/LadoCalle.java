package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class LadoCalle extends ProblemExecutorAbstractClassName {

    public LadoCalle() {
        super(LadoCalle.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);

        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (value == 0)
                break;
            System.out.println(value % 2 == 0 ? "DERECHA" : "IZQUIERDA");
        }
        sc.close();
    }

}
