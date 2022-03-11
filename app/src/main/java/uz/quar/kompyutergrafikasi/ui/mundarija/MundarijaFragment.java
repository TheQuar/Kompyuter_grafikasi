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
        data.add("SO’Z BOSHI ");
        data.add("Kompyuter lingvistikasi fanining mazmun-mohiyati");
        data.add("Mantiq, grammatika va algoritm");
        data.add("Aksiomatik nazariya – tilni formal tavsiflash asosi");
        data.add("Kompyuter lingvistikasida modellashtirish va analogiya metodlari");
        data.add("Formal grammatika nazariyasi ");
        data.add("Kompyuter lingvistikasida matematik statistika va kvantitativ metod ");
        data.add("Kompyuter lingvistikasi tarixi va zamonaviy holati. Kompyuter lingvistikasi bo’yicha tadqiqotlar");
        data.add("Kompyuter lingvistikasida avtomatik tarjima yo’nalishi ");
        data.add("Kompyuter leksikografiyasi ");
        data.add("Til o’rgatish jarayonini avtomatlashtirish ");
        data.add("Kompyuter lingvistikasida avtomatik tahrir, informatsion qidiruv tizimlari  va gipertekst texnologiyasi ");
        data.add("Kompyuter analizi va sintezi. Ingliz tilidagi gaplarni o’zbek tiliga tarjima qilish algoritmi");
        data.add("Kompyuter lingvistikasi fanining rivojlanish istiqbollari ");
        data.add("Foydalanilgan adabiyotlar ro’yxati ");
        data.add("Kompyuter lingvistikasi terminlari lug’ati (glossariy) ");

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
                MainActivity.defaultPage = 3;
                break;
            case 1:
                MainActivity.defaultPage = 4;
                break;
            case 2:
                MainActivity.defaultPage = 9;
                break;
            case 3:
                MainActivity.defaultPage = 21;
                break;
            case 4:
                MainActivity.defaultPage = 26;
                break;
            case 5:
                MainActivity.defaultPage = 34;
                break;
            case 6:
                MainActivity.defaultPage = 44;
                break;
            case 7:
                MainActivity.defaultPage = 53;
                break;
            case 8:
                MainActivity.defaultPage = 66;
                break;
            case 9:
                MainActivity.defaultPage = 79;
                break;
            case 10:
                MainActivity.defaultPage = 86;
                break;
            case 11:
                MainActivity.defaultPage = 91;
                break;
            case 12:
                MainActivity.defaultPage = 105;
                break;
            case 13:
                MainActivity.defaultPage = 116;
                break;
            case 14:
                MainActivity.defaultPage = 131;
                break;
            case 15:
                MainActivity.defaultPage = 136;

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