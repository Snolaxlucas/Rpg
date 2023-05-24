import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Importes de localidade e scanner.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Armazenar a quantidade de jogadores.
        System.out.println("Quantos jogadores na sessão?");
        int n = sc.nextInt();
        List<Jogadores> list = new ArrayList<>();
        //Armaenar as informações do jogadores.
        for (int i = 0; i < n; i++){
            System.out.println("Digite o seu nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o seu dado: ");
            int dado = sc.nextInt();
            //Verificação de o valor do dado é abaixo de 20.
            for (int i2 = dado; i2 > 20; i2 = dado = sc.nextInt()){
                System.out.println("Digite um numero menor que 20!");
            }
            Jogadores jog = new Jogadores(nome, dado);
            list.add(jog);
            list.sort(Collections.reverseOrder());
        }
        //Printar na tela os valores.
        for (Jogadores jog : list){
            System.out.println(jog);
        }
        sc.close();
    }
}