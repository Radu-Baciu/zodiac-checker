package services;

import io.grpc.stub.StreamObserver;
import proto.AutumnCheckerGrpc;
import proto.ZodiacChecker;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AutumnCheckerImpl extends AutumnCheckerGrpc.AutumnCheckerImplBase {
    @Override
    public void giveInfoAutumn (ZodiacChecker.ZodiacRequest request, StreamObserver<ZodiacChecker.ZodiacReply> response) {
        String[][] zodiac = new String[3][3];
        int zodiacBuilder = 0;
        File file = new File ("AutumnZodiac.txt");

        try {
            Scanner fileReader = new Scanner(file);
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
        if (date.compareTo(zodiac[0][1]) < 0)
            sign += zodiac[0][2];
        if (date.compareTo(zodiac[1][1]) < 0)
            sign += zodiac[1][2];
        if (date.compareTo(zodiac[2][1]) < 0)
            sign += zodiac[2][2];

        ZodiacChecker.ZodiacReply reply = ZodiacChecker.ZodiacReply.newBuilder().setResult("Client with birth date " + request.getDate() + " is a " + sign).build();
    }

}
