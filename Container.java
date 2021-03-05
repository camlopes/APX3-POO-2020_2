package Apx3_2020_2; import java.util.*;

//AP3_2020_2_Q1
public class Container {
    //Arraylist q adiciona softwares no container**
    //List<Software> softwares = new ArrayList<>();
    List<Software> softwares = new ArrayList<>();
    boolean estadoDoContainer;

    public void addSoftware(Software soft) { softwares.add(soft);
    ///// Container quando iniciado possui estado inicial inativo:
        estadoDoContainer = false; }

    //Apesar da facilidade de manipulação
    //conjunta de contêineres, podemos manipulá-los de forma individual também, como está
    //ocorrendo na linha 23, onde interrompemos a execução de um contêiner.

    ///// Um contêiner pode ser inicializado ou parado individualmente:
    public void stop() { estadoDoContainer = false; }
    public void run() { estadoDoContainer = true; }}