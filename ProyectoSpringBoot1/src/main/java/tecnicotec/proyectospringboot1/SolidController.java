package tecnicotec.proyectospringboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolidController {

    @GetMapping("/")
    public String inicio() {
        return "s";
    }

    @GetMapping("/s")
    public String responsabilidadUnica() {
        return "s";
    }

    @GetMapping("/o")
    public String abiertoCerrado() {
        return "o";
    }

    @GetMapping("/l")
    public String sustitucionLiskov() {
        return "l";
    }

    @GetMapping("/i")
    public String segregacionInterfaces() {
        return "i";
    }

    @GetMapping("/d")
    public String inversionDependencias() {
        return "d";
    }
}