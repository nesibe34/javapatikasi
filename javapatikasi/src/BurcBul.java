import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Kaçıncı ayda doğduğunuzu giriniz:");
        int month= inp.nextInt();
        System.out.println("Ayın kaçıncı gününde doğduğunuzu giriniz:");
        int day= inp.nextInt();
        if (month<1 || month>12){
            System.out.println("Geçersiz giriş yaptınız.");
        }else {
            if (month == 1) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 22) {
                        System.out.println("Burcunuz: OĞLAK");
                    } else {
                        System.out.println("Burcunuz: KOVA");
                    }
                }
            }
            if (month == 2) {
                if (day < 1 || day > 28) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 20) {
                        System.out.println("Burcunuz: KOVA");
                    } else {
                        System.out.println("Burcunuz: BALIK");
                    }
                }
            }
            if (month == 3) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 21) {
                        System.out.println("Burcunuz: BALIK");
                    } else {
                        System.out.println("Burcunuz: KOÇ");
                    }
                }
            }
            if (month == 4) {
                if (day < 1 || day > 30) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 21) {
                        System.out.println("Burcunuz: KOÇ");
                    } else {
                        System.out.println("Burcunuz: BOĞA");
                    }
                }
            }
            if (month == 5) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 22) {
                        System.out.println("Burcunuz: BOĞA");
                    } else {
                        System.out.println("Burcunuz: İKİZLER");
                    }
                }
            }
            if (month == 6) {
                if (day < 1 || day > 30) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 23) {
                        System.out.println("Burcunuz: İKİZLER");
                    } else {
                        System.out.println("Burcunuz: YENGEÇ");
                    }
                }
            }
            if (month == 7) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 23) {
                        System.out.println("Burcunuz: YENGEÇ");
                    } else {
                        System.out.println("Burcunuz: ASLAN");
                    }
                }
            }
            if (month == 8) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 23) {
                        System.out.println("Burcunuz: ASLAN");
                    } else {
                        System.out.println("Burcunuz: BAŞAK");
                    }
                }
            }
            if (month == 9) {
                if (day < 1 || day > 30) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 23) {
                        System.out.println("Burcunuz: BAŞAK");
                    } else {
                        System.out.println("Burcunuz: TERAZİ");
                    }
                }
            }
            if (month == 10) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 23) {
                        System.out.println("Burcunuz: TERAZİ");
                    } else {
                        System.out.println("Burcunuz: AKREP");
                    }
                }
            }
            if (month == 11) {
                if (day < 1 || day > 30) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 22) {
                        System.out.println("Burcunuz: AKREP");
                    } else {
                        System.out.println("Burcunuz: YAY");
                    }
                }
            }
            if (month == 12) {
                if (day < 1 || day > 31) {
                    System.out.println("Geçersiz bir gün girdiniz.");
                } else {
                    if (day < 22) {
                        System.out.println("Burcunuz: YAY");
                    } else {
                        System.out.println("Burcunuz: OĞLAK");
                    }
                }
            }
        }
    }
}
//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart