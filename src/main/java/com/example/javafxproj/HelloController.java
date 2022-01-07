package com.example.javafxproj;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HelloController {
    private int finalSiteNo;
    @FXML
    private TextField siteNo;
    @FXML
    private TextField filePath;
    @FXML
    private Label message;
    @FXML
    private Button validateButton;
    @FXML
    private Button burnButton;
  @FXML
  public void burnData(ActionEvent e) throws InterruptedException {
//      ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5000).usePlaintext().build();
//      userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);
//      System.out.println(channel);
//      int sn = Integer.parseInt(siteNo.getText());
      String fp = filePath.getText();
//      User.inputParameters inputParameters = User.inputParameters.newBuilder().setFilePath(fp).setSitesNo(sn).build();
//      User.APIResponse response = userStub.burnData(inputParameters);
//      System.out.println(response.getResponseCode());
//      System.out.println(response.getResponseMessage());
//      System.out.println(sn);
//      System.out.println(fp);
      //String fileName = "/src/resources/com/example/javafxproj/data.txt";

      long start = System.currentTimeMillis();
      ExecutorService es = Executors.newFixedThreadPool(finalSiteNo);
      List<parallelBurning> tasks = new ArrayList<>();
      for(int i = 1 ; i<=finalSiteNo ; i++){
        tasks.add(new parallelBurning(i,fp));

      }
      List<Future<Void>> futures = es.invokeAll(tasks);
      es.shutdown();
//                es.awaitTermination(1,TimeUnit.NANOSECONDS);
      long end = System.currentTimeMillis();
      System.out.println("elapsed time:"+(end-start));
      String displayMessage = String.format("Data burn has been successful it is done in %d",end-start);
      message.setText(displayMessage);

//      System.out.println("burning started");
  }
    @FXML
    public void validateData(ActionEvent e) throws InterruptedException {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5000).usePlaintext().build();
//        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);
//        int sn = Integer.parseInt(siteNo.getText());
        String fp = filePath.getText();
        long start = System.currentTimeMillis();
        ExecutorService es = Executors.newFixedThreadPool(finalSiteNo);
        List<parallelValidating> tasks = new ArrayList<>();
        for(int i =1 ; i<=finalSiteNo;i++){
           tasks.add(new parallelValidating(i,fp));
        }
        List<Future<Void>> futures = es.invokeAll(tasks);
        es.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("elapsed time:"+(end-start));
//        User.inputParameters inputParameters = User.inputParameters.newBuilder().setFilePath(fp).setSitesNo(sn).build();
//        User.APIResponse response = userStub.validateData(inputParameters);
//        System.out.println(response.getResponseCode());
//        System.out.println(response.getResponseMessage());
        String displayMessage = String.format("Data validation has been successful it is done in %d",end-start);
        message.setText(displayMessage);
    }
    @FXML
    public void updateIDInfo(ActionEvent e) throws IOException {
        File directory = new File("/home/captk/IdeaProjects/javafxproj/src/main/resources/copies");
        FileUtils.cleanDirectory(directory);
        int sn = Integer.parseInt(siteNo.getText());
        this.finalSiteNo = sn;
        message.setText("site no is in sync");
    }

}