package org.streams;

import java.io.*;

public class SaidaStreamBytes {

    public static void main(String[] args) {

        String path = "C:\\Users\\danie\\AquaProjects\\Streams\\resources\\arquivo.txt";
        try {
            DataInputStream in = new DataInputStream( new BufferedInputStream( new FileInputStream(path)));
            DataOutputStream out = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( path )));

            out.writeInt(1);
            out.writeInt(2);
            out.writeInt(3);
            out.writeInt(4);
            out.writeInt(5);

            while(in.available()>0){
                int x = in.readInt();
                System.out.println(x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
