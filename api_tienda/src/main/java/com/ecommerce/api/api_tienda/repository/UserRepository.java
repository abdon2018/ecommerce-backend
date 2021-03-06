package com.ecommerce.api.api_tienda.repository;

import com.ecommerce.api.api_tienda.entity.Usuario;
import com.ecommerce.api.api_tienda.pojos.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Usuario, Long> {

    public List<Usuario> findAll();

}
