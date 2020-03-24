package com.example.diversityrecycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dueeeke.videocontroller.StandardVideoController;
import com.dueeeke.videocontroller.component.CompleteView;
import com.dueeeke.videocontroller.component.ErrorView;
import com.dueeeke.videocontroller.component.GestureView;
import com.dueeeke.videocontroller.component.PrepareView;
import com.dueeeke.videocontroller.component.VodControlView;
import com.dueeeke.videoplayer.player.VideoView;
import com.example.diversityrecycler.R;
import com.example.diversityrecycler.bean.SwipeCardBean;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Videoadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<Integer> list;
    Context context;
    private static final String THUMB = "https://cms-bucket.nosdn.127.net/eb411c2810f04ffa8aaafc42052b233820180418095416.jpeg";


    public Videoadapter( Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
//        PrepareView prepareView = new PrepareView(context);//准备播放界面
//        ImageView thumb = prepareView.findViewById(R.id.thumb);//封面图
//        Glide.with(context).load(THUMB).into(thumb);
//
//        myViewHolder.player.setUrl("http://vfx.mtime.cn/Video/2019/03/14/mp4/190314223540373995.mp4"); //设置视频地址
//        StandardVideoController controller = new StandardVideoController(context);
//        controller.addDefaultControlComponent("标题", false);
//        controller.addControlComponent(new CompleteView(context));//自动完成播放界面
//        controller.addControlComponent(new ErrorView(context));//错误界面
//        VodControlView vodControlView = new VodControlView(context);//点播控制条
//        //是否显示底部进度条。默认显示
////                vodControlView.showBottomProgress(false);
//        controller.addControlComponent(prepareView);
//        controller.addControlComponent(vodControlView);
//        GestureView gestureControlView = new GestureView(context);//滑动控制视图
//        controller.addControlComponent(gestureControlView);
//
//        myViewHolder.player.setVideoController(controller); //设置控制器


    }

    @Override
    public int getItemCount() {
        return 20;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
       // VideoView player;


        public MyViewHolder(View itemView) {
            super(itemView);
           // player=itemView.findViewById(R.id.player);
        }

    }


}
