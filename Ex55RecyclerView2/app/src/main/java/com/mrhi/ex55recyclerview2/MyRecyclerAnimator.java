package com.mrhi.ex55recyclerview2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerAnimator extends DefaultItemAnimator {

    @Override
    public boolean animateRemove(RecyclerView.ViewHolder holder) {
        return super.animateRemove(holder);
    }

    @Override
    public boolean animateAdd(RecyclerView.ViewHolder holder) {


        Animation ani= AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.appear_item);
        holder.itemView.startAnimation(ani);

        return super.animateAdd(holder);
    }
}
