package Seminar5.Client;

import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException, ExceptionIssuingDiploma {
        App app = new App();
        app.runSystem();
//        app.runSystemWithException();
    }
}
