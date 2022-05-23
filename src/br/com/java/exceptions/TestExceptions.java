package br.com.java.exceptions;

public class TestExceptions {
    public static void main(String[] args) {

//        try {
//            //trecho onde a exce��o pode ocorrer
//            int val = 10 / 0;
//            System.out.println(val);
//        } catch (Exception e) { //captura da exce��o
//            //tratamento da exce��o
//            e.printStackTrace();
//        }

        //Exce��es Unchecked
        try {
            int val = 10 / 0;

            int[] valores = new int[3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

        } catch (ArithmeticException e) {
            System.out.println("N�o � poss�vel realizar uma divis�o por zero!");

            //Mensagem com a lista de erros
            System.out.println(e.getMessage());

            //Imprime a pilha do erro da exce��o
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("N�o � poss�vel acessar a posi��o 4 do array!");

        } catch (NullPointerException e) {
            System.out.println("N�o foi poss�vel retornar o length, vari�vel nome n�o instanciada!");

        } catch (NumberFormatException e) {
            System.out.println("N�o foi poss�vel realizar a convers�o!");

        } catch (Exception e) {
            System.out.println("Erro na execu��o do programa!");

        } finally {
            System.out.println("Sempre passar� aqui!");
        }
    }
}
