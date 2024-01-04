package model;

import com.github.javafaker.Faker;

public class Direction {

    private String direccion;
    private String descripcion;
    private String zona;
    private String telefono;

    public Direction() {
        var faker = new Faker();
        direccion = faker.address().firstName();
        descripcion = faker.address().secondaryAddress();
        zona = faker.address().state();
        telefono = faker.phoneNumber().cellPhone();
    }

    public  String getDireccion() {
        return direccion;
    }

    public  String getDescripcion() {
        return descripcion;
    }

    public String getZona() {
        return zona;
    }

    public String getTelefono() {
        return telefono;
    }
}