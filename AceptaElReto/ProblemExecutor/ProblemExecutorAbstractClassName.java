package AceptaElReto.ProblemExecutor;

public abstract class ProblemExecutorAbstractClassName implements ProblemExecutorInterface {
    private String problemName;

    public ProblemExecutorAbstractClassName(String problemName) {
        this.problemName = problemName;
        System.out.println("Problema: " + problemName);
    }

    public String getProblemName() {
        return problemName;
    }

}
