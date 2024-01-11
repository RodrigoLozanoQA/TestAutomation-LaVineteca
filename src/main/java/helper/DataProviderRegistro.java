package helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Registro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataProviderRegistro {

    ObjectMapper objectMapper = new ObjectMapper();

    public Registro getRegistroData() {
        try {
            File file = new File("src/test/resources/json/nuevousuario.json");
            Scanner myReader = new Scanner(file);
            String data = "";
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
            myReader.close();

            Registro registro = objectMapper.readValue(data, Registro.class);
            return registro;
        } catch (JsonProcessingException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Registro();
    }
}
