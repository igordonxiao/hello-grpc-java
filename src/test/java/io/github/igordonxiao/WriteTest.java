package io.github.igordonxiao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteTest {
    public static void main(String[] args) throws Exception {
        final String path = "/Users/gordon/proto.txt";
        HelloRequest.Builder requestBuilder = HelloRequest.newBuilder();
        requestBuilder.setName("name");
        HelloRequest helloRequest = requestBuilder.build();

        //你可以写到文件，也可以写到网络
        //byte[] bytes = person.toByteArray();
        OutputStream out = new FileOutputStream(new File(path));
        helloRequest.writeTo(out);
        out.flush();
        out.close();

        //读取
        HelloReply.Builder replyBuilder = HelloReply.newBuilder();
        HelloReply helloReply = replyBuilder.build();
        FileInputStream input = new FileInputStream(new File(path));
        helloReply = helloReply.parseFrom(input);
        input.close();

        //输出 结果
        System.out.println("helloReply = [" + helloReply + "]");
    }
}
