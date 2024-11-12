package AceptaElReto;

import java.util.ArrayList;
import java.util.List;

import AceptaElReto.ProblemExecutor.ProblemExecutorInterface;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.Nochevieja;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.OrdenandoElArmario;

public class Main {

    public static void main(String[] args) {
        List<ProblemExecutorInterface> problemExecutors = new ArrayList<>();

        problemExecutors.add(new Nochevieja());
        problemExecutors.add(new OrdenandoElArmario());

        for (ProblemExecutorInterface problemExecutorInterface : problemExecutors) {
            try {
                problemExecutorInterface.executeProblem();
            } catch (Exception e) {
                System.err.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

}
