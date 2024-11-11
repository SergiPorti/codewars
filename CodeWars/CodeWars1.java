package CodeWars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeWars1 {
    public static void main(String[] args) {
        // System.out.println(findIt(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 }));
        // System.out.println(findMissingLetter(new char[] { 'a', 'b', 'c', 'd', 'f'
        // }));
        // String[] arr = wave("two words");
        // for (String str : arr) {
        // System.out.println(str);
        // }null
        // int[] numbers = twoSum(new int[] { 1234, 5678, 9012 }, 14690);
        // for (int i : numbers) {
        // System.out.println(i);
        // }
        // System.out.println(dutyFree(12, 50, 1000));
        // System.out.println(encrypt("This is a test!", 2));
        // System.out.println(decrypt(encrypt("This is a test!", 1), 1));
        // System.out.println(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,
        // 0}));
        // System.out.println(flickSwitch(List.of("hola", "flick", "adios")));
        // System.out.println(spinWords("Hey fellow warriors"));
        // System.out.print ln(pofi(-1));
        // System.out.println(top3(" won't, wont wont "));
        // System.out.println(validateWord("abcabc"));
        // System.out.println(pigIt("t...ora o mores ![]"));
        // System.out.println(snail(new int[][] { { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 } }));
        // System.out.println(validParentheses(""));
        // System.out.println(sum(new double[] { 1.1, 2.2, 3.3 }));
        // System.out.println(sumIntervals(new int[][] { { 5, 8 }, { 3, 6 }, { 1, 2
        // }}));
        // System.out.println(powersOfTwo(1));
        // System.out.println(ghostBusters("O f fi ce"));
        // System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
        // System.out.println(oddCount(15023));
        // System.out.println(rot13("EBG13 rknzcyr."));
        // System.out.println(sumsOdd(100));
        // System.out.println(smash(new String[] { "hello", "world" }));

        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j >= 0; j--) {
        // System.out.print((i >= j) ? "*" : " ");
        // }
        // System.out.println();
        // }
        // System.out.println(areTheFieldsCorrect("a23232", "Viernes QUE viene vamos de
        // calotada a un pueblo de ñç\'\'"));
        // System.out.println(areTheFieldsCorrect("123123çñÑÇ", "Hola que tal estas"));
        // System.out.println(areTheFieldsCorrect("123123A", "Hola que tal estas çañ aña
        // ñañ ñañ ñañañañañañañañañañ "));
        // System.out.println(hasDescriptionSpecialChars(" Hola çñÇÑ ")); // true
        // System.out.println(hasDescriptionSpecialChars("L'amigdala")); // true
        // System.out.println(hasDescriptionSpecialChars("L'amigdala \n")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó")); // true
        // System.out.println(hasDescriptionSpecialChars("Amic")); // true
        // System.out.println(hasDescriptionSpecialChars("Lorizó %")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó $")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó |")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó <")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó >")); // false
        // System.out.println(hasDescriptionSpecialChars("Lorizó INSERT INTO"));// false
        // System.out.println(hasDescriptionSpecialChars("Lorizó UPDATE"));// false
        // System.out.println(hasDescriptionSpecialChars("Lorizó <xmls>"));// false
        // System.out.println(hasDescriptionSpecialChars("Lorizó DROP"));// false
        // System.out.println(hasDescriptionSpecialChars("Lorizó DELETE"));// false

        // String[] tests = {
        // "Este es un texto normal.",
        // "UPDATE tabla SET columna = valor;", // Inválido
        // "DELETE FROM tabla WHERE columna = valor;", // Inválido
        // "SELECT * FROM tabla;", // Inválido
        // "Texto con ñ y acentos áéíóú.", // Válido
        // "Texto con caracteres especiales \u0000.", // Válido
        // "Hola -- Adios", // Válido
        // "Texto con caracteres especiales \u007f.", // Válido
        // "Texto con caracteres especiales \u00ff.", // Válido
        // "Texto con nueva línea \n y retorno \r.", // Válido
        // "Texto con espacios \t y saltos \n.", // Válido
        // "Texto con separación \r\n en medio.", // Válido
        // "Texto con combinación \u0000\u007f\u00ff.", // Válido
        // "Texto con <script>alert('xss');</script>", // Inválido
        // "Texto con -- comentario", // Inválido
        // "Texto con /* bloque */ comentario", // Inválido
        // "Texto con ; DROP TABLE usuarios;", // Inválido
        // "Texto con DROP TABLE usuarios;", // Inválido
        // "Texto con UPDATE TABLE usuarios;", // Inválido
        // "Texto con `UPDATE TABLE usuarios;`", // Inválido
        // "Lorizó %",
        // "Lorizó $",
        // "Lorizó |",
        // "Lorizó <",
        // "Lorizó >",
        // "Lorizó ",
        // "We have to DELETE something", // true
        // "AB C Ć D E Ę F G H I J K L Ł M N Ń O Ó P Q R S Ś T U V W X Y Z Ź Ż",
        // "Ą",
        // "Ę",
        // "Ł",
        // "аз буки веди",
        // "глаголь добро есть",
        // "живете зело земля",
        // "' OR '1'='1",
        // "' OR (SELECT COUNT(*) FROM users) > 0 --",
        // "<input type='text' value='' onfocus='alert(\"XSS\")'>",
        // "' UNION SELECT username, password FROM users --",
        // "'; DROP TABLE users; --",
        // "Aqui - dos",
        // "Aqui dos --"

        // };

        // for (String eg : tests) {
        // System.out.println(hasDescriptionSpecialChars(eg));
        // }

        // System.out.println(areTheFieldsCorrect("ABCDEFGHIJKLMNOPQRS123409875X"));
        // System.out.println(areTheFieldsCorrect("Hola2"));
        // System.out.println(areTheFieldsCorrect("Hola."));
        // System.out.println(areTheFieldsCorrect("Hola^"));
        // System.out.println(areTheFieldsCorrect("Hola&"));

        // System.out.println(validateNumeric("1912739012"));
        // System.out.println(validateNumeric("191273901A2"));
        // System.out.println(validateNumeric("191273901@2"));

        // System.out.println(hasSpecialChars("191273901A2"));
        // System.out.println(validateNumeric("191273901A2@"));
        // System.out.println(toAlternativeString3("Hola adios 12345 123"));
        // System.out.println(toAlternativeString3("Hola adios 12345 123"));
        // System.out.println(reverseWords("Hola QueAASD Tal 123123 11223"));
        // System.out.println(upArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4,
        // 5, 6, 8, 6, 7, 8, 1, 9, 2, 3, 4,
        // 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
        // System.out.println(numberOfDivisors(30));
        // System.out.println(squareDigits("Hola QueAASD Tal 123123 11223"));
        // calcularInversionYRetornoEnETFsSegunElPorcentajeAnual();
        // System.out.println(cakes(Map.of(
        // "flour", 500,
        // "sugar", 200,
        // "eggs", 1),
        // Map.of(
        // "flour", 1200,
        // "sugar", 1200,
        // "eggs", 5,
        // "milk", 200)));
        String LIPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
                + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
                + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
                + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
                + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
                + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
                + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
                + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
                + " et dolor.";
        String LIPSUM2 = "123 45 6";
        // System.out.println(justify(LIPSUM, 30));
        System.out.println(justify(LIPSUM, 33));
        // System.out.println(justify(LIPSUM, 30));
        // System.out.println(justify(LIPSUM, 30));
        // System.out.println(justify(LIPSUM2, 7));
    }

    public static String justify(String text, int width) {
        List<String> response = new ArrayList<>();

        List<String> words = Arrays.stream(text.split(" ")).collect(Collectors.toList());

        int counter = 0;
        List<String> currentWords = new ArrayList<>();
        boolean specialSituation = false;

        for (String word : words) {
            counter += word.length() + 1;

            if (width == counter) {
                currentWords.add(word);
                response.add(fillGaps(currentWords, counter - currentWords.size(), width));
                currentWords.clear();
                counter = 0;
                continue;
            }

            if (specialSituation) {
                specialSituation = false;
                if (width + 1 == counter) {
                    currentWords.add(word);
                    response.add(String.join(" ", currentWords));
                    currentWords.clear();
                    counter = 0;
                    continue;
                } else {
                    response.add(fillGaps(currentWords, counter - currentWords.size() - word.length() - 1, width));
                    currentWords.clear();
                    counter = word.length() + 1;
                }
            }

            if (width == counter + 1) {
                specialSituation = true;
                currentWords.add(word);
                continue;
            }

            if (width + 1 == counter) {
                currentWords.add(word);
                response.add(String.join(" ", currentWords));
                currentWords.clear();
                counter = 0;
                continue;
            }

            if (counter >= width) {
                response.add(fillGaps(currentWords, counter - word.length() - currentWords.size() - 1, width));
                counter = word.length() + 1;
                currentWords.clear();
            }

            currentWords.add(word);

            if (words.get(words.size() - 1).equals(word) && !currentWords.isEmpty()) {
                response.add(String.join(" ", currentWords));
                currentWords.clear();
                counter = 0;
            }
        }

        return String.join("\n", response);
    }

    private static String fillGaps(List<String> currentList, int wordCounter, int width) {
        int gapsRemaining = width - wordCounter;

        if (gapsRemaining == currentList.size() - 1 && gapsRemaining != 0) {
            return String.join(" ", currentList);
        }
        if (currentList.size() <= 1) {
            return currentList.get(0);
        }

        int gapsPerWord = gapsRemaining / (currentList.size() - 1);
        int extraGaps = gapsRemaining % (currentList.size() - 1);
        boolean hasExtraGaps = extraGaps != 0;
        int extraGapsCounter = hasExtraGaps ? extraGaps : 0;

        StringBuilder response = new StringBuilder();

        for (int i = 0; i < currentList.size() - 1; i++) {
            response.append(currentList.get(i) + " ".repeat(hasExtraGaps ? gapsPerWord + 1 : gapsPerWord));

            if (hasExtraGaps) {
                extraGapsCounter--;
            }

            if (extraGapsCounter <= 0) {
                hasExtraGaps = false;
            }

        }
        response.append(currentList.get(currentList.size() - 1));

        return response.toString();
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> cakeCounter = new ArrayList<>();

        for (String recipeKey : recipe.keySet()) {
            if (!available.containsKey(recipeKey)) {
                return 0;
            }

            int availability = available.get(recipeKey) / recipe.get(recipeKey);
            cakeCounter.add(availability);
        }

        Collections.sort(cakeCounter);

        return cakeCounter.get(0);
    }

    private static void calcularInversionYRetornoEnETFsSegunElPorcentajeAnual() {
        int age = 25;
        double sum = 10000;
        double porcentajeAnual = 3.5 / 100;
        // int yearAcumulator = 300 * 12;
        // Como si cobrara 5k al mes
        int[] variableAcumulator = new int[] { 1000, 1000, 1800, 2000, 1500, 1600, 1400, 1200, 3000, 1000, 1700, 800 };
        int moneySpent = 0;

        for (int i = 1; i <= age; i++) {
            for (int j = 1; j <= 12; j++) {
                sum += variableAcumulator[j - 1] + ((sum + variableAcumulator[j - 1]) * (porcentajeAnual / 12));
                moneySpent += variableAcumulator[j - 1];
            }
        }

        System.out.println("Suma total: " + Math.rint(sum * 100) / 100 + "$");
        System.out.println("Total Invertido: " + moneySpent + "$");
        System.out.println("Diferencia invertido con ganado: " + ((Math.rint(sum * 100) / 100) - moneySpent) + "$");

    }

    public static int[] upArrayLucia(final int[] arr) {
        StringBuilder result = new StringBuilder();

        if (arr == null) {
            return null;
        }

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 || arr[i] < 0) {
                return null;
            }
            num = Integer.parseInt(String.valueOf(result.append(arr[i])));
        }
        num++;

        int[] array = new int[String.valueOf(num).length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        }

        return array;
    }

    public static int[] upArrayHakim(final int[] arr) {
        StringBuilder initNumber = new StringBuilder();
        for (int j : arr) {
            if (j > 9 || j < 0) {
                return null;
            }
            initNumber.append(j);
        }
        int finalNumber = Integer.parseInt(String.valueOf(initNumber)) + 1;
        int arrLength = Integer.toString(finalNumber).length();
        int[] result = new int[arrLength];
        while (finalNumber > 0) {
            result[arrLength - 1] = finalNumber % 10;
            finalNumber = finalNumber / 10;
            arrLength -= 1;
        }
        return result;
    }

    public static int[] upArray(final int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        String strNumber = Arrays.stream(arr).mapToObj(x -> (x > 9 || x < 0) ? null : String.valueOf(x))
                .collect(Collectors.joining());

        if (strNumber.contains("null")) {
            return null;
        }

        BigInteger bigIntegerNumber = new BigInteger(strNumber).add(BigInteger.ONE);

        return Arrays.stream(String.valueOf(bigIntegerNumber.toString(0)).split("")).mapToInt(x -> Integer.parseInt(x))
                .toArray();
    }

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String number = String.valueOf(n);
        for (char charDigit : number.toCharArray()) {
            int digit = Character.getNumericValue(charDigit);
            result.append(digit * digit);
        }
        return Integer.parseInt(result.toString());
    }

    public static long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).count();
    }

    public static String reverseWords(String str) {
        List<String> list = Arrays.stream(str.split("\\s+")).collect(Collectors.toList());

        Collections.reverse(list);

        return list.stream().collect(Collectors.joining(" "));
    }

    public static String toAlternativeString3(String string) {

        return Arrays.stream(string.split(""))
                .map(x -> Character.isUpperCase(x.charAt(0)) ? x.toLowerCase() : x.toUpperCase())
                .collect(Collectors.joining());
    }

    private static boolean validateNumeric(String input) {
        return !input.matches("^[0-9]+$");
    }

    private static boolean hasSpecialChars(String input) {
        return !input.matches("^[a-zA-Z0-9]+$");
    }

    public static boolean areTheFieldsCorrect(String id) {
        if (id == null || id.isEmpty()) {
            return false;
        }
        String idPattern = "^[a-zA-Z0-9]+$";
        return !id.matches(idPattern);
    }

    public static boolean hasDescriptionSpecialChars(String description) {
        if (description == null || description.isEmpty()) {
            return false;
        }
        description = description.replaceAll("\\s", "");
        String pattern = ".*([<>%|&;`\\n\\r\\x00\\x1f\\x7f\\x0f]|--).*+$";
        System.out.println(description);
        return description.matches(pattern);
    }

    public static String smash(String... words) {
        return String.join(" ", words);
        // return Arrays.stream(words).collect(Collectors.joining(" "));
    }

    public static String rot13(String message) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "n");
        map.put("A", "N");
        map.put("b", "o");
        map.put("B", "O");
        map.put("c", "p");
        map.put("C", "P");
        map.put("d", "q");
        map.put("D", "Q");
        map.put("e", "r");
        map.put("E", "R");
        map.put("f", "s");
        map.put("F", "S");
        map.put("g", "t");
        map.put("G", "T");
        map.put("h", "u");
        map.put("H", "U");
        map.put("i", "v");
        map.put("I", "V");
        map.put("j", "w");
        map.put("J", "W");
        map.put("k", "x");
        map.put("K", "X");
        map.put("l", "y");
        map.put("L", "Y");
        map.put("m", "z");
        map.put("M", "Z");
        map.put("n", "a");
        map.put("N", "A");
        map.put("o", "b");
        map.put("O", "B");
        map.put("p", "c");
        map.put("P", "C");
        map.put("q", "d");
        map.put("Q", "D");
        map.put("r", "e");
        map.put("R", "E");
        map.put("s", "f");
        map.put("S", "F");
        map.put("t", "g");
        map.put("T", "G");
        map.put("u", "h");
        map.put("U", "H");
        map.put("v", "i");
        map.put("V", "I");
        map.put("w", "j");
        map.put("W", "J");
        map.put("x", "k");
        map.put("X", "K");
        map.put("y", "l");
        map.put("Y", "L");
        map.put("z", "m");
        map.put("Z", "M");

        StringBuilder sb = new StringBuilder();

        String[] strspl = message.split("");
        for (int i = 0; i < strspl.length; i++) {
            sb.append(map.containsKey(strspl[i]) ? map.get(strspl[i]) : strspl[i]);
        }

        return sb.toString();
    }

    public static int sumsOdd(int n) {
        return (int) IntStream.range(0, n).filter(x -> x % 2 != 0).reduce((x1, x2) -> x1 + x2).getAsInt();
    }

    public static int oddCount(int n) {
        return (int) IntStream.range(0, n).filter(x -> x % 2 != 0).count();
    }

    public static long ipsBetween(String start, String end) {
        long[] a = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).toArray();
        long[] b = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).toArray();

        long[] c = IntStream.range(0, 4).map(i -> (int) a[4 - i - 1]).mapToLong(x -> (long) x)
                .toArray();

        long[] d = IntStream.range(0, 4).map(i -> (int) b[4 - i - 1]).mapToLong(x -> (long) x)
                .toArray();

        long c1 = c[0];
        long d1 = d[0];

        for (int i = 1; i < 4; i++) {
            c1 += 1L << c[i] * (long) Math.pow(1, i);
            d1 += 1L << d[i] * (long) Math.pow(1, i);
        }

        return Math.abs(c1 - d1);
    }

    public static String ghostBusters(String building) {
        /*
         * return building.contains(" ") ? building.replace(" ", "") :
         * "You just wanted my autograph didn't you?";
         * 
         */

        if (!building.contains(" "))
            return "You just wanted my autograph didn't you?";
        return Arrays.stream(building.split("\\s+")).collect(Collectors.joining(""));
    }

    public static long[] powersOfTwo(int n) {
        long[] a = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            a[i] = 1L << i;
        }

        return a;
    }

    public static String foo(String str) {
        return str.substring(2);
    }

    public static int sumIntervals(int[][] intervals) {
        List<int[]> l = new ArrayList<>();
        int finalSum = 0;

        for (int[] a : intervals) {
            l.add(a);
        }

        int sum = 0;

        for (int i = 0; i < l.size(); i++) {
            int[] current = l.get(i);
            sum = current[1] - current[0];
            boolean hasInterval = false;
            int intervalValue = 0;

            for (int j = 0; j < i; j++) {
                if (current[0] < l.get(j)[1]) {
                    if (current[0] < 0 && current[1] < l.get(j)[0]) {
                        continue;
                    }
                    hasInterval = true;
                    intervalValue = l.get(j)[1] - l.get(j)[0];
                }
            }

            finalSum += hasInterval ? Math.abs(intervalValue - sum) : sum;

        }

        return finalSum;
    }

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static boolean validParentheses(String parenStr) {
        while (parenStr.contains("()"))
            parenStr = parenStr.replace("()", "");
        return "".equals(parenStr);

    }

    public static int[] snail(int[][] array) {
        List<int[]> list = new ArrayList<>();
        List<int[]> fL = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int[] a : list) {
                fL.add(a);
                list.remove(a);
                list.stream().map(x -> fL.add(x)).peek(x -> list.remove(x));
            }
        }

        return null;
    }

    public static String pigIt(String str) {
        // EVITAR tocar caracteres especiales
        return Arrays.stream(str.split(" "))
                .map(x -> x.matches("^[a-zA-Z.]+$") ? x.substring(1) + x.charAt(0) + "ay" : x)
                .collect(Collectors.joining(" "));
        // BEST PRACTICE
        // return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static boolean validateWord(String word) {
        Map<Object, Integer> map = new HashMap<>();
        Arrays.stream(word.split("")).map(String::toLowerCase).forEach(x -> {
            map.put(x, (map.containsKey(x)) ? map.get(x) + 1 : 1);
        });
        return map.values().stream().distinct().count() == 1;
    }

    public static List<String> top3(String s) {
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(s.split("[^a-zA-Z']"))
                .map(String::trim)
                .map(String::toLowerCase)
                .filter(x -> !x.isEmpty() && x.matches(".*[a-zA-z].*"))
                .collect(Collectors.toList())
                .forEach(x -> {
                    map.put(x, (map.containsKey(x) ? map.get(x) + 1 : 1));
                });

        return map.entrySet().stream()
                .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey).collect(Collectors.toList());

    }

    private static String pofi(int n) {
        if (n == 0)
            return "1";
        String[] map = { "1", "i", "-1", "-i" };
        return map[Math.abs(n % 4)];
    }

    private static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(a).forEach(x -> {
            map.put(x, map.containsKey(x) ? map.get(x) + 1 : 1);
        });

        Optional<Integer> answer = map.entrySet().stream().filter(x -> x.getValue() % 2 == 1)
                .max(Entry.comparingByValue()).map(Entry::getKey);

        return answer.get();
    }

    public static boolean isValid(String braces) {
        String b = braces;
        System.out.println(braces);
        for (int i = 0; i < braces.length() / 2; i++) {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if (b.length() == 0)
                return true;
        }
        return false;
    }

    public static char findMissingLetter(char[] array) {
        String a = "abcdefghijklmnopqrstuvwxyz";

        if (Character.isUpperCase(array[0])) {
            a = a.toUpperCase();
        }

        int beggining = a.indexOf(String.valueOf(array[0]));

        for (int i = 0; i < array.length; i++) {
            if (beggining + i >= array.length) {
                beggining = beggining % a.length();
            }
            if (!String.valueOf(array[i]).equals(String.valueOf(a.charAt(beggining + i)))) {
                return a.charAt(beggining + i);
            }
        }

        return ' ';
    }

    public static String[] wave(String str) {
        if ("".equals(str)) {
            return new String[0];
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                continue;
            }

            String medio1 = str.substring(0, i);
            String medio2 = str.substring(i + 1, str.length());

            list.add(medio1 + String.valueOf(str.charAt(i)).toUpperCase() + medio2);

        }

        return list.toArray(new String[0]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int suposed = target - numbers[i];
            if (map.containsKey(numbers[i])) {
                return new int[] { map.get(numbers[i]), i };
            } else {
                map.put(suposed, i);
            }
        }

        return new int[0];
    }

    public static Map<Character, Integer> count(String str) {
        if ("".equals(str)) {
            return new HashMap<>();
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }

        return map;
    }

    public static int dutyFree(int normPrice, int discount, int hol) {

        return (int) Math.floor(hol / (normPrice * ((double) discount / 100)));

    }

    public static String encrypt(final String text, final int n) {
        if (n <= 0 || text == null) {
            return text;
        }

        String oddStr = IntStream.range(0, text.length()).filter(x -> x % 2 != 0).mapToObj(text::charAt)
                .map(String::valueOf).collect(Collectors.joining());
        String evenStr = IntStream.range(0, text.length()).filter(x -> x % 2 == 0).mapToObj(text::charAt)
                .map(String::valueOf).collect(Collectors.joining());

        return encrypt(oddStr + evenStr, n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (n <= 0 || encryptedText == null) {
            return encryptedText;
        }

        int textHalfLength = encryptedText.length() / 2;
        String first = encryptedText.substring(0, textHalfLength);
        String last = encryptedText.substring(textHalfLength);

        String decrypted = IntStream.range(0, textHalfLength)
                .mapToObj(x -> String.valueOf(last.charAt(x)) + String.valueOf(first.charAt(x)))
                .collect(Collectors.joining());

        if (encryptedText.length() % 2 != 0) {
            decrypted += last.charAt(textHalfLength);
        }

        return decrypt(decrypted, n - 1);
    }

    public static String createPhoneNumber(int[] numbers) {
        String str = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
        StringBuilder strB = new StringBuilder();
        strB.append("(");
        for (int i = 0; i < 3; i++) {
            strB.append(String.valueOf(numbers[i]));
        }
        strB.append(") ");

        for (int i = 0; i < 3; i++) {
            strB.append(String.valueOf(str.charAt(3 + i)));
        }
        strB.append("-");
        strB.append(str.substring(6));

        return strB.toString();
    }

    public static List<Boolean> flickSwitch(List<String> lst) {

        boolean[] state = { true };

        return lst.stream().peek(x -> {
            if (x.equals("flick")) {
                state[0] = !state[0];
            }
        }).map(x -> state[0]).collect(Collectors.toList());
    }

    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(x -> (x.length() >= 5) ? new StringBuilder(x).reverse().toString() : x)
                .collect(Collectors.joining(" "));
    }

}
