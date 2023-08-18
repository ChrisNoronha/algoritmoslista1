package revisao;

import revisao.ferramenta.Calculadora;
/***ClasseExecutavel */
public class ClasseExecutavel {

    public static void main(String[] args){

        Calculadora calc = new Calculadora();
        calc.a=3;
        calc.b=5;
        calc.operador = "+";

        System.out.println(calc.operar());

    }



}