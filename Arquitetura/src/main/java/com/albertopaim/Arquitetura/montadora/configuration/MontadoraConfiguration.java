package com.albertopaim.Arquitetura.montadora.configuration;

import com.albertopaim.Arquitetura.montadora.Motor;
import com.albertopaim.Arquitetura.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
    @Bean
    public Motor motor() {
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
