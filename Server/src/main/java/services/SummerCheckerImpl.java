package services;

import io.grpc.stub.StreamObserver;
import proto.SummerCheckerGrpc;
import proto.ZodiacChecker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SummerCheckerImpl extends SummerCheckerGrpc.SummerCheckerImplBase {
    @Override
    public void giveInfoSummer (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> responseObserver) {
        String[][] zodiac = new String[3][3];
        int zodiacBuilder = 0;
        try {
            Scanner fileReader = new Scanner(new BufferedReader(new FileReader("src/main/java/services/SummerZodiac.txt")));
            while (fileReader.hasNext()) {
                String input = fileReader.next();
                zodiac[zodiacBuilder/3][zodiacBuilder%3] = input;
                zodiacBuilder++;
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }

        String date = request.getDate();
        date = date.substring(0, date.length() - 4);

        String sign = "";
        if (date.compareTo(zodiac[2][1]) <= 0)
            sign = zodiac[2][2];
        if (date.compareTo(zodiac[1][1]) <= 0)
            sign = zodiac[1][2];
        if (date.compareTo(zodiac[0][1]) <= 0)
            sign = zodiac[0][2];

        ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult("Client with birth date " + request.getDate() + " is a " + sign).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();    }

}
