package Seminar5.Client;

import Seminar5.Core.Presenter;
import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;

import java.io.IOException;

public class App {
    private Presenter presenter;
    {
        this.presenter = new Presenter();
    }
    public void runSystem() throws IOException, ExceptionIssuingDiploma {
        this.presenter.setData();
        this.presenter.viewData();
    }
    public void runSystemWithException() throws IOException, ExceptionIssuingDiploma{
        this.presenter.setDataForTest();
        this.presenter.viewData();
    }
}
