package poetry.becquer.xxiii.service;

import poetry.becquer.xxiii.model.IObsequio;

import java.util.List;

public class Amada {

    private Boolean mirada;
    private Boolean sonrisa;
    private Boolean beso;

    private List<IObsequio> obsequios;

    public Amada(Boolean mirada, Boolean sonrisa, Boolean beso) {
        this.mirada = mirada;
        this.sonrisa = sonrisa;
        this.beso = beso;
    }

    public void addObsequio(IObsequio obsequio) {
        obsequios.add(obsequio);
    }
    public boolean getMirada() {
        return this.mirada;
    }
    public boolean getSonrisa() {
        return this.sonrisa;
    }
    public boolean getBeso() {
        return this.beso;
    }

}