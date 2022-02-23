package com.dellao.skye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AnalisaGejala extends AppCompatActivity {

    CheckBox CekG1, CekG2, CekG3, CekG4, CekG5, CekG6, CekG7, CekG8,
            CekG9, CekG10;


    Button btnLihatHasilAnalisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisa_gejala);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CekG1 = findViewById(R.id.gejala1);
        CekG2 = findViewById(R.id.gejala2);
        CekG3 = findViewById(R.id.gejala3);
        CekG4 = findViewById(R.id.gejala4);
        CekG5 = findViewById(R.id.gejala5);
        CekG6 = findViewById(R.id.gejala6);
        CekG7 = findViewById(R.id.gejala7);
        CekG8 = findViewById(R.id.gejala8);
        CekG9 = findViewById(R.id.gejala9);
        CekG10 = findViewById(R.id.gejala10);

        btnLihatHasilAnalisa = findViewById(R.id.btn_hasil_analisa);

        btnLihatHasilAnalisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasilDiagnosa = "";
                String headDiagnosa;
                int count = 0;

                if (CekG1.isChecked() && CekG2.isChecked() && CekG3.isChecked()) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu berminyak" +
                            "\nJenis kulit wajah berminyak dipicu oleh produksi sebum yang berlebihan. Beberapa cara merawatnya adalah dengan rajin mencuci muka. Hindari produk pembersih wajah deterjen dan gunakan pencuci wajah yang mengandung gliserin. Selalu siapkan kertas minyak atau bloating paper." +
                            "\nApabila menggunakan masker, pilih bahan masker yang mengandung clay, madu, tomat, atau lemon. Kemudian hindari makanan yang tidak sehat seperti makanan yang digoreng, makanan tinggi gula, dan makanan olahan. Jangan lupa untuk selalu menggunakan sunscreen serta pelembap yang bebas minyak.\n";
                }
                if (CekG8.isChecked() && CekG4.isChecked() && CekG5.isChecked()) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu kering" +
                            "\nPerawatan jenis kulit wajah kering dapat dilakukan dengan menggunakan pembersih wajah yang lembut dan tidak mengandung alkohol atau wewangian. Hindari juga mandi dan mencuci muka dengan air hangat terlalu lama.Gunakan pelembap setiap selesai mencuci muka. Selalu pakai sabun pembersih wajah dengan bahan yang melembapkan, seperti emolien atau colloidal oatmeal.\n" ;

                }
                if (CekG6.isChecked() && CekG7.isChecked()) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu kombinasi" +
                            "\nPerlakukan daerah T dan pipi secara berbeda-beda. Misalnya, untuk area yang rentan berjerawat gunakan krim anti-acne, sedangkan bagian lainnya memakai pelembap bebas minyak. Pilih tesktur sabun seperti gel, foam, atau krim.Setelah itu, Anda bisa mencuci wajah dengan memakai air hangat karena bisa membantu menjaga kelembapan di pori-pori kulit." +
                            "\nKemudian, Anda perlu menggunakan toner. Pilih toner yang bebas alkohol dan tidak membuat kulit Anda terlalu kering atau yang bisa merangsang kelenjar minyak.Eksfoliasi perlu dilakukan secara rutin. Gunakan clay mask. Pilih produk kecantikan tanpa alkohol. Lalu, gunakan vitamin A\n";
                }
                if (CekG8.isChecked() && CekG9.isChecked() && CekG10.isChecked()) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu sensitif" +
                            "\nAda beberapa solusi untuk merawat kulit wajah sensitif, misalnya mengetahui faktor-faktor yang menyebabkan kulit bereaksi seperti; terpapar sinar matahari langsung atau udara yang terlalu dingin. Gunakan sabun wajah yang lembut dan bilas dengan air hangat. Hindari menggosok wajah." +
                            "\nBeberapa kandungan dalam produk perawatan kulit yang tidak cocok dengan jenis kulit sensitif adalah Oxychloride Bismuth, Sodium Lauryl Sulphate, dan bahan kimia iritan lainnya." +
                            "\nCobalah gunakan produk perawatan kulit sensitif yang mengandung lidah buaya, chamomile, teh hijau, polifenol, dan gandum. Jangan lupa gunakan tabir surya dengan tingkat perlindungan sinar UVB (SPF 50+) dan UVA (PA++++).\n";
                }
                if (CekG1.isChecked() && CekG2.isChecked() && CekG6.isChecked()) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu kombinasi cenderung berminyak" +
                            "\n Kulit kombinasi cenderung berminyak disarankan untuk memakai produk yang mengandung bahan aktif yang dapat menjaga kelembapan, membersihkan kulit dengan optimal, dan keseimbangan minyak di wajah Anda.\n";
                }
                if (CekG1.isChecked() && CekG3.isChecked() && CekG8.isChecked() && CekG9.isChecked() ) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu sensitif dan berminyak" +
                            "\n Kulitmu peka terhadap perubahan suhu, mudah terbakar matahari dan cenderung mudah iritasi. Gunakan pembersih yang lembut dan jangan gunakan produk yang keras karena akan menghilangkan minyak natural sehingga memicu memproduksi minyak berlebih. Jaga kulitmu juga dengan serum ringan dan pelembab.\n";
                }
                if (CekG2.isChecked() && CekG4.isChecked() && CekG8.isChecked() ) {
                    count++;
                    hasilDiagnosa += "\n"+count+". Tipe kulitmu sensitif dan kering" +
                            "\n Kulitmu terasa kencang dan tidak nyaman setelah mencuci muka. Tipe kulitmu lebih rentan terhadap penuaan dan iritasi. Dengan perawatan kulit yang benar seperti masker wajah, pembersih yang melembabkan serta pelembab akan mengatasi kulit kering.\n";
                }
                if (hasilDiagnosa == "") {
                    headDiagnosa = "Anda memiliki kulit normal" +
                    "\nKulit wajah normal biasanya memiliki tingkat sebum dan hidrasi yang seimbang sehingga jenis kulit ini tidak terlalu kering dan tidak terlalu berminyak. Tingkat kelembapan kulit wajah normal cenderung pas. Orang dengan jenis kulit wajah normal biasanya jarang memiliki masalah kulit.\n";
                } else {
                    headDiagnosa = "Berikut merupakan hasil analisa kulit wajahmu";
                }

                switch (v.getId()){
                    case R.id.btn_hasil_analisa:
                        Intent solusi = new Intent(AnalisaGejala.this, solusi.class);
                        solusi.putExtra("txtDiagnosaHead", headDiagnosa );
                        solusi.putExtra("txtDiagnosaHasil", hasilDiagnosa );
                        startActivity(solusi);
                        break;
                }
            }
        });
    }
}