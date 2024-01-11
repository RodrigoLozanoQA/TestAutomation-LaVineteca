package helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DataProviderLogin {

    ObjectMapper objectMapper = new ObjectMapper();

    public Login getLoginData() {
        try {
            File file = new File("src/test/resources/json/login.json");
            Scanner myReader = new Scanner(file);
            String data = "";
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
            myReader.close();

            Login login = objectMapper.readValue(data, Login.class);
            return login;
        } catch (JsonProcessingException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Login();
    }
}
