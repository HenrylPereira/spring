package com.example.demo.controller;

import com.example.demo.controller.dto.TopicoDto;
import com.example.demo.modelo.Curso;
import com.example.demo.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "dúvida com spring", new Curso("Spring","Programação"));
        return TopicoDto.converter(Arrays.asList(topico,topico,topico));
    }
}
