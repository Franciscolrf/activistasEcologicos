/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import objetos.Cliente;

/**
 * Clase que implementa el acceso a datos de la tabla Cliente
 * @author ID145
 */
public class ClienteDAO {

    // Atributo que representa la conexión a la base de datos
    private EntityManager entityManager;

    /**
     * Constructor que recibe la conexión a la base de datos
     * @param entityManager
     */
    public ClienteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Método para buscar un cliente cuyo apellido paterno o materno comience con la
     * letra dada
     * 
     * @param letra
     * @return Lista de clientes
     */
    public List<Cliente> buscarClientePorLetraInicio(String letra) {
        String jpql = "SELECT c FROM Cliente c WHERE c.apPaterno LIKE :letra OR c.apMaterno LIKE :letra";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("letra", letra + "%");
        return query.getResultList();
    }

    /**
     * Método para buscar un cliente cuyo nombre comience con la letra dada
     * 
     * @param letra
     * @return Lista de clientes
     */
    public List<Cliente> buscarClientePorNombreInicio(String letra) {
        String jpql = "SELECT c FROM Cliente c WHERE c.nombre LIKE :letra";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("letra", letra + "%");
        return query.getResultList();
    }

    /**
     * Método para buscar un cliente cuyo apellido paterno o materno temine con la letra dada
     * @param letra
     * @return Lista de clientes
     */
    public List<Cliente> buscarClientePorLetraFinal(String letra) {
        String jpql = "SELECT c FROM Cliente c WHERE c.apPaterno LIKE :letra OR c.apMaterno LIKE :letra";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("letra", "%" + letra);
        return query.getResultList();
    }
    
    /**
     * Método para buscar un cliente cuyo nombre termine con la letra dada
     * @param letra
     * @return Lista de clientes
     */
    public List<Cliente> buscarClientePorNombreFinal(String letra) {
        String jpql = "SELECT c FROM Cliente c WHERE c.nombre LIKE :letra";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("letra", "%" + letra);
        return query.getResultList();
    }



}
