package AceptaElReto.ProblemExecutor.ProblemExecutorImpl;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import AceptaElReto.ProblemExecutor.ProblemExecutorAbstractClassName;

public class OrdenandoElArmario extends ProblemExecutorAbstractClassName {

    public OrdenandoElArmario() {
        super(OrdenandoElArmario.class);
    }

    @Override
    public void executeProblem() throws Exception {
        File file = super.getFileFromClassName();

        Scanner sc = new Scanner(file);

        String input;

        while (sc.hasNextLine()) {
            input = sc.nextLine();
            if (".".equals(input))
                break;
            Map<String, Integer> map = new HashMap<>();

            String[] inputSplitted = input.split(" ");
            inputSplitted = Arrays.stream(inputSplitted).map(value -> {
                switch (value) {
                    case "V":
                        return "VERANO";
                    case "I":
                        return "INVIERNO";
                    default:
                        return "";
                }
            }).toArray(String[]::new);

            for (int i = 0; i <= inputSplitted.length - 2; i++) {
                if (!inputSplitted[i].equals("AMBAS") || "".equals(inputSplitted[i])) {
                    map.put(inputSplitted[i], map.get(inputSplitted[i]) != null ? map.get(inputSplitted[i]) + 1 : 1);
                }
            }
            if (map.get("VERANO") == map.get("INVIERNO")) {
                System.out.println("EMPATE");
            } else {
                System.out.println(
                        Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
            }
        }

        sc.close();
    }

}
