package com.informaticonfig.spring.app1.springboot_applications.controllers;
/* 
import java.util.HashMap;
import java.util.Map;

import com.informaticonfig.spring.app1.springboot_applications.models.*;*/
import com.informaticonfig.spring.app1.springboot_applications.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
@RequestMapping ("/api")

public class EjemploRestController {
    @GetMapping (path= "/detalles_info2")

    
     /* public Map<String, Object> detalles_info2(){
       
        Empleados empleado1 = new Empleados("Juan","Rodriguez","Calle 1 nº 2","Gerente",35,123456789,001);

        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Empleado","Datos empleado");
        respuesta.put("Información",empleado1);
        */

    public ClaseDTO detalles_info(){
       ClaseDTO usuario1 = new ClaseDTO();
       usuario1.setTitulo("Administrador");
       usuario1.setUsuario("Infoconfig");


        return usuario1;
    }

}
