package com.example.javafxproj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class parallelValidating implements Callable<Void> {
    private String fp;
    private int sn;
    public parallelValidating(int sn , String fp){
        this.fp = fp;
        this.sn = sn;
    }
    @Override
    public Void call() throws Exception {
        String text1 = "";
        try {
            text1 = new String(Files.readAllBytes(Paths.get(fp)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        String text2 = "";
        String strFormat = String.format("/home/captk/IdeaProjects/javafxproj/src/main/resources/copies/copy%d.txt",sn);
        try {
            text2 = new String(Files.readAllBytes(Paths.get(strFormat)));

        }
        catch (IOException e)
        { e.printStackTrace();
        }

        if(text1.equals(text2)){
            System.out.println("success");
        }
        else{
            System.out.println("failed");
        }
        return null;
    }
}
