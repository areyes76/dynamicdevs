package cl.arg.dynamicdevs.io;


/**
 * Crear una función que reciba un parámetro string que reemplace cada letra de la cadena con la letra
 * siguiente en el alfabeto. Por ejemplo, reemplazar a por b ó c por d. Finalmente devolver la cadena.
 */
public class DdatmEs0001e {

    public static void main(String[] args) {
        if(args==null || args.length==0)
            return;

        DdatmEs0001e c = new DdatmEs0001e();
        String s = args[0];
        c.execute(s);
    }

    public void execute(String s){
        System.out.println(s);
        char cs = s.charAt(0);  // returns 'l'
        char[] c_arr = s.toCharArray();
        s = "";
        for (char c : c_arr ) {
            int ascii = (int) c;
            if( !isNumeric(Character.toString(c)) ){
                if( !containsSpecialCharacter(Character.toString(c)) )
                    if( !Character.toString(ascii).equals(" "))
                        ascii++;
            }
            s=s+ Character.toString(ascii);

        }
        System.out.println(s);
    }

    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    public boolean containsSpecialCharacter(String s) {
        return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
    }
}
