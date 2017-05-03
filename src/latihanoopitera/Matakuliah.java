package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Matakuliah {
    int sks;
    String kode_mk;
    String nama;
    
    //lengkapi 
    //constrcutor
    public Matakuliah(String kode, String nama, int sks) {
        this.kode_mk=kode;
        this.nama=nama;
        this.sks=sks;
        
    }

    //lengkapi
    @Override
    public String toString() {
        String a= this.kode_mk;
        String b=this.nama;
        int c=this.sks;
        String d= " ==Info Matakuliah=="+
                  "\nKode Matakuliah:"+a+
                  "\nNama Matakuliah:"+b+
                  "\nSks :"+sks;
        return d;
    }
    /*
    output
    == Info Matakuliah ==
    Kode Matakuliah : IF2
    Nama Matakuliah : Sistem Operasi
    SKS : 2
    */
    
    public static void main(String[] args) {
        Matakuliah b = new Matakuliah("IF2","Sistem Operasi",2);
        System.out.println(b);
    }
    
}
