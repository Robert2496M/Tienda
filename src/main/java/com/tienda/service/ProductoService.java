
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

//Define los metodos a exponer a los consumidores
public interface ProductoService {
    
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
}
