package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class Nochevieja extends ProblemExecutorAbstractClassName {

    public Nochevieja(String problemName) {
        super(problemName);
    }

    @Override
    public void executeProblem() throws Exception {
        File file;
        String path = ".\\InputDataFiles\\Nochevieja.txt";
        try {
            file = new File(path);
        } catch (NullPointerException e) {
            throw new FileNotFoundException(
                    "Problema " + super.getProblemName() + " no se ha encontrado la ruta con el path: " + path);
        }
        Scanner sc = new Scanner(file);

        String pregunta;
        int valorHora, valorMinut, minut;
        boolean fiPrograma;

        do {
            fiPrograma = sc.hasNextLine();
            pregunta = sc.nextLine();

            String[] vector = pregunta.split(":");
            valorHora = Integer.parseInt(vector[0]);
            valorMinut = Integer.parseInt(vector[1]);

            if (!(valorHora > 24 || valorHora < 0)) {
                fiPrograma = fiPrograma(valorHora, valorMinut);
                if (fiPrograma) {
                    minut = calcularMinut(valorHora, valorMinut);
                    System.out.println(minut);
                }
            }
        } while (fiPrograma);

        sc.close();
    }

    public static boolean fiPrograma(int hora, int minut) {
        return hora == 00 && minut == 00;
    }

    public static int calcularMinut(int hora, int minut) {
        int minuts = 0;

        if (!(hora > 24 || hora < 0)) {
            hora = 24 - hora;
            minuts = hora * 60;
            minuts -= minut;
        }

        return minuts;
    }

}
