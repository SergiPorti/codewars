package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class Desembalse extends ProblemExecutorAbstractClassName {

    public Desembalse() {
        super(Desembalse.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);
        int entries, counter;
        int[] input;

        while (sc.hasNextLine()) {
            entries = sc.nextInt();
            if (!sc.hasNextLine())
                break;
            sc.nextLine();

            input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
            counter = 0;

            for (int i = 0; i < entries; i++) {
                counter += input[input.length - 1] - input[i];
            }
            System.out.println(counter);
        }
        sc.close();
    }

}
