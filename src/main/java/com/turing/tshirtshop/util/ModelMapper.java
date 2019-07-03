package com.turing.tshirtshop.util;

import java.util.Set;

import com.turing.tshirtshop.entity.User;

public class ModelMapper {

    
    
    public static String mapToString(Set<User> listaUsuarios) {
    	return (listaUsuarios!=null? listaUsuarios.toString():null);
    }

}
