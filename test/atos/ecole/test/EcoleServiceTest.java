/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.ecole.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author khaled
 */
public class EcoleServiceTest {

    @Test
    public void test() {
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        
    }

}
