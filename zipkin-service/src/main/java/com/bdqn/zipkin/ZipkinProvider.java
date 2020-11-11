package com.bdqn.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
public class ZipkinProvider
{
    public static void main(String[] args) {
        SpringApplication.run(ZipkinProvider.class);
    }
}
