package AceptaElReto.ProblemExecutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ProblemExecutorAbstractClassName implements ProblemExecutorInterface {
    private String problemName;

    public <T> ProblemExecutorAbstractClassName(Class<T> problemNameClass) {
        this.problemName = problemNameClass.getSimpleName();
        System.out.println("Problema: " + problemName);
    }

    public String getProblemName() {
        return this.problemName;
    }

    public File getFileFromClassName() throws Exception {
        File file;
        Path path = getAbsolutePathFromClassName();
        try {
            file = new File(path.toAbsolutePath().toString());
        } catch (NullPointerException e) {
            throw new FileNotFoundException(
                    "Problema " + this.getProblemName() + " no se ha encontrado la ruta con el path: " + path);
        }
        return file;
    }

    private Path getAbsolutePathFromClassName() {
        return Paths.get("AceptaElReto", "ProblemExecutor", "ProblemExecutorImpl",
                "InputDataFiles", this.problemName + ".txt");
    }
}
