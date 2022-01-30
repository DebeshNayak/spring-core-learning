package com.debesh.spring.springcore.propertiesplaceholder.assignment;

public class WsClient {

    private String url;
    private String fname;
    private String password;

    public WsClient(String url, String fname, String password) {
        this.url = url;
        this.fname = fname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestWsClient{" +
                "url='" + url + '\'' +
                ", fName='" + fname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
