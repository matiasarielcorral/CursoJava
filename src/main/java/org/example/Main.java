package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        byte numeroByte = 9;  //emplea 8 bits // permite almacenar entre -128, 127
        short numeroShort = 32676; //emplea 16 bits // permite almacenar entre -32768, 32768
        int numeroInt = 41825;//emplea 32 bits // permite almacenar entre -2147483648, 2147483647
        long numeroLong = 98984958946954L; //emplea 64 bits // permite almacenar entre -9223372036854775808, 9223372036854775807
        float numeroFloat = 5.973453F;//emplea 32 bits
        double numeroDouble = 26223264655f;//emplea 64 bits
        boolean variableBolean = true;
        char numeroChar=1;
        char letraChar='D';
        String variableString = "Hola a todos";
        int vectorNumeros[] = new int[10];
        int matrizNumeros[][] = new int[4][5];
        Byte numberByte; // primitivo en forma objeto
        final int numeroDocumento = 168392818;
        final char letraA = 'A';
        final float pi;
        pi = 3.1415F;

        int numero1 = 12;
        int numero2 = 6;
        double division;
        int suma,resta,multiplicacion;
        double modulo;
        double operacion;
        operacion = 9/3*5-3+8*2;
        division = numero1/numero2;
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        modulo = numero1%numero2;


        System.out.println("EL RESULTADO DE LA OPERACION ES: "+operacion);
        System.out.println("EL RESULTADO DE LA DIVISION ES: " +division);
        System.out.println("EL RESULTADO DE LA SUMA ES: " +suma);
        System.out.println("EL RESULTADO DE LA RESTA ES: " +resta);
        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " +multiplicacion);
        System.out.println("EL RESULTADO DEL MODULO ES: " +modulo);

        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        b+=a;
        System.out.println(b);
        b-=a;
        System.out.println(b);

        boolean igualQue = 5==4;
        boolean distintoQue = 4!=2;
        boolean menorQue= 5<3;
        boolean mayorQue = 5>3;

        System.out.println(igualQue);
        System.out.println(distintoQue);
        System.out.println(menorQue);
        System.out.println(mayorQue);

        int acondicional = 4;
        int bcondicional = acondicional == 4 ? acondicional+5 : 6-acondicional;
        System.out.println(bcondicional);
        bcondicional= acondicional>4 ?  acondicional*7:acondicional+8;
        System.out.println(bcondicional);

        String saludo = "hola"+"matias";

        System.out.println(saludo);

        double valorPi = Math.PI;
        System.out.println(valorPi);
        double raizCuadrada = Math.sqrt(100);
        System.out.println(raizCuadrada);

    }
}