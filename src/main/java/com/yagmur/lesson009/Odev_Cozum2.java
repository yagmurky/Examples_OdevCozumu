package com.yagmur.lesson009;

import java.util.Random;
import java.util.Scanner;

public class Odev_Cozum2 {
    public static void main(String[] args) {
        int rastgeleSayi = rastgeleSayiUret();
        int tahminHakki = 0;
        int[] tahminler = new int[5];

        System.out.println("Merhaba ödev çözümüm aşağıdadır.");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bir sayı tuttum, tahmin et:");
            int tahmin = sc.nextInt();
            tahminler[tahminHakki] = tahmin;

            if (tahmin == rastgeleSayi) {
                System.out.println("Tahmininiz doğru.");
                tahminHakki++;
                break;
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Tahmininizi artırmalısınız.");
            } else {
                System.out.println("Tahmininizi azaltın.");
            }
            tahminHakki++;
        } while (tahminHakki < 5);

        if (tahminHakki == 5) {
            System.out.println("Tahmin hakkınız bitti. Doğru sayı: " + rastgeleSayi);
        }
        System.out.println("Tahminleriniz:");
        for (int i = 0; i < tahminHakki; i++) {
            System.out.println(tahminler[i]);
        }
    }
    public static int rastgeleSayiUret() {
        Random random= new Random();
        return random.nextInt(750) + 1;
    }
}
