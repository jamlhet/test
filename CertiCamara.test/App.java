package javaapplication1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author juancarlos
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    /**
     *
     * @param numbers
     * @return vreturn
     * @throws Exception
     */
    public static int add(String numbers) throws Exception {
        //<editor-fold defaultstate="collapsed" desc="String Calculator">
        //</editor-fold>
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String [] lnumbers;

            if (numbers.startsWith("//")) {
                Matcher matcher =
                        Pattern.compile("//(.)\n(.*)").matcher(numbers);
                matcher.matches();
                String miDelimitador = matcher.group(1);
                lnumbers = matcher.group(2).split(Pattern.quote(miDelimitador));
            } else {
                lnumbers = numbers.split(",|\n");
            }

            String excpMsg = "Negatives not allowed: ";
            Boolean negatives =  false;

            Integer vreturn = 0;

            for (int i = 0; i < lnumbers.length; i++) {
                int numeroActual = Integer.parseInt(lnumbers[i]);

                if (numeroActual < 0) {
                    excpMsg += lnumbers[i] + ", ";
                    negatives = true;
                }
                vreturn += numeroActual;
            }

            if (negatives) {
                String mensajeSinUltimaComa =
                        excpMsg.substring(0, excpMsg.length() - 2);
                throw new Exception(mensajeSinUltimaComa);
            }
            return vreturn;
        }
    }
}
