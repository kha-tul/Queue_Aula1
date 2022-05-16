package br.dio.aula.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue_Aula {
    public static void main(String[] args) {
        //Queue - as elementos devem seguir a mesma ordem que entram para sair.
        //Permite adição e removação considerando a a regra básica de fila: Primeiro q entra, é primeiro q sai.
        //Queue é não permite a alteração do elemento. Só add ou remover.
        //Caso precise alterar, é necessário remover o elemento da lista, fazer alteração e adicionar novamente.
        //O elemento adicionado-alterado, entra com nova posição.
        //Não permite mudança na alteração de ordem.

        Queue<String> filaDeBanco = new LinkedList<>(); //tipo de dado String
        //LinkedList implementa a interface do queue.
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flavio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Andersom");

        System.out.println(filaDeBanco);

        //Queue possuí metodos semelhantes a interface List. São herdados pelo collection.
        // não é possível remover um elemento do meio da lista(fila). sempre trabalhar com primeiro elemento.

        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);
                //pool - recebe e remove o primeiro item da fila.
                // peek - retorna, mas não remove o primeiro elemento da fila.
                // element - semelhante ao peek, retorna, mas não remove o primeiro elemento da fila. Se a fila
      //estiver vazia, ele retorna uma exceção.

        String primeiroCliente = filaDeBanco.peek(); //peek retorna só primeiro elemento, sem remover
        System.out.println(primeiroCliente);

        String primeiroClienteOuErro = filaDeBanco.element(); //element exibe primeiro elemento e retorna ele ou erro.
        System.out.println(primeiroClienteOuErro);

        // Opções para navegar no elemento Queue:

        for (String client : filaDeBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("--> " + iteratorFilaBanco.next());
        }
        System.out.println(filaDeBanco.size());
        
        System.out.println(filaDeBanco.isEmpty());
    }
}
