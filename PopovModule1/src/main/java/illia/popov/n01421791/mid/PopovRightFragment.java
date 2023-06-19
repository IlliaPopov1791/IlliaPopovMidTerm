package illia.popov.n01421791.mid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PopovRightFragment extends Fragment {

    TextView itemNum,course;

    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.fragm_popov_right, container, false);
        itemNum= (TextView) view.findViewById(R.id.ill_count);
        course= (TextView)view.findViewById(R.id.ill_course);

        return view;

    }
    public void display(String counter, String definition){
        itemNum.setText(counter);
        course.setText(definition);

    }
}