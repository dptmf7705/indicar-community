package com.indicar.indicar_community.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.indicar.indicar_community.R;
import com.indicar.indicar_community.view.activity.BoardDetailActivity;
import com.indicar.indicar_community.view.activity.BoardWriteActivity;
import com.indicar.indicar_community.vo.BbsVO;
import com.indicar.indicar_community.vo.FileDetailVO;

import java.util.ArrayList;

/**
 * Created by yeseul on 2018-02-23.
 */

public class BoardListAdapter extends RecyclerView.Adapter<BoardListAdapter.ViewHolder>{
    private Context context;
    private ArrayList<BbsVO> items;
    private Bitmap[] bitmaps;

    public BoardListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_board_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final BbsVO item = items.get(position);
        Bitmap bitmap = bitmaps[position];
        if(bitmap != null) {
            holder.iv_board_img.setImageBitmap(bitmap);
        } else{
            holder.iv_board_img.setImageResource(R.drawable.btn_category_2_sale_unclicked);
        }
        holder.tv_user_name.setText(item.getNtcr_nm());
        holder.tv_board_category.setText(item.getBbs_id());
        holder.tv_board_content.setText(item.getNtt_cn());
//        holder.tv_comment.setText(""+item.getComment());
        holder.tv_comment.setText("0");
        holder.tv_like.setText(""+item.getLike());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BoardDetailActivity.class);
                intent.putExtra("ntt_id", item.getNtt_id());
                intent.putExtra("bbs_id", item.getBbs_id());
                intent.putParcelableArrayListExtra("files", item.getFileList());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(items != null) {
            return items.size();
        }else{
            return 0;
        }
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        public ImageView iv_board_img;
        public TextView tv_user_name;
        public TextView tv_board_content;
        public TextView tv_like;
        public TextView tv_comment;
        public TextView tv_board_category;
        public View view;

        public ViewHolder(View view) {
            super(view);
            iv_board_img = view.findViewById(R.id.iv_board_img);
            tv_user_name = view.findViewById(R.id.tv_user_name);
            tv_board_content = view.findViewById(R.id.tv_board_content);
            tv_like = view.findViewById(R.id.tv_like);
            tv_comment = view.findViewById(R.id.tv_comment);
            tv_board_category = view.findViewById(R.id.tv_board_category);
            this.view = view;
        }
    }

    public void addFileList(int i , ArrayList<FileDetailVO> list){
        items.get(i).setFileList(list);
    }

    public void addImage(int i, Bitmap bitmap){
        bitmaps[i] = bitmap;
    }

    public void addList(ArrayList<BbsVO> items){
        this.items = items;
        bitmaps = new Bitmap[items.size()];
    }


}
