package com.cognos.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognos.app.productos.model.entity.Producto;
import com.cognos.app.productos.model.service.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/mostrar/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	 
	
}
