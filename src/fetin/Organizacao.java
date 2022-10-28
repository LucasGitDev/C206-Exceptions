package fetin;

import exceptions.DuplicateName;
import exceptions.InvalidGrades;
import exceptions.NotANumberException;

import java.util.HashMap;
import java.util.Map;

public class Organizacao {

    private Map<String, Double> projetos = new HashMap<>();

    public void addProjeto(String nome, String nota) throws InvalidGrades, DuplicateName, NotANumberException {
        // if nota is not a number raise NotANumberException
        // if nota is not between 0 and 100 raise InvalidGrades
        // if nome is already in projetos raise DuplicateName
        double notaDouble;
        try {
            notaDouble = Double.parseDouble(nota);
        } catch (NumberFormatException e) {
            throw new NotANumberException();
        }
        if (notaDouble < 0 || notaDouble > 100) {
            throw new InvalidGrades();
        }

        if (projetos.get(nome) != null) {
            throw new DuplicateName();
        }

        projetos.put(nome, notaDouble);
        System.out.println("Projeto cadastrado!");
    }

    public void showProjetos() {
        System.out.println("PROJETOS CADASTRADOS NA FETIN:");
        System.out.println();
        for (String nome: projetos.keySet()) {
            System.out.println("Nome do Projeto: " + nome );
            System.out.print("Nota: " + projetos.get(nome) + " pontos");
            System.out.println();
        }
    }

}
