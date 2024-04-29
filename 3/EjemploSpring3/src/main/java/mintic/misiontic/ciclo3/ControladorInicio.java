/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jciba
 */


@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String Inicio(){
        log.info("Ejecutando el controlador inicio");
        return "Este es el inicio";
    }
}
