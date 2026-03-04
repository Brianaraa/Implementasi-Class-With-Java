/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NotSuperHero;

/**
 *
 * @author Nara Ganteng
 */
public class NotGatotKaca {
    public String Nama = "Redacted";
    public int varian;

    public NotGatotKaca() {
        System.out.println("Identitas Asli Hero ini : " + this.Nama);
}

public void busetidentitas(String Nama, int varian){
    this.Nama = Nama;
    this.varian = varian;

}

public void yapping(){
    System.out.println("akulah sang prabu, aku bisa menjadi kutu");
}
}