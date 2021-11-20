package com.parse.parse;

import com.parse.parse.repository.WorkerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParseApplication.class, args);
        meow();

//        int devCounter = 0;
//        String a="luka qevxishvili var";
//        a=a.substring(1,19);
//        System.out.println(a);
//        String XML = "<xmlStart>\n" +
//                "   <head>\n" +
//                "       <title>Developers</title>\n" +
//                "   </head>\n" +
//                " \n" +
//                "   <body>\n" +
//                "       <developers>\n" +
//                "\t\t<developer>\n" +
//                "\t\t\t<name>Levan</name>\n" +
//                "       \t\t<lastname>Sarchimelia</lastname>\n" +
//                "       \t\t<gender>Male</gender>\n" +
//                "\t\t</developer>\n" +
//                "\t\t<developer>\n" +
//                "\t\t\t<name>Luka</name>\n" +
//                "       \t\t<lastname>Kevkhishvili</lastname>\n" +
//                "       \t\t<gender>Male</gender>\n" +
//                "\t\t</developer>\n" +
//                "<developer>\n" +
//                "\t\t\t<name>Avto</name>\n" +
//                "       \t\t<lastname>Bolashvili</lastname>\n" +
//                "       \t\t<gender>Male</gender>\n" +
//                "\t\t</developer>\n" +
//                "\t </developers>\n" +
//                "   </body>\n" +
//                "</start>\n";
//        String str = XML;
//
//
//        for (int i = 0; i < XML.length(); i++) {
//            if (i + 10 < XML.length() && XML.charAt(i) == '<' && XML.charAt(i + 9) == 'r' && XML.charAt(i + 10) == '>') {
//                devCounter = devCounter + 1;
//            }
//        }
////
////        String neww = str.substring(from, to);
////        System.out.println(devCounter);
////        System.out.println(str.length());
////        String str = "This is tutorials point";
//
//
//
//        while (devCounter > 0) {
//            System.out.println("-------------------------");
//            int from = XML.indexOf("<developer>");
//            int to = XML.indexOf("</start>");
//            String substr = "";
//            XML = XML.substring(from +1 , to + 8);
//            System.out.println(XML);
//            System.out.println("-------------------------");
//
//            devCounter--;
//        }
//

    }

    public static void meow() {

        System.out.println("meow Meow");

    }
}
