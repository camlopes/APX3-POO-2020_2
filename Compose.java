package Apx3_2020_2;

import java.util.*;

//AP3_2020_2_Q1
public class Compose { List<Container> container =
            new ArrayList<>();

public void addContainer(Container cont) {
        ////// a lista container recebe os contêineres c1, c2, c3 e o estadoDoContainer
        container.add(cont); }

    //Na linha 22 vemos um exemplo de manipulação, onde todos os
    //contêineres são executados a partir deste comando (neste nosso cenário, um contêiner,
    //quando criado, possui estado inicial inativo).

    ////// Como os contêineres possuiem estado inicial inativo só sera necessario o metodo run:
    public void run() {
        // inicializa todos os contêineres:
        for (int item = 0; item < container.size(); item++)
        { container.get(item).estadoDoContainer = true; } }

        // Na linha 25
    //temos a chamada ao método getTamanhoTempoReal, o qual retornará a soma dos
    //tamanhos de todos os softwares de contêineres que estejam ativos.
    public int getTamanhoTempoReal() { // exibe o somatorio de c1, c2, c3**
        // for q percorre a lista de containers e ve se estadoDoContainer == true pega os tamanhos dos software dentro
        // e os soma
        int Tamanho = 0;
        for (int i = 0; i < container.size(); i++){
            if (container.get(i).estadoDoContainer){
                // Cada iteraçao do 1o for zera a lista tam:
                List<Object> tam = new ArrayList<>();
                tam.addAll(container.get(i).softwares);
                for (int x = 0; x < tam.size(); x++){
                    Software software = (Software) tam.get(x);
                    Tamanho += software.tamanho; } } }
        return Tamanho; }}

///// No main original o tamanho total foi 4000, considerando que o contêiner c1 foi parado e somando somente os ativos.
///// No main reescrito o tamanho total foi de 8200, considerando a figura dada e que todos os contêineres(c1, c2, c3) estao ativos.
