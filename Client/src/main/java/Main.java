import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8999).usePlaintext().build();

        Main input = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert date:");
        String date = scanner.next();
        if (!input.dateValidation(date)) {
            System.out.println("Invalid date!");
        }
        else {
            date = input.dateConversion(date);
            String dateWithoutYear = date.substring(0, date.length() - 4);
            if (dateWithoutYear.compareTo("03/21") >=0 && dateWithoutYear.compareTo("06/21") <=0) {
                SpringCheckerGrpc.SpringCheckerBlockingStub springStub = SpringCheckerGrpc.newBlockingStub(channel);
                ZodiacChecker.ZodiacReply reply = springStub.giveInfoSpring(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
                System.out.println("Server replied with " + reply);
            }
            if (dateWithoutYear.compareTo("06/22") >=0 && dateWithoutYear.compareTo("09/23") <=0) {
                SummerCheckerGrpc.SummerCheckerBlockingStub summerStub = SummerCheckerGrpc.newBlockingStub(channel);
                ZodiacChecker.ZodiacReply reply = summerStub.giveInfoSummer(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
                System.out.println("Server replied with " + reply);
            }
            if (dateWithoutYear.compareTo("09/24") >=0 && dateWithoutYear.compareTo("12/21") <=0) {
                AutumnCheckerGrpc.AutumnCheckerBlockingStub autumnStub = AutumnCheckerGrpc.newBlockingStub(channel);
                ZodiacChecker.ZodiacReply reply = autumnStub.giveInfoAutumn(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
                System.out.println("Server replied with " + reply);
            }
            if (dateWithoutYear.compareTo("12/22") >=0 || dateWithoutYear.compareTo("03/20") <=0) {
                WinterCheckerGrpc.WinterCheckerBlockingStub winterStub = WinterCheckerGrpc.newBlockingStub(channel);
                ZodiacChecker.ZodiacReply reply = winterStub.giveInfoWinter(ZodiacChecker.ZodiacRequest.newBuilder().setDate(date).build());
                System.out.println("Server replied with " + reply);
            }
        }
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
        String newDate = "";
        String[] dateSplit = date.split("/");
        int helper;
        helper = Integer.parseInt(dateSplit[0]);
        if (helper <= 9 && dateSplit[0].length() == 1) {
            newDate += "0";
        }
        newDate += dateSplit[0];
        newDate += "/";
        helper = Integer.parseInt(dateSplit[1]);
        if (helper <= 9 && dateSplit[0].length() == 1) {
            newDate += "0";
        }
        newDate += dateSplit[1];
        newDate += "/";
        newDate += dateSplit[2];
        return newDate;
    }
}
