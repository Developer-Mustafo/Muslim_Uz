package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.My_Duo_Adapter;
import uz.coder.muslimuz.databinding.FragmentDuoBinding;
import uz.coder.muslimuz.model.Duo_Model;

public class DuoFragment extends Fragment {
    FragmentDuoBinding binding;
    My_Duo_Adapter my_duo_adapter;
    List<Duo_Model> duo_modelList;
 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDuoBinding.inflate(inflater,container,false);
        loadData();
        my_duo_adapter = new My_Duo_Adapter(getActivity(),duo_modelList);
        binding.lv.setAdapter(my_duo_adapter);
        binding.lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putString("name",duo_modelList.get(position).getName());
                bundle.putString("ozi",duo_modelList.get(position).getOzi());
                Navigation.findNavController(binding.getRoot()).navigate(R.id.duo1Fragment,bundle);
            }
        });
        return binding.getRoot();
    }

    private void loadData() {
     duo_modelList = new ArrayList<>();
     duo_modelList.add(new Duo_Model("Duo","Robbana atina fid-dunya hasanatav-va fil axiroti hasanatav-va qina azaban-nar."));
     duo_modelList.add(new Duo_Model("Salovat","Allohumma solli ‘ala Muhammadiv-va ‘ala ali Muhammad. Kama sollayta ‘ala Ibrohima va ‘ala ali Ibrohim. Innaka hamidum-majid. Allohumma barik ‘ala Muhammadiv-va ‘ala ali Muhammad. Kama barokta ‘ala Ibrohima va ‘ala ali Ibrohim. Innaka hamidum-majid."));
     duo_modelList.add(new Duo_Model("Attahiyat duvosi","Attahiyyatu lillahi vas-solavatu vattoyyibat. Assalamu ‘alayka ayyuhan-nabiyyu va rohmatullohi va barokatuh. Assalamu ‘alayna va ‘ala ibadillahis-solihiyn. Ashhadu alla ilaha illallohu va ashhadu anna Muhammadan ‘abduhu va rosuluh."));
     duo_modelList.add(new Duo_Model("SALOVAT (qisqa)","Allohumma solli ‘ala sayydina Muhammad"));
     duo_modelList.add(new Duo_Model("Saloti munjiya","Allohumma solli ‘ala sayyidina Muhammadin va ‘ala ali sayyidina Muhammad, salatan tunjina biha min-jami’il ahvali val afat. Va taqzi lana biha jami’al hajat va tutohhiruna biha min-jami’is-sayyiat. Va tarfa-’una biha ‘alad-darojat va tuballig‘una biha aqsol-g‘oyoti, min-jami’il xoyroti fil-hayati va ba’dal mamat.\n" +
             "\n" +
             "Allohim! Janobi Payg‘ambarimiz Muhammad Mustafoga beadad salot va salom bo‘lsin. Bu salotlar, salomlar va duolar bizni har turli balo va musibatlardan xalos etsin, barcha ehtiyojlarimizni ketkizib, bizni gunohlardan poklasin. Bizni yuksak daraja va martabalarga ko‘tarsin. Allohim! Bu salot va salomlar tufayli o‘lgandan ke-yin xayr (yaxshilik)larga noil bo‘laylik. "));
     duo_modelList.add(new Duo_Model("Saloti fathiyya ","Allohumma solli va sallim va barik ‘ala sayyidina Muhammadinil-fatihi lima ug‘liqo val-xotimi lima sabaqo, Nasiril-haqqi bilhaqqi, val hadi ila sirotikal-mustaqim va ‘ala alihi haqqo qadrihi va miqdarihil-’aziym.\n" +
             "\n" +
             "Allohim! Suyukli Payg‘ambarimiz Muhammad Mustafoga salot va salomlar bo‘lsin. Bizga Sening yashirin xazinalaringni ochib bergan Udir. Payg‘ambarlar halqasining oxiri Udir, Haqning eng katta yordamchisi Udir, insonlarga to‘g‘ri yo‘lni ko‘rsatgan Udir! Unga va yaqinlariga so‘ngsiz salot va salomlar bo‘lsin. "));
     duo_modelList.add(new Duo_Model("Boshqa bir salovot ","Allohumma solli ‘ala sayyidina Muhammadinin-nabiyyil-ummiyyi va ‘ala alihi va sahbihi va sallim. \n" +
             "\n"));
     duo_modelList.add(new Duo_Model("Azon Duosi","Allohumma robba hazihid da’vatit tammah. Vas-solatil qoimah, ati Muhammadanil vasiylata val faziylah. Vad-darojatal ’aliyatar rofi’a. Vab’as-hu maqomam mahmudanillaziy va’adtah. Varzuqna shafa-’atahu yavmal qiyamah. Innaka la tuxliful mi’ad!"));
     duo_modelList.add(new Duo_Model("Qunut duosi","«Allohumma innaa nasta’iynuka va nastag‘firuka. Va nu’minu bika va natavakkalu alayka. Va nusniy alaykal xoyro kullahu. Nashkuruka va laa nakfuruk. Va naxla’u va natruku man yafjuruk. Allohumma iyyaaka na’budu va laka nusolliy va nasjudu va ilayka nas’aa va nahfidu. Narjuu rohmataka va naxshaa azaabaka. Inna azaabaka bil kuffaari mulhiq»."));
     duo_modelList.add(new Duo_Model("Ro‘za tutish (saharlik, og‘iz yopish) duosi","نَوَيْتُ أَنْ أَصُومَ صَوْمَ شَهْرَ رَمَضَانَ مِنَ الْفَجْرِ إِلَى الْمَغْرِبِ، خَالِصًا لِلهِ تَعَالَى أَللهُ أَكْبَرُ\n" +
             "\n" +
             "Navaytu an asuvma sovma shahri ramazona minal fajri ilal mag‘ribi, xolisan lillahi taʼaalaa Allohu akbar.\n" +
             "\n" +
             "Maʼnosi: Ramazon oyining ro‘zasini subhdan to kun botguncha tutmoqni niyat qildim. Xolis Alloh uchun Alloh buyukdir."));
     duo_modelList.add(new Duo_Model("Iftorlik (og‘iz ochish) duosi","اَللَّهُمَّ لَكَ صُمْتُ وَ بِكَ آمَنْتُ وَ عَلَيْكَ تَوَكَّلْتُ وَ عَلَى رِزْقِكَ أَفْتَرْتُ، فَغْفِرْلِى مَا قَدَّمْتُ وَ مَا أَخَّرْتُ بِرَحْمَتِكَ يَا أَرْحَمَ الرَّاحِمِينَ\n" +
             "\n" +
             "Allohumma laka sumtu va bika aamantu va aʼlayka tavakkaltu va aʼlaa rizqika aftartu, fag‘firliy ma qoddamtu va maa axxortu birohmatika yaa arhamar roohimiyn.\n" +
             "\n" +
             "Maʼnosi: Ey Alloh, ushbu Ro‘zamni Sen uchun tutdim va Senga iymon keltirdim va Senga tavakkal qildim va bergan rizqing bilan iftor qildim. Ey mehribonlarning eng mehriboni, mening avvalgi va keyingi gunohlarimni mag‘firat qilgil."));
 }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}