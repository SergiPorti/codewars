package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class Amount extends ProblemExecutorAbstractClassName {

    public Amount() {
        super(Amount.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);

        double sum = 0;
        while (sc.hasNextLine()) {
            sum += Double.parseDouble(sc.nextLine().substring(1));
        }
        System.out.println("Gastado en total: " + sum);
        sc.close();
    }

}
