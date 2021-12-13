//1- Pacote
package intro;
//2-Redeferencia as bibliotecas

import java.util.Scanner;

//3-Classe
public class Medidas {
    //3.1 -Atributos - Caracteristicas


    //3.2 - Metodos e Funções
    public static  void main (String[]args){

        //utolizar a classe Scanner do Java para ler a escolha do usuario no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c -- Calcular Modo Curto");
        System.out.println("e -- Calcular Modo Extenso");
        System.out.println("d -- Contar até Dez");
        System.out.println("i -- IfSiples");
        System.out.println("d -- Contar até Dez");
        System.out.println("r -- Contagem regressiva de 10 a 0");
        System.out.println("Digite um letra");
        String opcao  = scanner.next();

        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou software
        //String opcao = "ifSimples";
        switch (opcao){
            case "i":
            case"I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case"c":
            case"C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case"d":
            case"D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case"r":
            case"R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que nãi te uma ação associada");

                break;

        }

        System.out.println();
    }
    public static void ifSimples(){
        //Condicional = Verificar ua condição - Fazer ua pergunta para uma pessoa, um hardware ou software
        //if = se
        //else = senão
        String modo = "curto";

        if(modo== "curto"){
            calcularAreaModoCurto();
        }else {
            calcularAreaModoExtenso();
        }
    }
    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de Areas Modo Curto");

        //Calcula de área - Reduzido
        int largura = 3;
        int comprimento = 2;
        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + " A aréa é de "
                + largura * comprimento);
    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Calculo de Areas Modo Extenso");
        //Calculo de área - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // Largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + "A aréa é de " + resultado + "m²");
    }
    public static void contarAteDez(){

        //Loops ou Repetições
        System.out.println("Contagem Crescente");
        for (int numero = 1; numero <=10;numero++){
            System.out.println(numero);

        }
    }
    public static  void contagemRegressiva(){

        System.out.println("Contagem Regressiva");
        for (int numero = 10 ;numero>=0; numero--){
            System.out.println(numero);

        }
    }

}


