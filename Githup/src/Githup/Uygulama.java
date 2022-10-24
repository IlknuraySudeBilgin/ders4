package Githup;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan =new Scanner(System.in);
		//1
		System.out.println("Aşağıdakilerden hangisi küresel ısınmanın sonuçlarından biri değildir?");
		System.out.println("A"+" Ortalama deniz seviyesinin yükselmesi");
		System.out.println("B"+"Tatli su kaynaklarının azalmasi");
		System.out.println("C"+"Buzullarin artmasi");
		System.out.println("D"+" Denizlerin soğumasi");
		System.out.println("E"+"İklim değişiklikleri");

		String soru1 = scan.nextLine();

		if(soru1.equals("A"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//2

		System.out.println("Küresel Isinma: Atmosfere salinan CO2 gibi sera etkisi yaratan gazlarin, yer yüzeyi ve denizlerin ortalama sicakliğini artirmasidir.\r\n"
				+ "\r\n"
				+ "Buna göre; aşağidakilerden hangisi küresel isinmaya karşi alinabilecek onlemler arasinda değildir?");
		System.out.println("A"+" Ambalajları fazla olan ürünleri kullanmaktan kacınmak");
		System.out.println("B"+"Ev ve iş yerinde enerji yalitimi saglamak");
		System.out.println("C"+" Yenilenemez enerji kaynaklarini kullanmayi tercih etmek");
		System.out.println("D"+"Otomobillerin hava ve yakit filtrelerinin her zaman temiz olmasina dikkat etmek ");
		System.out.println("E"+"Evsel atiklari geri donusturmek");

		String soru2 = scan.nextLine();

		if(soru2.equals("A"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//3
		System.out.println("Dunya'ya Gunes'ten gelen isinlar, karbondioksit, metan ve su buhari gibi atmosferde bulunan gazlar tarafindan tutulur. Boylece Dunya'nin sicakligi artar.\r\n"
				+ "\r\n"
				+ "Güneş enerjisinin bu gazlar tarafından tutulması olayına ne ad verilir?");
		System.out.println("A"+" Güneş Tutulması");
		System.out.println("B"+"Sera Etkisi");
		System.out.println("C"+"Buzulların artması");
		System.out.println("D"+" Ozon Tabakasının Delinmesi");
		System.out.println("E"+" Dünya'nın Presizyon Hareketi");

		String soru3=scan.nextLine();

		if(soru3.equals("A"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//4

		System.out.println("İnsanların küresel iklim değişikliğine neden olan etkinlikleri arasında aşağıdakilerden hangisi gösterilemez?");
		System.out.println("A"+" Tarlalarda yapay gübre kullanması");
		System.out.println("B"+"Sera Etkisi");
		System.out.println("C"+"Rüzgâr gücünden elektrik üretmesi");
		System.out.println("D"+" Motorlu taşıt kullanımının yaygınlaşması");
		System.out.println("E"+"  Şehirleşme oranının artması");
			

		String soru4=scan.nextLine();
		if(soru4.equals("A"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};
		//5
		System.out.println("Aşağıdakilerden hangisinin dünyanın normalden fazla ısınmasına neden olduğu söylenemez?");
		System.out.println("A"+" Nüfusun artması");
		System.out.println("B"+"Sanayileşme");
		System.out.println("C"+"Teknolojinin gelişmesi");
		System.out.println("D"+" Petrol tüketiminin artması");
		System.out.println("E"+"  Geri dönüşümün yaygınlaşması"
				+ "");

		String soru5=scan.nextLine();

		if(soru5.equals("A"))
		{
			System.out.println("dogru");
		}
		else
		{
			System.out.println("yanlis");
		};

		int c = 0;

		if(c==5) {
			System.out.println("mukemmel");
		}
		else if(c==4) {
			System.out.println("cok iyi");
		}
		else if(c<=3) {
			System.out.println("kuresel isinma hakkindaki bilgilerini tazele");
		}else {
			
		}
		

		
	}

}
