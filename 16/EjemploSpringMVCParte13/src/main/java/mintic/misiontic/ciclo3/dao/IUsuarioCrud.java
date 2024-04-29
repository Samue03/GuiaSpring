/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mintic.misiontic.ciclo3.dao;

import java.util.Optional;
import mintic.misiontic.ciclo3.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jciba
 */
public interface IUsuarioCrud extends CrudRepository<Usuario, String>{

    @Override
    public void deleteAll();

    @Override
    public void deleteAll(Iterable<? extends Usuario> entities);

    @Override
    public void deleteAllById(Iterable<? extends String> ids);

    @Override
    public void delete(Usuario entity);

    @Override
    public void deleteById(String id);

    @Override
    public long count();

    @Override
    public Iterable<Usuario> findAllById(Iterable<String> ids);

    @Override
    public Iterable<Usuario> findAll();

    @Override
    public boolean existsById(String id);

    @Override
    public Optional<Usuario> findById(String id);

    @Override
    public <S extends Usuario> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    public <S extends Usuario> S save(S entity);


    
}
