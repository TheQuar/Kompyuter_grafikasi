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
        data.add("Kompyuter grafikasi haqida tushuncha");
        data.add("Kompyuter grafikasida ranglarning sxemalari");
        data.add("Kompyuter grafikasining fayllar formatlari");
        data.add("Grafik axborotlar bilan ishlash texnologiyasi");
        data.add("CorelDRAW Graphics Suite X3 dasturiy paketi");
        data.add("Adobe Photoshop dasturiga kirish");
        data.add("Adobe Photoshop CS5 dasturida ranglar va qatlamlar");
        data.add("Autodesk 3ds Max 2009 dasturiga kirish");

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
                MainActivity.defaultPage = 14;
                break;
            case 2:
                MainActivity.defaultPage = 28;
                break;
            case 3:
                MainActivity.defaultPage = 36;
                break;
            case 4:
                MainActivity.defaultPage = 49;
                break;
            case 5:
                MainActivity.defaultPage = 99;
                break;
            case 6:
                MainActivity.defaultPage = 113;
                break;
            case 7:
                MainActivity.defaultPage = 139;
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