public class Logica {
    public static void main(String[] args) {
        final int vetor = 50;

        for (int i = 0; i < vetor; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i);
            } else {
                continue;
            }
}

            int[] vetor1 = new int[vetor];
            int[] vetor2 = new int[vetor];
            int[] soma = new int[vetor];

            // Preenchendo os vetores
            for (int i = 0; i < vetor; i++) {
                vetor1[i] = i++;
                vetor2[i] = i++;
            }

            // Somando os vetores
            for (int i = 0; i < vetor; i++) {
                soma[i] = vetor1[i] + vetor2[i];
            }

            // Mostrando o resultado
            for (int i = 0; i < vetor; i++) {
                System.out.println(
                        "Posição " + i +
                                ": " + vetor1[i] +
                                " + " + vetor2[i] +
                                " = " + soma[i]
                );
            }

            // imprimi apenas o valor par e caso seja impar imprimi 0
            int[] par = new int[vetor];
            for (int i = 0; i < vetor; i++) {
                if(i %2== 0){
                    System.out.println(i);
                } else{
                    System.out.println(0);
                }
            }

    }
}


