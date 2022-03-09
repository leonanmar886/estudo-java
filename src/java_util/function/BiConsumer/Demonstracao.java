package java_util.function.BiConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Demonstracao {
    public static void main(String[] args){
        //Duas listas que serão comparadas.
        List<Integer> listaA = new ArrayList<Integer>();
        listaA.add(1);
        listaA.add(2);
        listaA.add(3);

        List<Integer> listaB = new ArrayList<Integer>();
        listaB.add(4);
        listaB.add(2);
        listaB.add(1);

        //Interface BiConsumer onde foi definido usando generics que este receberia duas listas de inteiros
        BiConsumer<List<Integer>,  List<Integer>>
                //Função lambda que utiliza a interface BiConsumer
            iguais = (lista1, lista2) ->
        {
            //Se as listas forem de tamanhos diferentes, já será prontamente identificado que elas não são iguais
            if (lista1.size() != lista2.size()){
                System.out.println("Listas diferentes");
            } else {
                //Comparação de cada item da lista
                for (int i =0; i < lista1.size(); i++)
                    if (lista1.get(i) != lista2.get(i)){
                        System.out.println("Listas diferentes");
                        //Caso seja identificado alguma divergência entre os itens da lista, a operação irá parar por conta desse return.
                        return;
                    }
                    System.out.println("Listas iguais");
            }
        };
        //Função lamda que exibe cada item das listas
        BiConsumer<List<Integer>, List<Integer>> listas = (lista1, lista2) -> {
            lista1.stream().forEach(a -> System.out.print(a + " ")); //Uma stream é aberta para percorrer o fluxo da lista por completo
            System.out.println();
            lista2.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
        };

        //Aqui é onde o método é propriamente chamado. A função lambda que implementou a interface BiConsumer, chama o método accept que pertence a Interface.
        iguais.andThen(listas).accept(listaA, listaB);
    }
}

