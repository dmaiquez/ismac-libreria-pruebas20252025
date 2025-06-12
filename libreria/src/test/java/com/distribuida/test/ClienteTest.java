package com.distribuida.test;

import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1,"1701234567","Juan","Taipe","Av. por ahi.","0987654321","jtaipe@correo.com");
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Validar datos Cliente",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1701234567", cliente.getCedula()),
                () -> assertEquals("Juan", cliente.getNombre()),
                () -> assertEquals("Taipe", cliente.getApellido()),
                () -> assertEquals("Av. por ahi.", cliente.getDireccion()),
                () -> assertEquals("0987654321", cliente.getTelefono()),
                () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())
        );
    }


    @Test
    public void testClienteSetters(){

        cliente = new Cliente();

        cliente.setIdCliente(2);
        cliente.setCedula("1701234562");
        cliente.setNombre("Juan2");
        cliente.setApellido("Taipe2");
        cliente.setDireccion("Tumbaco2");
        cliente.setTelefono("0987654322");
        cliente.setCorreo("jtaipe2@correo.com");

        assertAll( "Validar datos CLiente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1701234562",cliente.getCedula()),
                () -> assertEquals("Juan2",cliente.getNombre()),
                () -> assertEquals("Taipe2",cliente.getApellido()),
                () -> assertEquals("Tumbaco2",cliente.getDireccion()),
                () -> assertEquals("0987654322",cliente.getTelefono()),
                () -> assertEquals("jtaipe2@correo.com",cliente.getCorreo())
        );

    }

    @Test
    public void testToString(){

        String str = cliente.toString();
        assertAll( "Validar datos de CLiente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1701234567")),
                () -> assertTrue(str.contains("Juan")),
                () -> assertTrue(str.contains("Taipe")),
                () -> assertTrue(str.contains("Av. por ahi.")),
                () -> assertTrue(str.contains("0987654321")),
                () -> assertTrue(str.contains("jtaipe@correo.com"))
        );

    }



}
