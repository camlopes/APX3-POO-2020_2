package Apx3_2020_2;

public class AP3_2020_2_Q1 {
    public static void main(String[] args) {
        //Das linhas 3-7 criamos softwares que podem ser instalados em contêineres. Nesta criação
        //informamos os seus nomes e respectivos tamanhos.
/*
        Software sublime = new Software("Sublime", 100);
        Software firefox = new Software("Firefox", 1500);
        Software chrome = new Software("Chrome", 2500);
        Software eclipse = new Software("Eclipse", 500);
        Software ubuntu = new Software("Ubuntu", 2000);*/

        Software Tomcat = new Software("Tomcat", 300);
        Software Java = new Software("Java", 1000);
        Software Debian = new Software("Debian", 2000);
        Software SQLServer= new Software("SQL Server", 400);
        Software NET= new Software("NET", 1000);
        Software Ubuntu= new Software("Ubuntu", 2500);
        Software StaticBinary= new Software("Static Binary",
                200);
        Software Alpine= new Software("Alpine", 800);

        //Das linhas 9-11 temos um exemplo
        //de criação de contêineres e adição de softwares

        ///// De acordo com a figura cada contêiner tem os softwares:
        Container c1 = new Container();
        /*c1.addSoftware(chrome);
        c1.addSoftware(sublime);*/
        c1.addSoftware(Tomcat);
        c1.addSoftware(Java);
        c1.addSoftware(Debian);

        Container c2 = new Container();
        /*c2.addSoftware(ubuntu);
        c2.addSoftware(firefox);
        c2.addSoftware(eclipse);*/
        c2.addSoftware(SQLServer);
        c2.addSoftware(NET);
        c2.addSoftware(Ubuntu);

        Container c3 = new Container();
        c3.addSoftware(StaticBinary);
        c3.addSoftware(Alpine);


        // De forma a facilitar a manipulação de
        //diversos contêineres, na linha 18 temos um novo tipo (classe) sendo usado para facilitar
        //esta manipulação.
        Compose containers = new Compose();
        containers.addContainer(c1);
        containers.addContainer(c2);
        containers.addContainer(c3);

        //Na linha 22 vemos um exemplo de manipulação, onde todos os
        //contêineres são executados a partir deste comando (neste nosso cenário, um contêiner,
        //quando criado, possui estado inicial inativo).
        containers.run();// ta dentro de compose**

        //Talvez:**
        //containers.stop();// ta dentro de compose**


        //Apesar da facilidade de manipulação
        //conjunta de contêineres, podemos manipulá-los de forma individual também, como está
        //ocorrendo na linha 23, onde interrompemos a execução de um contêiner.
        //c1.stop(); // esse stop n existe no main final***/

        //Talvez:**
        //c1.run();//**

        // Na linha 25
        //temos a chamada ao método getTamanhoTempoReal, o qual retornará a soma dos
        //tamanhos de todos os softwares de contêineres que estejam ativos.
        //int tamanho = containers.getTamanhoTempoReal();
        System.out.println("Tamanho total: "
                + /*tamanho*/ containers.getTamanhoTempoReal());}} // exibe o somatorio de c1, c2, c3**

        // Para testar sua implementação, reescreva a main() e imprima o
        //tamanho total dos contêineres, levando em conta os softwares listados na figura acima, os
        //quais possuem os seguintes tamanhos:
        //Software Tomcat Java Debian SQL
        //Server
        //.NET Ubuntu Static
        //Binary
        //Alpine
        //Tamanho 300 1000 2000 400 1000 2500 200 800