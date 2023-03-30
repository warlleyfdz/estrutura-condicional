package primeirotranpodev.estruturacondicional.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class EstruturaCondicionalService {

    public List<String> negativoOupositivo(Integer numero) {
        List<String> negatpositivo = new ArrayList<>();

        if (numero < 0) {
            negatpositivo.add("NEGATIVO");
        } else if (numero > 0) {
            negatpositivo.add("POSITIVO");
        } else {
            negatpositivo.add("ZERO");
        }
        return negatpositivo;
    }

    public List<String> parOuImpar(Integer numero) {
        List<String> parouimpar = new ArrayList<>();

        if (numero % 2 == 0) {
            parouimpar.add("O NUMERO E PAR");
        } else if (numero % 2 == 1) {
            parouimpar.add("O NUMERO E IMPAR");
        }
        return parouimpar;
    }

    public List<String> idadeVotar(Integer numero) {
        List<String> idadevotar = new ArrayList<>();

        if (numero > 18 && numero < 70) {
            idadevotar.add("ESSA PESSOA PODE VOTAR");
        } else if (numero < 17) {
            idadevotar.add("ESSA PESSOA NÃO PODE VOTAR");
        } else if (numero > 70) {
            idadevotar.add("ESSA PESSOA NÃO PRECISA VOTAR CONFORME LEGISLAÇÃO VIGENTE");
        }

        return idadevotar;
    }

    public List<String> vogalOuConsoante(String caracter) {
        List<String> vogaisconsoantes = new ArrayList<>();

        if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I") || caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
            vogaisconsoantes.add("ESSE CARACTER E UMA VOGAL");
        } else {
            vogaisconsoantes.add("ESSE CARACTER E UMA CONSOANTE");
        }

        return vogaisconsoantes;
    }

    public List<String> numeroEdivisivel(Integer valor1, Integer valor2) {
        List<String> numerodivisivel = new ArrayList<>();

        if (valor1 % valor2 == 0) {
            numerodivisivel.add("ESSE NUMERO E DIVISIVEL");
        } else {
            numerodivisivel.add("ESSE NUMERO NÃO E DIVISIVEL POR" +    valor1);
        }

        return numerodivisivel;

    }
}
