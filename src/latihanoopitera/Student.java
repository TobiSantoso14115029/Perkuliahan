package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Student implements Person {
    
    // nim mahasiswa
    private String nim,name,address;

    //Lengkapi
    //Constructor
    public Student(String name, String address, String noInduk) {
        this.name=name;
        this.address=address;
        this.nim=noInduk;
    }

    //Lengkapi
    //Mendapatkan nama person
    @Override
    public String getName() {
       return name;
    }

    //Lengkapi
    //Set nama person
    @Override
    public void setName(String name) {
        this.name=name;
    }

    //Lengkapi 
    //Alamat person
    @Override
    public String getAddress() {
       return address;
    }

    //Lengkapi
    //Set alamat person
    @Override
    public void setAddress(String address) {
        this.address=address;
                
    }
    
    
    //Lengkapi
    //mendapatkan kode mahasiswa / nim
    @Override
    public String getKode() {
        return nim;
       
    }
    
    //Lengkapi
    //set kode mahasiswa / nim
    @Override
    public void setKode(String kode){
        this.nim=nim;
    }
    
   //Lengkapi
   @Override
   public String toString() {
     return "student:"+name+"("+address+")"+"\n nim :"+nim;
   }
   /*
   output
   Student: Ahmad Luky Ramdani (Bandar Lampung)
   Nim: NIM12
   */
   public static void main(String[] args) {
      Student s1 = new Student("Ahmad Luky Ramdani", "Bandar Lampung", "NIM12");
      System.out.println(s1);
   }
}