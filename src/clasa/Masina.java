package clasa;

public class Masina {
  private static final int VITEZA_MAXIMA = 220;
  private String producator;
  private int nrRoti;
  private int viteza = 0;
  
  public Masina(String producator, int nrRoti) {
    this.producator = producator;
    this.nrRoti = nrRoti;
  }
  
  public Masina(String producator) {
    this.producator = producator;
    this.nrRoti = 5;
  }
  
  public String getProducator() {
    return producator;
  }
  
  public void setProducator(String producator) {
    this.producator = producator;
  }
  
  public int getNrRoti() {
    return nrRoti;
  }
  
  public void setNrRoti(int nrRoti) {
    this.nrRoti = nrRoti;
  }
  
  public int getViteza() {
    return viteza;
  }
  
  public void accelereaza(int vitezaDorita) {
    if (vitezaDorita > VITEZA_MAXIMA || (viteza + vitezaDorita > VITEZA_MAXIMA)) {
      this.viteza = VITEZA_MAXIMA;
    } else {
      while (vitezaDorita > viteza) {
        this.viteza += 1;
      }
    }
  }
}
