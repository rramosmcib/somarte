package com.somarte.DAO;

import com.somarte.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class UsuarioDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public Usuario validarLogin(String usuario, String clave) {
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
            Root<Usuario> root = cq.from(Usuario.class);

            cq.select(root)
              .where(
                  cb.equal(root.get("usuario"), usuario),
                  cb.equal(root.get("contraseña"), clave)
              );

            TypedQuery<Usuario> query = em.createQuery(cq);
            return query.getResultStream().findFirst().orElse(null);
        } finally {
            em.close();
        }
    }

    public void insertar(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}