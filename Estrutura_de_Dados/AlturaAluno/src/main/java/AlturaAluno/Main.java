
package AlturaAluno;

public class Main {

    
    public static void main(String[] args) {
        
        double vetor[] = new double[5];
        
        vetor[0] = 1.73;
        vetor[1] = 1.84;
        vetor[2] = 1.95;
        vetor[3] = 1.52;
        vetor[4] = 1.65;
        
        double maior = vetor[0];
        
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        
        System.out.println("Maior altura: " + maior);
        
        double soma = 0;
        double media;
        
        for (int j = 0; j < vetor.length; j++) {
            soma = soma + vetor[j];
        }
        
        media = soma / 5;
                
        System.out.println("Media: " + media);
        
        int qtd = 0;
        
        for (int k = 0; k < vetor.length; k++ ) {
            if (vetor[k] > media) {
                qtd++;
            }
        }
        
        System.out.println("Quantidade de alunos acima da media:" + qtd);
        
        
        
            
        
        
        
        
        
        
        
    }
    
}
