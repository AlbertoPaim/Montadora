package com.albertopaim.Arquitetura.montadora;

import java.awt.*;

public class HondaHrv extends Carro{

    public HondaHrv(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.black);
        setMontadora(Montadora.HONDA);
    }

}
