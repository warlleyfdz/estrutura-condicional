package primeirotranpodev.estruturacondicional.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import primeirotranpodev.estruturacondicional.Service.EstruturaCondicionalService;

import java.util.List;

@RestController
@RequestMapping(value = "/estrutaracondicional")
public class EstruturaCondicionalController {

    @Autowired
    EstruturaCondicionalService estruturaCondicionalService;

    @GetMapping("/posisitonegativo")
    public List<String> positivoOunegativo(@RequestParam("numero1") Integer numero) {
        return estruturaCondicionalService.negativoOupositivo(numero);
    }

    @GetMapping("/parouimpar")
    public List<String> parOuImpar(@RequestParam("numero1") Integer numero) {
        return estruturaCondicionalService.parOuImpar(numero);
    }

    @GetMapping("/idadeparavotar")
    public List<String> idadeParaVotar(@RequestParam("numero1") Integer numero) {
        return estruturaCondicionalService.idadeVotar(numero);

    }

    @GetMapping("/vogaisouconsoantes")
    public List<String> vogaisOuConsoantes(@RequestParam("caracter1") String caracter) {
        return estruturaCondicionalService.vogalOuConsoante(caracter);

    }

    @GetMapping("/numerodivisivel")
    public List<String> numeroEdivisivel(@RequestParam("digitevalor1")Integer numero1, @RequestParam("digitevalor2")Integer numero2){
        return estruturaCondicionalService.numeroEdivisivel(numero1,numero2);
    }
}

