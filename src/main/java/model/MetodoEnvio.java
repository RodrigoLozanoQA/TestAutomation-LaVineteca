package model;

import com.github.javafaker.Faker;

public class MetodoEnvio {
    private String comentario;

    public MetodoEnvio() {
        var faker = new Faker();
        comentario = faker.address().streetName();
    }

    public String getComentario() {
        return comentario;
    }
}
