package com.shumin.study.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shumin.study.R;
import com.shumin.study.bean.ExamHistory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class ExamHistoryAdapter extends BaseAdapter {

    private final int[] ICON_BG_LIST = {
            R.drawable.service_icon_bg_1,
            R.drawable.service_icon_bg_2,
            R.drawable.service_icon_bg_3,
            R.drawable.service_icon_bg_4
    };

    private Context mContext;
    private List<ExamHistory> mData = new ArrayList<>();

    public ExamHistoryAdapter(Context context, List<ExamHistory> data) {
        mData = data;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.documents_list_item, null);
            holder = new ViewHolder();
            holder.icon = (ImageView) convertView.findViewById(R.id.item_documents_icon);
            holder.name = (TextView) convertView.findViewById(R.id.item_name);
            holder.content = (TextView) convertView.findViewById(R.id.item_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ExamHistory info = mData.get(position);
        holder.icon.setImageResource(R.drawable.icon_punchcard);
        holder.icon.setBackgroundResource(ICON_BG_LIST[position % ICON_BG_LIST.length]);
        holder.name.setText(info.getQuestionsName());
        holder.content.setText("共回答" + info.getCompletedCount() + "题  " + "正确" + info.getCorrectCount() + "\n" + info.getTime());

        return convertView;
    }

    class ViewHolder {
        ImageView icon;
        TextView name;
        TextView content;
    }
}
