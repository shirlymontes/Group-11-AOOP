package service;

import org.mindrot.jbcrypt.BCrypt;
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;              


public class PasswordUtil {

    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(12));
    }

    public static boolean checkPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.checkpw(plainTextPassword, hashedPassword);
    }
}
