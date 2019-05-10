/*
* prima instrutiune este intotdeauna cea de pachet, in situatia in care exista unul declarat
*/
package clasa;

/*
* al doilea set de instructiuni este cel referitor la importuri (intre 0 si oricate)
* prin import intelegem ca dorim sa accesam functionalitate din alta clasa, care face parte din alt pachet
*/

/*
* declararea unei clase se face prin keywordul class, urmat de numele clasei
* optional: putem avea un modificator de acces:
* - public: vizibil de oriunde din proiect
* - protected: vizibil si in clasele care extind clasa de baza
* - default: nu trebuie scris, vizibil doar in pachet
* - private: vizibil doar in clasa/fisierul respectiv
* https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
*
* clasa trebuie sa aiba acelasi nume cu fisierul
* clasa care da numele fisierului nu trebuie sa fie private/protected
*/
public class NumeClasa {
  
  /*
   * atributele/membrii clasei/proprietatile
   * au aceiasi modificatori de acces, care descriu aceasi vizibilitate ca in cazul de mai sus
   */
  private static final String NUMELE_UNEI_CONSTANTE = "constanta";
  int numarDeAccesari;
  protected boolean esteClasaPublica = true;
  public char variabila;
  
  /*
   * constructori
   * daca nu doirim un constructor specific care primeste parametri, nu e necesar sa declaram unul
   * in caz contrar (declaram), constructorul implicit va trebui declarat pentru a putea fi folosit
   * putem avea oricate variatii de constructor, cu conditia de a nu duplica contractul
   * contractul unei metode(sau constructor) e reprezentat de nume si tipul parametrilor primiti ca input
   */
  public NumeClasa(int accesari) {
    //keywordul this acceseaza obiectul in care se lucreaza (apeleaza)
    this.numarDeAccesari = accesari; //seteaza in variabila clasei -> specifica unei instante <- valoarea primita ca input
  }
  
  public NumeClasa(int accesari, char variabila) {
    //keywordul this acceseaza obiectul in care se lucreaza (apeleaza)
    this.numarDeAccesari = accesari; //seteaza in variabila clasei -> specifica unei instante <- valoarea primita ca input
    this.variabila = variabila;
  }
  
  /*
   * Metode (oricate ca numar
   * respecta aceleasi reguli ca si un constructor, cu diferenta ca numele este scris camelCase
   * si trebuie sa aiba declarat un tip de date intors (daca nu vrem sa intoarcem nimic declaram void)
   * la fel ca in cazul
   */
  public void afiseazaText() {
    //functionalitate
  }
  
  private int calculeazaSuma(int i, int j) {
    //keywordul return semnaleaza ca valoarea obtinuta dupa el va fi intoarsa ca raspuns al metodei
    return i+j;
  }
  
  String obtineNume() {
    return "Alex";
  }
  
  protected void apelMetoda() {
    //functionalitate
  }
}
