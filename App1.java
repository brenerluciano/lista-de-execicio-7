import java.util.ArrayList;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
    
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
        System.out.println("Insira 12 temperaturas:");
        for(int i = 0; i < 12; i++){
         System.out.println("Digite a temperatura média de: " + meses[i] + ": ");
         double valor = scanner.nextDouble(); 
          lista.add(valor);
        }
    
        int soma = 0;
        for(double valor : lista){
            soma += valor;
        }
        double media = soma / lista.size();
        int mediaarredondado = (int) Math.round(media);

        System.out.println("\nTemperaturas acima da média anual (" + mediaarredondado + "): ");
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) > media){
                System.out.println("Mês: " +meses[i]+ " - Temperaturas: " + lista.get(i));
            }
        }
        scanner.close();
    }
}
