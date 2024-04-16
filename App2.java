import java.util.Scanner;
import java.util.ArrayList;
public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        
        int totalSim = 0;
        
            System.out.println("Responda com sim ou não");
            System.out.println("Telefonou para a vítima? ");
            String valor1 = scanner.nextLine(); 
             lista.add(valor1);

             System.out.println("Esteve no local do crime? ");
            String valor2 = scanner.nextLine(); 
             lista.add(valor2);

             System.out.println("Mora perto da vítima? ");
            String valor3 = scanner.nextLine(); 
             lista.add(valor3);

             System.out.println("Devia para a vítima? ");
            String valor4 = scanner.nextLine(); 
             lista.add(valor4);

             System.out.println("Já trabalhou com a vítima? ");
            String valor5 = scanner.nextLine(); 
             lista.add(valor5);

            for( String resposta : lista){
                if (resposta.equals("sim")){
                    totalSim++;
                }
            }    
                if(totalSim == 2){
                    System.out.println("\nParticipação: Suspeita");
                }else if(totalSim >=3 && totalSim <= 4){
                    System.out.println("\nParticipação: Cúmplice");
                }else if(totalSim == 5){
                    System.out.println("\nParticipação: Assassino");
                }else{
                    System.out.println("\nParticipação: Inocente");
                }
            scanner.close();    
         }
    }
    
