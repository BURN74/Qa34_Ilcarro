package manager;

import models.User;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {
    @DataProvider
    public Iterator<Object []> dataLogin(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"noa@gmail.com","Nnoa12345$"});
        list.add(new Object[]{"sonya@gmail.com","Ss12345$"});
        list.add(new Object[]{"noa@gmail.com","Nnoa12345$"});
        list.add(new Object[]{"sonya@gmail.com","Ss12345$"});

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]>dataRegistration(){
        List<Object[]> list= new ArrayList<>();
        list.add(new Object[]{new User().setName("Dorati").setLastName("Doe").setEmail("dor3@gmail.com").setPassword("Dd12345$")});
        list.add(new Object[]{new User().setName("Dorati").setLastName("Doe").setEmail("dor4@gmail.com").setPassword("Dd12345$")});
        list.add(new Object[]{new User().setName("Dorati").setLastName("Doe").setEmail("dor5@gmail.com").setPassword("Dd12345$")});

        return list.iterator();
    }
    @DataProvider
    public Iterator<Object[]> loginCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/login.csv.csv")));
        String line = reader.readLine();
        while(line!=null){
           String[] split =  line.split(",");
           list.add(new Object[]{new User().setEmail(split[0]).setPassword(split[1])});
           line=reader.readLine();
        }

        return list.iterator();
    }


    @DataProvider
    public Iterator<Object[]> dataBase(){
        List<Object[]> list = new ArrayList<>();

        return list.iterator();
    }
}
