package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Teacher implements Person {
    
    //Kode dosen
    private String Kode_dosen,nama,alamat; 

    public Teacher(String name, String address, String kode) {
        this.nama= name;
        this.alamat=address;
        this.Kode_dosen=kode;
        
    }
    //Lengkapi
    //Mendapatkan nama person
    @Override
    public String getName() {
       return nama;
    }

    //Lengkapi
    //Set nama person
    @Override
    public void setName(String name) {
        this.nama=name;
    }

    //Lengkapi 
    //Alamat person
    @Override
    public String getAddress() {
       return alamat;
    }

    //Lengkapi
    //Set alamat person
    @Override
    public void setAddress(String add) {
        this.alamat=add;
    }
  
    //Lengkapi
    //mendapatkan kode dosen
    @Override
    public String getKode() {
       return Kode_dosen;
    }
    
    //Lengkapi
    //set kode dosen
    @Override
    public void setKode(String kode){
        this.Kode_dosen=kode;
    }

    @Override
    public String toString() {
        String a="Teacher:"+this.nama.toString()+"("+this.alamat.toString()+")"+
                "\nKode: "+Kode_dosen;
        return a;
    }
    /*
    output
    Teacher: Hafiz (Bandar Lampung)
    Kode: HFZ
    */
    public static void main(String[] args) {
      Teacher t1 = new Teacher("Hafiz", "Bandar Lampung", "HFZ");
      System.out.println(t1);
    }
}
