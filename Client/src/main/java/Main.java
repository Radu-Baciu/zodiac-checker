import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8999).usePlaintext().build();
        
        SpringCheckerGrpc.SpringCheckerBlockingStub springStub = SpringCheckerGrpc.newBlockingStub(channel);
        SummerCheckerGrpc.SummerCheckerBlockingStub summerStub = SummerCheckerGrpc.newBlockingStub(channel);
        AutumnCheckerGrpc.AutumnCheckerBlockingStub autumnStub = AutumnCheckerGrpc.newBlockingStub(channel);
        WinterCheckerGrpc.WinterCheckerBlockingStub winterStub = WinterCheckerGrpc.newBlockingStub(channel);
        String date = "09/25/1999";
        ZodiacChecker.ZodiacReply reply = autumnStub.giveInfoAutumn(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
        System.out.println("Server replied with " + reply);
        channel.shutdown();
    }
    private boolean dateValidation(String date) {
        for (int x = 0; x < date.length(); x++) {
            if (date.charAt(x) < '/' || date.charAt(x) > '9')
                return false;
        }

        String[] dateSplit = date.split("/");

        int monthTest = Integer.parseInt(dateSplit[0]);
        if (monthTest < 1 || monthTest > 12)
            return false;

        int yearTest = Integer.parseInt(dateSplit[2]);
        if (yearTest < 0)
            return false;

        int dayTest = Integer.parseInt(dateSplit[1]);
        if (dayTest > 31 || dayTest < 0)
            return false;
        if (dayTest == 31) {
            if (monthTest == 2)
                return false;
            if (monthTest == 4)
                return false;
            if (monthTest == 6)
                return false;
            if (monthTest == 9)
                return false;
            if (monthTest == 11)
                return false;
        }
        if (dayTest == 30) {
            if (monthTest == 2)
                return false;
        }
        if (dayTest == 29) {
            if (monthTest == 2)
                if (yearTest % 4 != 0)
                    return false;
                if (yearTest % 100 == 0 && yearTest % 400 != 0)
                    return false;
        }
        return true;
    }
    private String dateConversion(String date) {
        String newDate = "0";
        String[] dateSplit = date.split("/");
        int helper;
        helper = Integer.parseInt(dateSplit[0]);
        if (helper <= 9) {
            newDate += dateSplit[0];
        }
        else {
            newDate = dateSplit[0];
        }
        newDate += "/";
        helper = Integer.parseInt(dateSplit[1]);
        if (helper <= 9) {
            newDate += "0";
        }
        newDate += dateSplit[1];
        newDate += "/";
        newDate += dateSplit[2]
        return newDate;
    }
}
