package com.reactividad.__microservicio_crud_productos.controllers;

import com.reactividad.__microservicio_crud_productos.model.Producto;
import com.reactividad.__microservicio_crud_productos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> productos(){
        return productService.catalogo();
    }

    @GetMapping(value = "productos/{categoria}")
    public List<Producto> productosCategoria(@PathVariable("categoria") String categoria){
        return productService.productosCategoria(categoria);
    }

    @GetMapping(value = "producto")
    public Producto productoCCodigo(@RequestParam("cod")  int cod){
        return productService.productoCodigo(cod);
    }

    @PostMapping(value = "alta")
    public void altaProducto(@RequestBody Producto producto){
        productService.altaProducto(producto);
    }

    @DeleteMapping(value = "eliminar")
    public Producto eliminarProducto(@RequestParam("cod") int cod){
        return productService.eliminarProducto(cod);
    }

    @PutMapping(value = "actualizar")
    public Producto actualizarProducto(@RequestParam("cod") int cod, @RequestParam("precio") double precio){
        return productService.actualizarPrecio(cod, precio);
    }
}
