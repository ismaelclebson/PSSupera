package pssupera;
import javax.swing.JOptionPane;


public class Desafio1 {


    public static void main(String[] args) {
        int n1 = 0, maior = 0, menor = 100000, cont = 0, i;
        String aux = "", resp = "";

        while(!"n".equals(resp)){
            aux = JOptionPane.showInputDialog(null, "Informe um número ");
            n1 = Integer.parseInt(aux);
            cont = cont+1;

            if(n1 % 2 == 0){
            for(i = 0; i < cont; i++){ //esse for poderia estar fora do while, no entanto ele ia guardar apenas uma posição (sendo impossivel fazer comparação), 
                if(maior < n1){      //então para não ter que fazer um vetor coloquei o for dentro do while assim ele ja faz as comparaçoes e salva 
                    maior = n1;  //essa seria uma das importancias de um vetor, armazenar um valor de um loop para outro loop externo a ele
                }            
            }
            }else{
            for(i = 0; i < cont; i++){ //esse for poderia estar fora do while, no entanto ele ia guardar apenas uma posição (sendo impossivel fazer comparação), 
                if(menor > n1){      //então para não ter que fazer um vetor coloquei o for dentro do while assim ele ja faz as comparaçoes e salva 
                    menor = n1;  //essa seria uma das importancias de um vetor, armazenar um valor de um loop para outro loop externo a ele
                }            
            }
            }
           resp = JOptionPane.showInputDialog(null, "Informe 's' para continuar e 'n' para sair");

        }



    }

}