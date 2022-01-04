package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // để nhập dữ liệu từ bàn phím Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int number = scanner.nextInt();
        String socandoc ="";
        switch (number){
            case 1:{
                socandoc="Zero";
                break;
            }
            case 2:{
                socandoc="Two";
            }
            case 3:{
                socandoc="Three";
                break;
            }
            case 4:{
                socandoc="Four";
                break;
            }
            case 5:{
                socandoc="five";
                break;
            }
            case 6:{
                socandoc="six";
                break;
            }
            case 7:{
                socandoc="sever";
                break;
            }
            case 8:{
                socandoc="eight";
                break;
            }
            case 9:{
                socandoc="nine";
                break;
            }
            case 10:{
                socandoc="ten";
                break;
            }
            case 11:{
                socandoc="eleven";
                break;
            }
            case 12:{
                socandoc="twelve";
                break;
            }
            case 13:{
                socandoc="thirteen";
                break;
            }
            case 14:{
                socandoc="fourteen";
                break;
            }
            case 15:{
                socandoc="fifteen";
                break;
            }
            case 16:{
                socandoc="sixteen";
                break;
            }
            case 17:{
                socandoc="seventeen";
                break;
            }
            case 18:{
                socandoc="eighteen";
                break;
            }
            case 19:{
                socandoc="nineteen";
                break;
            }
            case 20:{
                socandoc="twenty";
                break;
            }
        }
        System.out.println("đọc là "+ socandoc);
    }
}
