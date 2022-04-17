package com.star.unsplash_app_kphone.recycleview

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.star.unsplash_app_kphone.App
import com.star.unsplash_app_kphone.R
import com.star.unsplash_app_kphone.model.Photo
import com.star.unsplash_app_kphone.utils.Constants.TAG
import kotlinx.android.synthetic.main.layout_photo_item.view.*


class PhotoItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    // 뷰들을 가져온다.
    private val photoImageView = itemView.photo_image
    private val photoCreatedAtText = itemView.created_at_text
    private val photoLikesCountText = itemView.likes_count_text


    // 데이터와 뷰를 묶는다.
    fun bindWithView(photoItem: Photo){
        Log.d(TAG, "PhotoItemViewHolder - bindWithView() called")

        photoCreatedAtText.text = photoItem.createdAt

        photoLikesCountText.text = photoItem.likesCount.toString()

        // 이미지를 설정한다.
        Glide.with(App.instance)
            .load(photoItem.thumbnail)
            .placeholder(R.drawable.ic_baseline_insert_photo_24)
            .into(photoImageView)


    }


}