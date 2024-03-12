/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author ID145
 */
public class ProblemaDAO {
    // Atributo que representa la conexión a la base de datos
    private EntityManager entityManager;

    /**
     * Constructor que recibe la conexión a la base de datos
     * @param entityManager
     */
    public ClienteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    
    public List<Problema> buscarProblemaPorDescripcion(String palabraClave){
        String jpql = "SELECT p FROM Problema p WHERE p.descripcion LIKE :palabraClave";
        TypedQuery<Problema> query = entityManager.createQuery(jpql, Problema.class);
        query.setParameter("palabraClave", "%" + palabraClave + "%");
        return query.getResultList();

    }
}
