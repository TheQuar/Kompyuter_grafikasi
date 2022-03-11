package uz.quar.kompyutergrafikasi.ui.mundarija;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
;
import uz.quar.kompyutergrafikasi.MainActivity;
import uz.quar.kompyutergrafikasi.R;
import uz.quar.kompyutergrafikasi.adapter.MundarijaAdapter;
import uz.quar.kompyutergrafikasi.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        List<String> data = new ArrayList<>();
        data.add("Kompyuter grafikasi. Kompyuter grafikasi turlari");
        data.add("Kompyuter grafikasining asosiy yo‘nalishlari");
        data.add("Rang. Ranglarning sxemalari");
        data.add("Rang modeli");
        data.add("Ranglarni kodlash. Palitralar");
        data.add("Grafik fayllarning formatlari");
        data.add("Grafik fayllarning xossalari");
        data.add("Keng tarqalgan grafik muharrirlarning sharhi");
        data.add("Nuqtali grafika tushunchasi");
        data.add("Vektor grafika tushunchasi");
        data.add("Fraktal grafika tushunchasi");
        data.add("Tasvirlarga ishlov berish");
        data.add("CorelDRAW Graphics Suite X3 dasturi bilan tanishuv");
        data.add("CorelDRAW Graphics Suite X3 dasturiga kirish");
        data.add("CorelDRAW Graphics Suite X3 dasturining o‘ziga xos xususiyatlari");
        data.add("CorelDRAW Graphics Suite X3 dasturining imkoniyatlaridan foydalanish yo‘llari");
        data.add("CorelDRAW Graphics Suite X3 dasturida tashqi ko‘rinish, ranglar, matnlar, effektlar bilan ishlash");
        data.add("CorelDRAW Graphics Suite X3 dasturida maxsus effektlar va konvertatsiya");
        data.add("Adobe Photoshop dasturining asosiy imkoniyatlari");
        data.add("Adobe Photoshop CS5 dasturining uskunalar paneli bilan tanishish");
        data.add("Grafik obyektlarda ranglar va qatlamlar bilan ishlash");
        data.add("Adobe Photoshop CS5 grafik muharririda matn va konturlar bilan ishlashda qo‘llaniladigan tushunchalar");
        data.add("Web-sahifa uchun grafik ma’lumotlar yaratish. Animatsiya banerlarni aks ettirish");
        data.add("Uch o‘lchamli texnologiyalar haqida tushuncha");
        data.add("3DS MAX 2009 dasturini o‘rnatish va faollashtirish jarayoni");
        data.add("Autodesk 3ds Max dasturi haqida tushuncha");
        data.add("Obyektlar ustida bajariladigan operatsiyalar va buyruqlar bilan ishlash");
        data.add("3DS-MAX dasturida turli obektlar va jarayonlarni modellashtirish");
        data.add("Yoritgichlar va kameralarni o‘rnatish, materiallar va ular bilan ishlash");







        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mundarijaAdapter = new MundarijaAdapter(mContext, data);
        mundarijaAdapter.setClickListener(this);
        recyclerView.setAdapter(mundarijaAdapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onItemClick(View view, int position) {

        switch (position) {
            case 0:
                MainActivity.defaultPage = 5;
                break;
            case 1:
                MainActivity.defaultPage = 9;
                break;
            case 2:
                MainActivity.defaultPage = 14;
                break;
            case 3:
                MainActivity.defaultPage = 19;
                break;
            case 4:
                MainActivity.defaultPage = 25;
                break;
            case 5:
                MainActivity.defaultPage = 28;
                break;
            case 6:
                MainActivity.defaultPage = 32;
                break;
            case 7:
                MainActivity.defaultPage = 36;
                break;
            case 8:
                MainActivity.defaultPage = 39;
                break;
            case 9:
                MainActivity.defaultPage = 40;
                break;
            case 10:
                MainActivity.defaultPage = 41;
                break;
            case 11:
                MainActivity.defaultPage = 43;
                break;
            case 12:
                MainActivity.defaultPage = 49;
                break;
            case 13:
                MainActivity.defaultPage = 53;
                break;
            case 14:
                MainActivity.defaultPage = 59;
                break;
            case 15:
                MainActivity.defaultPage = 66;
                break;
            case 16:
                MainActivity.defaultPage = 80;
                break;
            case 17:
                MainActivity.defaultPage = 84;
                break;
            case 18:
                MainActivity.defaultPage = 99;
                break;
            case 19:
                MainActivity.defaultPage = 103;
                break;
            case 20:
                MainActivity.defaultPage = 113;
                break;
            case 21:
                MainActivity.defaultPage = 120;
                break;
            case 22:
                MainActivity.defaultPage = 127;
                break;
            case 23:
                MainActivity.defaultPage = 139;
                break;
            case 24:
                MainActivity.defaultPage = 141;
                break;
            case 25:
                MainActivity.defaultPage = 150;
                break;
            case 26:
                MainActivity.defaultPage = 155;
                break;
            case 27:
                MainActivity.defaultPage = 160;
                break;
            case 28:
                MainActivity.defaultPage = 166;
                break;
            case 29:
                MainActivity.defaultPage = 172;
                break;





        }

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}