package Mart24.ders.com;

import java.util.Random;

public class SinavProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rastgele = new Random();
		int IslemSayisi = rastgele.nextInt(10);
		int IslemTuru = rastgele.nextInt(2);
		int Sayi = rastgele.nextInt(10);
		SinavIslemleriMetodlar input = new SinavIslemleriMetodlar();

		switch (IslemTuru) {
		case 1:
			int y = input.Faktoriyel(Sayi, IslemSayisi);
			System.out.println("Yapýlan iþlem faktöriyel "+ y);
			break;
		case 2:
			int x = input.Fonksiyon(Sayi, IslemSayisi);
			System.out.println("Yapýlan iþlem Fonksiyon " + x);
			break;
		}

	}
}