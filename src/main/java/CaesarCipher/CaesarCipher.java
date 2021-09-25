package CaesarCipher;

public class CaesarCipher {

    //Julius Caesar protected his confidential information
    // by encrypting it using a cipher. Caesar's cipher
    // shifts each letter by a number of letters.
    // If the shift takes you past the end of the alphabet,
    // just rotate back to the front of the alphabet.
    // In the case of a rotation by 3, w, x, y and z would map
    // to z, a, b and c.
    // Note: The cipher only encrypts letters; symbols,
    // such as -, remain unencrypted.

    public String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();
        k = k % 26;

        for (char el : s.toCharArray()) {
            int sign = el;
            if (sign >= 65 && sign <= 90) {
                if ((sign + k) > 90) {
                    int z = 64 + ((sign + k) % 90);
                    String a = Character.toString((char) z);
                    str.append(a);
                } else {
                    String b = Character.toString((char) (sign + k));
                    str.append(b);
                }
            } else if (sign >= 97 && sign <= 122) {
                if ((sign + k) > 122) {
                    String c = Character.toString((char) (96 + ((sign + k) % 122)));
                    str.append(c);
                } else {
                    String d = Character.toString((char) (sign + k));
                    str.append(d);
                }
            } else {
                str.append(el);
            }

        }
        return str.toString();
    }

}
