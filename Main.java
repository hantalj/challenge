package com.company;

public class Main {

    public static void main(String[] args) {

        String part1 = "k12ww 7s49v ,?286?mv 27rq s33od4 6fh77k r4og2 hu+";
        String part2 = "yd23 un394 hti58 j934+0 67htr9 8?173h t23r96 rj8s3 y73x";
        String solution = deCipher(part1,3)+deCipher(part2,5);
        System.out.println(solution);
    }

    public static String deCipher(String partC, int number){
        String result = "";
        for (int i = 0; i < partC.length(); i++){
            char c = partC.charAt(i);
            if (Character.isLetter(c)){
                int asciiCode = c-number;
                if (asciiCode<97){
                    asciiCode = asciiCode+26;
                }
                result += (char)(asciiCode);
            }
            else if (c == ",".charAt(0))
                result += ":";
            else if (c == "+".charAt(0))
                result += ".";
            else if (c == "?".charAt(0))
                result += "/";
        }
        return result;
    }
}