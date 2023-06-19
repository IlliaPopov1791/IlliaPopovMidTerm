package illia.popov.n01421791.mid;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;
public class IlliaLeftFrag extends ListFragment {

    private String[] courses;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.frag_illia_left, container, false);

        courses = getResources().getStringArray(R.array.courses);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, courses);
        //bind the list view with array adapter
        setListAdapter(adapter);

        return view;

    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        PopovRightFragment fragment = (PopovRightFragment) getFragmentManager().findFragmentById(R.id.rightFragmentView);
        fragment.display("Item: "+Integer.toString((position+1)),courses[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}