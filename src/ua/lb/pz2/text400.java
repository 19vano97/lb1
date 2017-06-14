package ua.lb.pz2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by vanillin on 14.06.2017.
 */
public class text400 {
    public static void main(String[] args) {

        String s = "Abstract. The Kalyna block cipher was selected during Ukrainian National Public Cryptographic Competition (2007-2010) and its slight modifcation was approved as the new encryption standard of Ukraine in 2015.Main requirements for Kalyna were both high security level and high per-\n" +
                "formance of software implementation on general-purpose 64-bit CPUs.\n" +
                "The cipher has SPN-based (Rijndael-like) structure with increased MDS\n" +
                "matrix size, a new set of four di\u000Berent S-boxes, pre- and postwhitening\n" +
                "using modulo 264 addition and a new construction of the key schedule.\n" +
                "Kalyna supports block size and key length of 128, 256 and 512 bits (key\n" +
                "length can be either equal or double of the block size). On the time of\n" +
                "this paper publishing, no more e\u000Bective cryptanalytic attacks than ex-\n" +
                "haustive search are known. In this paper we present the adapted English\n" +
                "translated speci\fcation of Kalyna as it is given in the national standard\n" +
                "of Ukraine.";

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) != null) {
                int n = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++n);
                System.out.println((s.charAt(i)) + " " + n);
            } else {
                hm.put(s.charAt(i), 1);
                System.out.println((s.charAt(i)));
            }
        }
    }
}
