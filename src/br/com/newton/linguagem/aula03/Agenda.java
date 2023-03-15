package br.com.newton.linguagem.aula03;

public class Agenda { public static void main(String[] args) {


    Telefone tel = new Telefone();
    Telefone tel2 = new Telefone();
    Telefone tel3 = new Telefone();

    Contato cont1 = new Contato();
    Contato cont2 = new Contato();
    Contato cont3 = new Contato();



    cont1.nome = "fernanda";
    cont1.numero = " 6145515183";

    cont2.nome = "gabriel";
    cont2.numero = "2644554545";
    cont3.nome = "juliana";
    cont3.numero = "154454523";

    tel.contato = cont1;
    tel2.contato = cont2;
    tel3.contato = cont3;

    tel.cor = "cinza";
    tel2.cor = "vermelho";
    tel3.cor = "preto";

    tel.marca = "iphone";
    tel2.marca = "S21";
    tel3.marca = "iphone";

    tel3.ligar(cont1);
    tel.tocar("rock");


    System.out.println(tel.contato.nome +"  "+ tel.contato.numero+"  " +tel.marca);
    System.out.println(tel2.contato.nome +"  "+ tel2.contato.numero + "  "+ tel2.marca);
    System.out.println(tel3.contato.nome +"  "+ tel3.contato.numero+ "  " +tel3.marca);
    System.out.println(tel.cor+ "  "+tel2.cor+ "  "+tel3.cor);



}
}