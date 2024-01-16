package com.example;

import java.io.DataOutputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException{

        try {

            ServerSocket servsock= new ServerSocket(3000);

            Studente s1 = new Studente("01/02/2003", "Alessio", "Bruni");
            Studente s2 = new Studente("10/03/2005", "Marco", "Ascanio");
            Studente s3 = new Studente("01/01/2005", "Jim", "Carrey");
            Studente s4 = new Studente("05/04/2006", "Matteo", "Falli");
            Studente s5 = new Studente("09/07/2005", "Eros", "Ramazzotti");
            
            ArrayList<Studente> listastudenti = new ArrayList();

            listastudenti.add(s1);
            listastudenti.add(s2);
            listastudenti.add(s3);
            listastudenti.add(s4);
            listastudenti.add(s5);

            Aula classe = new Aula("IA", "5", "03-TT", listastudenti);


            XmlMapper xmlMapper = new XmlMapper();
            
            String st = xmlMapper.writeValueAsString(classe);
            System.out.println(st);
            xmlMapper.writeValue(new File("test.xml"), classe);

            
            Socket s=servsock.accept();

            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            out.writeBytes(null);

            servsock.close();
            s.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
