package Mart24.ders.com;

public class SinavIslemleriMetodlar {

	int Fonksiyon(int x, int y) {
		int sonuc = 0;
		for (int i = 1; i <= y; i++) {
			sonuc = (x * x) * x + (x - 3) * (x - 3) + 5;

		}
		return sonuc;

	}

	int Faktoriyel(int x, int y) {
		int sonuc = 1;
		for (int k = 1; k <= y; k++) {

			for (int i = 1; i <= x; i++) {
				sonuc = i * x;
			}

		}
		return sonuc;
	}

}
