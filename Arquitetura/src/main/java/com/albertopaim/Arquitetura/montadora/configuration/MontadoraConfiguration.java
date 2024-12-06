package com.albertopaim.Arquitetura.montadora.configuration;

import com.albertopaim.Arquitetura.montadora.Motor;
import com.albertopaim.Arquitetura.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
    @Bean(name = "MotorAspirado")
    public Motor motorAspirado() {
        Motor motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "MotorTurbo")
    public Motor motorTurbo() {
        Motor motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

    @Bean(name = "MotorEletrico")
    public Motor motorEletrico() {
        Motor motor = new Motor();
        motor.setCavalos(80);
        motor.setCilindros(3);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
}
