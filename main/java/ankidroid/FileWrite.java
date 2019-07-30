package ankidroid;

//import java.io.*;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {

    static void writer(List<Card> cards){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/ankita.gole/Documents/IdeaProjects/AnkiCards/src/main/java/ankidroid/CardFile.json"),
                    cards );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
