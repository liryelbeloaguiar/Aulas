package projeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Aulas sobre Java 8: Programação Funcional – Lambda, Streams, Optional, etc

public class Aula{
    public static void main(String[] args){
        List <Integer> Lista = Arrays.asList(10,1,2,3,7,8,23,4,9,55);
      
        /* 
        String collect = Lista.stream()
        .map(e -> String.valueOf(e)) //tranformando em string
        .collect(Collectors.joining()); //concatenando (juntando) a lista em uma só string
        System.out.println(collect);
        */

        //agrupando em um mapa de booleanos para numeros inteiros
        //true = numeros pares, false = numeros impares
       /* Map<Boolean, List<Integer>> mapa = Lista.stream()
        .collect(Collectors.groupingBy(e -> e % 2 == 0)); 
        System.out.println(mapa);
        */

        //agrupando pela divisão por 3  
       /* Map<Integer, List<Integer>> mapa = Lista.stream()
        .collect(Collectors.groupingBy(e -> e % 3)); 
        System.out.println(mapa);
    */

        //adicinando a primeira lista após uma operação 
        //em uma nova lista
      /* List<Integer> novaLista = Lista.stream()
        .map(e -> e * 3)
        .collect(Collectors.toList());
        System.out.println(novaLista);
      */ 

        //Lista.stream() 
        //Stream
        //.skip(1) // quantos elementos eu quero pular
        //.limit(1) //quantos elementos eu quero processar
        //.distinct() //impede de mostrar elementos repetidos
        //.filter(e -> e % 2==0)
        //.map(e -> e * 2) //transformação de dados
        //.count() // quantidade de itens
        //.forEach(e -> System.out.println(e));


//------Parte 2-----------------------------------------------------------------
 

/*     Optional<Integer> min = Lista.stream()
         .min(Comparator.naturalOrder());
         System.out.println(min.get());
//Minimo e maximo
       Optional<Integer> max = Lista.stream()
         .max(Comparator.naturalOrder());
         System.out.println(max.get());
    */

    //revisar reduce, optional, collect
    

    /*Stream.of(1,2,3)
    .findFirst() //encontra o primeiro 
    .ifPresent(System.out::println); // se houver ele imprimi
    */

  /* 
  //Adicionando na lista collect os itend de Lista2
   List <Integer> Lista2 = Arrays.asList(10,1,2,3,7,8,23);
      List<Integer> collect = Lista2.stream()
      .collect(
        () -> new ArrayList<>(),
        (l , e) -> l.add(e),
        (l1,l2) -> l1.addAll(l2)
      );
      System.out.println(Lista2); 
      System.out.println(collect);
   */
    }
}
