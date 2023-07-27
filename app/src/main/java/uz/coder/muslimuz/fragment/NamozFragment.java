package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.NamozAdapter;
import uz.coder.muslimuz.databinding.FragmentNamozBinding;
import uz.coder.muslimuz.model.NamozModel;

public class NamozFragment extends Fragment {
    FragmentNamozBinding binding;
    NamozAdapter adapter;
    List<NamozModel> namozModelList;
    String bomdod = "1. «Alloh rizoligi uchun qibla tomonga yuzlanib, bugungi bomdod namozining ikki rakat sunnatini o'qishni niyat qildim», deb ko'ngildan o'tkaziladi.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "2. «Allohu akbar», deb iftitoh takbiri aytiladi. Bu takbirda erkaklar qo'llar kaftini qiblaga qaratib, bosh barmoqlarining uchini quloqlarining yumshoq joyiga tekkizishadi. Ayollar qo'llarini yelka barobarida ko'taradilar. " +
            "3. Qo'llar bog'lanadi. Erkaklar o'ng qo'l kaftini chap qo'l ustiga qo'yishadi. O'ng qo'lning bosh va kichik barmoqlari bilan chap qo'l bilagini ushlashadi.\n" +
            "Ayollar o'ng qo'lni chap qo'l us-tida tutib, qo'llarini ko'krakka qo'yadilar. Bu hol «qiyom» deyiladi. Qiyomda (tik turgan holda) sajda qilinadigan joyga qarab, navbati bilan, quyidagilar o'qiladi.\n" +
            "\n" +
            "SANO DUOSI\n" +
            "\n" +
            "Subhanakallouhumma va bihamdika va tabarokasmuka va taa’la jadduka va la ilaha g‘oyruk.\n" +
            "Ma'nosi: «Allohim! Sening noming muborakdir. Shon-sharafing ulug'dir. Sendan o'zga iloh yo'qdir».\n" +
            "\n" +
            "FOTIHA SURASI\n" +
            "\n" +
            "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \n" +
            "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ \n" +
            "الرَّحْمَٰنِ الرَّحِيمِ \n" +
            "مَالِكِ يَوْمِ الدِّينِ \n" +
            "إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ \n" +
            "اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ \n" +
            "صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ \n" +
            "A’uzu billahi minash shaytonir rojiym. Bismillahir rohmanir rohiym. Al hamdulillahi robbil ‘alamiyn. Ar-rohmanir rohiym. Maliki yavmiddiyn. Iyyaka na’budu va iyyaka nasta’iyn. Ihdinas sirotol mustaqiym. Sirotollaziyna an’amta ‘alayhim g‘oyril mag‘zubi ‘alayhim valazzolliyn.\n" +
            "\n" +
            "\"Fotiha\" surasining qiroatini (MP3) ko'chirib olish uchun shuni bosing.\n" +
            "\n" +
            "Mazmuni: Allohning dargohidan quvilgan shayton yomonligidan Allohning panohiga qochaman. Mehribon va rahmli Alloh nomi bilan (boshlayman). Hamd olamlar rabbi Allohgakim, (U) mehribon, rahmli va hisob-kitob kuni (Qiyomat)ning egasidir. Sengagina ibodat qilamiz va Sendangina yordam so'raymiz! Bizni shunday to'g'ri yo'lga boshlaginki, (U) Sen in'om (hidoyat) etganlarning (payg'ambarlar, siddiq va shahidlarning) yo'lidir, g'azabga uchragan (Muso qavmidan itoatsizlarining) va adashgan (Iso qavmining «Allohning farzandi bor» deydigan)larning emas!\n" +
            "Fotiha surasidan so'ng bir zam (qo'shimcha) sura o'qiladi.\n" +
            "Yangi o'rganuvchilar quyidagi kichik suralardan birini zam qilishsa bo'ladi:\n" +
            "\n" +
            "KAVSAR SURASI\n" +
            "\n" +
            "إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ \n" +
            "فَصَلِّ لِرَبِّكَ وَانْحَرْ \n" +
            "إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ \n" +
            "Inna a’toynakal-kavsar. Fa solli lirobbika vanhar. Inna shaniaka huval abtar.\n" +
            "\n" +
            "\"Kavsar\" surasining qiroatini (MP3) ko'chirib olish uchun shuni bosing.\n" +
            "\n" +
            "Mazmuni: «(Ey Muhammad,) darhaqiqat, Biz Sizga Kavsarni* berdik. Bas, Rabbingiz uchun namoz o'qing va (tuya) so'yib qurbonlik qiling! Albatta, g'animingizning o'zi (barcha yaxshiliklardan) mahrumdir».\n" +
            "(Kavsar — jannatdagi bir ajib daryo yoki hovuzning nomi. Uning suvi asaldan totli, qor va suvdan oq. Undan ichgan kishi abadiy chanqoqlik ko'rmaydi.)\n" +
            "\n" +
            "IXLOS SURASI\n" +
            "\n" +
            "قُلْ هُوَ اللَّهُ أَحَدٌ \n" +
            "اللَّهُ الصَّمَدُ \n" +
            "لَمْ يَلِدْ وَلَمْ يُولَدْ \n" +
            "وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ \n" +
            "Qul huvallohu ahad. Allohus-somad. Lam yalid. Va lam yuvlad va lam yakullahu kufuvan ahad.\n" +
            "\n" +
            "\"Ixlos\" surasining qiroatini (MP3) ko'chirib olish uchun shuni bosing.\n" +
            "\n" +
            "Mazmuni: (Ey Muhammad,) ayting: «U — Alloh yagonadir. Alloh behojat, (lekin) hojatbarordir. U tug'magan va tug'ilmagan ham. Shuningdek, Unga teng biror zot yo'qdir».\n" +
            "\n" +
            "FALAQ SURASI\n" +
            "\n" +
            "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ \n" +
            "مِنْ شَرِّ مَا خَلَقَ \n" +
            "وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ \n" +
            "وَمِنْ شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ \n" +
            "وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ \n" +
            "Qul a’uzu birobbil falaq. Min sharri ma xolaq. Va min sharri g‘osiqin iza vaqob. Va min sharrin-naffasati fil ‘uqod. Va min sharri hasidin iza hasad." +
            "Ma'nosi: «(Ey Muhammad,) ayting: \"Panoh tilab iltijo qilurman tong Parvardigoriga yaratgan narsasi yovuzligidan, tugunchaga dam uruvchi ayollar yovuzligidan hamda hasadchining hasadi yovuzligidan\"».\n" +
            "\n" +
            "AN-NOS SURASI\n" +
            "\n" +
            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ \n" +
            "مَلِكِ النَّاسِ \n" +
            "إِلَٰهِ النَّاسِ \n" +
            "مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ \n" +
            "الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ \n" +
            "مِنَ الْجِنَّةِ وَالنَّاسِ \n" +
            "Qul a’uzu birrobin-nasi malikin-nasi ilahin-nasi min sharril vasvasil xonnas. Allaziy yuvasvisu fiy sudurin-nasi minal jinnati van-nas." +
            "Ma'nosi: «(Ey Muhammad,) ayting: \"Panoh tilab iltijo qilurman odamlar Parvardigoriga, odamlar Podshohiga, odamlar Ilohiga yashirin vasvasachi (shayton) yovuzligidanki, (u) odamlarning dillariga vasvasa solur. (O'zi) jinlar va odamlardandir\"».\n" +
            "\n" +
            "4. Zam sura tugagach, «Allohu akbar», deb ruku qilinadi. Erkaklar tirsaklari va tizzalarini bukmasdan, barmoqlarini ochgan holda, tizzalarini mahkam changallab egiladilar.\n" +
            "Ayollar erkaklarga nisbatan ozroq egiladilar. Tizzalarini bir oz bukadilar. Barmoqlarini jamlab tizzalarini tutadilar.\n" +
            "Rukuda uch marta «Subhana robbiyal aziym» (Ey buyuk Robbim, Sen barcha nuqsonlardan poksan), deyiladi.\n" +
            "\n" +
            "5. Rukudan «Sami'allohu liman hamidah» (Alloh Uni hamd etganlarni eshitguvchidir), deb qad ko'tariladi, bu holat «qavma» deyiladi.\n" +
            "Qavma holida: «Robbana lakal hamd» (Ey Robbimiz, har turli hamd-sanolar yolg'iz Sengadir), deyiladi.\n" +
            "\n" +
            "6. «Allohu akbar» deb avvalo tizzalar, ke-yin qo'llar, so'ng peshona va burun yerga tekkizilib, sajda qilinadi. Sajda qi-linayotganda oyoq panjalari qiblaga qaratiladi, erkaklarning tirsaklari yerga tegmaydi. Ayollar tirsaklarini yerga qo'yadilar. Sajdada uch marta: «Subhana robbiyal a'la» (Ey ulug' Robbim, Sen butun nuqsonlardan poksan), deyiladi.\n" +
            "\n" +
            "7. «Allohu akbar» deb sajdadan bosh ko'tariladi va tiz cho'kkan holda bir oz o'tiriladi, bu holat «jalsa» deyiladi. Jalsada qo'llar, barmoqlar o'z holicha tutilib, songa qo'yiladi. Barmoq uchlari tizza bilan teng bo'lishi lozim.\n" +
            "\n" +
            "Erkaklar chap oyoqlari ustiga o'tiradilar. O'ng oyoq panjalari qiblaga qaratiladi. Ayollar oyoqlarini o'ng tarafdan chiqarib o'tiradilar.\n" +
            "\n" +
            "8. «Allohu akbar», deb ikkinchi marta sajda qilinadi. Sajdada uch marta: «Subhana robbiyal a'la», deyiladi. Shu bilan birinchi rakat tugaydi.\n" +
            "\n" +
            "9. «Allohu akbar», deb qiyomga (tikka) turiladi.\n" +
            "\n" +
            "10. Qiyomda «Bismillahir rohmanir rohiym»dan boshlab, Fotiha surasi, orqasidan bir zam sura o'qiladi.\n" +
            "\n" +
            "11. «Allohu akbar», deb ruku qilinadi. Rukuda uch marta «Subhana robbiyal aziym», deyiladi.\n" +
            "\n" +
            "12. «Sami'allohu liman hamidah», deb tik turiladi, ketidan «Robbana lakal hamd», deyiladi.\n" +
            "\n" +
            "13. «Allohu akbar», deb sajdaga boriladi. Sajdada uch marta «Subhana robbiyal a'la», deyiladi.\n" +
            "\n" +
            "14. «Allohu akbar», deb sajdadan bosh ko'tariladi va bir oz o'tiriladi.\n" +
            "\n" +
            "15. «Allohu akbar», deb ikkinchi bor sajda qilinadi. Sajdada uch marta: «Subhana robbiyal a'la», deyiladi.\n" +
            "\n" +
            "16. «Allohu akbar», deb sajdadan bosh ko'tarilib qa'dada o'tiriladi va quyidagilar o'qiladi:\n" +
            "\n" +
            "«ATTAHIYYAT» DUOSI\n" +
            "\n" +
            "Attahiyyatu lillahi vas-solavatu vattoyyibat. Assalamu ‘alayka ayyuhan-nabiyyu va rohmatullohi va barokatuh. Assalamu ‘alayna va ‘ala ibadillahis-solihiyn. Ashhadu alla ilaha illallohu va ashhadu anna Muhammadan ‘abduhu va rosuluh.\n" +
            "\n" +
            "Mazmuni: Mol, badan, til bilan ado etiladigan butun ibodatlar Alloh uchundir. Ey Nabiy! Allohning rahmati va barakoti Sizga bo'lsin. Sizga va solih qullarga Allohning salomi bo'lsin. Iqrormanki, Allohdan o'zga iloh yo'q. Va yana iqrormanki, Muhammad, alayhissalom, Allohning quli va elchisidirlar.\n" +
            "\n" +
            "SALOVOT\n" +
            "\n" +
            "Allohumma solli ‘ala Muhammadiv-va ‘ala ali Muhammad. Kama sollayta ‘ala Ibrohima va ‘ala ali Ibrohim. Innaka hamidum-majid. Allohumma barik ‘ala Muhammadiv-va ‘ala ali Muhammad. Kama barokta ‘ala Ibrohima va ‘ala ali Ibrohim. Innaka hamidum-majid.\n" +
            "\n" +
            "Mazmuni: Allohim, Ibrohim va uning oilasiga rahmat etganing kabi, Muhammad va ul zotning oilasiga rahmat ayla, Sen hamdu maqtovga loyiq va buyuk Zotsan.\n" +
            "Allohim, Ibrohim va uning oilasiga barakotingni ehson etganing kabi Muhammad va ul zotning oilasi ustiga ham barakotingni ehson ayla. Sen hamdu maqtovga loyiq va buyuk Zotsan.\n" +
            "\n" +
            "DUO\n" +
            "\n" +
            "Robbana atina fid-dunya hasanatav-va fil axiroti hasanatav-va qina azaban-nar.\n" +
            "\n" +
            "Mazmuni: «Ey Robbimiz, bizga bu dunyoda ham, oxiratda ham yaxshilikni bergin va bizni do'zax olovi azobidan saqlagin».\n" +
            "\n" +
            "17. Avval o'ng, keyin chap yelkaga qarab: «Assalamu alaykum va rohmatulloh» deb salom berilib namozdan chiqiladi.\n" +
            "\n" +
            "Shu bilan bomdod namozining ikki rakat sunnati tugaydi.\n" +
            "Bomdod namozining ikki rakat farzi ham xuddi shu tartibda o'qiladi. Farqi — avvalo, erkaklar niyatdan oldin (boshqa farz namozlari oldidan ham) quyidagi iqomat takbirini aytishadi:\n" +
            "\n" +
            "Allohu akbar, Allohu akbar,\n" +
            "Allohu akbar, Allohu akbar.\n" +
            "Ashhadu alla ilaha illalloh,\n" +
            "Ashhadu alla ilaha illalloh.\n" +
            "Ashhadu anna Muhammadar rosululloh,\n" +
            "Ashhadu anna Muhammadar rosululloh.\n" +
            "Hayya 'alas-solah, hayya'alas-solah,\n" +
            "Hayya 'alal-falah, hayya'alal-falah.\n" +
            "Qod qomatis-solah, qod qomatis-solah\n" +
            "Allohu akbar, Allohu akbar,\n" +
            "La ilaha illalloh.";
    String peshin = "Peshin namozi to'rt rakat sunnat, to'rt rakat farz va ikki rakat sunnatdan iborat.\n" +
            "To'rt rakat sunnat quyidagicha o'qiladi:\n" +
            "1. Niyat qilinadi.\n" +
            "2. Iftitoh takbiri aytiladi.\n" +
            "3. Sano duosi o'qiladi.\n" +
            "4. Fotiha surasi. Keyin birorta zam sura.\n" +
            "5. Ruku.\n" +
            "6. Sajda.\n" +
            "7. «Allohu akbar» deb turib, yana Fotiha surasi, zam sura.\n" +
            "8. Ruku.\n" +
            "9. Sajda.\n" +
            "10. O'tirib «Attahiyyat» o'qiladi.\n" +
            "11. «Allohu akbar» deb yana turib, Fotiha surasi va zam sura.\n" +
            "12. Ruku.\n" +
            "13. Sajda.\n" +
            "14. «Allohu akbar» deb to'rtinchi rakatga turiladi. Yana Fotiha surasi va zam sura.\n" +
            "15. Ruku.\n" +
            "16. Sajda.\n" +
            "17. O'tirib, «Attahiyyat», «Salovot», «Robbana» duolari o'qiladi.\n" +
            "18. Salom berib namozdan chiqiladi.\n" +
            "Peshin namozining farzi ham ayni shu tartibda o'qiladi. Faqatgina niyat qilinayotganda «Alloh roziligi uchun peshin namozining to'rt rakat farzini o'qishga niyat qildim», deyiladi. Bundan tashqari, farzda uchinchi va to'rtinchi rakatlarda «Fotiha»dan keyin zam sura qo'shilmaydi.\n" +
            "Peshin namozining ikki rakat sunnati bomdod namozining sunnati kabi o'qiladi.\n" +
            "\n";
            String asr = "ASR NAMOZI\n" +
            "\n" +
            "Asr namozi to'rt rakat farzdan iborat. Bu namoz bilan peshin namozi farzining o'qilishi bir xil. Niyatda «Asr namozining to'rt rakat farzini...» deyilsa bo'ldi.\n" +
            "\n";
            String shom = "SHOM NAMOZI\n" +
            "\n" +
            "Shom namozi uch rakat farz va ikki rakat sunnatdan iborat. Uch rakatli farzning o'qilishi:\n" +
            "1. Niyat.\n" +
            "2. Iftitoh takbiri.\n" +
            "3. Sano.\n" +
            "4. Fotiha, zam sura.\n" +
            "5. Ruku.\n" +
            "6. Sajda.\n" +
            "7. Turib, Fotiha, zam sura.\n" +
            "8. Ruku.\n" +
            "9. Sajda.\n" +
            "10. O'tirib, «Attahiyyat».\n" +
            "11. Turib, faqat Fotiha.\n" +
            "12. Ruku.\n" +
            "13. Sajda.\n" +
            "14. O'tirib, «Attahiyyat», «Salovot», «Robbana» duolari.\n" +
            "15. Salom.\n" +
            "Shom namozining ikki rakat sunnati bomdod namozining ikki rakat sunnati kabi o'qiladi.\n" +
            "\n";
            String xufton = "XUFTON NAMOZI\n" +
            "\n" +
            "Xufton namozi to'rt rakat farz, ikki rakat sunnatdan iborat.\n" +
            "Xufton namozining to'rt rakat farzi peshin namozining farzi kabi o'qilib, faqat niyatda farq bo'ladi. Xuftonning ikki rakat sunnati ham yuqorida o'rganganimiz bomdod va shom namozlarining ikki rakat sunnatlari kabi bir xil tartibda o'qiladi.\n" +
            "\n" +
            "VITR NAMOZI\n" +
            "\n" +
            "Vitr namozi uch rakatli bo'lib, vojib ibodat sanaladi. Farzdan quyiroq, sunnatdan ulug' turadi. O'qilishi shart. Biror sabab ila vaqtida o'qilmay qolsa, qazosi o'qiladi. Vitr namozi xufton namozidan keyin o'qiladi.\n" +
            "Quyidagi tartibda ado etiladi:\n" +
            "1. Niyat.\n" +
            "2. Iftitoh takbiri.\n" +
            "3. Sano.\n" +
            "4. Fotiha, zam sura.\n" +
            "5. Ruku.\n" +
            "6. Sajda.\n" +
            "7. Ikkinchi rakatga turib, «Fotiha», zam sura.\n" +
            "8. Ruku.\n" +
            "9. Sajda.\n" +
            "10. O'tirib, «Attahiyyat» duosi.\n" +
            "11. Uchinchi rakatga turib «Fotiha», zam sura.\n" +
            "12. Zam suradan keyin o'sha tik turgan holda «Allohu akbar», deb quloq qoqiladi.\n" +
            "13. Qo'l qovushtirilib, Qunut duosi o'qiladi.\n" +
            "\n" +
            "QUNUT DUOSI\n" +
            "\n" +
            "Allohumma inna nasta'inuka va nastag'firuk. Vanu'minu bika va natavakalu 'alayka va nusniy 'alaykal xoyr. Kullahu nashkuruka va la nakfuruk. Va naxla'u va natruku may-yafjuruk.\n" +
            "Allohumma iyyaka na'budu va laka nusolliy va nasjudu va ilayka nas'a va nahfidu narju rohmatak(a). Va naxsha 'azabaka inna 'azabaka bil kuffari mulhiq.\n" +
            "Ma'nosi: Allohim! Biz Sendan yordam istaymiz, gunohlarimizni afu etishingni so'raymiz. Allohim! Senga imon keltiramiz, ishlarimizda Senga suyanamiz va Senga tavakkal qilamiz. Va Senga hamd aytamiz. Butun yaxshiliklar Sendandir. Bizlarga berganing shuncha ne'matlar tufayli Senga shukrona aytamiz va nonko'rlik qilmaymiz. Senga qarshi nonko'rlik qilgan gunohkorlardan ayrilamiz, ular bilan aloqani uzamiz.\n" +
            "Allohim! Biz yolg'iz Sengagina qullik qilamiz, namozni Sen uchungina o'qiymiz. Sengagina sajda qilamiz. Sengagina intilamiz. Ibodatni xushu'-kamtarlik bilan ado etamiz. Rahmating ko'p bo'lishini so'raymiz, azobing-dan qo'rqamiz. Hech shubha yo'qki, Sening azobing kofirlargadir.\n" +
            "14. Ruku.\n" +
            "15 Sajda.\n" +
            "16. O'tirib «Attahiyyat», «Salovot», «Robbana» duolari.\n" +
            "18. Salom.\n" +
            "\n" +
            "        ";
            String tax = "Tahorat olish uchun, iloji bo‘lsa, qiblaga yuzlaniladi.\n" +
                    "\n" +
                    "«Bismillahir rohmanir rohiym» deb, niyat qilinadi." +
                    "Qo‘llar bandigacha uch marta yuviladi. Barmog‘ida uzugi bor kishi uni qimirlatib, ostiga suv yetkazadi. Barmoqlarni bir-birining orasiga kirgiziladi." +
                    "Tishlar misvok yoki tish yuvish pastasi bilan, yoki qo‘l bilan ishqalab yuviladi.\n" +
                    "\n" +
                    "O‘ng qo‘lga suv olib, og‘iz uch marta g‘arg‘ara qilib chayiladi." +
                    "O‘ng qo‘lga suv olib, burunga uch marta tortib, chap qo‘l bilan qoqib tozalanadi." +
                    "Yuz yuviladi – uch marta. Yuzning chegarasi uzunasiga soch chiqqan joydan jag‘ning ostigacha, kengligi esa ikki quloq yumshog‘ining orasigacha bo‘lgan o‘rindir." +
                    "Avval o‘ng qo‘l, so‘ng chap qo‘l tirsak bilan qo‘shib uch marta yuviladi." +
                    "Hovuchga suv olib to‘kib tashlab, qo‘li bilan boshning hamma qismiga bir marta mas’h tortiladi.\n" +
                    "\n" +
                    "Ko‘rsatkich barmoq bilan quloq ichiga mas’h tortib, bosh barmoq bilan esa quloq tashqarisiga mas’h tortiladi." +
                    "Chap qo‘l bilan o‘ng oyoqni oshiq (to‘piq) bilan qo‘shib va barmoqlar orasini (ishqalab) uch marta yuviladi.\n" +
                    "\n" +
                    "Chap oyoq ham shu tarzda uch marta yuviladi." +
                    "Tahorat qilib bo‘lgandan keyin shahodat kalimasini va rivoyatda kelgan duo o‘qiladi:\n" +
                    "\n" +
                    "Ashhadu allaa ilaaha illallohu vahdahu laa shariyka lahu. Va ashhadu anna Muhammadan abduhu va Rasuluhu.\n" +
                    "\n" +
                    "Ma’nosi: Guvohlik beramanki, Allohdan boshqa iloh (ibodatga sazovor zot) yo‘q. U yolg‘izdir, Uning sherigi yo‘q. Yana guvohlik beramanki, Muhammad (sollallohu alayhi vasallam) Uning bandasi va Rasulidir.\n" +
                    "\n" +
                    "Duo: Allohummaj’alnii minat-tavvabiyna vaj’alnii minal mutatohhiriyn.\n" +
                    "\n" +
                    "Duoning ma’nosi: Allohim, meni tavba qiluvchilardan va poklanuvchilardan qilgin».";
    String safar = "Abu Hurayra roziyallohu anhudan rivoyat qilinadi:\n" +
            "«Nabiy sollallohu alayhi vasallam qachon safarga otlansalar «Allohumma, anta sohibu fissafari val xalifatu filahl. Allohumma, innii a’uuzu bika min va’sais safari va kaobatil munqalabi va su’ul manzari fil ahli val mali. Allohumma, itvi lanal arza va havvin alaynas safar», der edilar». \n" +
            "Sharh: Bu duoning ma’nosi: «Allohim! Sen safarda sohibsan va ahlda xalifa — o‘rinbosarsan. Allohim! Sendan safarning mashaqqatidan, mahzun bo‘lib qaytishdan hamda axd va molda yomon manzara bo‘lishidan panoh so‘rayman. Allohim! Bizga yerni yaqin va safarni oson qilgin».\n" +
            "\n" +
            "Ibn Umar roziyallohu anhudan rivoyat qilinadi:\n" +
            "«Rasululloh sollallohu alayhi vasallam safarga chiqib tuyalariga minganlarida uch marta takbir aytar va:\n" +
            "«Subahanallazii saxxara lanaa hazihi. Va maa kunnaa lahu muqriniyn va innaa ila robbinaa lamunqalibiyn. Allohumma innaa nas’aluka fii safarinaa haza al-birra vat taqva va minal amali maa tarzaa. Allohumma, havvin alaynaa safarana haza va itvi’ annaa bu’dahu. Allohumma, anta sohibu fissafar val xalifatu filahl. Allohumma, innii a’uuzu bika min va’sais safari va kaobatil manzari va su’ul munqalabi fil mali val ahli», der edilar.\n" +
            "Qachon qaytsalar ham, shularni aytardilar va «Oyibuna, taibuna, aabiduna va lirobbinaa haamidun»ni ziyoda qilar edilar».\n" +
            "Ikkisini beshovlaridan faqat Buxoriy rivoyat qilmagan. \n" +
            "Sharh: Inson markabga minganda o‘zida alla-qanday bir ko‘tarinkiliq g‘urur va manmanlik paydo bo‘lganini sezadi. Ana shunda darhol Allohni eslasa, unga markab minish imkonini bergan Zotni eslasa, Unga shukrona o‘laroq ushbu rivoyatdagi duoni o‘qisa, hamma narsa o‘rniga tushadi.\n" +
            "“Bizga buni bo‘ysundirgan Zot pokdir”. \n" +
            "Ya’ni, bizga bu markabni bergan Alloh pokdir. Agar o‘sha pok bo‘lgan Zot markabni bizga bo‘ysundirib qo‘ymaganida, “Biz bunga qodir emas edik”.\n" +
            "Bizda bunday markablarni bo‘ysundirib olish imkoni yo‘q. Bu ish bizning qo‘limizdan kelmas edi.\n" +
            "«Va, albatta, biz Robbimizga qaytguvchilardirmiz», degaysiz». \n" +
            "Hech qachon boshqaga qaytmaymiz. Shuning uchun doimo Uni eslaymiz. Doimo Unga ibodat va shukr qilamiz.\n" +
            "Imom Muslim qilgan rivoyatda quyidagilar aytiladi:\n" +
            "«Rasululloh sollalohu alayhi vasallam qachon safarga chiqib ulovga minsalar, uch marta «Allohu akbar» deb takbir aytar va quyidagilarni o‘qir edilar: «Bizga buni bo‘ysundirgan Zot pokdir. Biz bunga qodir emas edik. Va albatta, biz Robbimizga qaytguvchilardirmiz». Yo Alloh! Biz Sendan bu safarimizda yaxshilik va taqvoni, O‘zing rozi bo‘ladigan amallarni so‘raymiz. Yo Alloh! O‘zing bizga bu safarimizni oson qilgin. Uning uzog‘ini yaqin qilgin. Yo Alloh! Sening O‘zing safardagi sohibsan. Ahli ayoldagi xalifasan. Yo Alloh! Men Sendan safar qiyinchiliklaridan, turli yomonliklardan, molu mulk va ahli ayolning yomonlikka yuz tutishidan panoh so‘rayman».\n" +
            "Har bir musulmon odam bunga amal qilmog‘i darkor.\n" +
            "Ushbu duoni yaxshilab yod olib, har safar markabga minganda o‘qib yurish tavsiya qilinadi.\n" +
            "Hozirda ko‘pchilik aynan ushbu hadisi sharifga amal qiladi.\n" +
            "\n" +
            "Ali ibn Robiy’a roziyallohu anhudan rivoyat qilinadi: \n" +
            "«Ali roziyallohu anhuga ulovini minishi uchun keltirilganda hozir bo‘ldim. Oyog‘ini uzangiga qo‘yganda uch marta «Bismillah»ni aytdi. Uning ustiga o‘tirib, o‘nglanib olgandan keyin «Alhamdu lillahi. Subhanallazii saxxara lanaa hazihi. Va maa kunnaa lahu muqriniyn va innaa ila robbinaa lamunqalibiyn», dedi. \n" +
            "Keyin uch marta «Alhamdu lillahi», uch marta «Allohu akbar», deb turib, «Subhanaka, innii qod zolamtu nafsii. Fag‘fir lii, fainnahu laa yag‘firuz zunuba illaa anta», dedi. So‘ngra kuldi. Men unga: \n" +
            "«Ey mo‘minlarning amiri, nimaga kuldingiz?», dedim. \n" +
            "«Nabiy sollallohu alayhi vasallamni xuddi men qilgandek qilganlarini va so‘ngra kulganlarini ko‘rdim. Bas: \n" +
            "«Ey Allohning Rasuli! Nimadan kuldingiz?», dedim. \n" +
            "«Albatta, Robbing bandasidan u «Robbim, mening gunohlarimni mag‘firat qilgin. Albatta, gunohlarni Sendan o‘zga hech kim mag‘firat qilmas» desa, xursand bo‘lur», dedilar». \n" +
            "Termiziy va Abu Dovud rivoyat qilishgan. \n" +
            "Sharh: Bu rivoyatda sahobai kiromlar Rasululloh sollallohu alayhi vasallamga qanchalar diqqat va himmat bilan ergashishlaridan bir namuna kelmoqda. Ali ibn Abu Tolib roziyallohu anhuning amalni qilib bo‘lgandan keyin Nabiy sollallohu alayhi vasallamga o‘xshab kulib qo‘yishlari buning dalilidir.\n" +
            "\n" +
            "Ibn Umar roziyallohu anhudan rivoyat qilinadi: \n" +
            "«Rasululloh sollallohu alayhi vasallam lashkarlar, sariyyalar bilan yoki haj va umrada yurib borib, dovon va tepalikka yetganlarida uch marta takbir aytar va so‘ngra «Laa ilaha illallohu, vahdahu laa shariyka lahu, lahul mulku va lahul hamdu va huva alaa kulli shay’in qodiyr. Oyibuna, taaibuna, aabiduna, saajiduna va lirobbinaa haamidun. Sodaqallohu va’dahu va nasara abdahu va hazamal ahzaba vahdahu», der edilar».\n" +
            "Ikki shayx rivoyat qilishgan. \n" +
            "Sharh: Bu rivoyatda safarda yurganda, biror dovon yoki qir oshayotganda o‘qiladigan duo zikr kilingan. Bunga ham amal kilishga odatlanishimiz kerak.";
            String xayit = "Alloh rizoligi uchun  Ramazon hayiti namozini o‘qishga niyat qilinadi." +
                    "                " +
                    "                1. Imom “Allohu akbar” deya takbir aytgach jamoat ham qo‘llarini ko‘tarib, ichida iftitoh takbiri (Allohu akbar)ni aytadi. \n" +
                    "                2. Takbir aytilganidan so‘ng, qo‘lni qovushtirib turib, har kim ichida sano duosini o‘qiydi. So‘ngra imom qo‘llarini quloqlariga ko‘tarib, uch marta takbir aytadi. Jamoat ham unga ergashadi. Birinchi va ikkinchi takbirda qo‘llar yon tomonga tushiriladi. Uchinchi takbirdan so‘ng qo‘llar bog‘lanib, qiyom holida turiladi. \n" +
                    "                3. Imom ichida “A’uzu”ni va “Bismillah”ni aytib, ovoz chiqarib “Fotiha” surasini va zam surani o‘qiydi. Takbir aytib ruku va sajda ado etiladi. \n" +
                    "                4. Shundan so‘ng ikkinchi rakatga turiladi. Imom “Fotiha” surasi bilan zam sura o‘qigach, rukuga bormay turib, xuddi birinchi rakatdagi kabi uch marta takbir aytadi. \n" +
                    "                5. To‘rtinchi takbirda qo‘l ko‘tarmasdan imom orqasidan ruku va sajda ado qilinadi. \n" +
                    "                6. Sajdadan so‘ngra “Attahiyyot”, “Salovat” va “Duo” o‘qilib, salom berilib, namoz tugatiladi. \n" +
                    "                7. Alloh ibodatlaringizni O‘z dargohida qabul etsin!";
    String janoza = "Janoza namozi to‘rt takbirdan iborat bo‘lib, uni o‘qish quyidagi tartibda amalga oshiriladi:\n" +
            "\n" +
            "1. Janoza namozini o‘qishga niyat qilinadi.\n" +
            " \n" +
            "\n" +
            "2. Jamoat imomi “Allohu akbar” deb takbir aytgach, boshqalar ham ichida “Allohu akbar” deb aytib qo‘lni quloqlarning yumshoq yerigacha ko‘taradi va qo‘llarini bog‘laydi.\n" +
            " \n" +
            "\n" +
            "3. Qo‘llar qovushtirilgach “Sano” duosi o‘qiladi:\n" +
            "“Subhanakallohumma va bihamdika va tabarokasmuka va ta’ala jadduka va la ilaha g‘oyruk”.\n" +
            "\n" +
            " \n" +
            "\n" +
            "4. Sano duosidan so‘ng imom ikkinchi takbirni aytadi. Bunda qo‘llar ko‘tarilmaydi va tananing boshqa a’zolari ham o‘z holida turadi.\n" +
            "Eslatma! Ba’zi bir kishilarning takbir vaqtida, ya’ni imom “Allohu akbar” deb aytganda osmonga qarash holati ko‘zatiladi. Bunday qilish nojoizdir.\n" +
            "\n" +
            " \n" +
            "\n" +
            "5. Ikkinchi takbirni aytgach, quyidagi salavot aytiladi: “Allohumma solli ’ala Muhammad va ’alaa aali Muhammad, kamaa sollayta ’ala Ibrohiyma va ’alaa aali Ibrohiym, innaka hamiydum majiyd.\n" +
            "Allohumma baarik ’alaa Muhammad va ’alaa aali Muhammad, kamaa baarokta ’alaa Ibrohiyma va ’alaa aali Ibrohiym, innaka hamiydum majiyd”.\n" +
            "\n" +
            " \n" +
            "\n" +
            "6. Salavotdan keyin uchinchi takbir aytiladi. Uchinchi takbirdan keyin mayyit haqqiga quyidagi duo o‘qiladi:\n" +
            "“Allohumma mag‘fir lihayyinaa va mayyitinaa va shaahidinaa va g‘oibinaa va sog‘iyrinaa va kabiyrinaa va zakarinaa va unsaanaa. Allohumma man ahyayta huva minnaa fa ahyihi ’alal Islaam va man tavaffayta huva minnaa fatavaffahu ’alal iymaan”.\n" +
            "\n" +
            "Ma’nosi: Allohim, bizning tiriklarimiz va mayyitlarimiz, hozirlarimiz va g‘oiblarimiz, kichiklarimiz va kattalarimiz, erkaklarimiz va ayollarimizni mag‘firat qilgin!\n" +
            "\n" +
            "Allohim, Sen bizlardan kimni yashatadigan bo‘lsang, uni Islomda yashatgin. Bizlardan kimni vafot ettirsang, uni imonda vafot ettir.\n" +
            "\n" +
            " \n" +
            "\n" +
            "7. Mayyit haqqiga duo qilingach to‘rtinchi takbir aytiladi To‘rtinchi takbirdan keyin duo qilinmasdan, ikki yonga salom beriladi.\n" +
            "Balog‘atga yetmagan bolalarga yoki majnunlarga janoza namozi o‘qilganda ularning gunohlari kechirilishi so‘ralmaydi. Sababi ular gunohsizdirlar. Ularga quyidagi duo o‘qiladi:\n" +
            "\n" +
            "“Allohumma, a’izhu min ’azaabil qobr”.\n" +
            "\n" +
            "Ma’nosi: Allohim, uni qabr azobidan saqlagin.";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNamozBinding.inflate(inflater,container,false);
        loadData();
        adapter = new NamozAdapter(namozModelList, new NamozAdapter.VH.OnClickListener() {
            @Override
            public void OnClick(NamozModel namozModel, int position, View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("img",namozModelList.get(position).getImg());
                bundle.putString("nomi",namozModelList.get(position).getName());
                bundle.putString("Ozi",namozModelList.get(position).getOzi());
                Navigation.findNavController(binding.getRoot()).navigate(R.id.namoz2Fragment,bundle);
            }
        });
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false);
    binding.rv.setAdapter(adapter);
    binding.rv.setLayoutManager(linearLayoutManager);
        return binding.getRoot();
    }

    private void loadData() {
        namozModelList = new ArrayList<>();
        namozModelList.add(new NamozModel(R.drawable.img,"Bomdod namozi",bomdod));
        namozModelList.add(new NamozModel(R.drawable.img,"Peshin namozi",peshin));
        namozModelList.add(new NamozModel(R.drawable.img,"Asr namozi",asr));
        namozModelList.add(new NamozModel(R.drawable.img,"Shom namozi",shom));
        namozModelList.add(new NamozModel(R.drawable.img,"Xufton namozi",xufton));
        namozModelList.add(new NamozModel(R.drawable.img_4,"Tahorat olish qoidasi",tax));
        namozModelList.add(new NamozModel(R.drawable.img_5,"Safarga chiqish duosi",safar));
        namozModelList.add(new NamozModel(R.drawable.img_6,"Hayit namozi",xayit));
        namozModelList.add(new NamozModel(R.drawable.img_7,"Janoza namozi",janoza));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}