package br.principal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public static void main(String[] args) {

    List<String> nomes = Arrays.asList("bruno", "gaby", "edgar", "sandy");

    List<String> resultado = nomes.stream()
            .filter(nome -> nome.length() >= 6)
            .map(String()::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
    System.out.println(resultado);

}

