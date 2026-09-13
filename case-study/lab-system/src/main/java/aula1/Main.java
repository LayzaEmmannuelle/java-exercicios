package aula1;

import java.util.ArrayList;

import aula1.controle.Acesso;
import aula1.controle.Lab;
import aula1.controle.Manutencao;
import aula1.controle.Material;
import aula1.controle.Pessoa;

public class Main {

    public static void main(String[] args) {

        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("Maciel", "maciel123", 1.58f);

        // Usando getters
        System.out.println("Usuário criado: " + pessoa.getUser());

        // Usando setters
        pessoa.setDtNascimento("16/08/2006");
        pessoa.setPeso(58.0f);

        // Criando um laboratório
        Lab labj203 = new Lab("203", "Laboratório para a disciplina de POO.", "J");
        System.out.println("Adicionando materiais ao laboratório " + labj203.getArea() + labj203.getCod());

        // Criando materiais para o laboratório
        ArrayList<Material> materiais = labj203.getMateriais();

        Material m1 = new Material("CAD1", "Cadeira giratória", "Escritório");
        Material m2 = new Material("MES1", "Mesa de madeira", "Escritório");
        Material m3 = new Material("CAN1", "Caneta marcadora", "Cor Azul");

        materiais.add(m1);
        materiais.add(m2);
        materiais.add(m3);

        for (Material material : labj203.getMateriais()) {
            System.out.println("Nome: " + material.getNome());
        }

        // Criando um acesso para a pessoa
        // Acesso não tem uma data de fim definida, após o fim do código a data de saída será definida
        Acesso acesso1 = new Acesso("13/09/2026", pessoa);

        // Criando uma manutenção
        Manutencao manutencao = new Manutencao(
                "Reparo de computador",
                "Preventiva",
                "Reparo em um dos equipamentos do laboratório j203",
                "19/09/2026");
    }
}
