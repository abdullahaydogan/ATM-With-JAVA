public class Kullanıcı {

    private String ad;
    private String soyAd;
    private int bakiye;
    private int sifre;
    public Kullanıcı(int sifre){
      if(sifre==4144){
          this.ad="Abdullah";
          this.soyAd="Aydoğan";
          this.bakiye=10000;
      }
      else if(sifre==0644){
          this.ad="Hasan";
          this.soyAd="Kaya";
          this.bakiye=30000;
        }
      else if(sifre==4444){
          this.ad="Miraç";
          this.soyAd="Yüksek";
          this.bakiye=12000;
      }

    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        int basamak=0;
        while(sifre>0){
            sifre/=10;
            basamak++;
        }
        if(basamak==3){
            this.sifre=sifre;
        }
        else{
            System.out.println("Lütfen Geçerli 4 haneli şifrenizi giriniz!!!");
        }

    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {

        this.bakiye = bakiye;
    }

}
