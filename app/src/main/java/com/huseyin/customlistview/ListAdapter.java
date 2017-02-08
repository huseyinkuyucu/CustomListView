package com.huseyin.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private List<Person> list;
    LayoutInflater layoutInflater;


    public ListAdapter(Context context, List<Person> list) {
        this.context=context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Person getItem(int position) {
        return list.get(position);
    }


    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View line_design=layoutInflater.inflate(R.layout.line_design, null);

        ImageView ivPersonImage = (ImageView) line_design.findViewById(R.id.ivPerson);
        TextView tvName = (TextView) line_design.findViewById(R.id.tvName);
        TextView tvSurname = (TextView) line_design.findViewById(R.id.tvSurname);
        TextView tvCountry = (TextView) line_design.findViewById(R.id.tvCountry);
        TextView tvHobby = (TextView) line_design.findViewById(R.id.tvHobby);



        Person person=list.get(position);

        ivPersonImage.setImageResource(person.getImageId());
         tvName.setText(person.getName());
         tvSurname.setText(person.getSurname());
         tvCountry.setText(person.getCountry());
         tvHobby.setText(person.getHobby());


        return line_design;
    }
}
