package org.sequencial;

/*
 *    TIPOS PRIMITIVOS
 *       - byte, short, int, float, long, double, char e boolean
 *       - constante final
 *       - templates com STR
 */
public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos Primitivos
        byte x0 = 127;                          //−128a+127
        short x1 = 32767;                       //−32.768 a + 32.767
        int x2 = 2147483647;                    //−2.147.483.648 a +2.147.483.647
        float x3 = 3.40292347e+37f;             //−3.40292347E+38 a +3.40292347E+38
        long x4 = 9223372036854775807L;         //−9.223.372.036.854.775.808 a +9.223.372.036.854.775.807
        double x5 = 1.79769313486231570E+308;   //−1.79769313486231570E+308 a +1.79769313486231570E+308
        char x6 = 'm';                          //'\u0000' a '\uFFFF'
        boolean x7 = true;                      // true ou false

        // Constantes
        final float PI = 3.14f;
        // y0 = 2;  // gera um erro, pois conta

        //Template STR
        System.out.println(
                STR."x0 = \{x0}\nx1 = \{x1}\nx2 = \{x2}\nx3 = \{x3}\nx4 = \{x4}\nx5 = \{x5}\nx6 = \{x6}\nx7 = \{x7}\n"
        );
    }
}
