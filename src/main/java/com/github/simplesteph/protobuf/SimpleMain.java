package com.github.simplesteph.protobuf;

import com.google.protobuf.util.JsonFormat;
import example.simple.Simple.SimpleMessage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {
          
        final SimpleMessage message = SimpleMessage.newBuilder()
                .setId(10)
                .setName("My Simple Message")
                .setIsSimple(true)
                .addAllSampleList(Arrays.asList(1, 2, 4))
                .build();
        
        FileOutputStream outputStream = null;
        
        final String fileName = "simple-message.bin";
        
        try {
            
            System.out.println("Writing the message in a file");
            
            outputStream = new FileOutputStream(fileName);
            
            outputStream.write(message.toByteArray());
            
             System.out.println("Recovering the message from the file");
             
            final FileInputStream inputStream = new FileInputStream(fileName);
            
            final SimpleMessage messageRecovered = SimpleMessage.parseFrom(inputStream);
            
            System.out.println(messageRecovered.toString());
            
            final String jsonString = JsonFormat.printer().print(message);
            
            System.out.println("Printing in json format");
               
            System.out.println(jsonString);
            
            SimpleMessage.Builder builder = SimpleMessage.newBuilder();
            
            System.out.println("Going back to protocol buffer");
            
            JsonFormat.parser().merge(jsonString, builder);
            
            System.out.println(builder);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
       

    }
}
