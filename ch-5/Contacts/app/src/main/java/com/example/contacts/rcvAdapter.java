package com.example.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rcvAdapter extends RecyclerView.Adapter<rcvAdapter.ViewHolder> {

    private Contacts[] localDataSet;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

//            textView = (TextView) view.findViewById(R.id.textView);
//            textView2 = (TextView) view.findViewById(R.id.textView2);
//            textView3 = (TextView) view.findViewById(R.id.textView3);
        }

//        public TextView getTextView() {
////            return textView;
//        }
//        public TextView getTextView2() {
//            return textView2;
//        }
//        public TextView getTextView3() {
//            return textView3;
//        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public rcvAdapter(Contacts[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact_structure, viewGroup, false);
        textView1 = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView3 = view.findViewById(R.id.textView3);
        return new ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
//        viewHolder.getTextView1().setText(localDataSet[position].getSno());
//        textView1.setText(localDataSet[position].getSno());
        textView2.setText(localDataSet[position].getName());
        textView3.setText(localDataSet[position].getMob());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
