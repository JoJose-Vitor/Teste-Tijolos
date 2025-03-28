package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "http://localhost:4200")
public class App {

    private static Producao producao = new Producao();

    @GetMapping("/producao")
    public static void iniciarProducao() throws Exception{
        producao.produzirTijolos();
    }

    @GetMapping("/relatorio")
    public static String gerarRelatorio(){
        return producao.relatorioFurosECores();
    }

    @GetMapping("/consulta/{id}")
    public static String consultarTijolo(@PathVariable("id") String id){
        int idBusca = Integer.parseInt(id);
        return producao.getTijolos().get(idBusca - 1).imprimirPropriedades();
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(App.class, args);
    }
}