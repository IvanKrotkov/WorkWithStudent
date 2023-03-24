package Seminar5.Core;

import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;

import java.io.IOException;
import java.util.Scanner;

public interface View {
    void viewData() throws ExceptionIssuingDiploma;
    void setData() throws IOException;

}
