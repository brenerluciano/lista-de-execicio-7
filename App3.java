import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> listaNumero = new ArrayList<Double>();
    
    double numeros = 0;

    while (numeros != -1) {
        System.out.println("Insira as notas desejadas:  (-1 para finalizar o programa)");
        numeros = scanner.nextDouble();
        if(numeros == -1){
            break;
        }
        listaNumero.add(numeros);
    }
    System.out.println("\nQuantidade de Notas lidas: " + listaNumero.size());
    
    System.out.println("\nNotas: " + listaNumero);

    Collections.reverse(listaNumero);
    System.out.println("\nNotas na sequência inversa. ");
    for(double numerosInverso : listaNumero){
        System.out.println(numerosInverso);
    }
    double soma = 0;
    for(double somatotal : listaNumero){
        soma += somatotal;
    }
    System.out.println("\nSoma: " + soma);

    double mediaDasSomas = soma / listaNumero.size();
    System.out.printf("\nMédia da soma: %.1f" , mediaDasSomas);
    System.out.println();

    int acimaDaMedia = 0;
    int abaixoDeSete = 0;
        
    for (int i = 0; i < listaNumero.size(); i++) {
     if (listaNumero.get(i) > mediaDasSomas) {
       acimaDaMedia++;
        }
          if (listaNumero.get(i) < 7) {
                abaixoDeSete++;
            }
        }

        System.out.println("\nQuantidade de notas acima da média: " + acimaDaMedia);
        System.out.println("\nQuantidade de notas abaixo de 7: " + abaixoDeSete);
        
        
        System.out.println("\nDepois de muito sofrimeto eu cosegui fazer o programa que você queria, Muito obrigado por utilizar o nosso programa.");
        scanner.close();
    }
  }  

