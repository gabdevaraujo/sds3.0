package com.devsuperior.dsvendas.resources;

import java.util.List;

import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
    
    @Autowired
    private SellerService service;

    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
