package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class win_appdata extends BaseAdapter {
    LayoutInflater inflater = null;
    private ArrayList<winlist> m_oData = null;
    private int nListCnt = 0;

    public win_appdata(ArrayList<winlist> _oData){
        m_oData=_oData;
        nListCnt=m_oData.size();
    }


    @Override
    public int getCount() {
        Log.i("TAG","GETCOUNT");
        return nListCnt;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            final Context context = parent.getContext();
            if(inflater==null){
                inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.fragment_win,parent,false);
        }

        TextView oTourName = (TextView) convertView.findViewById(R.id.title_win);
        TextView oTourContent = (TextView) convertView.findViewById(R.id.now_win);
        TextView oTourLocation = (TextView) convertView.findViewById(R.id.local_win);
        TextView oTourScore = (TextView) convertView.findViewById(R.id.price_win);

        oTourName.setText(m_oData.get(position).name);
        oTourContent.setText(m_oData.get(position).content);
        oTourLocation.setText(m_oData.get(position).location);
        oTourScore.setText(m_oData.get(position).score);

        return convertView;
    }
}