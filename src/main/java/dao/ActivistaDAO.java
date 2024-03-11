/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import objetos.Activista;

import java.util.Calendar;
import java.util.List;

/**
 * Clase que implementa el acceso a datos de la tabla Activista
 * @author ID145
 */
public class ActivistaDAO {
    // Atributo que representa la conexión a la base de datos
    private EntityManager entityManager;

    /**
     * Constructor que recibe la conexión a la base de datos
     * @param entityManager
     */
    public ActivistaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Método que buscar activistas por fecha hardcodeada.
     * @return Lista de activistas
     */
    public List<Activista> buscarActivistaPorFecha() {
        // Se crea un objeto de tipo Calendar con la fecha 1 de enero de 2024 a las 00:00:00
        Calendar fechaInicio = Calendar.getInstance();
        fechaInicio.set(2024,Calendar.JANUARY,1,0,0,0);
        fechaInicio.set(Calendar.MILLISECOND,0);

        // Se crea un objeto de tipo Calendar con la fecha 31 de marzo de 2024 a las 23:59:59
        Calendar fechaFin = Calendar.getInstance();
        fechaFin.set(2024, Calendar.MARCH,31,23,59,59);
        fechaFin.set(Calendar.MILLISECOND,999);

        // Se crea la consulta
        String jpql = "SELECT a FROM Activista a WHERE a.fechaInicioLabores BETWEEN :fecha1 AND :fecha2"; // Uso de between
        TypedQuery<Activista> query = entityManager.createQuery(jpql, Activista.class); // Se crea la consulta
        query.setParameter("fecha1", fechaInicio); // Se asigna el valor a la variable
        query.setParameter("fecha2", fechaFin); // Se asigna el valor a la variable
        return query.getResultList(); // Se ejecuta la consulta y se retorna el resultado

    }

    /**
     * Método que buscar activistas por fecha.
     * @param fechaInicio
     * @param fechaFin
     * @return Lista de activistas
     */
    public List<Activista> buscarActivistaPorFecha(Calendar fechaInicio, Calendar fechaFin) {
        // Se crea la consulta
        String jpql = "SELECT a FROM Activista a WHERE a.fechaInicioLabores BETWEEN :fechaInicio AND :fechaFin"; // Uso de between
        TypedQuery<Activista> query = entityManager.createQuery(jpql, Activista.class); // Se crea la consulta
        query.setParameter("fechaInicio", fechaInicio); // Se asigna el valor a la variable
        query.setParameter("fechaFin", fechaFin); // Se asigna el valor a la variable
        return query.getResultList(); // Se ejecuta la consulta y se retorna el resultado
    }
}
