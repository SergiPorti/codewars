package AceptaElReto;

import java.util.ArrayList;
import java.util.List;

import AceptaElReto.ProblemExecutor.ProblemExecutorInterface;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.Desembalse;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.Nochevieja;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.OrdenandoElArmario;
import AceptaElReto.ProblemExecutor.ProblemExecutorImpl.PicPocPong;

public class Main {

    public static void main(String[] args) {
        List<ProblemExecutorInterface> problemExecutors = new ArrayList<>();

        problemExecutors.add(new Nochevieja());
        problemExecutors.add(new OrdenandoElArmario());
        problemExecutors.add(new PicPocPong());
        problemExecutors.add(new Desembalse());

        for (ProblemExecutorInterface problemExecutorInterface : problemExecutors) {
            try {
                String problemLog = "|-Problema " + problemExecutorInterface.getClass().getSimpleName() + "-|";

                System.out.println("-".repeat(problemLog.length()));
                System.out.println(problemLog);
                System.out.println("-".repeat(problemLog.length()));

                problemExecutorInterface.executeProblem();
                System.out.println();
            } catch (Exception e) {
                System.err.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

}
