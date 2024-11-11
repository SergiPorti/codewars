package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorInterface;

public class Nochevieja implements ProblemExecutorInterface {

    @Override
    public void executeProblem() {
        Scanner sc = new Scanner(System.in);

        String pregunta_hora;
        boolean fiPrograma = false;

        do {
            pregunta_hora = sc.next();

            String[] HoraArray = pregunta_hora.split(":");
            int valorHora, valorMinuts, minutsHora = 0;

            valorHora = Integer.parseInt(HoraArray[0]);
            valorMinuts = Integer.parseInt(HoraArray[1]);

            if (valorHora > 24 || valorHora < 00)
                continue;

            if (valorHora == 00 && valorMinuts == 00) {
                fiPrograma = true;
            } else {
                valorHora = 24 - valorHora;
                minutsHora = valorHora * 60;
                minutsHora -= valorMinuts;
                System.out.println(minutsHora);
            }

        } while (fiPrograma != true);

        sc.close();
    }

}
