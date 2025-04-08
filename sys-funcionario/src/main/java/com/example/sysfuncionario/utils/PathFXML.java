package com.example.sysfuncionario.utils;

import java.nio.file.Paths;

public class PathFXML {

    public static String pathBase() {
        return Paths.get("C:\\Users\\Bruno_Rodrigues\\Downloads\\Faculdade-main\\sys-funcionario\\src\\main\\java\\com\\example\\sysfuncionario\\view").toAbsolutePath().toString();
    }
}
