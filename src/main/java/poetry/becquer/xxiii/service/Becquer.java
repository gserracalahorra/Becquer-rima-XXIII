package poetry.becquer.xxiii.service;

import poetry.becquer.xxiii.model.Cielo;
import poetry.becquer.xxiii.model.Default;
import poetry.becquer.xxiii.model.Mundo;

public class Becquer {

    public void executeRimaXXIII(Amada amada) {
        if (amada.getMirada()) {
            amada.addObsequio(new Mundo());
        }
        if (amada.getSonrisa()) {
            amada.addObsequio(new Cielo());
        }
        if (amada.getBeso()) {
            amada.addObsequio(new Default());
        }
    }

}