package berlari;

public class OopBerlari { //Class
    String Nama, NIM; //Attribut
    int jumlahPutaran, waktuPutaran;   //Attribut
        public void setNama(String nama) //Method
        {   
            Nama=nama;
        }
        public void setNIM(String nim) //Method
        {   
            NIM=nim;
        }
        public void setJumlahPutaran (int jumlahputaran) //Method
        {   
            jumlahPutaran=jumlahputaran;
        }
        public void setWaktuPutaran (int waktuputaran) //Method
        {
            waktuPutaran=waktuputaran;
        }
        public String getNama () //Method
        {   
            return Nama;
        }
        public int getWaktuPutaran() //Method
        {
            return waktuPutaran;
        }
        public int getHasil () //Method
        {
            return 2*(100+20)*jumlahPutaran ;
        }
}
