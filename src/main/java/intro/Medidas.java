//1- Pacote
package intro;
//2-Redeferencia as bibliotecas


//3-Classe
public class Medidas {
    //3.1 -Atributos - Caracteristicas


    //3.2 - Metodos e Funções
    public static  void main (String[]args) {
        System.out.println("Calculo de Areas");

        //Calcula de área - Reduzido
        int largura = 3;
        int comprimento = 2;
        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + " A aréa é de "
                + largura * comprimento);

    }

        public void calcularAreaModoExtenso () {
            //Calculo de área - Exemplo: o tamanho do tapete ou piso
            int largura;
            int comprimento;
            int resultado;

            largura = 5; // Largura recebe 4
            comprimento = 6;

            resultado = largura * comprimento;
            System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + "A aréa é de " + resultado + "m²");
        }
        public void calcularAreaModoCompacto () {




        }
    }

