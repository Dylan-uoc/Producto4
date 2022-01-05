/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.producto4.service;

import com.producto4.model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author rojaw
 */
public class LoginService {
    
    private Session session;
    
    public LoginService() {
    
     session = HibernateUtil.getSessionFactory().getCurrentSession();
    
    }    
}
