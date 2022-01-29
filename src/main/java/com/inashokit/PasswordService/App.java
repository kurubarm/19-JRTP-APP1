package com.inashokit.PasswordService;

import com.inashokit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PasswordService service = new PasswordService();
        String encrypt=service.encrypt("Ramya@143");
        System.out.println(encrypt);
        String decrypt = service.decrypt(encrypt);
        System.out.println(decrypt);
        
        
    }
}
