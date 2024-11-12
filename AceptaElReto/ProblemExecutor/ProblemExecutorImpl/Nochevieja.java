package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class Nochevieja extends ProblemExecutorAbstractClassName {

    public Nochevieja() {
        super(Nochevieja.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);
        String hora;
        int hour, minute;

        while (sc.hasNextLine()) {
            hora = sc.nextLine();
            if ("00:00".equals(hora))
                break;
            hour = Integer.parseInt(hora.substring(0, 2));
            minute = Integer.parseInt(hora.substring(3));
            int minutosMediaNoche = 24 * 60;

            if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
                System.out.println(minutosMediaNoche - ((hour * 60) + minute));
            }
        }

        sc.close();
    }
}
