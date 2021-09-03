package com.vactuvahangtong.listviewdemo44;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterProduct extends BaseAdapter {
    List<Product> products;

    public AdapterProduct(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_prroduct, parent, false);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPhoneNumber = view.findViewById(R.id.tvPhoneNumber);
        ImageView imgView = view.findViewById(R.id.imgLauncher);

        Product product=products.get(position);

        tvName.setText(product.getName());
        tvPhoneNumber.setText(product.getNumberPhone());
        if (product.isAvataUser()) imgView.setVisibility(View.VISIBLE);
        else imgView.setVisibility(View.GONE);

        return view;
    }
}
