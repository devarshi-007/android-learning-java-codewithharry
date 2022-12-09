package com.devarshi.tmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

//    private ArrayList<String> localDataSet;
    private String localDataSet;
    private ViewGroup parent;
    private int viewType;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tasks;
        private final ImageButton done;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            tasks = (TextView) view.findViewById(R.id.taskItem);
            done = (ImageButton) view.findViewById(R.id.taskDone);
        }

        public TextView getTextView() {
            return tasks;
        }

        public ImageButton getImageButton() {
            return done;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    //main---------------------------------------------------
//    public TaskAdapter(ArrayList<String> dataSet) {
//        localDataSet = dataSet;
//    }

    public TaskAdapter(String dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.task_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        //viewHolder.getTextView().setText(localDataSet.get(position)); //main--------------------
        viewHolder.getTextView().setText(localDataSet);
        viewHolder.getImageButton();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Return the size of your dataset (invoked by the layout manager)
    //main--------------------------------------------------------
//    @Override
//    public int getItemCount() {
//        return localDataSet.size();
//    }
}

