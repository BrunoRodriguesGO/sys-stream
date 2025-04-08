package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Bruno","35","1000"),
                new Funcionario("jao","23","1100"),
                new Funcionario("sandy","33","1200"),
                new Funcionario("tiago","40","1300"),
                new Funcionario("julia","46","1400")
        );
        List<Funcionario> funcionariosComMaisDe30 = funcionarios.stream()
                .filter(f -> f.getIdade() >=30)
                .collect(Collectors.toList());
        funcionariosComMaisDe30.forEach(System.out::println);

        List<String> nomesDosFuncionarios =  funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());
        nomesDosFuncionarios.forEach(System.out::println);

        double somaDosSalarios = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();
        System.out.println(somaDosSalarios);
    }
}
