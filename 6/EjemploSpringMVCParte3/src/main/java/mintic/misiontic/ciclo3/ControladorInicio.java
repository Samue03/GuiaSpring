/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import mintic.misiontic.ciclo3.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author PARRA HERNANDEZ
 */


@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    
    public String inicio(Model modelo){
        String mensaje = "Saludos desde spring MVC con paso de informacion";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        log.info("Ejecutando el controlador Inicio");
        Usuario u = new Usuario();
        u.setCedula("1234");
        u.setClave("Abcd");
        u.setNombre("JOHN CARLOS ARRIETA ARRIETA");
        u.setEmail("jarrieta@hotmail.com");
        modelo.addAttribute("alguien",u);
        return "index";
    }
    
}
