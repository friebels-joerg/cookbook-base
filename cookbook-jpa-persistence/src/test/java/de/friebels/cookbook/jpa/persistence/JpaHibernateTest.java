package de.friebels.cookbook.jpa.persistence;

import org.h2.tools.RunScript;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class JpaHibernateTest {

    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    @BeforeAll
    public static void init() throws FileNotFoundException, SQLException {
        emf = Persistence.createEntityManagerFactory("cookbook-test");
        em = emf.createEntityManager();
    }

    @AfterAll
    public static void tearDown(){
        em.clear();
        em.close();
        emf.close();
    }
}