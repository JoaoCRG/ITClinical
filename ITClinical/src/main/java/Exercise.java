import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise {

    /**
     * Returns every Nth character from that text that is uppercase or special character.
     *
     * @param string
     * @param nTh
     * @return
     */
    public String extractUpperAndSpecial(String string, int nTh) {

        String upperCases = "";

        String regEx = "[0-9A-Z$&+,:;=?@#|'<>.^*()%!-]";


        String[] stringToArray = string.split("");

        for (int i = nTh - 1; i < stringToArray.length; i += nTh) {

            if (stringToArray[i].matches(regEx)) {

                upperCases += stringToArray[i];

            }

        }
        System.out.println(upperCases);

        return upperCases;
    }

}
