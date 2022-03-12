package uz.quar.kompyutergrafikasi.ui.about;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import uz.quar.kompyutergrafikasi.MainActivity;
import uz.quar.kompyutergrafikasi.R;

public class AboutFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_about, container, false);

        TextView textView = root.findViewById(R.id.about_gamil_text);
        textView.setText(Html.fromHtml("<a href=\"mailto:"+getString(R.string.gmail)+"\">"+getString(R.string.gmail)+"</a>"));
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        return root;
    }


}