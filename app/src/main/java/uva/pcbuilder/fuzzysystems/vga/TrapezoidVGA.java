package uva.pcbuilder.fuzzysystems.vga;

import uva.pcbuilder.fuzzysystems.Valor;
import uva.pcbuilder.fuzzysystems.Trapezoid;

/**
 * Created by peuso on 29/09/2016.
 */

public class TrapezoidVGA extends Trapezoid {


    public TrapezoidVGA(Valor valor) {
        super(valor);
    }

    @Override
    public float defuzzification(float relevance) {
        if (this.getValor().equals(Valor.MB)) {
           return 450 - (300 * relevance);
        }
        if (this.getValor().equals(Valor.B)) {
            float curva1 = 150 + (300 * relevance);
            float curva2 = 1050 - (300 * relevance);
            return (curva1 + curva2)/2;
        }
        if (this.getValor().equals(Valor.M)) {
            float curva1 = 750 + (300 * relevance);
            float curva2 = 1650 - (300 * relevance);
            return (curva1 + curva2)/2;
        }
        if (this.getValor().equals(Valor.A)) {
            float curva1 = 1350 + (300 * relevance);
            float curva2 = 2250 - (300 * relevance);
            return (curva1 + curva2)/2;
        }
        if (this.getValor().equals(Valor.MA)) {
            float curva1 = 1950 + (300 * relevance);
            float curva2 = 2850 - (300 * relevance);
            return (curva1 + curva2)/2;
        }
        if (this.getValor().equals(Valor.E)) {
            return 2550 + (300 * relevance);
        }
        return -1;
    }
}