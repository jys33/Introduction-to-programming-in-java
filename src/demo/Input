package functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author neomi
 */
public final class Input {

    private Input() {
    }

    // Integer.MAX_VALUE => 2147483647
    public static int getPositiveInt(String str) {
        int n;
        do {
            n = get_int(str);
        } while (n < 1);
        return n;
    }

    public static int getInt(String str) {
        String input = null;
        int len;
        int n = 0;
        do {
            input = JOptionPane.showInputDialog(null, str);
            if (input == null) {
                break;
            } else if (!input.isEmpty()) {
                len = input.length();
                int i = 0;
                while (i < len) {
                    char c = input.charAt(i);
                    if ((c > 47 && c < 58) || (c == '-' && i == 0) || (c == '+' && i == 0)) {
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido.");
                        break;
                    }
                }
                if (i == len) {
                    try {
                        n = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, no ingrese un valor mayor a 2147483647 o menor -2147483648.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor.");
            }
        } while (true);

        return n;
    }

    public static int get_int(String str) {
        int n = 0;
        Pattern p = Pattern.compile("^[+-]?\\d+$");
        while (true) {
            String input = JOptionPane.showInputDialog(str);
            if (input == null) {
                break;
            }
            Matcher m = p.matcher(input);
            if (m.find()) {
                try {
                    n = Integer.parseInt(m.group());
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "No ingrese valores mayores a 2147483647 o menores -2147483648.");
                }
            }
        }
        return n;
    }
}
