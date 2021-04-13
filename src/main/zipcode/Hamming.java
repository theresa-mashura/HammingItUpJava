package zipcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hamming {

    private String s;
    private String s1;

    public Hamming(String s, String s1) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int l = s.length();
        int b = IntStream.range(0, l)
                .map(i -> {
                    if (s.charAt(i) != (s1.charAt(i))) {
                        return 1;
                    } else { return 0;}
                })
                .sum();

        return b;
    }
}
