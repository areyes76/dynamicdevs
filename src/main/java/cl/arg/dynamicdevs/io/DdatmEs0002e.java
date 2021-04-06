package cl.arg.dynamicdevs.io;

import java.util.ArrayList;
import java.util.List;

/**
 * Crear una función que reciba como parámetro un arreglo de números enteros positivos en cualquier
 * orden, el algoritmo debe completar si faltan números en el arreglo en el rango dado. Finalmente
 * devolver el arreglo completo y ordenado de manera ascendente.
 */
public class DdatmEs0002e {

    public static void main(String[] args) {
        if(args==null || args.length==0)
            return;

        DdatmEs0002e c = new DdatmEs0002e();
        int[] intArray = new int[args.length];
        int x = 0;
        for (int i = 0; i < args.length; i++) {
            if(c.isNumeric(args[i]) ) {
                intArray[x] = Integer.parseInt(args[i]);
                x++;
            }
        }
        c.execute(intArray);
    }

    public void execute(int[] intArray){
        Integer[] array = getArray(mayorNumeric(intArray));
        for(int s : array)
            System.out.println(s);
    }

    public int mayorNumeric(int[] intArray) {
        int indiceDelMayor = 0;
        for (int x = 1; x < intArray.length; x++) {
            if (intArray[x] > intArray[indiceDelMayor]) {
                indiceDelMayor = x;
            }
        }
        return intArray[indiceDelMayor];
    }

    public Integer[] getArray(int mayor) {
        List list = new ArrayList<Integer>();
        for (int x = 0; x < mayor; x++) {
            list.add(x+1);
        }
        Integer[] intArray = new Integer[list.size()];
        intArray = (Integer[]) list.toArray(intArray);
        return intArray;
    }

    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
