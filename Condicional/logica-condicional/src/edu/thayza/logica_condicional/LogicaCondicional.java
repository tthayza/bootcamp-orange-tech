package edu.thayza.logica_condicional;

public class LogicaCondicional {

    public static void main(String[] args){

        //operadores relacionais

        int inteiro1 = 10;
        int inteiro2 = 20;

        float flutuante1 = 4.5f;
        float flutuante2 = 3.5f;

        char caractere1 = 'x';
        char caractere2 = 'y';

        String palavra1 = "Fulano";
        String palavra2 = "Fulano";

        boolean boo1eano1 = true;
        boolean booleano2 = false;

        System.out.println(inteiro1 == inteiro2);
        System.out.println(inteiro1 != inteiro2);
        System.out.println(inteiro1 > inteiro2);
        System.out.println(inteiro1 <= inteiro2);
        System.out.println(flutuante1 == flutuante2);
        System.out.println(flutuante1 != flutuante2);
        System.out.println(flutuante1 >= flutuante2);
        System.out.println(flutuante1 < flutuante2);
        System.out.println(caractere1 == caractere2);
        System.out.println(caractere1 != caractere2);
        System.out.println(caractere1 >  caractere2);
        System.out.println(caractere1 <= caractere2);
        System.out.println(palavra1 != palavra2);
        System.out.println(palavra1 == palavra2);


        // operadores lógicos
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));
        System.out.println("b2 || b4" + (b2 || b4));
        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b1 ^ b3" + (b1 ^ b3));
        System.out.println("b4 ^ b1" + (b4 ^ b1));
        System.out.println("!b1" + (!b1));
        System.out.println("!b2" + (!b2));
    }


}
