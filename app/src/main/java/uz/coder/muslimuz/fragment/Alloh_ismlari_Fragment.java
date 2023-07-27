package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.AllohAdapter;
import uz.coder.muslimuz.databinding.FragmentAllohIsmlariBinding;
import uz.coder.muslimuz.model.AllohIsmlariModel;


public class Alloh_ismlari_Fragment extends Fragment {
    FragmentAllohIsmlariBinding binding;
    AllohAdapter adapter;
    List<AllohIsmlariModel> allohIsmlariModelList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAllohIsmlariBinding.inflate(inflater,container,false);
        loadData();
        adapter = new AllohAdapter(requireContext(), allohIsmlariModelList);
        binding.lv1.setAdapter(adapter);
        binding.lv1.setOnItemClickListener((parent, view, position, id) -> {
            AllohIsmlariModel allohIsmlariModel = allohIsmlariModelList.get(position);
            Bundle bundle = new Bundle();
            bundle.putString("key",allohIsmlariModel.getName());
            bundle.putString("key1",allohIsmlariModel.getQuality());
            bundle.putInt("key2",allohIsmlariModel.getImg());
            Navigation.findNavController(binding.getRoot()).navigate(R.id.allohFragment,bundle);
        });
        return binding.getRoot();
    }

    private void loadData() {
        allohIsmlariModelList = new ArrayList<>();
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Alloh","O‘z sifatida, zotida yagona, ibodat qilish uchun eng munosib, undan boshqa iloh yo‘q Zot.\n" +
                "\n" +
                "“Alloh” ismi Parvardigorimizning jami go‘zal ismlari maʼnosini o‘zida jamlagan.\n" +
                "\n"));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Rahmon","O‘ta Mehribon, karamli, barcha maxluqotlarga, jumladan, kofirga ham, mo‘minga ham rizq beruvchi Zot.\n" +
                "\n" +
                "“Rahmon” sifati faqat Alloh taoloning O‘ziga xos. Bu sifat Undan boshqasiga ishlatilmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Rahim","Mehribon, Rahmli, qiyomat kuni faqat mo‘minlarga rahm qiluvchi, Haqiqiy imon keltirganlar\n" +
                "\n" +
                "gunohini avf qilib, jannatga kirituvchi.\n" +
                "\n" +
                "“Ar-Rahim” sifati “Ar-Rahmon”dan xosroq bo‘lib, “Oxiratda faqat mo‘minlarga shafqat qiluvchi”\n" +
                "\n" +
                "maʼnosini bildiradi.\n" +
                "\n" +
                "Yuqorida “Rahmon” sifatini Alloh taolodan o‘zgaga qo‘llab bo‘lmasligi aytildi. Lekin “Rahim”\n" +
                "\n" +
                "Allohdan o‘zgalarga, jumladan Payg‘ambarimiz sollallohu alayhi va sallamga nisbatan qo‘llanilishi\n" +
                "\n" +
                "mumkin (Qarang: “Tavba” surasi, 128-oyat)."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Malik","Barcha mulklarning haqiqiy Egasi, Undan o‘zga ega yo‘q. Alloh xohlagan ishini qila oladi, xohlagan\n" +
                "\n" +
                "narsasini yaratishi mumkin."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Quddus","Har qanday ayb-nuqsondan pok, mukammal Zot. Mutlaq muqaddaslik faqat Allohga xos."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"As-Salom","Nuqsonlardan salomat, pok, bandalarini halokatlardan saqlovchi, ularga omonlik, xotirjamlik\n" +
                "\n" +
                "beruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Moʻmin","Dunyoda istalgan bandasiga, oxiratda jahannam o‘tidan faqat mo‘minlarga omonlik beruvchi;\n" +
                "\n" +
                "omonatga vafo qiluvchi, bandalariga jannat haqida bashorat berib, qiyomat kuni buning tasdig‘i o‘laroq\n" +
                "\n" +
                "ularni jannatga kirituvchi Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muhaymin","Barcha narsani kuzatib turuvchi, maxluqotlarni himoya qiluvchi, ularning har bir holatini bilib\n" +
                "\n" +
                "turuvchi; har bir narsaga shohid bo‘luvchi; maxluqotlar ishini tadbir qiluvchi; amin, ishonchli,\n" +
                "\n" +
                "vaʼdasiga vafo qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Aziz","Kuch-quvvat Egasi, hech qachon mag‘lub bo‘lmaydigan; barcha narsadan g‘olib keluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Jabbor","Maxluqotlari ustidan mutlaq G‘olib, ularga O‘zi xohlagan amr-qaytariqlarni joriy qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mutakabbir","Ulug‘, Aziz, kibriyo Egasi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Xoliq","Avval yo‘q bo‘lgan narsalarni Yaratuvchi, har bir narsani aniq o‘lchov bilan xalq qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Boriʼ","Yo‘qdan bor qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Musavvirʼ","Har bir maxluqotiga o‘ziga yarasha, o‘zga maxluqotlardan ajralib turadigan darajada surat beruvchi;\n" +
                "\n" +
                "bandalariga onalari qornida turgan hollarida O‘zi xohlagan tarzda shakl beruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-G‘affor","Haqiqiy tavba qiluvchi bandalari xato-kamchiliklarini, gunohlarini doim kechiruvchi,\n" +
                "\n" +
                "nuqsonlarini berkituvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Qahhor","Barcha maxluqotlaridan ustun, ularga O‘zining adolatli hukmini yurgizuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vahhob","Bandalariga evazni niyat qilmagan holda juda ko‘p neʼmatlar beruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Razzoq","Rizqlarni yaratib, ularni maxluqotlariga yetkazuvchi, maxluqotlarini doim rizqlantirib turuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Fattoh","Bandalariga rizq va rahmat eshiklarini ochuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Alim","Barcha narsa va hodisalarning botiniy, zohiriy, eng nozik, eng katta jihatlarigacha Biluvchi, ilmi\n" +
                "\n" +
                "hamma narsani to‘liq qamrab olgan Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Qobiz","O‘z hikmati bilan baʼzi bandalari rizqini tor qiluvchi, o‘lim chog‘ida bandalar ruhini oluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Bosit","O‘z karami, rahmati bilan xohlagan bandasi rizqini keng qiluvchi, bandalar hayotlik chog‘ida\n" +
                "\n" +
                "jasadlari ichidagi ruhlarini qo‘yib yuboruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Xofiz","Kofir, mushrik, osiy bandalar martabasini pasaytiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Rofiʼ","Mo‘min bandalari martabasini baland qiluvchi, avliyo bandalarini O‘ziga yaqinlashtiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muiz","Xohlagan bandasini imon yo‘liga boshlab, aziz-mukarram qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muzil","Bandalaridan kimni xohlasa, xor qiluvchi, ulardan azizlikni, mukarramlikni oluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"As-Samiʼ","Har bir narsani eshitib turuvchi. Bo‘layotgan har qanday voqea-hodisa Allohning eshitishidan,\n" +
                "\n" +
                "ilmidan xoli emas."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Basir","Har bir narsani ko‘rib turuvchi, bo‘layotgan har qanday holat Allohning ko‘rishidan chetda qolmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1," Al-Hakam","Mutlaq Hokim. Hech kim Allohning hukmiga eʼtiroz bildirib, qarshilik ko‘rsata olmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Adl","Adolatli, mutlaq adolat qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Latif","Lutf ko‘rsatuvchi, karamli, muloyim, mehribon; har bir narsaning o‘ta nozik jihatlarigacha bilib\n" +
                "\n" +
                "turuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Xabir","Har bir narsaning zohiriy (tashqi), botiniy (ichki) jihatlaridan xabardor Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Halim","Bandalari isyoniga tezda g‘azab qilmaydigan, ularga imkon beruvchi, osiy bandalariga azob berishga\n" +
                "\n" +
                "shoshilmaydigan, faqat mavridi kelgandagina jazolovchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1," Al-Azim","Inson aqli, tafakkuri tasavvur qila olmaydigan darajada ulug‘ Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-G‘afur","Bandalar gunohlarini kechirib, ayb-kamchiliklarini berkituvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ash-Shakur","Itoatkor, solih amallar qiluvchi bandalariga nihoyatda ko‘p mukofot beruvchi, oz amal qiluvchi\n" +
                "\n" +
                "bandalariga ham niyatlariga, ixloslariga yarasha ajr-savob beruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Aliy","Juda oliy martabali; Uning zotini, sifatini tasavvur qilishga aqllar ojizlik qiladi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Kabir","O‘ta ulug‘, maxluqotlaridan mutlaq ustun, azaliy, abadiy Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hafiz","Maxluqotlarini O‘zi xohlagan muddat halokatdan saqlab turuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muqit","“Al-Muqit” sifatining birinchi maʼnosi “Al-Hafiz”niki bilan bir xil. Ikkinchi maʼnosi esa\n" +
                "\n" +
                "har bir maxluqotiga o‘z nasibasini beruvchidir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hasib","Kifoya qiluvchi, maxluqotlarini kifoya qiladigan darajada rizqlantiruvchi, qiyomat kuni\n" +
                "\n" +
                "bandalarini hisob qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Jalil","Ulug‘lik sifatini o‘zida jamlagan Zot; buyuk, ulug‘, oliy."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Karim","Karami, saxovati cheksiz Zot. Inʼom qilish bilan Allohning xazinasi kamayib qolmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Raqib","Har bir narsani kuzatib turuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mujib","Bandalar ixlos bilan qilgan duolarini ijobat etuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vosiʼ","Rahmati barcha narsadan keng, xohlagan bandasi rizqini kengaytiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hakim","Har bir tadbirini hikmat bilan amalga oshiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vadud","O‘zining solih bandalarini yaxshi ko‘ruvchi, ulardan rozi bo‘luvchi, bandalari tomonidan seviluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Majid","Shuhrati nihoyatda cheksiz, qadri juda baland; karamining cheki yo‘q, o‘ta saxiy Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Bois","Mazkur sifatning ikki xil maʼnosi bor: 1. Tiriltiruvchi. 2. Yuboruvchi.\n" +
                "\n" +
                "Yaʼni, bandalariga payg‘ambarlar yuboruvchi, barcha maxluqotlarini qiyomat kuni qayta\n" +
                "\n" +
                "tiriltiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ash-Shahid","Bo‘layotgan har bir narsa, hodisa ustida hozir-shohid bo‘lib turuvchi. Biron narsa Allohning\n" +
                "\n" +
                "guvohligidan chetda qolmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Haq","Mavjudligi haqiqatan tasdiqlangan, Haq, Haqni yuzaga chiqaruvchi Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vakil","Bandalari ishlarini amalga oshiruvchi, ularga manfaat yetkazishga kafil Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Qaviy","Kuch-quvvat Egasi, biron amalni bajarishdan ojiz qolmaydigan Zot. Alloh mutlaq qudrat\n" +
                "\n" +
                "Sohibidir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Matin","O‘ta quvvatli, matonatli Zot. Biron ishni amalga oshirgach, Alloh charchamaydi, zaiflashib olmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Valiy","Yordam beruvchi; valiy bandalarini yaxshi ko‘ruvchi; butun olamdagi maxluqotlari ishlarini\n" +
                "\n" +
                "boshqarib turuvchi Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hamid","Har qanday holatda, har qanday zamonda hamdu sanoga eng munosib, bandalari tomonidan tinimsiz\n" +
                "\n" +
                "maqtaladigan Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muhsiy","Har bir narsani O‘z ilmi bilan hisobga oluvchi, ilmi barcha narsani qamragan, har bir narsaning\n" +
                "\n" +
                "eng nozik jihatlarini ham, eʼtiborga molik tomonlarini ham inobatga oluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mubdiʼ","Har bir narsani o‘xshashi yo‘q darajada avvaldan Yaratuvchi, yo‘qdan bor qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muid","Maxluqotlarini o‘limga qaytaruvchi (yaʼni, o‘ldiruvchi), so‘ng qiyomat kuni ularni yana hayotga\n" +
                "\n" +
                "qaytaruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muhyi","Qiyomatda o‘liklarni qayta tiriltiruvchi, ularga jon ato etuvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mumit","O‘limni yaratuvchi, xohlagan bandasi jonini xohlagan vaqtida oluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hay","Doim tirik, hech qachon o‘lmaydigan Zot.\n" +
                "\n" +
                "Boqiylik faqat U Zotga xos. O‘lim, foniylik esa maxluqotlarga xos. Bunday sifatlar Allohga\n" +
                "\n" +
                "nisbat berilmaydi. Alloh barhayotligi bandalar tirikligidan tubdan farq qiladi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Qayyum","O‘z-o‘zidan qoim bo‘luvchi, boshqalarni ham qoim qiluvchi, har bir narsa ustida guvoh bo‘luvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vojid","Xohlagan narsasini xohlagan vaqtida topuvchi, hech qachon faqir bo‘lmaydigan darajada boy Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mojid","Shon-shuhrat Egasi, qadri baland, karamli, saxiy Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Vohid","Yagona, Yolg‘iz, sherigi yo‘q Zot." +
                "Alloh taoloning azalda ham sherigi bo‘lmagan, bundan keyin ham bo‘lmaydi. U Zot o‘z sifatida,\n" +
                "\n" +
                "zotida, ilohlikda, ibodatga munosiblikda Yakkayu Yagonadir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"As-Somad","Mazkur sifat bir necha maʼnolarni anglatadi. Jumladan, “mutlaq Hokim”, “doim barhayot\n" +
                "\n" +
                "turuvchi”, “hech kimga hojati tushmaydigan, aksincha maxluqotlari hojatini ravo qiluvchi Zot”."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Qodir","Har bir narsaga qodir Zot. Alloh xohlagan ishini qilishdan ojiz emas. Har qanday ish Unga oson."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muqtadir","Qudrati cheksiz, nihoyatda kuchli Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muqaddim","Xohlagan narsasini oldinga surib, ularni o‘z joyiga qo‘yuvchi. Kim yoki nima oldinga surilishga\n" +
                "\n" +
                "munosib bo‘lsa, oldinga suradi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muaxxir","Xohlagan narsasini ortga surib, ularni o‘z joyiga qo‘yuvchi. Kim yoki nima ortga surilishga\n" +
                "\n" +
                "munosib bo‘lsa, ortga suradi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Avval","Boshlanishining avvali yo‘q, barcha narsadan avval bo‘lgan Zot.\n" +
                "\n" +
                "Alloh taolo maxluqotlar yaratilmasidan oldin ham mavjud edi. Dunyodagi barcha narsalar,\n" +
                "\n" +
                "mavjudotlar “Al-Avval” sifatli Alloh tomonidan yaratilgan."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Oxir","Maxluqotlar o‘lib ketganidan so‘ng ham boqiy qoluvchi, hech qachon o‘lmaydigan, mavjudligining\n" +
                "\n" +
                "oxiri yo‘q Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Az-Zohir","Barcha narsadan ustun, oliy Zot. Atrof-muhitdagi narsalar, holatlar Allohning zohirligiga\n" +
                "\n" +
                "dalolat qiladi.\n" +
                "\n" +
                "Haqiqatan, aql yuritgan kishi Allohning borligini, Yakkayu Yagonaligini biladi. Zero, U Zotning\n" +
                "\n" +
                "mavjudligi ochiq-oydin ko‘rinib turadi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Botin","Maxluqotlar nazaridan berkingan, ularga ko‘rinmaydigan Zot. Chunonchi, ko‘z bilan Allohni bu\n" +
                "\n" +
                "dunyoda ko‘rib bo‘lmaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Voliy","Barcha narsaning Egasi, ularni tasarruf etuvchi Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mutaoliy","Kofirlar U Zotga nisbatan ayb taqashlaridan, mo‘minlar hamdu sanolaridan oliy Zot.\n" +
                "\n" +
                "Yaʼni, kofir va mushriklarning Alloh taologa nisbatan noloyiq tuhmatlari U Zot shaʼniga putur\n" +
                "\n" +
                "yetkazmaydi. Mo‘minlar hamdu sanolari esa U Zot ulug‘ligini ziyoda qilmaydi. Chunonchi, bandalari\n" +
                "\n" +
                "tuhmatlari, hamdu sanolari Alloh taologa zarar ham, foyda ham keltirmaydi. U Zot bandalari\n" +
                "\n" +
                "qiladigan amallaridan, aytadigan gaplaridan Oliy va Behojatdir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Bar","Bandalariga cheksiz yaxshiliklar qiluvchi, lutf-karami, ehsonining cheki yo‘q Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"At-Tavvob","Bandalari ixlos bilan qilgan tavbalarini qabul qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muntaqim","G‘azabini qo‘zg‘agan bandalaridan intiqom (qasos) oluvchi, ularni jazolovchi. Lekin Allohning\n" +
                "\n" +
                "jazolashi zulm emas, adolatdir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Afuv","Bandalari gunohlarini kechirib yuboruvchi.\n" +
                "\n" +
                "Mazkur sifat maʼnosi “Al-G‘afur”nikidan ham kuchliroq. Zero “Al-G‘afur” bandalar gunohlarini\n" +
                "\n" +
                "berkitishni, “Al-Afuv” gunohlarni kechirishni, o‘chirib yuborishni anglatadi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Rauf","O‘ta Mehribon, nihoyatda Shafqatli, Rahmli Zot."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Molikul mulk","Mulk egasi, ishlarni O‘zi xohlagan tarzda amalga oshiradi, Uning hukmiga qarshi boruvchi yo‘q,\n" +
                "\n" +
                "mutlaq tasarruf qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Zul jaloli val ikrom","Ulug‘lik va karam Egasi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Muqsit","Adolatli Zot.\n" +
                "\n" +
                "Alloh O‘z hukmida, jazo berishida, mahrum etishida adolatlidir. Bandalariga zulm qilmaydi,\n" +
                "\n" +
                "ularni gunohlariga yarasha jazolaydi, yaxshi ishlarini munosib taqdirlaydi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Jomiʼ","Maxluqotlarni hisob qilish uchun qiyomat kuni mahshargohga Jamlovchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-G‘aniy","Boy, Behojat Zot. Boshqalarning Allohga hojati tushadi, biroq Alloh hech kimga, hech narsaga\n" +
                "\n" +
                "muhtoj emas."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Mug‘niy","Behojat-boy qiluvchi.\n" +
                "\n" +
                "Alloh bandalari orasidan kimni xohlasa, o‘shani boy-behojat qilib qo‘yadi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Moniʼ","O‘ziga itoat etuvchi mo‘min bandalarini har xil kulfatlardan, qiyinchiliklardan asrovchi, ularni\n" +
                "\n" +
                "balolardan qutqaruvchi; xohlagan bandasidan keng rizqni man qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Az-Zor","Zararli narsalarni ham yaratuvchi.\n" +
                "\n" +
                "Alloh yaxshini ham, yomonni ham, foydalini ham, zararlini ham yaratadi. Shu orqali xohlagan\n" +
                "\n" +
                "maxluqotiga O‘z hikmati bilan zarar yetkazadi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"An-Nofiʼ","Xohlagan bandasiga manfaat keltiruvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"An-Nur","Ko‘zi ojizlar Allohning nuri bilan ko‘radi. Maʼnaviy so‘qirlar Uning hidoyati ila to‘g‘ri yo‘lni\n" +
                "\n" +
                "topadi. Alloh O‘zi zohir bo‘luvchi, o‘zgalarni ham zohir qiluvchi Zotdir. U osmonlar va Yerning nuridir."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Hodiy","Xohlagan bandasini to‘g‘ri yo‘lga yo‘llovchi, hidoyatga boshlovchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Badiʼ","Mislsiz narsalarni yo‘qdan bor qiluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Boqiy","Doim boqiy turuvchi, foniylik sifatidan xoli."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Al-Voris","Barcha maxluqotlar o‘lib ketganidan keyin ham mangu qoluvchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"Ar-Rashid","Xohlagan bandasini to‘g‘ri yo‘lga boshlovchi."));
        allohIsmlariModelList.add(new AllohIsmlariModel(R.drawable.img_1,"As-Sabur","O‘ta sabrli Zot.\n" +
                "\n" +
                "Alloh gunohkorlarni jazolashga shoshilmaydi, balki hidoyat yo‘liga yurib, o‘zlarini isloh\n" +
                "\n" +
                "qilishlariga imkon beradi."));
            }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}