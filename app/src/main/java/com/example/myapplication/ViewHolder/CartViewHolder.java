package com.example.myapplication.ViewHolder;

import android.view.View;
import android.widget.TextView;
import com.example.myapplication.Interface.ItemClickListener;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class CartViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtProductName, txtProductPrice, txtProductQuantity;
    private ItemClickListener itemClickListner;


    public CartViewHolder(View itemView)
    {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.cart_product_name);
        txtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
    }

    @Override
    public void onClick(View view)
    {
        itemClickListner.onClick(view, getAdapterPosition(), false);
    }

    public void setItemClickListener(ItemClickListener itemClickListner)
    {
        this.itemClickListner = itemClickListner;
    }
}
