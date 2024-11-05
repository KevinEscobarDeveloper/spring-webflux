package com.reactividad.__microservicio_crud_productos.service;

import com.reactividad.__microservicio_crud_productos.model.Producto;

import java.util.List;

public interface ProductService {
    List<Producto> catalogo();
    List<Producto> productosCategoria(String categoria);
    Producto productoCodigo(int cod);
    void altaProducto(Producto producto);
    Producto eliminarProducto(int cod);
    Producto actualizarPrecio(int cod, double precio);
}
