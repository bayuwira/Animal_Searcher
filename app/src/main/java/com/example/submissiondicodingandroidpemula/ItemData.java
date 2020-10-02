package com.example.submissiondicodingandroidpemula;

import java.util.ArrayList;

public class ItemData {
    private static String [] itemName = {
            "Komodo",
            "Macan Tutul Jawa",
            "Dugong",
            "Burung Jalak Bali",
            "Penyu",
            "Panda",
            "Gajah",
            "Badak",
            "Burung Merak",
            "Burung Cenderawasih",
            "Gorila",
            "Orang Utan",
            "Kuda Nil",
            "Ikan Arwana Irian",
            "Hiu Sentani",
            "Kucing Merah Kalimantan",
            "Kadal Berduri Australia",
            "Ikan Arwana Merah",
            "Kura-kura Leher Ular",
            "Kanguru Pohon"

    };

    public static int[] itemImage = {
            R.drawable.komodo,
            R.drawable.macan_tutul,
            R.drawable.dugong,
            R.drawable.jalak_bali,
            R.drawable.penyu,
            R.drawable.panda,
            R.drawable.gajah,
            R.drawable.badak,
            R.drawable.merak,
            R.drawable.cendrawasih,
            R.drawable.gorila,
            R.drawable.orang_utan,
            R.drawable.kuda_nil,
            R.drawable.arwana,
            R.drawable.hiu_sentani,
            R.drawable.kucin_merah_kalimantan,
            R.drawable.kadal_berduri_australia,
            R.drawable.arwana_merah,
            R.drawable.kura_kura_leher_ular,
            R.drawable.kangguru_pohon,
    };

    private static String[] itemDetail = {
            "Komodo adalah hewan langka yang hanya dapat kita temui di Indonesia terutama di pulau komodo. Komodo telah ditetapkan pemerintah sebagai hewan yang dilindungi karena habitat komodo semakin berkurang hal ini disebabkan karena adanya perburuan illegal sampai lamanya perkembang biakan dari komodo sendiri.",
            "Macan Tutul Jawa adalah hewan yang telah dinyatakan hampir punah tahun 2007 dan masuk dalam daftar red list di IUCN. Macan tutul jawa memiliki ukuran paling kecil dibandingan jenis macan tutul lainnya dan memiliki pengelihatan yang sangat tajam dalam mencari mangsa. Macan ini adalah asli hewan endemis Pulau Jawa.",
            "Dugong atau nama lainnya adalah ikan duyung merupakan spesies mamalia laut yang hidup indo pasifik dan dapat ditemui di sekitar perairan sebelah utara Australia. Dugong ini banyak diburu untuk diambil daging dan minyaknya, selain itu dugaan lain menyebabkan dugong hampir punah karena terjadinya perubahan iklim ekstrem sehingga sulitnya dugong untuk tetap bertahan hidup di habitat aslinya.",
            "Burung jalak bali atau Leucopsar rothschildi adalah hewan endemis Indonesia yang berasal dari Bali. Burung ini pertama di temukan pada tahun 1910 oleh seorang ahli binatang bernama Walter rothchild, karakteristik burung jalak bali yang unik karena memiliki bulu putih bersih dan warna biru di bagian mata yang cantik.\n" +
                    "\n" +
                    "Jumlah burung jalak bali semakin berkurang sangat signifikan, kemudian pada tahun 1984 pemerintah menetapkan hewan ini sebagai hewan yang terancam punah dan wajib dilindungi.",
            "Penyu bisa ditemui di seluruh samudera dunia, namun keberadaan penyu sekarang terancam punah dan semakin sulit ditemui dilaut karena banyaknya pemangsa yang mengincar tukik atau anak penyu. Selain itu adanya perburuan telur penyu yang dilakukan oleh manusia membuat hewan ini semakin lama populasinya semakin berkurang.",
            "Panda adalah hewan langka yang berasal dari negara China, hewan ini banyak ditemui disekitar pegunungan China seperti Sichuan dan Tibet.\n" +
                    "\n" +
                    "Panda dinyatakan sebagai Hewan langka dan terancam punah karena populasinya semakin berkurang. Diduga banyak panda yang mati karena rusaknya habitat sehingga panda kesulitan untuk mencari makan.",
            "Gajah dinyatakan sebagai hewan langka yang terancam punah keberadaannya oleh IUCN, hal ini disebabkan penurunan populasi hewan gajah di habitat aslinya.\n" +
                    "\n" +
                    "Terancamnya hewan ini penyebab utamanya karena rusaknya habitat gajah sehingga mereka sulit mencari makan. Selain itu adanya perburuan liar untuk diambil gadingnya merupakan salah satu pemicu berkurangnya tingkat populasi gajah di habitat aslinya tersebut.",
            "Badak adalah spesies hewan dengan ciri khas cula yang terdapat pada kepalanya, hewan ini banyak dijumpai di kawasan Asia dan Afrika. Namun badak dinyatakan sebagai hewan langka dan terancam di habitat aslinya, hal ini disebabkan adanya kepercayaan bahwa cula badak berguna bagi kesehatan terutama pada ilmu obat-obatan tradisional Cina.",
            "Merak adalah spesies burung yang memiliki bulu dengan warna yang cerah dan ekor yang ukuran besar dan indah.\n" +
                    "\n" +
                    "Sayangnya hewan cantik asal Indonesia ini semakin terancam karena banyaknya perburuan merak untuk dijadikan hewan peliharaan maupun untuk diambil bulunya yang indah.",
            "Burung cenderawasih menjadi maskot pulau papua karena pulau ini memiliki 28 jenis spesies dari 30 spesies yang ada. Burung cenderawasih memiliki bulu warna yang beragam seperti putih, kuning, coklat, dan hijau.\n" +
                    "\n" +
                    "Namun dengan keindahannya ini membuat burung cenderawasih menjadi hewan yang langka karena banyaknya perburuan untuk dijual di pasaran. Habitatnya pun sudah sangat mengkhawatirkan sehingga membuat burung ini semakin terancam keadaannya.",
            "Gorila adalah hewan langka yang berasal dari Afrika, memiliki DNA 97 % mirip dengan DNA manusia. Sayangnya hewan ini dianggap langka karena keberadaan di habitatnya semakin berkurang.",
            "Orang Utan masih berkerabat dekat dengan kera sehingga orang utan sendiri sering juga disebut dengan kera besar. Hewan ini hidup di Malaysia dan juga Indonesia terutama di Pulau Kalimantan dan Sumatra.\n" +
                    "\n" +
                    "Orang Utan sendiri dikatakan sebagai hewan langka karena hanya terdapat sekitar 7.500 ekor saja saat ini, padahal tahun 1990 orang utan diperkirakan berjumlah lebih dari 200.000 ekor.",
            "Kuda Nil atau nama latinnya Hippopotamus amphibius adalah hewan mamalia sekaligus amfibi yang hidup di dua alam yaitu darat dan air. Kuda Nil dinyatakan sebagai hewan langka yang terancam punah oleh IUCN karena jumlahnya yang semakin menurun tiap tahunnya.",
            "Seperti namanya ikan arwana irian berasal dari Irian Jaya Papua. Ikan ini banyak di tangkap secara ilegal dan dijual belikan di pasaran sehingga menyebabkan populasi ikan arwana irian semakin turun dratis dan sulit ditemui.",
            "Ikan Hiu Sentani atau biasa disebut dengan hiu gergaji adalah spesies hiu yang dapa dijumpai di perairan Indo pasifik. Selain itu ikan ini juga sering dijumpai di Madagaskar, Afrika, India, Vietnam, dan lain sebagainya. Namun kini ikan ini jarang bahkan sulit untuk ditemui karena sudah termasuk ke dalam hewan yang sangat langka.",
            "Kucing Merah adalah hewan endemis asli Pulau Kalimantan dengan karakteristik warna merah di seluruh tubuhnya.\n" +
                    "\n" +
                    "Kucing ini telah masuk sebagai Hewan langka dan terancam punah sejak tahun 2002 yang ditetapkan oleh IUCN. Jumlah populasi di habitat aslinya kucing ini diperkirakan hanya tersisa sebanyak 2.500 ekor saja 2007.",
            "Hewan ini terancam punah karena adanya perubahan iklim yang sangat ekstrim terjadi di Australia, bahkan bukan hanya di Australia perubahan iklim ini banyak dirasakan di negara-negara dunia.",
            "Ikan Arwana Merah adalah hewan endemis asli Indonesia. Hewan ini dinyatakan sebagai hewan langka yang sangat terancam karena adanya penangkapan liar yang dilakukan oleh masyarakat baik untuk di konsumsi maupun untuk di jual sebagai ikan hias.",
            "Kura-kura Leher Ular adalah salah satu spesies dari kura-kura yang dimasukkan ke dalam hewan langka oleh IUCN.",
            "Kanguru Pohon adalah salah satu spesies dari kanguru, binatang ini banyak ditemukan di Papua Nugini dan Australia. \n" +
                    "\n" +
                    "Kanguru ini terancam punah karena habitat yang mereka tempati banyak yang rusak dan pohon banyak ditebang sehingga mereka kehilangan habitat."

    };

    static ArrayList<Item> getListData(){
        ArrayList <Item> list = new ArrayList<>();
        for (int i = 0; i< itemName.length; i++){
            Item item = new Item();
            item.setName(itemName[i]);
            item.setDetail(itemDetail[i]);
            item.setPhoto(itemImage[i]);
            list.add(item);
        }
        return list;
    };

}
