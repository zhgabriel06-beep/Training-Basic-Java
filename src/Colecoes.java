import java.util.*;

public class Lista {
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
    }
}
