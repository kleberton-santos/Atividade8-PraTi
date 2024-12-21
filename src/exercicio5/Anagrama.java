package exercicio5;

import java.util.Arrays;

public class Anagrama {
    public boolean saoAnagramas(String palavra1, String palavra2) {
        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
