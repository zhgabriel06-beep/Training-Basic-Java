import java.util.*;

public class Colecoes {
    public static void main(String[] args){
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Pedro");

        System.out.println(funcionarios.getFirst());
        System.out.println(funcionarios.get(1));


        Set<String> pessoas = new HashSet<>();
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("Joao");
        pessoas.add("Gabriel");
        pessoas.add("Pedro");
        // não imprime valores duplicados

        System.out.println(pessoas);

        Set<String> pessoas2 = new LinkedHashSet<>();
        pessoas2.add("Pedro");
        pessoas2.add("Maria");
        pessoas2.add("Gabriel");

        System.out.println(pessoas2);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Pedro");
        clientes.put(2, "Joao");
        clientes.put(1, "Gabriel");
        // reescreve em cima do valor da chave
        System.out.println(clientes.get(1));
        // = Gabriel. Ele busca pela chave
        pessoas2.size();
        System.out.println(pessoas2.size());
    }
}
