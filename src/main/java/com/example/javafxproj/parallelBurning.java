package com.example.javafxproj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class parallelBurning implements Callable<Void> {
    private int sn;
    private String fp;
    public parallelBurning(int sn , String fp){
        this.sn = sn;
        this.fp = fp;
    }
    @Override
    public Void call() throws IOException {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fp)));

        }
        catch (IOException e)
        { e.printStackTrace();
        }
        BufferedWriter output = null;
        try {
            String newstring = String.format("/home/captk/IdeaProjects/javafxproj/src/main/resources/copies/copy%d.txt",sn);
            File file = new File(newstring);
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) {
                output.close();
            }
        }

        return null;
    }
}
