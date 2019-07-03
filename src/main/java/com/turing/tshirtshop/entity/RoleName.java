package com.turing.tshirtshop.entity;

/**
 * Created by Aleks Becker
 */
public enum  RoleName {
    ROLE_USER_TRIADOR,
    ROLE_USER_FINALIZADOR,
    ROLE_ADMIN;
    
    public static RoleName getRoleName(String status) {
		switch (status) {
			case "ROLE_USER_TRIADOR": return ROLE_USER_TRIADOR;
			case "ROLE_USER_FINALIZADOR": return ROLE_USER_FINALIZADOR;
			case "ROLE_ADMIN": return ROLE_ADMIN;
			default : return ROLE_USER_FINALIZADOR;
		}
	}
}
