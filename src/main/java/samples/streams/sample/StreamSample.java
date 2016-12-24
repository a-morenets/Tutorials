/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.streams.sample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Денис
 */
public class StreamSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Entity entity = Entity.getInstance();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream( bout ));
        out.writeObject(entity);
        out.close();
        System.out.write(bout.toByteArray());
        try(OutputStream fout = new FileOutputStream("d:/1.out")){
            fout.write(bout.toByteArray());
        }
        try(ObjectInputStream in = new ObjectInputStream(
                                        new BufferedInputStream(
                                                new FileInputStream("d:/1.out")))){
             Entity entity2 = (Entity) in.readObject();
             System.out.println("=================");
             System.out.println( entity == entity2 );
             System.out.println(entity);
             System.out.println(entity2);
        }
        
        
        
    }
    
}
