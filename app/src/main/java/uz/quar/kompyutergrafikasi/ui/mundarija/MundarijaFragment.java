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
import uz.quar.kompyutergrafikasi.model.MundarijaModel;
import uz.quar.kompyutergrafikasi.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;
    private List<MundarijaModel> data;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        data = new ArrayList<>();
        data.add(new MundarijaModel("Kompyuter grafikasi. Kompyuter grafikasi turlari", 5));
        data.add(new MundarijaModel("Kompyuter grafikasining asosiy yo‘nalishlari", 9));
        data.add(new MundarijaModel("Rang. Ranglarning sxemalari", 14));
        data.add(new MundarijaModel("Rang modeli", 19));
        data.add(new MundarijaModel("Ranglarni kodlash. Palitralar", 25));
        data.add(new MundarijaModel("Grafik fayllarning formatlari", 28));
        data.add(new MundarijaModel("Grafik fayllarning xossalari", 32));
        data.add(new MundarijaModel("Keng tarqalgan grafik muharrirlarning sharhi", 36));
        data.add(new MundarijaModel("Nuqtali grafika tushunchasi", 39));
        data.add(new MundarijaModel("Vektor grafika tushunchasi", 40));
        data.add(new MundarijaModel("Fraktal grafika tushunchasi", 41));
        data.add(new MundarijaModel("Tasvirlarga ishlov berish", 43));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturi bilan tanishuv", 49));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturiga kirish", 53));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturining o‘ziga xos xususiyatlari", 59));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturining imkoniyatlaridan foydalanish yo‘llari", 66));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturida tashqi ko‘rinish, ranglar, matnlar, effektlar bilan ishlash", 80));
        data.add(new MundarijaModel("CorelDRAW Graphics Suite X3 dasturida maxsus effektlar va konvertatsiya", 84));
        data.add(new MundarijaModel("Adobe Photoshop dasturining asosiy imkoniyatlari", 99));
        data.add(new MundarijaModel("Adobe Photoshop CS5 dasturining uskunalar paneli bilan tanishish", 103));
        data.add(new MundarijaModel("Grafik obyektlarda ranglar va qatlamlar bilan ishlash", 113));
        data.add(new MundarijaModel("Adobe Photoshop CS5 grafik muharririda matn va konturlar bilan ishlashda qo‘llaniladigan tushunchalar", 120));
        data.add(new MundarijaModel("Web-sahifa uchun grafik ma’lumotlar yaratish. Animatsiya banerlarni aks ettirish", 139));
        data.add(new MundarijaModel("Uch o‘lchamli texnologiyalar haqida tushuncha", 141));
        data.add(new MundarijaModel("3DS MAX 2009 dasturini o‘rnatish va faollashtirish jarayoni", 150));
        data.add(new MundarijaModel("Autodesk 3ds Max dasturi haqida tushuncha", 155));
        data.add(new MundarijaModel("Obyektlar ustida bajariladigan operatsiyalar va buyruqlar bilan ishlash", 160));
        data.add(new MundarijaModel("3DS-MAX dasturida turli obektlar va jarayonlarni modellashtirish", 166));
        data.add(new MundarijaModel("Yoritgichlar va kameralarni o‘rnatish, materiallar va ular bilan ishlash", 172));

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
        MainActivity.defaultPage = data.get(position).getPage();

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}