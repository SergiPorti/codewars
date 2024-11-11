package AceptaElReto;

import java.util.ArrayList;
import java.util.List;

import AceptaElReto.ProblemExecutor.ProblemExecutorInterface;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.Nochevieja;

public class Main {

    public static void main(String[] args) {
        List<ProblemExecutorInterface> problemExecutors = new ArrayList<>();

        problemExecutors.add(new Nochevieja());

        for (ProblemExecutorInterface problemExecutorInterface : problemExecutors) {
            problemExecutorInterface.executeProblem();
        }
    }

}
