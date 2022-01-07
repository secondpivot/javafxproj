module com.example.javafxproj {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires grpc.core;
    requires grpc.stub;
    requires java.annotation;
    requires grpc.protobuf;
    requires guava;
    requires protobuf.java;
    requires org.apache.commons.io;

    opens com.example.javafxproj to javafx.fxml;
    exports com.example.javafxproj;
}