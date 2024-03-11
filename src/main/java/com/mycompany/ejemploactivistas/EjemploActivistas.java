/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemploactivistas;

import dao.ActivistaDAO;
import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import objetos.*;

/**
 *
 * @author ID145
 */
public class EjemploActivistas {

    public static void main(String[] args) {
        EntityManagerFactory mf = Persistence.createEntityManagerFactory("com.mycompany_ejemploActivistas_jar_1.0-SNAPSHOTPU");
        EntityManager em = mf.createEntityManager();
        em.getTransaction().begin();

        /*CREAR ACTIVISTA
        Activista activista1 = new Activista("Ramiro","Perez","López","6442216360",new GregorianCalendar(2020, 1, 15));
        Activista activista2 = new Activista("Eduardo","Cano","Ruiz","6444221133",new GregorianCalendar(2022, 3, 19));
        Activista activista3 = new Activista("Josue","Flores","Carballo","6444666677",new GregorianCalendar(2022, 6, 14));
        Activista activista4 = new Activista("Pedro","Manuel","Sanchez","6444224193",new GregorianCalendar(2023, 2, 19));
        em.persist(activista1);
        em.persist(activista2);
        em.persist(activista3);
        em.persist(activista4);
        em.getTransaction().commit();
        */ 
        
         /*BUSCAR ACTIVISTA 
        Activista a = em.find(Activista.class, 1L);
        if (a!=null) {
            System.out.println(a.toString());
        }else{
            System.out.println("Activista no encontrado");
        }
        em.getTransaction().commit();
         */

        /*Actualizar Activista
        Activista a = em.find(Activista.class, 1L);
        if (a != null) {
            System.out.println("Activista antes de la actualización: ");
            System.out.println(a.toString()); // Imprimir el activista antes de la actualización

            a.setApMaterno("Dominguezz");
            a.setTelefono("6444778865");
            em.persist(a);
            em.getTransaction().commit(); // Commit después de la actualización

            System.out.println("Activista actualizado: ");
            System.out.println(a.toString()); // Imprimir el activista actualizado
        } else {
            System.out.println("Activista no encontrado");
        }
        */


        /*ELIMINAR ACTIVISTA 
        Activista a = em.find(Activista.class, 2L);
        if (a!=null) {
            em.remove(a);
            System.out.println("Activista eliminado");
        }else{
            System.out.println("Activista no encontrado");
        }
        em.getTransaction().commit();
         */

        /*SELECT DE TODOS LOS ACTIVISTAS
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Activista.class));
        Query query = em.createQuery(criteria);
        List <Activista> activistas = query.getResultList();
        for (Activista activista : activistas) {
            System.out.println(activista.toString());
        }
        em.getTransaction().commit();
        */


        /* Crear cliente y agregar dirección
        Cliente c = new Cliente();
        c.setNombres("Pancho");
        c.setApPaterno("Pantera");
        c.setApMaterno("Núñez");
        Direccion d = new Direccion("Wallaby","Villa Alegría","85000","952",c);
        List<Direccion> ds = new ArrayList();
        ds.add(d);
        c.setDirecciones(ds);
        em.persist(c);
        em.getTransaction().commit();
        */
 
         /* 
        List<Activista> ac = new ArrayList();
        Activista activista3 = new Activista("Jose","Torres","god","6444224133",new GregorianCalendar(2021, 6, 19));
        em.persist(activista3);
        Activista activista4 = new Activista("Pedro","Manuel","abc","6444224193",new GregorianCalendar(2023, 2, 19));
        em.persist(activista4);
        ac.add(activista3);
        ac.add(activista4);
        Cliente c1 = new Cliente();
        Direccion d = new Direccion("Haiti","Alegría","85000","954",c1);
        List<Direccion> ds = new ArrayList();
        ds.add(d);
        c1.setApMaterno("Lopez");
        c1.setApPaterno("Ruiz");
        c1.setDirecciones(ds);
        c1.setNombres("Francisco");
        em.persist(c1);
        
        Problema p = new Problema(new GregorianCalendar(2023,3,13),new GregorianCalendar(2024,3,13),"Pendiente",c1,ac);
        em.persist(d);
        em.persist(p);

        em.getTransaction().commit();
        */

        // Pruebas para los métodos de ActivistaDAO 

        //Crear activista entre las fechas 1 de enero de 2024 y 31 de marzo de 2024
        ActivistaDAO adao = new ActivistaDAO(em);
        //Activista activista5 = new Activista("Juan", "Perez", "Lopez", "6444224133", new GregorianCalendar(2024, 1, 19));
        //Activista activista6 = new Activista("Pedro", "Manuel", "Sanchez", "6444224193", new GregorianCalendar(2024, 2, 19));
        //em.persist(activista5);
        //em.persist(activista6);
        //em.getTransaction().commit();
        


        //Buscar activistas entre las fechas 1 de enero de 2024 y 31 de marzo de 2024
        List<Activista> activistas = adao.buscarActivistaPorFecha();
        System.out.println("Activistas entre las fechas 1 de enero de 2024 y 31 de marzo de 2024");
        for (Activista activista : activistas) {
            System.out.println(activista.toString());
        }

        //Prueba de método con parámetros
        Calendar fechaInicio = new GregorianCalendar(2024, 1, 1);
        Calendar fechaFin = new GregorianCalendar(2024, 3, 31);
        List<Activista> activistas2 = adao.buscarActivistaPorFecha(fechaInicio, fechaFin);
        System.out.println("Activistas entre las fechas 1 de enero de 2024 y 31 de marzo de 2024");
        for (Activista activista : activistas2) {
            System.out.println(activista.toString());
        }
    }
}
