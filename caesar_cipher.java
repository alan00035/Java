public class caesar_cipher {
    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 0;
        rotation(s, k);

    }

    static String rotation(String str, int k ){

        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] c = s.toCharArray();
        char[] ch = new char[26];
        for(int n =0; n<26; n++){
            ch[n+k] = c[n];
        }

        System.out.println(ch);
        return null;
    }
}

// https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true